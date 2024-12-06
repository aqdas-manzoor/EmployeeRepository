package polymorphisam;

public class Overriding {

    Overriding show(){

        System.out.println("parent class method");
        return this;
    }

}
 class A  extends Overriding{

    A show(){
        System.out.println("child class method");
        return this;
    }
    public  static void main(String[] args){
        A obj= new A();
        obj.show();
    }
}
class Animal {
    protected Animal getAnimal() {
        return new Animal();
    }
}

class Dog extends Animal {
    @Override
    public Dog getAnimal() {  // Covariant return type, and more permissive access modifier (public)
        return new Dog();
    }
}