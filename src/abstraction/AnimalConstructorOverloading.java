package abstraction;

/**
 * a subclass constructor calls the constructor of its superclass using the super() keyword.
 */
    class AnimalConstructorOverloading {
        String name;

        // Constructor of the superclass
        public AnimalConstructorOverloading(String name) {
            this.name = name;
            System.out.println("Animal constructor called");
        }
    }

    class Dog extends AnimalConstructorOverloading {
        int age;

        // Constructor of the subclass
        public Dog(String name, int age) {
            // Calls the superclass constructor
            super(name);
            this.age = age;
            System.out.println("Dog constructor called");
        }

        public void displayDetails() {
            System.out.println("Name: " + name + ", Age: " + age);
        }

        public static void main(String[] args) {
            Dog dog = new Dog("Buddy", 3);  // Calls Dog constructor
            dog.displayDetails();           // Outputs: Name: Buddy, Age: 3
        }
    }


