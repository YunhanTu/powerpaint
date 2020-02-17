/*
 * TCSS 305
 * Assignment 5 - PowerPaint
 */



package tool;

import java.awt.Graphics;

/**
 * the abstract class.
 * @author Yunhan Tu
 * @version 2017/11/17
 */
public abstract class AbstractTool {
    
    /**
     * Draws the object with the given shape. 
     * @param theGraphics The graphics. 
     * @param theShape The shape. 
     */
    public abstract void drawingMethod(Graphics theGraphics, DrawShape theShape);
    
    /**
     * Gets the name of the tool.
     * 
     * @return returns the name of the class. 
     */
    public String getName() {
        return getClass().getName();
    }
    
    
}