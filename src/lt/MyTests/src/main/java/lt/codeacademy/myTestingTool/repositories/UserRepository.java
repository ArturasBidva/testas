package lt.codeacademy.myTestingTool.repositories;

import lt.codeacademy.myTestingTool.FileEditor;
import lt.codeacademy.myTestingTool.entities.UserEntity;
import lt.codeacademy.myTestingTool.models.Role;
import lt.codeacademy.myTestingTool.models.User;

import java.util.*;

public class UserRepository implements Repository<User> {

    private final String FILE_NAME = "users.json";
    private final FileEditor<UserEntity> fileEditor = new FileEditor(FILE_NAME, UserEntity.class);
    private final RolesRepository rolesRepository = new RolesRepository();

    Map<Integer, User> users;

    public UserRepository() {
        renewData();
    }

    public Map<Integer, User> getUsers() {
        return users;
    }

    public void remove(int id) {
        users.remove(id);
        addToFile();
    }

    public boolean changeRole(int userId, int roleId) {
        Role role = rolesRepository.getById(roleId);
        User user = users.get(userId);
        if (role == null || user == null)
            return false;
        else {
            user.setRole(role);
            User userByRole = rolesRepository.getUserByRoleId(user);
            users.remove(userId);
            users.put(userByRole.getId(), userByRole);
            renewData();
            return true;
        }
    }

    private Map<Integer, User> entitiesToUserMap(List<UserEntity> userEntities) {
        Map<Integer, User> userMap = new HashMap<>();
        for (UserEntity userEntity : userEntities) {
            Role role = rolesRepository.getById(userEntity.getRoleId());
            User user = new User(
                    userEntity.getId(),
                    userEntity.getName(),
                    userEntity.getUsername(),
                    role);
            User userWithrole = rolesRepository.getUserByRoleId(user);
            userMap.put(userEntity.getId(), userWithrole);
        }
        return userMap;
    }

    private List<UserEntity> usersToEntities() {
        List<UserEntity> userEntityList = new ArrayList<>();
        for (Map.Entry<Integer, User> entry : users.entrySet()) {
            User user = entry.getValue();
            UserEntity userEntity = new UserEntity(user);
            userEntityList.add(userEntity);
        }
        return userEntityList;
    }

    private Map<Integer, User> getData() {
        List<UserEntity> userEntities = fileEditor.readFromFile();
        return entitiesToUserMap(userEntities);
    }

    private int generateId() {
        Random random = new Random();
        return random.nextInt(100000);
    }

    private void addToFile() {
        fileEditor.addToFile(usersToEntities());
        renewData();
    }

    @Override
    public void renewData() {
        users = getData();
    }

    public User getByUsername(String username) {
        User user = null;
        for (Map.Entry<Integer, User> entry : users.entrySet()) {
            User userEntry = entry.getValue();
            if (userEntry.getUsername().equals(username)) {
                user = userEntry;
                break;
            }
        }
        return user;
    }

    @Override
    public User getById(int id) {
        return users.get(id);
    }

    @Override
    public void add(User item) {
        int defaultId = 1;
        int id;
        do {
            id = generateId();
        } while (users.containsKey(id));
        User userWithId = new User(id, item.getName(), item.getUsername(), rolesRepository.getById(defaultId));
        users.put(id, userWithId);
        addToFile();
    }
}