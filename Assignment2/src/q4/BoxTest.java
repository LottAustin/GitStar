package q4;

import java.util.Scanner;

/**
 * <p>
 * This program builds a box and updates it. This is done by getting user input
 * for parameters.
 * </p>
 * 
 * @author Austin Lott, 1C
 * @version 1.0
 */
public class BoxTest {
    /**
     * <p>
     * Used to hold user input for height.
     * </p>
     * 
     * @value height holds the height of the box.
     */
    private static int height;
    /**
     * <p>
     * Used to hold user input for width.
     * </p>
     * 
     * @value width holds the width of the box.
     */
    private static int width;
    /**
     * <p>
     * Used to hold user input for depth.
     * </p>
     * 
     * @value depth holds the depth of the box.
     */
    private static int depth;
    /**
     * <p>
     * Use to hold user input for if the box is full.
     * </p>
     * 
     * @value full boolean variable for if the box is full.
     */
    private static boolean full;
    /**
     * <p>
     * Takes user input.
     * </p>
     * 
     * @value scan takes user input.
     */
    private static Scanner scan = new Scanner(System.in);

    /**
     * <p>
     * This is the main method (entry point) that gets called by the JVM.
     * </p>
     * 
     * @param args command line arguments.
     */
    public static void main(String[] args) {

        /* ask for dimentions of the first box */
        System.out.println("Enter the height of the box: ");
        height = scan.nextInt();

        System.out.println("Enter the width of the box: ");
        width = scan.nextInt();

        System.out.println("Enter the depth of the box: ");
        depth = scan.nextInt();

        /* build and print results */
        Box box1 = new Box(height, width, depth, full);

        System.out.println("height\twidth\tdepth\tfull");
        System.out.println(box1);

        /* ask for dimentions of the second box */
        System.out.println("Enter the height of another box: ");
        height = scan.nextInt();

        System.out.println("Enter the width of another box: ");
        width = scan.nextInt();

        System.out.println("Enter the depth of another box: ");
        depth = scan.nextInt();

        /* build and output results */
        Box box2 = new Box(height, width, depth, full);

        System.out.println("height\twidth\tdepth\tfull");
        System.out.println(box2);

        /* update both boxes */
        System.out.println("Update box 1.");
        updateBox(box1);

        System.out.println("Update box 2.");
        updateBox(box2);

        /* output updated boxes */
        System.out.println("height\twidth\tdepth\tfull");
        System.out.println(box1);
        System.out.println(box2);
    }

    /**
     * <p>
     * Updates the passed in object.
     * </p>
     * 
     * @param box object that is passed in.
     */
    public static void updateBox(Box box) {

        /* ask for new height and update it */
        System.out.println("New height: ");
        height = scan.nextInt();
        box.setHeight(height);

        /* ask for new width and update it */
        System.out.println("New width: ");
        width = scan.nextInt();
        box.setWidth(width);

        /* ask for new depth and update it */
        System.out.println("New depth: ");
        depth = scan.nextInt();
        box.setDepth(depth);

        /* ask if the box is now full */
        System.out.println("Is the new box full?(true/fales): ");
        full = scan.nextBoolean();
        box.setFull(full);
    }

}
