
/**
 * Write a description of class queue2Stack here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.*;

public class queue2Stack<T> implements  QueueADT<T> 
{
    Stack<T> stack1 = new Stack<T> ();
    Stack<T> stack2 = new Stack<T> ();

    public void enqueue(T element) // adds and element                              
    {
        stack1.push(element);
    }

    public T dequeue () // removes element 
    {

        if(stack2.isEmpty()) // checks to see if empty
        {
            System.out.println("Stack");

        }
         stack2.push(stack1.pop());
         return stack1.pop();

        
    }

    public T first () //peek 
    {
        return stack2.peek();

    }

    public boolean isEmpty() 
    {
        return stack1.isEmpty() && stack2.isEmpty();

    }

    public int size () 
    {
        return stack1.size() + stack2.size();

    }

    public String toString() // returns a string representation of this queue
    {
       
        
        return "hi";
        
    }


} 

