package nested.classes.anonymousclass;

public class AnonyMousClassExam2 {
    public static void main(String[] args){
        Runnable myRunnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("Running in an anonymous class!");
            }
        };
     Thread obj = new Thread(myRunnable);
     obj.start();

    }
}
