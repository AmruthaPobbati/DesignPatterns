public class SingletonDesignPattern extends Thread {
    public static void main(String[] args) {
//        testLazySingleton();
//        testEagerSingleton();
        testMultiThreadSingleton();
    }

    public static void testLazySingleton() {
        SingletonDesignPattern mainObjThread1 = new SingletonDesignPattern();
        SingletonDesignPattern mainObjThread2 = new SingletonDesignPattern();

        mainObjThread1.start();
        mainObjThread2.start();
    }

    public static void testEagerSingleton() {
        SingletonDesignPattern mainObjThread1 = new SingletonDesignPattern();
        SingletonDesignPattern mainObjThread2 = new SingletonDesignPattern();

        mainObjThread1.start();
        mainObjThread2.start();
    }

    public static void testMultiThreadSingleton() {
        SingletonDesignPattern mainObjThread1 = new SingletonDesignPattern();
        SingletonDesignPattern mainObjThread2 = new SingletonDesignPattern();

        mainObjThread1.start();
        mainObjThread2.start();
    }

    public void run() {
        MultiThreadSingleton obj = MultiThreadSingleton.getInstance();
        System.out.println("Multi-thread Singleton Object: " + obj.hashCode());
    }

//    public void run() {
//        EagerSingleton obj = EagerSingleton.getInstance();
//        System.out.println("Eager Singleton Object: " + obj.hashCode());
//    }

//    public void run() {
//        LazySingleton obj = LazySingleton.getInstance();
//        System.out.println("Lazy Singleton Object: " + obj.hashCode());
//    }




}