/*
 * TCSS 305
 * Assignment 5 - PowerPaint
 */

package tool;

import java.awt.Graphics2D;

/**
 * This class draws an ellipse. 
 * 
 * @author Yunhan Tu
 * @version 2017/11/17
 */
public class Ellipse extends Rectangle {
    
    
    /**
     * Override helper method that will draw a ellipse with the start point and end point
     * with the specific height and width. 
     * @param theX
     * @param theY.
     * @param theWidth.
     * @param theHeight.
     * @param theGraphics.
     */
    @Override
    public void drawTool(final int theX, final int theY, final int theWidth, 
                         final int theHeight, final Graphics2D theGraphics) {
        theGraphics.drawOval(theX, theY, theWidth, theHeight);  
    }
    
   
}