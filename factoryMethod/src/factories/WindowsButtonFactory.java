package factories;

import products.IButton;
import products.WindowsButton;

public class WindowsButtonFactory implements IButtonFactory {

    @Override
    public IButton getButton() {
        return new WindowsButton();
    }
}
