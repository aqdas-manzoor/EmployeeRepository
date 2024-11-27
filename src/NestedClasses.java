import javax.swing.plaf.RootPaneUI;

class NestedClasses {
    int i;
    static int j;

    static class StaticInnerClass {
        public void display() {
            System.out.println("print static outer class variable" + j);
        }
    }

    public static void main(String[] args) {

        StaticInnerClass obj = new StaticInnerClass();
        obj.display();
    }
}
class OuterClass {
    int i;
    static int j;

    class NonStaticClass {
        public void display() {
            i = 10;
            j = 20;
            System.out.println(i + " " + j);
        }
    }

    public static void main(String[] args) {
        OuterClass outerObject = new OuterClass();
        OuterClass.NonStaticClass nonStaticClass = outerObject.new NonStaticClass();
        nonStaticClass.display();
    }
}
// local class inside the method and can access only final variable

class LocalOuterClass{

    void display(){
        final int i=10;
        class LocalClass{
            void method1(){
                System.out.println(i);
            }
        }
        LocalClass localInner = new LocalClass();
        localInner.method1();
    }
    public static void main(String[] args){

        LocalOuterClass localOuterClass= new LocalOuterClass();
        localOuterClass.display();
    }




}
class AnnonyMousClass{
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


class AnonyMosClass{

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

        AnonyMosClass obj = new AnonyMosClass();
        obj.method1();

    }

}

class AnnonyMousee{
    void  display(){
        System.out.println("method dixply");
    }

}
class Test{

    AnnonyMousee obj = new AnnonyMousee(){
        void display(){

            System.out.println("Method 2");

        }
    };
public static void main(String[] args){
Test obj1 = new Test();
obj1.obj.display();
}}