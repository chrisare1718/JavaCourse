public class VariableScope {
    // GLOBAL variable is declared on the CLASS and outside of the methods
    // Are useful for a constant value or OOP

    static int x = 5;

    public static void main(String[] args){

        // Variable declared on the same method is called LOCAL

        System.out.println(x);

        doSomething();
    }

    static void doSomething(){
        // Java prefers use first the local variable than global one
        int x = 7;
        System.out.println(x);
    }

}
