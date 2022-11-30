package mvcTask.view;

import mvcTask.controller.Controller;
import mvcTask.model.ModelData;

public class EditUserView implements View {
    private Controller controller;

    public void fireEventUserDeleted(long id) {
        controller.onUserDelete(id);
    }

    @Override
    public void refresh(ModelData modelData) {
        StringBuilder toPrint = new StringBuilder("User to be edited:\n\t").
                append(modelData.getActiveUser()).
                append("\n===================================================");
        System.out.println(toPrint);

    }

    @Override
    public void setController(Controller controller) {
        this.controller = controller;
    }
}