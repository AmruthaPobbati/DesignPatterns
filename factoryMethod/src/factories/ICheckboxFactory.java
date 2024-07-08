package factories;
import products.ICheckbox;

public interface ICheckboxFactory {
    ICheckbox getCheckbox();

    public default void paint() {
        ICheckbox checkbox = getCheckbox();
        checkbox.paint();
    }
}
