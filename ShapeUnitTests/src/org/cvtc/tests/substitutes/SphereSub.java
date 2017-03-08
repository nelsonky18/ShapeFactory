package org.cvtc.tests.substitutes;
/**
 * @author nelsonky18
 */
public class SphereSub extends ShapeSub implements RenderSub {
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
	public SphereSub(DialogSub messageBox) {
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
	public String render() {
		String result = "0x00";
		return result;
	}
}