
interface FunctionalInterface {
    void say();
}

class FunctionalInterfaceExample {
    static void saySomething() {
        System.out.println("Hello World");
    }

    public static void main(String[] args) {
        FunctionalInterface calculator = () -> System.out.println("Hello World");
        calculator.say();
        FunctionalInterface functionalInterface= FunctionalInterfaceExample::saySomething;
        functionalInterface.say();

    }
}
