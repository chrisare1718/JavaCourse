public class Constructorr {

    public static void main(String[] args) {
        // constructor = A special method to initialize objects
        // You can pass arguments to a constructor
        // And set up initial values

        Student student1 = new Student("Spongebob", 30, 3.2);
        Student student2 = new Student("Patrick", 24, 1.5);

        System.out.println(student1.name);
        System.out.println(student1.age);
        System.out.println(student1.gpa);
        student1.study();

        System.out.println(student2.name);
        System.out.println(student2.age);
        System.out.println(student2.gpa);
        System.out.println(student2.isEnrolled);
        student2.study();
    }
}