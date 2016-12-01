
/**
 * Write a description of class Queue here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public interface QueueADT<T>
{
    public void enqueue (T element); // adds one element to the rear of this queue.
    
    public T dequeue (); // removes and returns the element at the front of this queue
    
    public T first (); //returns without removing the element at the front of this queue
    
    public boolean isEmpty(); // returns true if this queu contains no elements
    
    public int size (); // retunrs number of elements in this queue
    
    public String toString(); // returns a string representation of this queue
    
}
