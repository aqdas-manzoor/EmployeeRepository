// Bill Pugh Singleton Design
public class SingletonPattern4 {
    private SingletonPattern4() {
        System.out.println("SingletonPattern4 constructor");
    }
    private static class Singleton {
        private static final SingletonPattern4 instance = new SingletonPattern4();
    }

    public static SingletonPattern4 getInstance() {
        return Singleton.instance;
    }
}
class Main1{
    public static void main(String[] args) {
        SingletonPattern4 singletonPattern4=SingletonPattern4.getInstance();
    }
}
