package nested.classes.anonymousclass;

public class ConcreteClassExam {
    void  display(){
        System.out.println("method display");
    }

}
class Test{

  ConcreteClassExam obj = new ConcreteClassExam(){
   @Override
    void display(){
        System.out.println("Ovveride the parent class display method");
    }
};
public static void main(String[] args){
   Test obj1 = new Test();
    obj1.obj.display();
}}
