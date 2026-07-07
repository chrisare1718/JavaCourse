public abstract class Shape {
// We can't create any objects because is an abstract class

    abstract double area();    // Create abstract method

    // Concrete method, can be Inherited
    void display(){
        System.out.println("This is a shape");
    }
}