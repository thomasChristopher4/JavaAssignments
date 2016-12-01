
/**
 * Write a description of class FirstNameComparator here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Comparator;
public class FirstNameComparator implements Comparator<Student>
{
    @Override
    public int compare(Student st1, Student st2)
    {
        return st1.getFirstName().compareTo(st2.getFirstName());
    }
    
   
}
