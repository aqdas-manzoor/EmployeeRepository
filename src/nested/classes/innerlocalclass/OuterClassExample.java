package nested.classes.innerlocalclass;

public class OuterClassExample {
    static int staticVar = 100;
    int nonStaticVar = 200;
    final int finalVar = 300;
    void outerMethod() {
        class LocalClass {
            int instanceVar = 10;
            final int finalInstanceVar = 20;

            void display() {
                System.out.println("Accessing outer class static variable: " + staticVar);
                System.out.println("Accessing outer class non-static variable: " + nonStaticVar);
                System.out.println("Accessing outer class final variable: " + finalVar);
                System.out.println("Accessing local class non-static variable: " + instanceVar);
                System.out.println("Accessing local class final variable: " + finalInstanceVar);
            }
        }
        LocalClass localObj = new LocalClass();
        localObj.display();
    }

    public static void main(String[] args) {
        OuterClassExample outerObj = new OuterClassExample();
        outerObj.outerMethod();
    }
}
