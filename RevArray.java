
/**
 * Write a description of class RevArray here.
 *
 * Shane Fairhall
 * @version (a version number or a date)
 */

public class RevArray
{

    /**
     * reverseArray takes an array and rearranges its contents
     * Accepts a string array as an argument
     * Returns a string array
     *
     * Shane Fairhall
     * updated 12/05/24
     */
    static String[] reverseArray(String[] list){
        int len = list.length;
        String[] newList = new String[len];

        for(int i=0; i<len; i++){

            newList[i] = list[len-(i+1)];

        }

        return(newList);
    }

    public static void main(String[] args)
    {
        String[] names = {"Bob", "Sue", "Jim", "Jo"};

        String[] newNames;
        newNames = reverseArray(names);

        for(String name : newNames){
            System.out.println(name);
        }

    }
}
