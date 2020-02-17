/*
 * TCSS 305
 * Assignment 5 - PowerPaint
 */

package tool;
import java.awt.BasicStroke;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;

/**
 * This class draws a rectangle. 
 * 
 * @author Yunhan Tu
 * @version 2017/11/17
 */
public class Rectangle extends AbstractTool {
   
    /**
     * Override method that draws a rectangle.
     * 
     * @param theGraphics the graphic to draw with.
     * @param theShape the shape to be drawn.
     */
    @Override
    public void drawingMethod(final Graphics theGraphics, final DrawShape theShape) {
        final int x1 = (int) theShape.getStartPoint().getX();
        final int y1 = (int) theShape.getStartPoint().getY();
        final int x2 = (int) theShape.getEndPoint().getX();
        final int y2 = (int) theShape.getEndPoint().getY();
        final Graphics2D g2d = (Graphics2D) theGraphics;
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, 
                             RenderingHints.VALUE_ANTIALIAS_ON);
        g2d.setStroke(new BasicStroke(theShape.getMyThick()));
        g2d.setColor(theShape.getMyColor());
        
        if (x2 > x1 && y2 > y1) { 
            drawTool(x1, y1, x2 - x1, y2 - y1, g2d); 
        } 
        if (x2 < x1 && y2 < y1) {
            drawTool(x2, y2, x1 - x2, y1 - y2, g2d);
        } 
        if (x2 > x1 && y2 < y1) {
            drawTool(x1, y2, x2 - x1, y1 - y2, g2d);
        }      
        if (x2 < x1 && y2 > y1) {
            drawTool(x2, y1, x1 - x2, y2 - y1, g2d);
        }
        
    }
    
    
    /**
     * * Helper method that draws a rectangle.
     * 
     * @param theX the x
     * @param theY the y
     * @param theWidth the width
     * @param theHeight the hight
     * @param theGraphics the graphic
     */
    public void drawTool(final int theX, final int theY, final int theWidth, 
        final int theHeight, final Graphics2D theGraphics) {
        theGraphics.drawRect(theX, theY, theWidth, theHeight); 
    }

    
}