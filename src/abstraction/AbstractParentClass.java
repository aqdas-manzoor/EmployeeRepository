package abstraction;

abstract class AbstractParentClass {

    public abstract void sound();
}

abstract class ChildDemoClass extends AbstractParentClass {
    @Override
    public void sound() {
        System.out.println("implemented the parent abstract method");
    }

    public abstract void eat();
}

class implementAbstractClasses extends ChildDemoClass {

    @Override
    public void eat() {
        System.out.println("implemented 2nd abstract method");
    }

    public static void main(String[] args) {
        implementAbstractClasses obj = new implementAbstractClasses();
        obj.eat();
        obj.sound();
    }

}


