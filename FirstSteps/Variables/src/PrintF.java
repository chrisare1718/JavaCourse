public class PrintF {
    public static void main(String[] args){
        // Is an alternative to printline or print

        // printf() is a method used to format output

        // %[flags][width][.precision][specifier-character]

        String name = "Link";
        char first_Letter = 'L';
        int age = 17;
        double height = 1.60;
        boolean isKnight = true;

        System.out.printf("Hello %s\n", name);
        System.out.printf("Your name starts with the letter: %c\n", first_Letter);
        System.out.printf("You're %d years old\n", age);
        System.out.printf("You're %f cm tall\n", height);
        System.out.printf("He's a knight: %b\n", isKnight);

        System.out.printf("My name is %s and I'm %d years old, it is %b that I'm a knight\n", name, age, isKnight);

        double price1 = 3.14156;

        System.out.printf("The price is: %.2f\n", price1);
    }
}
