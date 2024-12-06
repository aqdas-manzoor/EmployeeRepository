package nested.classes;


class Test{

    ConcreteClassExam obj = new ConcreteClassExam(){
        void display(){

            System.out.println("Method 2");

        }
    };
public static void main(String[] args){
Test obj1 = new Test();
obj1.obj.display();
}}