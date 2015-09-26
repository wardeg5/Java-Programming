import java.util.ArrayList;
/**
 * Write a description of class ListsDemo here.
 * 
 * @author Warren Degenhardt 
 * @version 7/19/2015
 */
public class ListsDemo
{
    private ArrayList<String> list;
    /**
     * Constructor for objects of class ArrayListDemo
     */
    public ListsDemo()
    {
        list = new ArrayList<String>(); //create an empty list
    }
    
    /**
     */
    public void useList()
    {
        // add elements to the list
        String blueColor = "blue";
        list.add(blueColor);
        list.add("yellow");
        
        System.out.println("The list has " + list.size() + " elements");
        System.out.println("The first element is " + list.get(0));
        
        String removedColor = list.remove(0);
        System.out.println("Removed element " + removedColor);
        System.out.println("Now the list has " + list.size() + " elements");
    }
}