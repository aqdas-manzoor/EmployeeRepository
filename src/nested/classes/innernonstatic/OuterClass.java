package nested.classes.innernonstatic;

public class OuterClass {
    int i;
    static int j;

   static void method() {
        System.out.println("outer class static method");
    }
    void displayOuter() {
    }
    class NonStaticClass {
        public void display() {
            i = 10;
            j = 20;
            System.out.println(i + " " + j);
            method();
            displayOuter();
        }
    }

    public static void main(String[] args) {
        OuterClass outerObject = new OuterClass();
        NonStaticClass nonStaticClass = outerObject.new NonStaticClass();
        nonStaticClass.display();
    }
}
