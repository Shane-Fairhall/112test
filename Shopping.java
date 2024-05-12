
/**
 * Write a description of class Shopping here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class Shopping
{
    public static void main(String[] args){
        
        String[] sizes = {"XS", "S", "M", "L", "XL"};
        int[] stock = {12, 8, 2, 4, 6};
        boolean again = true;
        String response;
        String userChoice;
        boolean found = true;
        boolean available = true;
        
        Scanner keyboard = new Scanner(System.in);
        
        while(again == true){
            System.out.println("\n***************\nWelcome to jeans shop\n***************\n");
            System.out.println("Shop stock:");
            
            for(int i=0; i<sizes.length; i++){
                System.out.printf("\n%s: %s", sizes[i], stock[i]);
                
                if(stock[i]==0){
                    System.out.print("   <-- none left");
                } else if(stock[i]<3){
                    System.out.print("   <-- low stock");
                }
            }
            System.out.println("\n\nWhich size would you like to purchase?");
            userChoice = keyboard.nextLine().toUpperCase();
            System.out.println();
            
            found = false;
            available = false;
            for(int i=0;i<stock.length;i++){
                if(userChoice.equals(sizes[i])){
                    found=true;
                    if(stock[i]>0){
                        available = true;
                        stock[i]--;
                    }
                }
            }
            
            if(!found){
                System.out.println("Sorry I didn't understand");
            } else {
                if(!available){
                    System.out.println("Sorry there are no jeans left in that size");
                } else {
                    System.out.printf("Great. You purchased a pair of %s jeans", userChoice);
                }
            }
            
            System.out.println("\nWould you like to make another purchase? (y|n)");
            response = keyboard.nextLine();
            if(response.equals("n")){
                again = false;
            }
        }
    
    }
}
