package org.cvtc.tests;
import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.cvtc.shapes.MessageBox;
import org.cvtc.shapes.Sphere;
import junitparams.*;
@RunWith(JUnitParamsRunner.class)
public class SphereUnitTests {
	// Sphere Tests
	
		@Test
		public void sphereGetRadius() {
			// 1. Arrange
			MessageBox messageBox = new MessageBox();
			Sphere sphere = new Sphere(messageBox);
			float expected = 0;		
			// 2. Act
			float actual = sphere.getRadius();				
			// 3. Assert
		    assertEquals(expected, actual, 0.0f);
		}
		
		@Test
		public void sphereSetRadius() {
			// 1. Arrange
			MessageBox messageBox = new MessageBox();
			Sphere sphere = new Sphere(messageBox);
			float expected = 10;		
			// 2. Act
			sphere.setRadius(10);
			float actual = sphere.getRadius();				
			// 3. Assert
		    assertEquals(expected, actual, 0.0f);
		}
		
		@Test
		public void sphereConstructorTest() {
			// 1. Arrange
			MessageBox messageBox = new MessageBox();
			Sphere sphere = new Sphere(messageBox);
			Sphere expected = new Sphere(messageBox);
			// 2. Act
			Sphere actual = sphere;
			// 3. Assert
			assertEquals(actual.getMessageBox(), expected.getMessageBox());
		}
		
		@Test
		public void sphereGetSurfaceAreaTest1() {
			// 1. Arrange
			MessageBox messageBox = new MessageBox();
			Sphere sphere = new Sphere(messageBox);
			float expected = 0;		
			// 2. Act
			float actual = sphere.surfaceArea();				
			// 3. Assert
		    assertEquals(expected, actual, 0.0f);
		}
		
		@Test
		@Parameters ({
			"12"
		})
		public void sphereGetSurfaceAreaTest2(float radius) {
			// 1. Arrange
			MessageBox messageBox = new MessageBox();
			Sphere sphere = new Sphere(messageBox);
			float expected = 1810f;
			// 2. Act
			sphere.setRadius(radius);
			float actual = sphere.surfaceArea();				
			// 3. Assert
		    assertEquals(expected, actual, 1.0f);
		}
		
		@Test
		@Parameters ({
			"19"
		})
		public void sphereGetSurfaceAreaTest3(float radius) {
			// 1. Arrange
			MessageBox messageBox = new MessageBox();
			Sphere sphere = new Sphere(messageBox);
			float expected = 4536f;
			// 2. Act
			sphere.setRadius(radius);
			float actual = sphere.surfaceArea();				
			// 3. Assert
		    assertEquals(expected, actual, 1.0f);
		}
		
		@Test
		public void sphereGetVolumeTest1() {
			// 1. Arrange
			MessageBox messageBox = new MessageBox();
			Sphere sphere = new Sphere(messageBox);
			float expected = 0;
			// 2. Act
			float actual = sphere.volume();				
			// 3. Assert
		    assertEquals(expected, actual, 0.0f);
		}
		
		@Test
		@Parameters ({
			"6"
		})
		public void sphereGetVolumeTest2(float radius) {
			// 1. Arrange
			MessageBox messageBox = new MessageBox();
			Sphere sphere = new Sphere(messageBox);
			float expected = 848f;
			// 2. Act
			sphere.setRadius(radius);
			float actual = sphere.volume();				
			// 3. Assert
		    assertEquals(expected, actual, 1.0f);
		}
		
		@Test
		@Parameters ({
			"17"
		})
		public void sphereGetVolumeTest3(float radius) {
			// 1. Arrange
			MessageBox messageBox = new MessageBox();
			Sphere sphere = new Sphere(messageBox);
			float expected = 19293f;
			// 2. Act
			sphere.setRadius(radius);
			float actual = sphere.volume();				
			// 3. Assert
		    assertEquals(expected, actual, 1.0f);
		}
}
