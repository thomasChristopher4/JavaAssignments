
/**
 * Write a description of class AnalysisAssignment here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Random;

/**
 *
 * @author csu
 */
public class AnalysisAssignment 
{

    // fill the contents of the array passed as parameter at random
    public static void fillArray(int array[])
    {
        Random rnd = new Random();
        for(int i =0; i < array.length; i++)
        {
            array[i] = rnd.nextInt(Integer.MAX_VALUE);
        }    

    }        

    // returns a new array with a copy of each of the values from the array passed as parameter
    public static int[] copyArray(int[] array)
    {
        int array1[] = new int[array.length];
        for(int i = 0 ; i < array.length; i++)
        {
            array1[i] = array[i];
        }    
        return array1;
    }      

    public static int alg1(int array[])
    {
        int operations_alg1 = 0;
        for(int i = 0; i < array.length; i++)
        {
            for(int j = i; j < array.length; j++)
            {
                operations_alg1++;
                if(array[j] < array[i])
                {
                    exchangeNumbers(i, j, array);
                }  
            }    
        }   

        return operations_alg1;
    }        

    public static int alg2(int array[])
    {
        return alg3(0, array.length - 1, array);
    }        

    public static int alg3(int lowerIndex, int higherIndex, int array[]) {

        int i = lowerIndex;
        int j = higherIndex;

        int pivot = array[lowerIndex+(higherIndex-lowerIndex)/2];

        int count = 0;

        while (i <= j) {
            while (array[i] < pivot) {
                i++;
                count++;
            }
            while (array[j] > pivot) {
                j--;
                count++;
            }

            count++;
            if (i <= j) {
                exchangeNumbers(i, j, array);
                i++;
                j--;
            }
        }

        if(lowerIndex < j)
        {    
            return count + alg3(lowerIndex, j, array);
        }    
        if(i < higherIndex)
        {    
            return count + alg3(i, higherIndex, array);
        }    
        return count;
    }

    public static void exchangeNumbers(int i, int j, int[] array)
    {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    public static void main(String [] args)
    {
        int[] origArray = new int [1000];// declaring an array of type int
        int[] array1 = new int [1000];
        int[] array2 = new int [2000];

        fillArray(origArray);

        array1 = copyArray(origArray); // copying the elements of the old anArray into algArray1

        array2 = copyArray(origArray); // copying the elements of the old anArray into algArray1

        for( int i = 0; i<origArray.length ; i++)
        {
            System.out.println("Original Array " + origArray[i]);
            System.out.println("");
        }

        System.out.println("Before Alg1");

        for( int i = 0; i<array1.length ; i++)
        {
            System.out.println("Array1 " + array1[i]);
            System.out.println("");

        }
        System.out.println("After Alg 1");
        System.out.println(alg1(array1));
        System.out.println("_____________________________");
        System.out.println("Before Alg2 ");
        for( int i = 0; i<array2.length ; i++)
        {
            System.out.println("Array2 " + array2[i]);
            System.out.println("");

        }
        System.out.println("After Alg2");
        System.out.println(alg2(array2));

       
    }
}
