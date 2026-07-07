public class HogwartsStudent extends Person{

    double gpa;

    HogwartsStudent(String first, String last, double gpa){
        super(first,last); // It's like passing the Person attributes
        this.gpa = gpa;
    }

    void showGPA(){
        System.out.println(this.first + "'s gpa is: " + this.gpa);
    }

}
