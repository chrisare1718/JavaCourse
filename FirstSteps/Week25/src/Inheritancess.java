public class Inheritancess {

    public static void main(String[] args){
        // Inheritance = One class inherits the attributes and methods
        // from another class
        // Grandparent -> Parent -> Child


        Dog dog = new Dog();
        Cat cat = new Cat();
        Plant plant = new Plant();

        dog.eat();
        dog.speak();
        System.out.println(dog.lives);
        System.out.println(cat.isAlive);
        System.out.println(cat.lives);
        cat.speak();
        System.out.println(plant.isAlive);
        plant.photosyntezise();



    }

}
