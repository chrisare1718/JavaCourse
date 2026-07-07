import  java.util.Scanner;

public class nestedLoops {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        // nested loop = loop inside another loop
        int rows;
        int columns;
        char symbols;

        System.out.println("Enter the # of rows: ");
        rows = scanner.nextInt();

        System.out.print("Enter the # of columns: ");
        columns = scanner.nextInt();

        System.out.print("Enter the symbol to use: ");
        symbols = scanner.next().charAt(0);

        for(int i = 0; i < rows; i++){
            for(int j = 0; j < columns; j++){
                System.out.print(symbols);
            }
            System.out.println();
        }
        scanner.close();
        scanner.close();
    }
}