package design.pattern;

//Double-Checked Locking (Optimized with Synchronization)
public class SingletonPattern3 {
    private static volatile SingletonPattern3 instance;


    private SingletonPattern3() {
        System.out.println("private SingletonPattern3 constructor");
    }

    public static SingletonPattern3 getInstance() {
        if(instance == null){
            synchronized (SingletonPattern3.class){
                if(instance == null){
                    instance = new SingletonPattern3();
                }
            }
        }
        return instance;
    }
}
class Singleton1{
    public static void main(String[] args) {

        SingletonPattern3 s1 = SingletonPattern3.getInstance();



    }
}