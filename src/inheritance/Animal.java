package inheritance;

public class Animal {
    protected static void eat(){
        System.out.println("parent eat");
    }
    public int calculation(int a, int b){
        return a+b;
    }
}
 class Dog extends Animal{

    public static void eat(){
        System.out.println("child eat");
    }
    public int calculation(int a, int b){
        return a+b;
    }
    public void abc(){

    }

    public  static  void main(String[] args){
        Animal animal = new Dog(); //upcasting
        animal.eat();
        Dog dog= (Dog) animal;  //downcasting
        dog.eat();

    }

}