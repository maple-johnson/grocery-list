/*
 * Where the grocery list will be instantiated
 */

public class Main
{
     public static void main(String[] args)
     {
         // Testing Class connection
         GroceryList test = new GroceryList();

         System.out.println(test.printTest());

         test.addTest("Hello World!");
         System.out.println(test.printTest());

     }

}