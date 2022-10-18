
/**
 * Write a description of class Date_Program here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;

public class Data 
{
    public static void main(String[]args) {
        Scanner s = new Scanner(System.in);
        
        System.out.print("Enter the day of the week: ");
        String day = s.nextLine();
        
        System.out.print("Enter the month: ");
        String month = s.nextLine();
        
        System.out.print("Enter the year: ");
        String year = s.nextLine();
        
        System.out.print("Enter the day of the month: ");
        String dayofmonth = s.nextLine();
        
        System.out.println("American Format: " + month (",") + day (",") + ("," year); 
        System.out.println("European Format: " + day (" ") + (" ") dayofmonth + month);
        

        

    }
}