package controller;

import model.Model;
import view.UsersView;

public class Controller {
    private Model model;
    private UsersView usersView;

    public void onShowAllUsers() {
        model.loadUsers();
        usersView.refresh(model.getModelData());
    }

    public void setModel(Model model) {
        this.model = model;
    }

    public void setUsersView(UsersView usersView) {
        this.usersView = usersView;
    }
}
