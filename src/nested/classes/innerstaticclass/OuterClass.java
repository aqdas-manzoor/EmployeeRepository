package nested.classes.innerstaticclass;

public class OuterClass {
    int i;
    static int j;
    static void method() {
        System.out.println("outer class static method");
    }
    static class InnerStaticClass {
        public void display() {
            method();
            j=10;
            System.out.println("print static outer class variable" + " " +j);
        }
    }
    public static void main(String[] args) {
//        NestedClasses.StaticInnerClass obj = new NestedClasses.StaticInnerClass();
        InnerStaticClass obj = new InnerStaticClass();
        obj.display();
    }
}
