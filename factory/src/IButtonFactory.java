import products.IButton;
import products.LinuxButton;
import products.WindowsButton;

public interface IButtonFactory {
    static IButton getButton(OSTYPE ostype) {
        switch (ostype) {
            case OSTYPE.WINDOWS -> {
                return new WindowsButton();
            }
            case OSTYPE.LINUX -> {
                return new LinuxButton();
            }
            default -> {
                throw new IllegalArgumentException("No such OSTYPE exists !");
            }
        }
    }
}
