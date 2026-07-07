public class Car {
    // Attributes
    String make = "Toyota";
    String model = "Matrix";
    int year = 2005;
    double price = 3500.00;
    boolean isRunning = false;

    void start(){
        isRunning = true;
        System.out.println("You start the engine");
    }

    void stop(){
        isRunning = false;
        System.out.println("You stop the engine");
    }

    void drive(){
        System.out.println("You drive the " + model);
    }

    void bake(){
        System.out.println("You brake the " + model);
    }
}