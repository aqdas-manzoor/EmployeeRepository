package nested.classes.anonymousclass;

public class AnonymousclassExam1 {
        Runnable myRunnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("Running in an anonymous class!");
            }
        };
        public static void main(String[] args){

           AnonymousclassExam1 anonyMousClass = new AnonymousclassExam1();
            anonyMousClass.myRunnable.run();

        }
    }
