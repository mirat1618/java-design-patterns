package singleton.v2;

public class EnumSingletoneDemo {
    public static void main(String[] args) {
        Singleton singleton = Singleton.INSTANCE.getInstance();

        System.out.println(singleton.hashCode());
        System.out.println(Singleton.INSTANCE.getInstance().hashCode());
    }
}


enum Singleton {
    INSTANCE;

    public Singleton getInstance() {
        return INSTANCE;
    }
}