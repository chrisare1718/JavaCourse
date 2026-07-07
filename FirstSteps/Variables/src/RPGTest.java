import java.util.Scanner;

public class RPGTest {
    public static void main(String[] args){

        /* 1- Create an RPG, first ask the user name, the kind of fighter and hiss age */


        Scanner getUserData = new Scanner(System.in);


        System.out.print("What is your name? ");
        String userName = getUserData.nextLine();

        System.out.print("How old are you? ");
        int userAge = getUserData.nextByte();
        getUserData.nextLine();
        System.out.println("Great! Now we know you're: " + userName + ", " + userAge + " years old.");

        System.out.println("Now tell me, we have these options \n" +
                "1-Wizard \n" +
                "2-Soldier\n" +
                "3-Troll \n" +
                "Put the number to pick your character: ");

        int pickCharacter = getUserData.nextByte();
        getUserData.nextLine();

        System.out.print("Great! Now give it a name: ");
        String characterName = getUserData.nextLine();

        String selectedCharacter = "";

        if(pickCharacter == 1){
            selectedCharacter = "Wizard";
        }
        else if(pickCharacter == 2){
            selectedCharacter = "Soldier";
        }
        else if(pickCharacter == 3){
            selectedCharacter = "Troll";
        }
        else{
            System.out.println("Invalid class.");
        }

        System.out.println("We saved your data " + characterName + " the " + selectedCharacter);

        int enemyLife = 100;
        int characterAttack = 45;
        int i = 0;

        while(enemyLife > 0){
            System.out.println("Enemy HP: " + enemyLife);
            System.out.println(characterName + " attacks!");
            enemyLife  = enemyLife - characterAttack;

            if(enemyLife <= 0){
                enemyLife = 0;

                System.out.println("Enemy HP: " + enemyLife);
                System.out.println("Enemy defeated");

            }
        }

        getUserData.close();

    }

}
