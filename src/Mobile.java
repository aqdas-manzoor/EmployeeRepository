// Abstract Product (Phone) - Interface
interface Mobile {
    void displayInfo();
}

// Concrete Products
class IPhoneModel implements Mobile {
    public void displayInfo() {
        System.out.println("IPhoneModel - A premium phone.");
    }
}

class OnePlusModel implements Mobile {
    public void displayInfo() {
        System.out.println("OnePlusModel - A high-performance phone.");
    }
}

// Abstract Factory - Interface
interface MobileFactory {
    Mobile createMobile();  // Factory method to create Mobile
}

// Concrete Factories
class IPhoneMobileFactory implements MobileFactory {
    public Mobile createMobile() {
        return new IPhoneModel();  // Return a concrete Mobile (IPhone)
    }
}

class OnePlusMobileFactory implements MobileFactory {
    public Mobile createMobile() {
        return new OnePlusModel();  // Return a concrete Mobile (OnePlus)
    }
}

// Client Code
 class AbstractClientCode {
    public static void main(String[] args) {
        // Using IPhoneFactory to create an IPhone
        MobileFactory iphoneFactory = new IPhoneMobileFactory();
        Mobile iphone = iphoneFactory.createMobile();
        iphone.displayInfo();

        // Using OnePlusFactory to create a OnePlus
        MobileFactory onePlusFactory = new OnePlusMobileFactory();
        Mobile onePlus = onePlusFactory.createMobile();
        onePlus.displayInfo();
    }
}
