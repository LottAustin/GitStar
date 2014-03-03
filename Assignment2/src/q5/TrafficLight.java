package q5;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 * <p>
 * This program draws a traffic light that is controlled by a button. The lights
 * all start as black and change color in order of green, amber, and red. They
 * will repeat after red.
 * </p>
 * 
 * @author Austin Lott, 1C
 * @version 0.9
 */
public class TrafficLight extends JFrame {

    /**
     * Unique panel version.
     */
    private static final long serialVersionUID = 1498757235602259350L;
    /**
     * <p>
     * holds part of the color for the frame
     * background.
     * </p>
     * 
     * @value FRAME_BG1 red value of frame background 
     */
    private static final int FRAME_BG1 = 236;
    /**
     * <p>
     * holds part of the color for the frame
     * background.
     * </p>
     * 
     * @value FRAME_BG2 green value of frame background 
     */
    private static final int FRAME_BG2 = 118;
    /**
     * <p>
     * Height of the Frame.
     * </p>
     * 
     * @value FRAME_H height of the frame 
     */
    private static final int FRAME_H = 420;
    /**
     * <p>
     * Width of the frame.
     * </p>
     * 
     * @value FRAME_W width of the frame 
     */
    private static final int FRAME_W = 200;
    /**
     * <p>
     * Height of the Frame.
     * </p>
     * 
     * @value PANEL_H height of the frame 
     */
    private static final int PANEL_H = 340;
    /**
     * <p>
     * Width of the panel.
     * </p>
     * 
     * @value PANEL_W width of the frame 
     */
    private static final int PANEL_W = 150;
    /**
     * <p>
     * holds part of the color for the panel
     * background.
     * </p>
     * 
     * @value PANEL_BG1 red value of frame background 
     */
    private static final int PANEL_BG1 = 193;
    /**
     * <p>
     * holds part of the color for the panel
     * background.
     * </p>
     * 
     * @value PANEL_BG2 green value of frame background 
     */
    private static final int PANEL_BG2 = 97;
    /**
     * <p>
     * holds the X position for the lights.
     * </p>
     * 
     * @value LIGHT_X coordinates for the lights 
     */
    private static final int LIGHT_X = 25;
    /**
     * <p>
     * holds the diameter of the lights.
     * </p>
     * 
     * @value LIGHT_DIAM Diameter of the circle 
     */
    private static final int LIGHT_DIAM = 100;
    /**
     * <p>
     * Holds the Y position for the green light.
     * </p>
     * 
     * @value GREEN_Y coordinated for green light 
     */
    private static final int GREEN_Y = 10;
    /**
     * <p>
     * Holds the Y position for the amber light.
     * </p>
     * 
     * @value AMBER_Y coordinated for amber light 
     */
    private static final int AMBER_Y = 120;
    /**
     * <p>
     * Holds the Y position for the red light.
     * </p>
     * 
     * @value RED_Y coordinated for red light 
     */
    private static final int RED_Y = 230;
    /**
     * <p>
     * Used to change color of the green light.
     * </p>
     * 
     * @value greenLight holds the color of the green light.
     */
    private Color greenLight = Color.black;
    /**
     * <p>
     * Used to change color of the amber light.
     * </p>
     * 
     * @value greenLight holds the color of the amber light.
     */
    private Color amberLight = Color.black;
    /**
     * <p>
     * Used to change color of the red light.
     * </p>
     * 
     * @value greenLight holds the color of the red light.
     */
    private Color redLight = Color.black;
    /**
     * <p>
     * Used to check position of lit light. 0 for green on 1 for amber on 3 for
     * red on
     * </p>
     * 
     * @value count counts the position of the lit light.
     */
    private int count;
    /**
     * <p>
     * Button that is used to change lights.
     * </p>
     * 
     * @value button button for action.
     */
    private JButton button;

    /**
     * <p>
     * The default constructor which sets the title of this app, sets the
     * default close operation to exit, creates a new content pane and finally
     * sets size and sets the visibility of this frame to true (show).
     * </p>
     */
    public TrafficLight() {
        super("Austin Lott");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        /*
         * adds the button and panel to the page as well as set the
         * actionListener
         */
        button = new JButton("Change");
        button.addActionListener(new ButtonListener());
        JPanel panel = new JPanel();
        panel.add(button);
        panel.add(new DrawingPanel());
        panel.setBackground(new Color(FRAME_BG1, FRAME_BG2, 0));

        getContentPane().add(panel);

        setSize(FRAME_W, FRAME_H);
        setVisible(true);
    }

    /**
     * <p>
     * The actionListener Class for used by the button.
     * </p>
     */
    private class ButtonListener implements ActionListener {

        /**
         * <p>
         * Method that performs the action triggered by the button.
         * </p>
         * 
         * @param event action that is performed.
         */
        public void actionPerformed(ActionEvent event) {

            /*
             * if check for count is greater then the number of lights
             */
            if (count > 2) {
                count = 0;
            }

            /*
             * if else statement for position of the light to be lit
             */
            if (count == 0) { // if the light is green
                greenLight = Color.green;
                count++;
                repaint();
            } else if (count == 1) { // if the light is amber
                amberLight = Color.yellow;
                count++;
                repaint();
            } else { // if the light is red
                redLight = Color.red;
                count++;
                repaint();
            }
        }
    }

    /**
     * <p>
     * Used to change color of the green light.
     * </p>
     * 
     * @value greenLight holds the color of the green light.
     */
    class DrawingPanel extends JPanel {

        /**
         * Unique panel version.
         */
        private static final long serialVersionUID = -1936027174564215297L;

        /**
         * <p>
         * Draws the panel.
         * </p>
         */
        public DrawingPanel() {
            setPreferredSize(new Dimension(PANEL_W, PANEL_H));
            setBackground(new Color(PANEL_BG1, PANEL_BG2, 0));
        }

        /**
         * <p>
         * Drawing surface of the panel.
         * </p>
         * 
         * @param g the graphics context with which we paint into.
         */
        public void paintComponent(Graphics g) {
            super.paintComponent(g);

            /* draw the lights */
            g.setColor(greenLight);
            g.fillOval(LIGHT_X, GREEN_Y, LIGHT_DIAM, LIGHT_DIAM);
            g.setColor(amberLight);
            g.fillOval(LIGHT_X, AMBER_Y, LIGHT_DIAM, LIGHT_DIAM);
            g.setColor(redLight);
            g.fillOval(LIGHT_X, RED_Y, LIGHT_DIAM, LIGHT_DIAM);

            /*
             * return the color of the lights to off (default).
             */
            greenLight = Color.black;
            amberLight = Color.black;
            redLight = Color.black;
        }
    }

    /**
     * <p>
     * The main method.
     * </p>
     * 
     * @param args command line arguments
     */
    public static void main(String[] args) {
        new TrafficLight();
    }
}
