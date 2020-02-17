/*
 * TCSS 305
 * Assignment 5 - PowerPaint
 */


package tool;

import java.awt.Color;


/**
 * This class draws with eraser. 
 * 
 * @author Yunhan Tu
 * @version 2017/11/17
 *
 */
public class Eraser extends Pencil {
    
    /** 
     * Override the method for set color. 
     * @param theShape white color.
     */
    @Override
    public Color getColor(final DrawShape theShape) {
        return Color.WHITE;
    }

}