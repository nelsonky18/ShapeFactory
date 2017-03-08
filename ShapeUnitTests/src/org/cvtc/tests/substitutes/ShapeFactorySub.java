package org.cvtc.tests.substitutes;
/**
 * @author nelsonky18
 */
public class ShapeFactorySub {
	private DialogSub dialog = new MessageBoxSub(); 
	
	/**
	 * This sets the dialog to an incoming dialog instance.
	 */
	public void setDialog(DialogSub dialog) {
		 this.dialog = dialog;
	 }
	 
	/**
	 * This returns the currently set dialog.
	 */
	 public DialogSub getDialog() {
		 return dialog;
	 }
	 
	 /**
	  * This constructs a new ShapeFactory.
	  */
	 public ShapeFactorySub(DialogSub dialog) {
		 this.dialog = dialog;
	 }
	 
	 /**
	  * This makes a new Cuboid with the input variables and returns it.
	  */
	 public ShapeSub makeCuboid(float height, float width, float depth) {
		 CuboidSub newCuboid = new CuboidSub(dialog);
		 newCuboid.setHeight(height);
		 newCuboid.setWidth(width);
		 newCuboid.setDepth(depth);
		 return newCuboid;
	 }
	 
	/**
	 * This makes a new Cylinder with the input variables and returns it.
	 */
	 public ShapeSub makeCylinder(float radius, float height) {
		 CylinderSub newCylinder = new CylinderSub(dialog);
		 newCylinder.setRadius(radius);
		 newCylinder.setHeight(height);
		 return newCylinder;
	 }
	 
	/**
	 * This makes a new Sphere with the input variables and returns it.
	 */
	 public ShapeSub makeSphere(float radius) {
		 SphereSub newSphere = new SphereSub(dialog);
		 newSphere.setRadius(radius);
		 return newSphere;
	 }
}