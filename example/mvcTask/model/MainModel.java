package mvcTask.model;

import mvcTask.model.service.UserService;
import mvcTask.model.service.UserServiceImpl;

public class MainModel implements Model {
    private ModelData modelData = new ModelData();
    private UserService userService = new UserServiceImpl();

    @Override
    public void loadUsers() {
        modelData.setUsers(userService.getUsersBetweenLevels(1, 100));
    }

    @Override
    public void loadDeletedUsers() {
        modelData.setUsers(userService.getAllDeletedUsers());
    }

    @Override
    public ModelData getModelData() {
        return modelData;
    }
}
