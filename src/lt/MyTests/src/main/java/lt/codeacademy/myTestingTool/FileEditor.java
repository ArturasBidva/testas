package lt.codeacademy.myTestingTool;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.type.CollectionType;

import java.io.File;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class FileEditor<R> {

    Class<R> classType;

    private String fileName = "";

    public FileEditor(String fileName,Class<R> parameterClass) {
        this.fileName = fileName;
        this.classType = parameterClass;
    }

    public void addToFile(List<R> itemList) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            mapper.writeValue(Paths.get(fileName).toFile(), itemList);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public List<R> readFromFile() {
        System.out.println();
        List<R> entities;
        try {
            ObjectMapper objectMapper = new ObjectMapper();
            CollectionType listType =
                    objectMapper.getTypeFactory().constructCollectionType(ArrayList.class,classType);
            entities = objectMapper.readValue(
                    new File(fileName),
                    listType
            );
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        return entities;
    }
}
