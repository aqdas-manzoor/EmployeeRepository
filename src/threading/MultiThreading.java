package threading;

/**
 *  Thread is created by extending Thread class
 *
 */
class A extends Thread {
    public void run() {
        System.out.println("A");
    }

}

public class MultiThreading {
    public static void main(String[] args) {
        A a = new A();
        a.start();

        System.out.println("Main thread started");
    }

}
