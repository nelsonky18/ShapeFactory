package org.cvtc.tests;
import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.cvtc.shapes.Cylinder;
import org.cvtc.shapes.MessageBox;
import junitparams.*;
@RunWith(JUnitParamsRunner.class)
public class CylinderUnitTests {
	// Cylinder Tests
	
		@Test
		public void cylinderGetHeightTest() {
			// 1. Arrange
			MessageBox messageBox = new MessageBox();
			Cylinder cylinder = new Cylinder(messageBox);
			float expected = 0;		
			// 2. Act
			float actual = cylinder.getHeight();				
			// 3. Assert
		    assertEquals(expected, actual, 0.0f);
		}
		
		@Test
		public void cylinderGetRadiusTest() {
			// 1. Arrange
			MessageBox messageBox = new MessageBox();
			Cylinder cylinder = new Cylinder(messageBox);
			float expected = 0;		
			// 2. Act
			float actual = cylinder.getRadius();				
			// 3. Assert
		    assertEquals(expected, actual, 0.0f);
		}
		
		@Test
		public void cylinderSetHeightTest() {
			// 1. Arrange
			MessageBox messageBox = new MessageBox();
			Cylinder cylinder = new Cylinder(messageBox);
			float expected = 10;		
			// 2. Act
			cylinder.setHeight(10);
			float actual = cylinder.getHeight();				
			// 3. Assert
		    assertEquals(expected, actual, 0.0f);
		}
		
		@Test
		public void cylinderSetRadiusTest() {
			// 1. Arrange
			MessageBox messageBox = new MessageBox();
			Cylinder cylinder = new Cylinder(messageBox);
			float expected = 10;		
			// 2. Act
			cylinder.setRadius(10);
			float actual = cylinder.getRadius();				
			// 3. Assert
		    assertEquals(expected, actual, 0.0f);
		}
		
		@Test
		public void cylinderConstructorTest() {
			// 1. Arrange
			MessageBox messageBox = new MessageBox();
			Cylinder cylinder = new Cylinder(messageBox);
			Cylinder expected = new Cylinder(messageBox);		
			// 2. Act
			Cylinder actual = cylinder;
			// 3. Assert
			assertEquals(actual.getMessageBox(), expected.getMessageBox());
		}
		
		@Test
		public void cylinderGetSurfaceAreaTest1() {
			// 1. Arrange
			MessageBox messageBox = new MessageBox();
			Cylinder cylinder = new Cylinder(messageBox);
			float expected = 0;		
			// 2. Act
			float actual = cylinder.surfaceArea();				
			// 3. Assert
		    assertEquals(expected, actual, 0.0f);
		}
		
		@Test
		@Parameters ({
			"10, 11"
		})
		public void cylinderGetSurfaceAreaTest2(float radius, float height) {
			// 1. Arrange
			MessageBox messageBox = new MessageBox();
			Cylinder cylinder = new Cylinder(messageBox);
			float expected = 1319;		
			// 2. Act
			cylinder.setRadius(radius);
			cylinder.setHeight(height);
			float actual = cylinder.surfaceArea();				
			// 3. Assert
		    assertEquals(expected, actual, 1.0f);
		}
		
		@Test
		@Parameters ({
			"12, 13"
		})
		public void cylinderGetSurfaceAreaTest3(float radius, float height) {
			// 1. Arrange
			MessageBox messageBox = new MessageBox();
			Cylinder cylinder = new Cylinder(messageBox);
			float expected = 1885;		
			// 2. Act
			cylinder.setRadius(radius);
			cylinder.setHeight(height);
			float actual = cylinder.surfaceArea();				
			// 3. Assert
		    assertEquals(expected, actual, 1.0f);
		}
		
		@Test
		public void cylinderGetVolumeTest1() {
			// 1. Arrange
			MessageBox messageBox = new MessageBox();
			Cylinder cylinder = new Cylinder(messageBox);
			float expected = 0;
			// 2. Act
			float actual = cylinder.volume();				
			// 3. Assert
		    assertEquals(expected, actual, 0.0f);
		}
		
		@Test
		@Parameters ({
			"4, 8"
		})
		public void cylinderGetVolumeTest2(float radius, float height) {
			// 1. Arrange
			MessageBox messageBox = new MessageBox();
			Cylinder cylinder = new Cylinder(messageBox);
			float expected = 402;
			// 2. Act
			cylinder.setRadius(radius);
			cylinder.setHeight(height);
			float actual = cylinder.volume();				
			// 3. Assert
		    assertEquals(expected, actual, 1.0f);
		}
		
		@Test
		@Parameters ({
			"16, 19"
		})
		public void cylinderGetVolumeTest3(float radius, float height) {
			// 1. Arrange
			MessageBox messageBox = new MessageBox();
			Cylinder cylinder = new Cylinder(messageBox);
			float expected = 15281;
			// 2. Act
			cylinder.setRadius(radius);
			cylinder.setHeight(height);
			float actual = cylinder.volume();				
			// 3. Assert
		    assertEquals(expected, actual, 1.0f);
		}
}
