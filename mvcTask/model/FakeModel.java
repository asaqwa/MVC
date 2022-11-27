package model;

import bean.User;

import java.util.LinkedList;
import java.util.List;

public class FakeModel  implements Model{
    private ModelData modelData = new ModelData();

    @Override
    public void loadUsers() {
        List<User> users = new LinkedList<User>() {{
            add(new User("Ivanov", 123l, 1));
            add(new User("Petrov", 124l, 2));
            add(new User("Petrov", 125l, 1));
            add(new User("Sidorov", 126l, 2));
        }};
        modelData.setUsers(users);
    }

    @Override
    public ModelData getModelData() {
        return modelData;
    }
}
