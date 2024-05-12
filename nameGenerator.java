import java.util.Scanner;
import java.util.Random;

/**
 * Write a description of class nameGenerator here.
 *
 * Shane Fairhall
 * @version (a version number or a date)
 */
public class nameGenerator
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        String[] adj = {"shifty", "grotesque", "milky"};
        String[] noun = {"grasshopper", "spy", "farmer"};
        System.out.println("What is your name?: ");
        String username = keyboard.nextLine();
        Random generator = new Random();
        int adjIndex = generator.nextInt(adj.length);
        int nounIndex = generator.nextInt(noun.length);
        
        System.out.println("From this day forth " + username + " shall be known as...");
        System.out.println(adj[adjIndex] + " " + noun[nounIndex]);
    }
}
