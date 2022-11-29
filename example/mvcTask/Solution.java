package mvcTask;

import mvcTask.controller.Controller;
import mvcTask.model.FakeModel;
import mvcTask.model.MainModel;
import mvcTask.model.Model;
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
    }
}