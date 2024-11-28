//lazy initialization(thread safety with synchronized method)
public class SingletonPattern2 {

    private static SingletonPattern2 instance;
    private SingletonPattern2() {
        System.out.println("SingletonPattern2 constructor");
    }
    public static synchronized SingletonPattern2 getInstance() {
        if (instance == null) {
            instance = new SingletonPattern2();
        }
        return instance;
    }

}
class Singleton {
    public static void main(String[] args) {
        SingletonPattern2 singleton = SingletonPattern2.getInstance();

    }
}
