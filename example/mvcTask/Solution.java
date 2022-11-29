package mvcTask;

import mvcTask.controller.Controller;
import mvcTask.model.FakeModel;
import mvcTask.model.MainModel;
import mvcTask.model.Model;
import mvcTask.view.EditUserView;
import mvcTask.view.UsersView;

public class Solution {
    public static void main(String[] args) {
        Model model = new MainModel();
        UsersView usersView = new UsersView();
        Controller controller = new Controller();

        usersView.setController(controller);
        controller.setModel(model);
        controller.setUsersView(usersView);

        usersView.fireEventShowAllUsers();

        EditUserView editUserView = new EditUserView();
        editUserView.setController(controller);
        controller.setEditUserView(editUserView);

        usersView.fireEventOpenUserEditForm(126L);

        usersView.fireEventShowDeletedUsers();
    }
}