import java.io.Serializable;

public class EagerSingleton implements Serializable {

    private static EagerSingleton instance = new EagerSingleton();

    private EagerSingleton() {

    }

    public static EagerSingleton getInstance() {
        return instance;
    }
}
