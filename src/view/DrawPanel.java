/*
 * TCSS 305
 * Assignment 5 - PowerPaint
 */


package view;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JPanel;
import javax.swing.event.MouseInputAdapter;
import tool.DrawShape;
import tool.Eraser;
import tool.Line;
import tool.Pencil;
import tool.AbstractTool;


/**
 * This class creates a panel which will be used to draw on in the GUI. 
 * 
 * @author Yunhan Tu
 * @version 2017/11/17
 *
 */
public class DrawPanel extends JPanel {
    /** 
     * A generated serial ID number. 
     */
    private static final long serialVersionUID = 1L;
    /** 
     * The thickness.
     */
    private static final int DEFAULT_THICK = 10;
    /** 
     * primary red color value. 
     */
    private static final int RGB_RL = 51;
    /**
     *  primary blue color value.
     */
    private static final int RGB_BL = 111;
    /** 
     *  secondary red color value. 
     */
    private static final int RGB_RR = 232;
    /**  
     * secondary  green color value. 
     */
    private static final int RGB_GR = 211;
    /** 
     * secondary blue color value. 
     */
    private static final int RGB_BR = 162;
    
    /** 
     * the abstract Tool. 
     */
    private AbstractTool myTool;
    /** 
     * 
     * my primary color. 
     */
    private Color myPrimarymyColor;
    /** 
     * my secondary color. 
     */
    private Color mySecondarymyColor;
    /** 
     * The thickness of the drawn object.
     */
    private int myThickness;
    /** 
     * The shapes drawn. 
     */
    private DrawShape myShape;
    /** 
     * A collection of all the shapes drawn. 
     */
    private final List<DrawShape> myDrawings;

    /**
     * Construct of the panel and set the default tool as line.
     * Also set up listener shape and color and thickness.
     */
    public DrawPanel() { 
        this.addMouseListener(new Draw());
        this.addMouseMotionListener(new Draw());
        myTool = new Line();
        myDrawings = new ArrayList<DrawShape>();
        myThickness = DEFAULT_THICK;
        myPrimarymyColor = new Color(RGB_RL, 0, RGB_BL);
        mySecondarymyColor = new Color(RGB_RR, RGB_GR, RGB_BR);
    }

    
    /**
     * Sets the tool. 
     * 
     * @param theTool the Tool to be set.  
     */
    public void setTool(final AbstractTool theTool) {
        myTool = theTool;
    }
    
    /**
     * Sets the thickness of the tool.
     * 
     * @param theThick the thickness to be set. 
     */
    public void setThickness(final int theThick) {
        myThickness = theThick;
    }
    /**
    * Sets the primary color. 
    * 
    * @param theColor the color to be set.  
    */
    public void setColorP(final Color theColor) {
        myPrimarymyColor = theColor;
    }
    /**
     * Sets the secondary color.
     * 
     * @param theColor the color to be set.
     */
    public void setColorS(final Color theColor) {
        mySecondarymyColor = theColor;
    }  
    /**
     * Gets the last DrawShape object drawn.
     * 
     * @return the last DrawShape object.
     */
    public DrawShape getMyShape() {
        return myShape;
    }
    /**
     * Gets the current tool.
     * 
     * @return return the tool.
     */
    public AbstractTool getTool() {
        return myTool;
    }
    /**
     * returns a new colon collection. 
     * 
     * @return returns  myDrawings colon collection.
     */
    public List<DrawShape> getList() {
        final ArrayList<DrawShape> drawingsCopy = new ArrayList<DrawShape>();
        drawingsCopy.addAll(myDrawings);
        return drawingsCopy;
    }
    
    
    /**
     * Clear everything. 
     */
    public void clearAll() {
        myDrawings.removeAll(myDrawings);
    }
    
    @Override 
    public void paintComponent(final Graphics theGraphics) {
        super.paintComponent(theGraphics);
        if (myShape != null) {
            for (final DrawShape s : myDrawings) {
                s.getMyTool().drawingMethod(theGraphics, s);
            }
                
        }
    }
        
   /**
    * the mouse adapter and draw.
    * @author Yunhan Tu
    * @version 2017/11/17
    */
    class Draw extends MouseInputAdapter {  
        
       
        @Override
        public void mousePressed(final MouseEvent theEvent) {
            final Point p = new Point(theEvent.getX(), theEvent.getY());
            if (theEvent.getModifiers() == MouseEvent.BUTTON1_MASK) {
                myShape = new DrawShape(p, p, myTool, myThickness, myPrimarymyColor);  
               
            } else {
               
                myShape = new DrawShape(p, p, myTool, myThickness, mySecondarymyColor);      
            }
            if (myShape.getMyThick() != 0) {
                myDrawings.add(myShape);
            }
            repaint(); 
        }
        @Override
        public void mouseDragged(final MouseEvent theEvent) {
            if (myTool.getClass() == Pencil.class
                    || myTool.getClass() == Eraser.class) {
                myShape.setPencilEndPoint(theEvent.getX(), theEvent.getY());
            } else {
                myShape.setEndPoint(theEvent.getX(), theEvent.getY());
            }  
            repaint();
        } 
    }
}

    
   
    

