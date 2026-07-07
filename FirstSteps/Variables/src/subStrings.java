import java.util.Scanner;

public class subStrings {
    public static void main(String[] args){
        // .substring is a method used to extract a portion of a string

        Scanner getData = new Scanner(System.in);

        String email;
        String userName;
        String domain;

        System.out.print("Enter your email: ");

        email = getData.nextLine();

        if(email.contains("@")){
            userName = email.substring(0, email.indexOf("@"));
            domain  = email.substring(email.indexOf("@") + 1);

            System.out.println(userName);
            System.out.println(domain);
        }
        else{
            System.out.println("Email must contain @");
        }

        getData.close();
    }
}