package lt.codeacademy.myTestingTool.repositories;

public interface Repository<R> {

    void renewData();
    R getById(int id);

    void add(R item);
}
