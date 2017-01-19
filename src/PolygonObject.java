import java.awt.Color;
import java.awt.Graphics;
import java.awt.Polygon;


public class PolygonObject {
	Polygon P;
	Color c;
	
	
	public PolygonObject(int[] x, int[] y, Color c)
	{
		P = new Polygon();
		P.xpoints = x;
		P.ypoints = y;
		P.npoints = x.length;
		this.c = c;
	}
	
	void fillPolygon(Graphics g)
	{
		g.setColor(c);
		g.fillPolygon(P);
		g.fillRect(30, 80, 30, 60);
		
	}
	
}
