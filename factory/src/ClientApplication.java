import products.IButton;

import java.util.Random;

public class ClientApplication {

    IButton button;

    public void createUI() {
        // mock OSConfiguration reading
        OSTYPE osType = getOSConfiguration();

        button = IButtonFactory.getButton(osType);
        // here the client has information of the IButton methods for it to use
        button.paint();
    }

    public OSTYPE getOSConfiguration() {
        return OSTYPE.values()[new Random().nextInt(OSTYPE.values().length)];
    }
}
