package factories;

import products.IButton;

public interface IButtonFactory {
    IButton getButton();

    public default void paint() {
        IButton button = getButton();
        button.paint();
    }
}
