package design.pattern;

//Eager Initialization
class SingletonPattern {

    private final static SingletonPattern employee = new SingletonPattern();


    private SingletonPattern(){
        System.out.println("Hello");

    }
    public static SingletonPattern getEmployee(){
        return employee;
    }
   void method(){
        System.out.println("world");
   }


}

class Employee{
    public static void main(String[] args){
        SingletonPattern singletonPattern= SingletonPattern.getEmployee();
        singletonPattern.method();

    }



}