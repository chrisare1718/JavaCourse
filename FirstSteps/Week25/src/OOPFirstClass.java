public class OOPFirstClass {

    public static void main(String[] args){
        // Object = an entity that holds data (attributes)
        // and can perform actions (methods)
        // It is a reference data type

        Car car = new Car(); // Create object

        System.out.println(car.model); // Call attribute

        System.out.println(car.isRunning);
        car.start(); // Call method
        System.out.println(car.isRunning);
        car.stop(); // Call method
        System.out.println(car.isRunning);


        car.drive();
        car.bake();
    }

}
