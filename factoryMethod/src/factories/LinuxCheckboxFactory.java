package factories;

import products.IButton;
import products.ICheckbox;
import products.LinuxButton;
import products.LinuxCheckbox;

public class LinuxCheckboxFactory implements ICheckboxFactory{
    @Override
    public ICheckbox getCheckbox() {
        return new LinuxCheckbox();
    }
}
