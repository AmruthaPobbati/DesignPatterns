package factories;

import products.IButton;
import products.ICheckbox;
import products.LinuxButton;
import products.LinuxCheckbox;

public class LinuxFactory implements GUIFactory {

    @Override
    public IButton createButton() {
        return new LinuxButton();
    }

    @Override
    public ICheckbox createCheckbox() {
        return new LinuxCheckbox();
    }
}
