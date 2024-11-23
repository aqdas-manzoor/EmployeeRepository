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