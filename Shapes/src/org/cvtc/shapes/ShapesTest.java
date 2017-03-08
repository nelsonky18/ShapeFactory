package org.cvtc.shapes;
/**
 * @author nelsonky18
 */
public class ShapesTest {
	
	/**
	 * This is the main method, where you can create instances of various Shape objects.
	 * Currently, you can create Cuboid, Cylinder, and Sphere shapes.
	 */
	public static void main(String[] args) {
		try {
			Dialog messageBox = new MessageBox();
			Cuboid myCuboid;
			Cylinder myCylinder;
			Sphere mySphere;
			
			ShapeFactory myFactory = new ShapeFactory(messageBox);
			
			myCuboid = (Cuboid) myFactory.makeCuboid(10, 15, 20);
			myCylinder = (Cylinder)myFactory.makeCylinder(12, 14);
			mySphere = (Sphere)myFactory.makeSphere(18);
			
			myCuboid.render();
			myCylinder.render();
			mySphere.render();
			
		} catch (Exception ex) {
			
		}
	}
}