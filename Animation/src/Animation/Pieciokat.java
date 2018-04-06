package animacjee;
import java.awt.*;
import java.awt.geom.AffineTransform;
import java.awt.geom.Area;

public class Pieciokat extends Figura {


    public Pieciokat(Graphics2D buffer, int delay, int width, int height) {
        
    	super(buffer,delay,width,height);
        Polygon polygon = new Polygon();

        polygon.addPoint(20,0);
        polygon.addPoint(50,0);
        polygon.addPoint(60,20);
        polygon.addPoint(35,40);
        polygon.addPoint(10,20);

        shape = polygon;
        aft = new AffineTransform();
        area = new Area(shape);
    }

}