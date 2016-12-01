
/**
 * Write a description of class Tester here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.*;
public class Tester
{
    public static void main(String args[])
    {
        // create an linked list
        List<Student> studentList = new LinkedList<Student>();
        
        //create studnet objects
        Student st1 = new Student(987324867,"Zachary","Thomas", 75.00);
        
        Student st2 = new Student(12487654,"Venessa","Almanza", 50.00);
        
        Student st3 = new Student(26234569,"Glory","Lamas", 99.00);
        
        Student st4 = new Student(98324867,"Michale","Gunnels", 80.00);
        
        Student st5 = new Student(256453648,"Leida","Trueman", 65.00);
        
        Student st6 = new Student(162738374,"Luciano","Hooten", 87.00);
        
        Student st7 = new Student(913746182,"Shawnda","Markus", 71.00);
        
        Student st8 = new Student(19283653,"Kiara","Mudge", 100.00);
        
        Student st9 = new Student(463271831,"Gloria","Rojas", 63.00);
        
        Student st10 = new Student(19353324,"Andrea","Paules", 95.90);
        
        Student st11 = new Student(756222351,"Tana","Schecter", 30.10);
        
        Student st12 = new Student(782839402,"Anabel","Raine ", 98.12);
        
        Student st13 = new Student(172638493,"Melynda","Pankratz ", 67.50);
        
        Student st14 = new Student(91234634,"Keiko","Terranova", 87.00);
        
        Student st15 = new Student(343487982,"Bennie ","Bert", 77.70);
        
        Student st16 = new Student(9778934,"Charissa","Hoag", 49.60);
        
        Student st17 = new Student(454646454,"Herma","Spalding", 52.20);
        
        Student st18 = new Student(890817262,"Garnett","Coon", 89.00);
        
        Student st19 = new Student(543516172,"Yee","Kesselman", 80.80);
        
        Student st20 = new Student(908776334,"Angel","Spanbauer", 70.00);
        //add stundet objects ot linked list
        studentList.add(st1);
        studentList.add(st2);
        studentList.add(st3);
        studentList.add(st4);
        studentList.add(st5);
        
        
        System.out.println("Order of students before sorting by grade: ");
        //llop for access the studnet objects in linkedlist
        for(int index = 0 ; index < studentList.size(); index ++)
        {
            System.out.println(studentList.get(index));
            
        }
         //sort linked list using grade comaptarotor
        Collections.sort(studentList,new GradeComparator());
        System.out.println("");
        System.out.println("Order of students after sorting by grade: ");
        
        for(int index = 0 ; index < studentList.size(); index ++)
        {
            System.out.println(studentList.get(index));
            
        }
        
        System.out.println("________________________");
        System.out.println("");
         System.out.println("Order of students before sorting by First Name: ");
         for(int index = 0 ; index < studentList.size(); index ++)
        {
            System.out.println(studentList.get(index));
            
        }
        
        Collections.sort(studentList,new FirstNameComparator());
        
        System.out.println("");
        System.out.println("Order of students after sorting by First Name: ");
        
        for(int index = 0 ; index < studentList.size(); index ++)
        {
            System.out.println(studentList.get(index));
            
        }
        
        System.out.println("________________________");
        System.out.println("");
         System.out.println("Order of students before sorting by Last Name: ");
         for(int index = 0 ; index < studentList.size(); index ++)
        {
            System.out.println(studentList.get(index));
            
        }
        
        Collections.sort(studentList,new LastNameComparator());
        
        System.out.println("");
        System.out.println("Order of students after sorting by Last Name: ");
        
        for(int index = 0 ; index < studentList.size(); index ++)
        {
            System.out.println(studentList.get(index));
            
        }
        
        
    }
}
