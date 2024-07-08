import factories.*;
import products.IButton;
import products.ICheckbox;

public class Application {

    private final GUIFactory factory;
    private IButton button;
    private ICheckbox checkbox;

    public Application(GUIFactory factory) {
        this.factory = factory;
    }

    private void buildUI() {
        button = factory.createButton();
        checkbox = factory.createCheckbox();
    }

    void renderUI() {
        buildUI();
        button.paint();
        checkbox.paint();
    }
}
