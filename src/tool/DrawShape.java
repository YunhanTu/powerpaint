/*
 * TCSS 305
 * Assignment 5 - PowerPaint
 */

package tool;

import java.awt.Color;
import java.awt.Point;
import java.util.ArrayList;
import java.util.List;


/**
 * 
 * This class creates an object which gives.
 * 
 * @author Yunhan Tu
 * @version 2017/11/17
 */
public class DrawShape {
    /** 
     * The starting point of the drawing.
     */
    private final Point myStart;
    /** 
     * The ending point of the drawing. 
     */
    private Point myEnd;
    /** 
     * The thickness of the shape.
     */
    private final int myThickness;
    /** 
     * The color of the shape. 
     */
    private final Color myColor;
    /**
     *  The tool currently using. 
     */
    private final AbstractTool myCurrentTool; 

    /** A list of points for the pencil to draw. */
    private final List<Point> myPathPoints = new ArrayList<Point>();
    

    /**
     * the constrCreates a shape. 
     * 
     * @param theStart  the starting point.
     * @param theEnd  the ending point.
     * @param theTool  the tool currently using.
     * @param theThickness  the thickness of the shape.
     * @param theColor  the color of the shape. 
     */
    public DrawShape(final Point theStart, final Point theEnd, final AbstractTool theTool, 
                     final int theThickness, final Color theColor) {
        myStart = theStart;
        myEnd = theEnd;
        myCurrentTool = theTool;
        myThickness = theThickness;
        myColor = theColor;
      
    }

    /**
     * Gets the start point.
     * @return return start point. 
     */
    public Point getStartPoint() {
        return (Point) myStart.clone();
    }

    /**
     * Gets the end point.
     * @return returns the end point.
     */
    public Point getEndPoint() {
        return (Point) myEnd.clone();
    }
    
    /**
     * set end point.
     * @param theX the x.
     * @param theY the y.
     */
    public void setEndPoint(final int theX, final int theY) {
        myEnd = new Point(theX, theY);
    }
    
    
    /**
     * Sets the end point for the path. 
     * 
     * @param theX the x coordinate.
     * @param theY the y coordinate. 
     */
    public void setPencilEndPoint(final int theX, final int theY) {
        addPoint(new Point(theX, theY));
    }

    /**
     * Adds a point to the path. 
     * 
     * @param theP the point to be added. 
     */
    public void addPoint(final Point theP) {
        myPathPoints.add(theP);
    }

     
     /**
      * Gets the points of the path the pencil will draw. 
      * 
      * @return returns a copy of the collection. 
      */
    public List<Point> getPoints() {
        final ArrayList<Point> paths = new ArrayList<Point>();
        for (int i = 0; i < myPathPoints.size(); i++) {
            final Point p = myPathPoints.get(i);
            paths.add(p);
        }
        return paths;
    }
     
    /**
     * Gets the thickness.
     * 
     * @return myThickness. 
     */
    public int getMyThick() {
        return myThickness;
    }
    
    
    /**
     * Gets the tool.
     * 
     * @return myTool.
     */
    public AbstractTool getMyTool() {
        return myCurrentTool;
        
    }
    
    
    /**
     * Gets the color.
     * 
     * @return myColor . 
     */
    public Color getMyColor() {
        return myColor;
    }

    
}