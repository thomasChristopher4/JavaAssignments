
/**
 * Write a description of class BinarySearchIterative here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.*;
public class BinarySearchIterative
{
    public static boolean binarySearch(Integer [] data, int min, int max, Integer target)
    {
       int middle = 0;
        while(max>=min)
        {
            middle = (min + max)/2;
            if(data[middle].compareTo(target) == 0)
            {
                return true;
            }

            if(data[middle].compareTo(target) > 0)
            {
                min = middle + 1;
            }
            
            if(data[middle] > target)
            {
                max = min - 1;
            }
            
            
        }
        return false;
    }
    public static void main(String [] args)
    {
        
        int start = 0;
        
        Integer target = new Integer(30);
        Integer [] myList = new Integer [4];
        myList[0]= new Integer(10);
        myList[1] = new Integer(20);
        myList[2] = new Integer(30);
        myList[3] = new Integer(50);
        
        System.out.println(binarySearch(myList,start,myList.length,target));
        
        
    }
}


