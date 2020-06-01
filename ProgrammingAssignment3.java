
import java.util.Scanner;

/*
 * Jessica Craw
 * This program will be checking to see if x and y coordinates given by user
is inside of a rectangle.  The rectangle's center is the origin and has a width
of 10 and height of 5.  I've decided to use nested if-else loops to check if the
coordinates are inside of the rectangle.
 */

public class ProgrammingAssignment3 {
    public static void main(String[] args){
        
        //declare the variables for the x and y coordinates
        double x;
        double y;
        
        //declare the scanner method
        Scanner input = new Scanner(System.in);
        
        //What the user will see and requesting the x and y from the user
        System.out.println("You'll be entering in an x and y value for coordinates to see if it lies within a rectangle.");
        System.out.println("The rectangles center is the origin and is at a height of 5 and width of 10.");
        System.out.println("Enter a point with two coordinates: ");
        x = input.nextDouble();
        y = input.nextDouble();
        
        //do the if-else loops to see if the coordinates are within the rectangle
        if(x <= 10.0/2.0 && x >= -(10.0/2.0)){
            if(y <= 5.0/2.0 && y >= -(5.0/2.0)){
                System.out.println("Point (" + x + "," + y + ") is in the rectangle.");
            }else{
                System.out.println("Point (" + x + "," + y + ") is not in the rectangle.");
            }
        }else{
            System.out.println("Point (" + x + "," + y + ") is not in the rectangle.");
        }
    }
}
