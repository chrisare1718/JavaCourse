public class nestedIfs {
    public static void main(String[] args){
        boolean isStudent = true;
        boolean isSenior = false;
        double price = 19.99;

        if(isStudent){
            if(isSenior){
                System.out.println("You get a discount of 20% for being a senior");
                System.out.println("You get a discount of 10% for being a student");
                price *= 0.7;
            }
            else{
                System.out.println("You get a discount of 10% for being a student");
                price *= 0.9;
            }
        }
        else{
            if(isSenior){
                System.out.println("You get a discount of 20% for being a senior");
                price *= 0.8;
            }
            else{
                price *= 1;
            }
        }
        System.out.printf("The price of the ticket is %.2f pesos\n", price);


    }
}
