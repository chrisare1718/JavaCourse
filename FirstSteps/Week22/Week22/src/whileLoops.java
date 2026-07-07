import java.util.Scanner;

public class whileLoops {
    public static void main(String[] args){

        Scanner whileLoop = new Scanner(System.in);

        String name = "";

        while(name.isEmpty()){
            System.out.print("Enter your name: ");
            name = whileLoop.nextLine();
        }

        System.out.println("Hello " + name);

        whileLoop.close();

    }
}
