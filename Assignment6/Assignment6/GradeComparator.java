
/**
 * Write a description of class GradeComparator here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Comparator;
public class GradeComparator implements Comparator<Student>
{
    @Override
    public int compare(Student st1, Student st2)
    {
        if(st1.getGrade() >st2.getGrade())
        {
            return -1;
        }
        else if(st1.getGrade()<st2.getGrade())
        {
            return 1;
        }
        return 0;

    }
}
