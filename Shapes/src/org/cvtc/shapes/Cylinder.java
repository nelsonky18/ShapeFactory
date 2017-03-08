package org.cvtc.shapes;
/**
 * @author nelsonky18
 */
public class Cylinder extends Shape implements Render {
	
	/**
	 * The radius of this Cylinder instance.
	 */
	private float radius = 0.0f;
	
	/**
	 * The height of this Cylinder instance.
	 */
	private float height = 0.0f;
	
	/**
	 * Gets the radius of this Cylinder instance.
	 */
	public float getRadius() {
		return radius;
	}
	
	/**
	 * Sets the radius of this Cylinder instance.
	 */
	public void setRadius(float radius) {
		this.radius = radius;
	}
	
	/**
	 * Gets the height of this Cylinder instance.
	 */
	public float getHeight() {
		return height;
	}
	
	/**
	 * Sets the height of this Cylinder instance.
	 */
	public void setHeight(float height) {
		this.height = height;
	}
	
	/**
	 * Initializes a new instance of a Cylinder.
	 */
	public Cylinder(Dialog messageBox) {
		super(messageBox);
	}
	
	/**
	 * This method returns the surface area for a cylinder.
	 */
	@Override
	public float surfaceArea() {
		return ((2 * (float)Math.PI) * getRadius() * getHeight()) +
			   (2 * (float)Math.PI) * getRadius() * getRadius();
	}
	
	/**
	 * This method returns the volume for a cylinder.
	 */
	@Override
	public float volume() {
		return (float)Math.PI * getRadius() * getRadius() * getHeight();
	}
	
	/**
	 * This method displays the dimensions for a cylinder.
	 */
	public void render() {
		messageBox.show("CYLINDER: Radius: " + getRadius() + " Height: " + getHeight() + " Surface Area: " + surfaceArea() + " Volume: " + volume(), "Cylinder");
	}
}