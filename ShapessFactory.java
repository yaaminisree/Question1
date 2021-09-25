package Question3;

import java.util.ArrayList;
import java.util.Iterator;

public class ShapessFactory {
	ArrayList<Shape> slist = new ArrayList<>();  //to store Circle and Rectangle objects.
	
	
	public ShapessFactory() {  }
    public void addShape(Shape s)
  {
        slist.add(s);
   }
   public ArrayList<Circle> getCircles()
   { 
	 ArrayList<Circle> c= new ArrayList<>();
	   Iterator<Shape> iter = slist.iterator();
	   while(iter.hasNext())
	   {
		   Shape s1=iter.next();
	   		if(s1.getClass().getName()=="Circle")
	   			c.add((Circle) s1);
	   }
	   return c;
	   
   }
  public ArrayList<Rectangle> geRectangles()
   {
        // Should return list of  Rectangle Objects from slist property.
	  ArrayList<Rectangle> r= new ArrayList<>();
	  Iterator<Shape> iter = slist.iterator();
	   while(iter.hasNext())
	   {
		   Shape s1=iter.next();
	   		if(s1.getClass().getName()=="Rectangle")
	   			r.add((Rectangle) s1);
	   }
	   return r;
   }
   public boolean  deleteShape(Shape s)
   {
            // If given Shape I,e. Circle/Rectangle object if should delete and return true
            // If not found should return false
	   if(slist.contains(s)) {
		   slist.remove(slist.indexOf(s));
	   }
	   return slist.contains(s);
   }

}
