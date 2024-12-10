package threading;

class AB implements Runnable {

    @Override
    public void run() {
        System.out.println("Running AB");
    }
}


public class MultiThreadingExample {
    public static void main(String[] args) {
        /**
         *  Runnable interface has only one run method and for running it so we have to create the object of thread
         *  class and then give the object of AB class to thread object to run it.
         */
        Thread thread = new Thread(new AB());
        thread.start();
        System.out.println("Running main method");
    }
}
