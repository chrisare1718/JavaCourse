public class Polymorphismm {

    public static void main(String[] args){
        // Polymorphism = Means "multiple shapes".
        // Objects can identify as other objects.
        // Objects can be treated as objects of common superclass


        Car car = new Car();
        Bike bike = new Bike();
        Boat boat = new Boat();

        car.go();
        bike.go();
        boat.go();

        // To use the polymorphism can be used the superclass
        Vehicle[] vehicles = {car, bike, boat};

        for(Vehicle vehicle : vehicles){
            vehicle.go();
        }

    }

}
