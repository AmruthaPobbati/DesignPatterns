package factories;

import products.IButton;
import products.ICheckbox;

public interface GUIFactory {
    IButton createButton();
    ICheckbox createCheckbox();
}
