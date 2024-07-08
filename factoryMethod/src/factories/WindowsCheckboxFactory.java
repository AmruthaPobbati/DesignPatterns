package factories;

import products.ICheckbox;
import products.WindowsCheckbox;

public class WindowsCheckboxFactory implements ICheckboxFactory {
    @Override
    public ICheckbox getCheckbox() {
        return new WindowsCheckbox();
    }
}
