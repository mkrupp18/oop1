import java.util.Random;
import java.util.random;
public class FunWithStrings{
    public static void main(String[] args){
        System.out.println("This program demonstrates strings");
        String phase = "it is a gloomy monday, and the bears suck";
        int charCount = phrase.length();
        String chars3To8 = phrase.substring(16,30);
        System.out.printf("there are %-10d characters in the string, and the substring is %s. \n", charCount, chars3To8); 
        String upper = phrase.toUpperCase();
        String lower = phrase.toLowerCase();
        System.out.println("the uppercase of this is"+ upper + ".");

        Random randy = new Random();
        int startPos = randy.nextInt(charCount);
        char randomChar = phrase.charAt(startPos);
        System.out.println("the randomly chosen character is at position"+ startPos + "and is a"+ randomChar);

    }

}