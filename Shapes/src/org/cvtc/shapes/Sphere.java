package org.cvtc.shapes;
/**
 * @author nelsonky18
 */
public class Sphere extends Shape implements Render {
	
	/**
	 * The radius of this Sphere instance.
	 */
	private float radius = 0.0f;
	
	/**
	 * Gets the radius of this Sphere instance.
	 */
	public float getRadius() {
		return radius;
	}
	
	/**
	 * Sets the radius of this Sphere instance.
	 */
	public void setRadius(float radius) {
		this.radius = radius;
	}
	
	/**
	 * Initializes a new instance of a Sphere.
	 */
	public Sphere(Dialog messageBox) {
		super(messageBox);
	}
	
	/**
	 * This method returns the surface area for a sphere.
	 */
	@Override
	public float surfaceArea() {
		return (float)4 * (float)Math.PI * getRadius() * getRadius();
	}
	
	/**
	 * This method returns the volume for a sphere.
	 */
	@Override
	public float volume() {
		return (float)1.25 * (float)Math.PI * getRadius() * getRadius() * getRadius();
	}
	
	/**
	 * This method displays the dimensions for a sphere.
	 */
	public void render() {
		messageBox.show("SPHERE: Radius: " + getRadius() + " Surface Area: " + surfaceArea() + " Volume: " + volume(), "Sphere");
	}
}