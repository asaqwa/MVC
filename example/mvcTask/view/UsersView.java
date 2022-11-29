package mvcTask.view;

import mvcTask.bean.User;
import mvcTask.controller.Controller;
import mvcTask.model.ModelData;

public class UsersView implements View {
    private Controller controller;

    public void fireEventShowAllUsers() {
        controller.onShowAllUsers();
    }

    public void fireEventShowDeletedUsers() {
        controller.onShowAllDeletedUsers();
    }

    @Override
    public void refresh(ModelData modelData) {
        StringBuilder toPrint = new StringBuilder();

        if (modelData.isDisplayDeletedUserList()) toPrint.append("All deleted users:\n");
        else toPrint.append("All users:\n");

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