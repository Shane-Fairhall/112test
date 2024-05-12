
/**
 * Write a description of class minMaxArray here.
 *
 * Shane Fairhall
 * @version (a version number or a date)
 */
public class minMaxArray
{
    static double maxArr(double[] list){
        double maxVal = list[0];
        for(double item : list){
            if(item>maxVal){
                maxVal = item;
            }
        }
        return(maxVal);
    }
    
    public static void main(String[] args)
    {
        double[] myArr = {6, 6, 8, 3};
        System.out.println(maxArr(myArr));
    }
}
