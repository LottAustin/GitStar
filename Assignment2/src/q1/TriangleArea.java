package q1;

import java.text.DecimalFormat;
import java.util.Scanner;
import static java.lang.Math.sqrt;


/**
 * <p>This program calculates the Area of a triangle. This is done by asking
 * for user input and then calculates the perimeter. From there we calculate the
 * area using Herons formula. </p>
 *
 * @author Austin Lott, C1
 * @version 1.0
 */
public class TriangleArea {
    /**
     * <p>This is the main method (entry point) that gets called by the JVM.</p>
     *
     * @param args command line arguments.
     */
    public static void main(String[] args) {

        /* variables that hold the side of a triangle */
        double sideA;
        double sideB;
        double sideC;
        
        double area;
        double perimeter;
        
        double s; // variable need to calculate the area
        
        Scanner scan = new Scanner(System.in); //scanner to take user input
        
        /* formating for the numbers */
        DecimalFormat decimalFormat = new DecimalFormat("0.000");
        
        
        /* ask for user input */
        System.out.print("Enter side A's value: ");
        sideA = scan.nextDouble();
        
        System.out.print("Enter side B's value: ");
        sideB = scan.nextDouble();
        
        System.out.print("Enter side C's value: ");
        sideC = scan.nextDouble();
        
        /* calculate perimeter, s, and area */
        perimeter = sideA + sideB + sideC;
        s = perimeter / 2.0;
        area = sqrt(s * (s - sideA) * (s - sideB) * (s - sideC));
        
        /* output results */
        System.out.println("The perimeter of the triangle is " 
                + decimalFormat.format(perimeter) + " and the area is " 
                + decimalFormat.format(area));
        
        scan.close(); //close scanner
        
    }

};
