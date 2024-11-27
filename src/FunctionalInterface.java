//using lambda expression
interface FunctionalInterface {
    int add(int a, int b);


}
 class FunctionalInterfaceExample {

    void method1(){
        FunctionalInterface calculator = (a, b) -> a + b; //lambda expression
        System.out.println(calculator.add(5,3));


    }
    public static void main(String[] args) {
        FunctionalInterfaceExample obj1 = new FunctionalInterfaceExample();
        obj1.method1();
}
}





