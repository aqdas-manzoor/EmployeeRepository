public class Dog extends Animal{

    public void eat(){
        System.out.println("child eat");
    }
    public int calculation(int a, int b){
        return a+b;
    }
    public void abc(){

    }

public  static  void main(String[] args){

  Animal animal = new Dog();
  Dog dog= (Dog) animal;
  dog.eat();


}

}
