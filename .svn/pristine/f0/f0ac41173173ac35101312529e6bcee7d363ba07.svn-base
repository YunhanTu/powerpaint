/*
 * TCSS 305
 * Assignment 5 - PowerPaint
 */

package tool;

import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.Icon;

/**
 * This class creates a panel that fill with the color has been chose. 
 * @author Yunhan Tu
 * @version 2017/11/17
 */
public class CreateIcon implements Icon {
    /** 
     * The icon size. 
     */
    private static final int ICON_SIZE = 14;
    /** 
     * A color for the icon. 
     */
    private Color myColor;

    /**
     * Creates a new icon with the chosen color.
     * 
     * @param theColor used to be set as the icon.
     */
    public CreateIcon(final Color theColor) {
        myColor = theColor;
    }
    
    /**
     * Override the paintIcon method.
     */
    @Override
    public void paintIcon(final Component theComp, final Graphics theGraphics, 
                          final int theX, final int theY) {
        final Graphics2D g2d = (Graphics2D) theGraphics;
        g2d.setPaint(myColor);
        g2d.fillRect(theX, theY, ICON_SIZE, ICON_SIZE);

    }

   /**
    * set color.
    * @param theColor the color
    */
    public void setColor(final Color theColor) {
        myColor = theColor;
    }
    
    /**
     * Gets the width .
     */
    @Override
    public int getIconWidth() {
        return ICON_SIZE;
    }

    /**
     * Gets the Height.
     */
    @Override
    public int getIconHeight() {
        return ICON_SIZE;
    }


}