package org.cvtc.tests.substitutes;
/**
 * @author nelsonky18
 */
public abstract class ShapeSub {
	protected DialogSub messageBox;
	
	/**
	 * This method returns the Shape's current message box.
	 */
	public DialogSub getMessageBox() {
		return messageBox;
	}
	
	/**
	 * This method sets the message box of the Shape.
	 */
	public void setMessageBox(DialogSub messageBox) {
		this.messageBox = messageBox;
	}
	
	/**
	 * This constructor sets up the shape with a message box.
	 */
	public ShapeSub(DialogSub messageBox) {
		this.messageBox = messageBox;
	}
	
	/**
	 * This is the abstract method for computing the surface area of different shapes. 
	 */
	public abstract float surfaceArea();
	
	/**
	 * This is the abstract method for computing the volume of different shapes.
	 */
	public abstract float volume();
}