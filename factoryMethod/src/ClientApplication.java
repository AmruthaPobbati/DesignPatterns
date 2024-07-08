import factories.*;

import java.util.Random;

public class ClientApplication {

    IButtonFactory buttonFactory;
    ICheckboxFactory checkboxFactory;

    public void buildUI() {
        // mock OSConfiguration reading
        OSTYPE osType = getOSConfiguration();
        // here the client is in exposed of which factory to create object for based on OSConfigruation
        switch (osType) {
            case OSTYPE.WINDOWS -> {
                buttonFactory = new WindowsButtonFactory();
                checkboxFactory = new WindowsCheckboxFactory();
            }
            case OSTYPE.LINUX -> {
                buttonFactory = new LinuxButtonFactory();
                checkboxFactory = new LinuxCheckboxFactory();
            }
            default -> throw new IllegalArgumentException("OSTYPE doesn;t exist");
        }
        renderUI();
    }

    public void renderUI() {
        buttonFactory.paint();
        checkboxFactory.paint();
    }

    public OSTYPE getOSConfiguration() {
        return OSTYPE.values()[new Random().nextInt(OSTYPE.values().length)];
    }
}
