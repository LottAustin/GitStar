package q2;

import java.text.DecimalFormat;
import static java.lang.Math.PI;
import static java.lang.Math.pow;
import java.util.Scanner;

/**
 * <p>This program computes the surface area and volume of a cylinder.
 * The radius and height is take in as user input.</p>
 *
 * @author Your Name goes here
 * @version 1.0
 */
public class CylinderStats {
    /**
     * <p>This is the main method (entry point) that gets called by the JVM.</p>
     *
     * @param args command line arguments.
     */
    public static void main(String[] args) {
        /* variables for calculating volume and surface area */
        double radius;
        double height;
        double volume;
        double surfaceArea;
        
        /* scanner for reading in user input */
        Scanner scan = new Scanner(System.in);
        
        /* formating for decimals */
        DecimalFormat decimalFormat = new DecimalFormat("0.0000");
        
        
        /* ask for input */
        System.out.print("Enter a radius for the cylinder: ");
        radius = scan.nextDouble();
        
        System.out.print("Enter a height for the cylinder: ");
        height = scan.nextDouble();
        
        /* calculate surface area and volume */
        surfaceArea = 2.0 * PI * (radius + height);
        volume = PI * pow(radius, 2) * height;
        
        /* output results */
        System.out.println("The surface area of the cylinder is " 
                + decimalFormat.format(surfaceArea) 
                + " and the volume is " + decimalFormat.format(volume));
        
        scan.close(); //close scanner
    }

}
