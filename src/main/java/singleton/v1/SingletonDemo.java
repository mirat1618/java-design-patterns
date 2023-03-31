package singleton.v1;

public class SingletonDemo {
    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance();

        System.out.println(singleton.hashCode());
        System.out.println(Singleton.getInstance().hashCode());
    }
}

class Singleton {
    private static Singleton INSTANCE;

    private Singleton() { }

    public static synchronized Singleton getInstance() {
        if(INSTANCE == null)
            INSTANCE = new Singleton();

        return INSTANCE;
    }
}
