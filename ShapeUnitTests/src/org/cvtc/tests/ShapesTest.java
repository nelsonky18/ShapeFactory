package org.cvtc.tests;
import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.cvtc.tests.substitutes.CuboidSub;
import org.cvtc.tests.substitutes.CylinderSub;
import org.cvtc.tests.substitutes.MessageBoxSub;
import org.cvtc.tests.substitutes.SphereSub;

import junitparams.*;
@RunWith(JUnitParamsRunner.class)
public class ShapesTest {
	@Test
	public void CuboidRenderTest() {
		// 1. Arrange
		MessageBoxSub messageBox = new MessageBoxSub();
		CuboidSub cuboid = new CuboidSub(messageBox);
		// 2. Act
		String expected = "0x00";
		String actual = cuboid.render();
		// 3. Assert
		assertEquals(expected, actual);
	}
	
	@Test
	public void CylinderRenderTest() {
		// 1. Arrange
		MessageBoxSub messageBox = new MessageBoxSub();
		CylinderSub cylinder = new CylinderSub(messageBox);
		// 2. Act
		String expected = "0x00";
		String actual = cylinder.render();
		// 3. Assert
		assertEquals(expected, actual);
	}
	
	@Test
	public void SphereRenderTest() {
		// 1. Arrange
		MessageBoxSub messageBox = new MessageBoxSub();
		SphereSub sphere = new SphereSub(messageBox);
		// 2. Act
		String expected = "0x00";
		String actual = sphere.render();
		// 3. Assert
		assertEquals(expected, actual);
	}
}