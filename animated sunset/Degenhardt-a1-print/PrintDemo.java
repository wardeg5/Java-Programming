/**
 * Demonstrate printing to the console
 * 
 * @author Warren Degenhardt
 * @version 6/25/2015
 */
public class PrintDemo
{
    /**
     * Constructor for objects of class PrintDemo
     */
    public PrintDemo()
    {
    }
    
    /**
     * Print a hello world message
     */
    public void helloWorld()
    {
        System.out.println("---------------------------");
        System.out.println("Hello, World!");
        System.out.println("----------------------------");
    }
    
    /**
     * Demonstrate println vs print
     */
    
    public void printlnSvPrint()
    {
        System.out.println("----------------------------");
        System.out.println("println prints a line with 'enter' at the end");
        System.out.println("Here's the next line");
        System.out.println("print prints a line without 'enter' at the end");
        System.out.println("Here's the next line:");
        System.out.println("Next we'll print a blank line:");
        System.out.println(); // print a blank line
        System.out.println("----------------------------");
        
        
    }
    
   /**
    * Print special characters
    */
   public void specialCharacters()
   {
     System.out.println("----------------------------");
     System.out.println("Quotes such as these \"\" need to be 'quoted' with a backslash (\\)");
     System.out.println("Whitespace can be printed with special characters");
     System.out.println("Tab: \\t");
     System.out.println("New line: \\n");
     System.out.println("One\t1");
     System.out.println("Two\t2\n");
     System.out.println("Three\t3");
     System.out.println("Four\t4");
     System.out.println("----------------------------");

     
       
       
       
   }
}