package mvcTask.model;

public interface Model {
    ModelData getModelData();
    void loadUsers();
    void loadDeletedUsers();
}
