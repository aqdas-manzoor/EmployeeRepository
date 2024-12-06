package nested.classes.innerlocalclass;

public class OuterClass {
    final int y=10;
    int i;
    static int j;
    static void method() {
        System.out.println("outer class static method");
    }
    void displayOuter() {
        System.out.println("outer class non static method");
    }
    void display(){
        int ii=10;
        class LocalInnerClass{
            static int j=10;
            int x;
            final int i=10;
            void method1(){
                method();
                displayOuter();
                System.out.println(i+" "+y+" "+x+ii+j);
            }
        }
        LocalInnerClass localInner = new LocalInnerClass();
        localInner.method1();
    }
    public static void main(String[] args){

        OuterClass localOuterClass= new OuterClass();
        localOuterClass.display();
    }

}
