package org.cvtc.tests;
import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.cvtc.tests.substitutes.*;

import junitparams.*;
@RunWith(JUnitParamsRunner.class)
public class ShapeFactoryUnitTests {
	// ShapeFactory Tests
	
	@Test
	public void getDialogTest() {
		// 1. Arrange
		DialogSub messageBox = new MessageBoxSub();
		ShapeFactorySub myFactory = new ShapeFactorySub(messageBox);
		DialogSub expected = messageBox;
		// 2. Act
		DialogSub actual = myFactory.getDialog();		
		// 3. Assert
	    assertEquals(expected, actual);
	}
	
	@Test
	public void setDialogTest() {
		// 1. Arrange
		DialogSub messageBox = new MessageBoxSub();
		ShapeFactorySub myFactory = new ShapeFactorySub(messageBox);
		DialogSub expected = messageBox;
		// 2. Act
		myFactory.setDialog(messageBox);
		DialogSub actual = 	myFactory.getDialog();	
		// 3. Assert
	    assertEquals(expected, actual);
	}
	
	@Test
	public void ShapeFactoryConstructorTest() {
		// 1. Arrange
		DialogSub messageBox = new MessageBoxSub();
		ShapeFactorySub myFactory = new ShapeFactorySub(messageBox);
		ShapeFactorySub expected = new ShapeFactorySub(messageBox);		
		// 2. Act
		ShapeFactorySub actual = myFactory;			
		// 3. Assert
		assertEquals(actual.getDialog(), expected.getDialog());
	}
	
	@Test
	public void makeCuboidTest() {
		// 1. Arrange
		DialogSub messageBox = new MessageBoxSub();
		ShapeFactorySub myFactory = new ShapeFactorySub(messageBox);
		CuboidSub cuboid;
		CuboidSub expected = new CuboidSub(messageBox);
		// 2. Act
		expected.setHeight(8);
		expected.setWidth(9);
		expected.setDepth(10);
		cuboid = (CuboidSub)myFactory.makeCuboid(8, 9, 10);
		CuboidSub actual = cuboid;
		// 3. Assert
		assertEquals(actual.surfaceArea(), expected.surfaceArea(), 0.0f);
	}
	
	@Test
	public void makeCylinderTest() {
		// 1. Arrange
		DialogSub messageBox = new MessageBoxSub();
		ShapeFactorySub myFactory = new ShapeFactorySub(messageBox);
		CylinderSub cylinder;
		CylinderSub expected = new CylinderSub(messageBox);
		// 2. Act
		expected.setRadius(5);
		expected.setHeight(7);
		cylinder = (CylinderSub)myFactory.makeCylinder(5, 7);
		CylinderSub actual = cylinder;
		// 3. Assert
		assertEquals(actual.surfaceArea(), expected.surfaceArea(), 0.0f);
	}
	
	@Test
	public void makeSphereTest() {
		// 1. Arrange
		DialogSub messageBox = new MessageBoxSub();
		ShapeFactorySub myFactory = new ShapeFactorySub(messageBox);
		SphereSub sphere;
		SphereSub expected = new SphereSub(messageBox);
		// 2. Act
		expected.setRadius(15);
		sphere = (SphereSub)myFactory.makeSphere(15);
		SphereSub actual = sphere;
		// 3. Assert
		assertEquals(actual.surfaceArea(), expected.surfaceArea(), 0.0f);
	}
}