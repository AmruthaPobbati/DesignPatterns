import java.io.Serializable;

public class MultiThreadSingleton implements Serializable {

    private static MultiThreadSingleton instance = null;

    private MultiThreadSingleton() {

    }

    public static MultiThreadSingleton getInstance() {
        if (instance == null) {
            synchronized (MultiThreadSingleton.class) {

                if (instance == null) {
                    instance = new MultiThreadSingleton();
                }
            }
        }
        return instance;
    }
}
