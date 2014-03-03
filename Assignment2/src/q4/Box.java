package q4;

/**
 * <p>
 * This is used to build a box and update it.
 * </p>
 * 
 * @author Austin Lott, 1C
 * @version 1.0
 */
public class Box {
    /**
     * <p>
     * Used to hold user input for height.
     * </p>
     * 
     * @value height holds the height of the box.
     */
    private int height;
    /**
     * <p>
     * Used to hold user input for width.
     * </p>
     * 
     * @value width holds the width of the box.
     */
    private int width;
    /**
     * <p>
     * Used to hold user input for depth.
     * </p>
     * 
     * @value depth holds the depth of the box.
     */
    private int depth;
    /**
     * <p>
     * Use to hold user input for if the box is full.
     * </p>
     * 
     * @value full boolean variable for if the box is full.
     */
    private boolean full;
    
    /**
     * <p>Constructor that builds the box.</p>
     * 
     * @param boxHeight dimension of the box
     * @param boxWidth dimension of the box
     * @param boxDepth dimension of the box
     * @param boxFull state of the box (full or not)
     */
    public Box(int boxHeight, int boxWidth, int boxDepth, boolean boxFull) {
        
        boxFull = false;
        height = boxHeight;
        width = boxWidth;
        depth = boxDepth;
        full = boxFull;
    }
    
    /**
     * <p>Setter for the height.</p>
     *
     * @param boxHeight dimension of the box.
     */
    public void setHeight(int boxHeight) {
        height = boxHeight;
    }
    
    /**
     * <p>Getter for the height of the box.</p>
     * 
     * @return Returns dimension of the box.
     */
    public int getHeight() {
        return height;
    }
    
    /**
     * <p>Setter for the width.</p>
     *
     * @param boxWidth dimension of the box.
     */
    public void setWidth(int boxWidth) {
        width = boxWidth;
    }
    
    /**
     * <p>Getter for the width of the box.</p>
     * 
     * @return Returns dimension of the box.
     */
    public int getWidth() {
        return width;
    }
    
    /**
     * <p>Setter for the depth.</p>
     *
     * @param boxDepth dimension of the box.
     */
    public void setDepth(int boxDepth) {
        depth = boxDepth;
    }
    
    /**
     * <p>Getter for the depth of the box.</p>
     * 
     * @return Returns dimension of the box.
     */
    public int getDepth() {
        return depth;
    }
    
    /**
     * <p>Setter for the state of the box (full/not full).</p>
     *
     * @param boxFull state of the box
     */
    public void setFull(boolean boxFull) {
        full = boxFull;
    }
    
    /**
     * <p>Getter for the state of the box (full/not full).</p>
     * 
     * @return Returns state of the box.
     */
    public boolean getFull() {
        return full;
    }
    
    /**
     * <p>Format for output.</p>
     * 
     * @return Returns the object in a better formate.
     */
    public String toString() {
        return (height + "\t" + width + "\t" + depth + "\t" + full);
    }
}
