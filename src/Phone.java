// Abstract Product (Phone)
abstract class Phone {
    abstract void displayInfo();
}

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


abstract class PhoneFactory {
    abstract Phone createPhone();

    public void displayPhoneInfo() {
        Phone phone = createPhone();
        phone.displayInfo();
    }
}

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

class Factory {
    public static void main(String[] args) {
        PhoneFactory iphoneFactory = new IphoneFactory();
        iphoneFactory.displayPhoneInfo();


        PhoneFactory onePlusFactory = new OnePlusFactory();
        onePlusFactory.displayPhoneInfo();
    }
}
