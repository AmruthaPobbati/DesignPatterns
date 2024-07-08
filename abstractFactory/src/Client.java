import factories.GUIFactory;
import factories.LinuxFactory;
import factories.WindowsFactory;

import java.util.Random;

public class Client {
    public static void main(String[] args) {
        OSTYPE ostype = getOsConfiguration();
        GUIFactory factory;

        switch (ostype) {
            case WINDOWS -> factory = new WindowsFactory();
            case LINUX -> factory = new LinuxFactory();
            default -> throw new IllegalArgumentException("OS Type not defined !");
        }
        Application application = new Application(factory);
        application.renderUI();
    }

    public static OSTYPE getOsConfiguration() {
        return OSTYPE.values()[new Random().nextInt(OSTYPE.values().length)];
    }
}