package org.cvtc.shapes;
/**
 * @author nelsonky18
 */
public class Cuboid extends Shape implements Render {
	
	/**
	 * The width of this Cuboid instance.
	 */
	private float width = 0.0f;
	
	/**
	 * The height of this Cuboid instance.
	 */
	private float height = 0.0f;
	
	/**
	 * The depth of this Cuboid instance.
	 */
	private float depth = 0.0f;
	
	/**
	 * Gets the width of this Cuboid instance.
	 */
	public float getWidth() {
		return width;
	}
	
	/**
	 * Sets the width of this Cuboid instance.
	 */
	public void setWidth(float width) {
		this.width = width;
	}
	
	/**
	 * Gets the height of this Cuboid instance.
	 */
	public float getHeight() {
		return height;
	}
	
	/**
	 * Sets the height of this Cuboid instance.
	 */
	public void setHeight(float height) {
		this.height = height;
	}
	
	/**
	 * Gets the depth of this Cuboid instance.
	 */
	public float getDepth() {
		return depth;
	}
	
	/**
	 * Sets the depth of this Cuboid instance.
	 */
	public void setDepth(float depth) {
		this.depth = depth;
	}
	
	/**
	 * Initializes a new instance of a Cuboid.
	 */
	public Cuboid(Dialog messageBox) {
		super(messageBox);
	}
	
	/**
	 * This method returns the surface area for a cuboid.
	 */
	@Override
	public float surfaceArea() {
		return getWidth() * getDepth() * getHeight() * (float)Math.PI;
	}
	
	/**
	 * This method returns the volume for a cuboid.
	 */
	@Override
	public float volume() {
		return getWidth() * getDepth() * getHeight();
	}
	
	/**
	 * This method displays the dimensions of a cuboid.
	 */
	public void render() {
		messageBox.show("CUBOID: Width: " + getWidth() + " Height: " + getHeight() + " Depth: " + getDepth() + " Surface Area: " + surfaceArea() + " Volume: " + volume(), "Cuboid");
	}
}