
/**
 * Write a description of class LastNameComparator here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Comparator;
public class LastNameComparator implements Comparator<Student>
{
    @Override
    public int compare(Student st1, Student st2)
    {
        return st1.getLastName().compareTo(st2.getLastName());
    }


}
