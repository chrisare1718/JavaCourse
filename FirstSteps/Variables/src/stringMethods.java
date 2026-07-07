import java.util.Locale;

public class stringMethods {
    public static void main(String[] args){
        String name = "Christian Arellano";

        String data = "yourmamma";

        int length = name.length();
        char letter = name.charAt(10);
        int index = name.indexOf("i");
        int lastIndex = name.lastIndexOf("a");

        // name = name.toLowerCase();
        // name = name.toUpperCase();
        // name = name.trim();
        // name = name.replace("i", "e");

        if(name.contains(" ")){
            System.out.println("Your name has spaces");
        }
        else{
            System.out.println("Your name has no spaces");
        }

        // equalsIgnoreCase ignores capital letters
        if(data.equalsIgnoreCase("yourMamma")){
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }


        // System.out.println(name);
    }
}
