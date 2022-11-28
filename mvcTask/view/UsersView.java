package view;

import bean.User;
import controller.Controller;
import model.ModelData;

public class UsersView implements View {
    private Controller controller;

    public void fireEventShowAllUsers() {
        controller.onShowAllUsers();
    }

    @Override
    public void refresh(ModelData modelData) {
        StringBuilder toPrint = new StringBuilder("All users:\n");
        for (User user : modelData.getUsers()) {
            toPrint.append('\t').append(user).append('\n');
        }
        toPrint.append("===================================================").append('\n');
        System.out.println(toPrint);
    }

    @Override
    public void setController(Controller controller) {
        this.controller = controller;
    }
}
