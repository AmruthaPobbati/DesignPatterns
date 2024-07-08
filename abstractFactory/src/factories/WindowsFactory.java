package factories;

import products.IButton;
import products.ICheckbox;
import products.WindowsButton;
import products.WindowsCheckbox;

public class WindowsFactory implements GUIFactory{
    @Override
    public IButton createButton() {
        return new WindowsButton();
    }

    @Override
    public ICheckbox createCheckbox() {
        return new WindowsCheckbox();
    }
}
