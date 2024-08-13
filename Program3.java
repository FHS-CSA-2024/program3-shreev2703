//Program 3
//Extension of program 2 that now asks for user input when assigning the length and width of the sides
import java.util.*;  //This imports the console scanner that reads user input

//Your code here:
public class ScannerRectangle{
public static void main(String args[])
{
    Scanner scanner= new Scanner(System.in);
    System.out.println("Enter your desired length:");
        int length = scanner.nextInt(); // Read length
        System.out.println("Enter your desired width:");
        int width = scanner.nextInt(); // Read width
    //break
    int area = width * length;
   int perimeter = 2 * (width + length);
  System.out.println("The width is " + width);
  System.out.println("The length is " + length);
  System.out.println("The area is " + area);
  System.out.println("The perimeter is " + perimeter);
    
    

}
}


//Paste console output below:
/*


*/
