package threading;

class MyThread extends Thread {
    @Override
    public void run() {
        /**
         * join(): This method is used to ensure that one thread waits for another thread to complete
         * before it continues its execution. When you call join() on a thread,
         * the current thread will wait until the thread on which join() was called finishes.
         */
        try {
            System.out.println(Thread.currentThread().getName() + " is running");
            Thread.sleep(2000); // Simulate some work by sleeping for 2 seconds
            System.out.println(Thread.currentThread().getName() + " has finished");
        } catch (InterruptedException e) {
            System.out.println("Thread interrupted");
        }
    }
}

public class ThreadJoinExample {
    public static void main(String[] args) {
        MyThread thread1 = new MyThread();
        MyThread thread2 = new MyThread();

        thread1.start();
        thread2.start();

        try {
            // Wait for thread1 to finish before continuing
            thread1.join();
            System.out.println("thread1 has finished. Now continuing with the main thread.");

            // Wait for thread2 to finish before continuing
            thread2.join();
            System.out.println("thread2 has finished. Now continuing with the main thread.");
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted");
        }

        System.out.println("Main thread finishes");
    }
}
