package mvcTask;

import mvcTask.controller.Controller;
import mvcTask.model.FakeModel;
import mvcTask.model.Model;
import mvcTask.view.UsersView;

public class Solution {
    public static void main(String[] args) {
        Model model = new FakeModel();
        UsersView usersView = new UsersView();
        Controller controller = new Controller();

        usersView.setController(controller);
        controller.setModel(model);
        controller.setUsersView(usersView);

        usersView.fireEventShowAllUsers();
    }
}