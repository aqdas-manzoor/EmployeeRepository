package composition;

    class Car {
        private Engine engine;  // Car "composes" Engine (Engine is part of Car)

        public Car() {
            engine = new Engine();  // When a Car is created, an Engine is also created
        }

      public Engine getEngine() {
            return engine;
      }
    }

    class Engine {
        public void start() {
            System.out.println("Engine is starting...");
        }

        public void stop() {
            System.out.println("Engine is stopping...");
        }
    }

    class Main {
        public static void main(String[] args) {
            Car car = new Car();    // When a Car is created, the Engine is also created
             car.getEngine().start();
             car.getEngine().stop();
        }
    }