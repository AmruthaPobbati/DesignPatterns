package factories;

import products.IButton;
import products.LinuxButton;

public class LinuxButtonFactory implements IButtonFactory{
    @Override
    public IButton getButton() {
        return new LinuxButton();
    }
}
