package animacjee;

import java.awt.*;
import java.awt.geom.AffineTransform;
import java.awt.geom.Area;

public class Trojkat extends Figura {


    public Trojkat(Graphics2D buffer, int delay, int width, int height) {
        
    	super(buffer,delay,width,height);
        Polygon polygon = new Polygon();

        polygon.addPoint(20,0);
        polygon.addPoint(50,0);
        polygon.addPoint(35,15);

        shape = polygon;
        aft = new AffineTransform();
        area = new Area(shape);
    }

}