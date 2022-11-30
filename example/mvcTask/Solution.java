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
        EditUserView editUserView = new EditUserView();
        Controller controller = new Controller();

        usersView.setController(controller);
        editUserView.setController(controller);

        controller.setModel(model);
        controller.setUsersView(usersView);
        controller.setEditUserView(editUserView);

        usersView.fireEventShowAllUsers();
        usersView.fireEventOpenUserEditForm(126L);
        editUserView.fireEventUserDeleted(124L);
        usersView.fireEventShowDeletedUsers();
    }
}