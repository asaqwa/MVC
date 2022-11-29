package mvcTask.model;

import mvcTask.dao.mock.DataSource;

public class FakeModel  implements Model{
    private ModelData modelData = new ModelData();

    @Override
    public ModelData getModelData() {
        return modelData;
    }

    @Override
    public void loadUsers() {
        modelData.setUsers(DataSource.getInstance().getUsers());
    }

    @Override
    public void loadDeletedUsers() {
        throw new UnsupportedOperationException();
    }
}
