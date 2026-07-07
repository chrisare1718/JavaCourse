public class OverLoadConstructorr {
    public static void main(String[] args){
        // overload constructors = Allow a class to have multiple constructors
        // with different parameter list
        // Enable objects to be initialized in various ways

        User user1 = new User("Merlin");
        User user2 = new User("Arthur", "arthur25@gmail.com");
        User user3 = new User("Rauru", "rauru1000@gmail.com", 1000);

        System.out.println(user1.username);

        System.out.println(user2.username);
        System.out.println(user2.email);

        System.out.println(user3.username);
        System.out.println(user3.email);
        System.out.println(user3.age);
    }
}