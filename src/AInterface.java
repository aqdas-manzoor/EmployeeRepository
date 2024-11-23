interface AInterface {
    void A();
    default void method1(){
        System.out.println("interface 1 method");
    }
}
interface BInterface extends AInterface{

    default void A(){
        System.out.println("implemeenting A interface abstract method");
    }
    void method2();

}
class ImplementingInterface implements BInterface, AInterface{

    public void method2(){
        System.out.println("implementing interface 2nd method");



    }

    public static void main(String[] args){

        ImplementingInterface obj1= new ImplementingInterface();
        obj1.A();
        obj1.method1();
        obj1.method2();
    }



}
