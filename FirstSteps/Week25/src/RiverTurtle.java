public class RiverTurtle extends RiverAnimals{

    // The @Override allows to identify the override method, which Class it comes
    // And if its misspelled or something, shows where's to check
    @Override
    void move(){
        System.out.println("This animal is running");
    }
}
