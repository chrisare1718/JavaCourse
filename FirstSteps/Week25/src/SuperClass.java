public class SuperClass {

    public static void main(){

        // super = Refers to the parent class (superclass -> subclass)
        // Used in constructors and method overriding
        // Calls the parent constructor to initialize attributes

        Person person = new Person("Harry", "Potter");

        HogwartsStudent hStudent = new HogwartsStudent("Hermione", "Gringer", 4.9);

        HogwartsEmployee hEmployee = new HogwartsEmployee("Severus", "Snape", 500);

        person.showName();
        hStudent.showName();
        System.out.println(hStudent.gpa);
        hStudent.showGPA();

        hEmployee.showSalary();
        hEmployee.showName();

    }

}
