public class Student {

    String name;
    int age;
    double gpa;
    boolean isEnrolled;

    // Create a constructor
    Student(String name, int age, double gpa){
        // This object attribute equals this constructor parameter
        this.name = name;  // student1.name = name;
        this.age = age;
        this.gpa = gpa;
        this.isEnrolled = true;
    }

    void study(){
        System.out.println(this.name + " is studying");
    }
}