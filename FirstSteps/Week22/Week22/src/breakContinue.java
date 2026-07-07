public class breakContinue {

    public static void main(String[] args){

        // break = stop a loop
        // continue = skip current iteration of a loop

        for(int i = 0; i < 10; i++){
            if(i == 5){
                // break; // here breaks on 5 and stop printing
                continue; // here skips 5 into the print on continue

            }

            System.out.println(i + " ");
        }

    }

}
