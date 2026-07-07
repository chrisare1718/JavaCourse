public class HogwartsEmployee extends Person{

    int salary;

    HogwartsEmployee(String first, String last, int salary){
        super(first, last);
        this.salary = salary;
    }

    void showSalary(){
        System.out.println(this.first + "'s salary is $" + this.salary);
    }

}
