// Abstract Product (Phone)
abstract class Phone {
    abstract void displayInfo();
}

// Concrete Products
class Iphone extends Phone {
    public void displayInfo() {
        System.out.println("Iphone - A premium phone.");
    }
}

class OnePlus extends Phone {
    public void displayInfo() {
        System.out.println("OnePlus - A high-performance phone.");
    }
}

// Abstract Factory
abstract class PhoneFactory {
    abstract Phone createPhone();

    // Common functionality (optional)
    public void displayPhoneInfo() {
        Phone phone = createPhone();
        phone.displayInfo();
    }
}

// Concrete Factories
class IphoneFactory extends PhoneFactory {
    public Phone createPhone() {
        return new Iphone();
    }
}

class OnePlusFactory extends PhoneFactory {
    public Phone createPhone() {
        return new OnePlus();
    }
}

// Client Code
class Factory {
    public static void main(String[] args) {
        // Using IphoneFactory to create an Iphone
        PhoneFactory iphoneFactory = new IphoneFactory();
        iphoneFactory.displayPhoneInfo();  // Output: Iphone - A premium phone.

        // Using OnePlusFactory to create a OnePlus
        PhoneFactory onePlusFactory = new OnePlusFactory();
        onePlusFactory.displayPhoneInfo();  // Output: OnePlus - A high-performance phone.
    }
}
