public class MethodOverraidingss {

    public static void main(String[] args){

        // Method Overriding = When a subclass provides its own
        // Implementation of a method that is already defined.
        // Allows for code reusability and give specific implementations.

        RiverFish fish = new RiverFish();
        RiverTinyFish tinyFish = new RiverTinyFish();
        RiverTurtle turtle = new RiverTurtle();


        fish.move();
        tinyFish.move();
        turtle.move();

    }

}
