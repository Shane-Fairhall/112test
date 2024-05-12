
/**
 * Write a description of class Adventure here.
 *
 * Shane Fairhall
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class Adventure
{
    public static void main(String[] args)
    {
        String[] Descriptions = {
            "You are enter a cave from the outside, it's dimly lit and smells of death. \nThere is water on the floor and a wooden door at the far end.", 
            "This room is smaller than the last. The ceiling glows with a eerie green light.", 
            "The door opens onto a massive chamber, with vast tapestries on the walls and a rich rug covering the whole floor. \nTables and other furniture fills the room, and the door at the end is gilt in gold.", ""};
        
        Scanner keyboard = new Scanner(System.in);
        String[] RoomItems = {"coin", "sword", "key", "monster"};
        int coins = 0;
        String[] Inventory = new String[4];
        boolean dead= false;
        boolean EndOfGame = false;
        int currentRoom=0;
        int choice =0;
        
        while (!EndOfGame){
            System.out.println("\nWould you like to:\n 1. go forward\n 2. go back");
            System.out.println(" 3. Look around you\n 4. pickup any items in the room\n---\n\n");
            choice = keyboard.nextInt();
            keyboard.nextLine();
            
            if(choice == 1){
                currentRoom +=1;
                System.out.println("You move forward");
            }
            else if(choice ==2){
                currentRoom -=1;
                System.out.println("You move backwards");
            }
            else if(choice ==3)
                System.out.println(Descriptions[currentRoom]);
            else if(choice==4){
                if(RoomItems[currentRoom].equals("coin")){
                    System.out.println("A shiny coin!");
                    coins+=1;
                }
            }
            
        }
        
        
        
        }
}
