package nested.classes.anonymousclass;

public class AnonyMousClassExam3 {

    public void method1(){
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("interface");
            }
        };
        runnable.run();
    }
    public static void main(String[] args){

        AnonyMousClassExam3 obj = new AnonyMousClassExam3();
        obj.method1();

    }

}
