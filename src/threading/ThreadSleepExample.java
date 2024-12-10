package threading;

class SleepExample extends Thread {
    @Override
    public void run() {
        /**
         * sleep(): This method pauses the current thread for a specified amount of time. During the sleep period,
         * the thread is not executing, and it allows other threads to run.
         */
        try {
            System.out.println(Thread.currentThread().getName() + " is going to sleep for 3 seconds");
            Thread.sleep(3000); // Sleep for 3 seconds
            System.out.println(Thread.currentThread().getName() + " woke up after sleep");
        } catch (InterruptedException e) {
            System.out.println("Thread interrupted");
        }
    }
}

public class ThreadSleepExample {
    public static void main(String[] args) {
        SleepExample thread1 = new SleepExample();
        SleepExample thread2 = new SleepExample();

        thread1.start(); // Start thread1
        thread2.start(); // Start thread2

        try {
            // Main thread sleeps for 1 second to let thread1 and thread2 start
            Thread.sleep(1000);
            System.out.println("Main thread is awake after 1 second of sleep");
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted");
        }

        System.out.println("Main thread finishes");
    }
}
