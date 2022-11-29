package mvcTask.view;

import mvcTask.controller.Controller;
import mvcTask.model.ModelData;

public interface View {
    void refresh(ModelData modelData);
    void setController(Controller controller);
}
