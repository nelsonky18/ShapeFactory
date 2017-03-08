package org.cvtc.shapes;
/**
 * @author nelsonky18
 */
public class ShapeFactory {
	Dialog dialog = new MessageBox(); 
	
	/**
	 * This sets the dialog to an incoming dialog instance.
	 */
	public void setDialog(Dialog dialog) {
		 this.dialog = dialog;
	 }
	 
	/**
	 * This returns the currently set dialog.
	 */
	 public Dialog getDialog() {
		 return dialog;
	 }
	 
	 /**
	  * This constructs a new ShapeFactory.
	  */
	 public ShapeFactory(Dialog dialog) {
		 this.dialog = dialog;
	 }
	 
	 /**
	  * This makes a new Cuboid with the input variables and returns it.
	  */
	 public Shape makeCuboid(float height, float width, float depth) {
		 Cuboid newCuboid = new Cuboid(dialog);
		 newCuboid.setHeight(height);
		 newCuboid.setWidth(width);
		 newCuboid.setDepth(depth);
		 return newCuboid;
	 }
	 
	/**
	 * This makes a new Cylinder with the input variables and returns it.
	 */
	 public Shape makeCylinder(float radius, float height) {
		 Cylinder newCylinder = new Cylinder(dialog);
		 newCylinder.setRadius(radius);
		 newCylinder.setHeight(height);
		 return newCylinder;
	 }
	 
	/**
	 * This makes a new Sphere with the input variables and returns it.
	 */
	 public Shape makeSphere(float radius) {
		 Sphere newSphere = new Sphere(dialog);
		 newSphere.setRadius(radius);
		 return newSphere;
	 }
}