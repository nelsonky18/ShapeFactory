package org.cvtc.tests;
import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.cvtc.shapes.Cuboid;
import org.cvtc.shapes.MessageBox;
import junitparams.*;
@RunWith(JUnitParamsRunner.class)
public class CuboidUnitTests {
	// Cuboid Tests
		
		@Test
		public void cuboidGetWidthTest() {
			// 1. Arrange
			MessageBox messageBox = new MessageBox();
			Cuboid cuboid = new Cuboid(messageBox);
			float expected = 0;		
			// 2. Act
			float actual = cuboid.getWidth();				
			// 3. Assert
		    assertEquals(expected, actual, 0.0f);
		}

		@Test
		public void cuboidGetHeightTest() {
			// 1. Arrange
			MessageBox messageBox = new MessageBox();
			Cuboid cuboid = new Cuboid(messageBox);
			float expected = 0;		
			// 2. Act
			float actual = cuboid.getHeight();				
			// 3. Assert
		    assertEquals(expected, actual, 0.0f);
		}
		
		@Test
		public void cuboidGetDepthTest() {
			// 1. Arrange
			MessageBox messageBox = new MessageBox();
			Cuboid cuboid = new Cuboid(messageBox);
			float expected = 0;		
			// 2. Act
			float actual = cuboid.getDepth();				
			// 3. Assert
		    assertEquals(expected, actual, 0.0f);
		}
		
		@Test
		@Parameters ({
			"10"
		})
		public void cuboidSetWidthTest(float x) {
			// 1. Arrange
			MessageBox messageBox = new MessageBox();
			Cuboid cuboid = new Cuboid(messageBox );
			float expected = 10;		
			// 2. Act
			cuboid.setWidth(x);
			float actual = cuboid.getWidth();				
			// 3. Assert
		    assertEquals(expected, actual, 0.0f);
		}
		
		@Test
		@Parameters ({
			"11"
		})
		public void cuboidSetHeightTest(float x) {
			// 1. Arrange
			MessageBox messageBox = new MessageBox();
			Cuboid cuboid = new Cuboid(messageBox);
			float expected = 11;		
			// 2. Act
			cuboid.setHeight(x);
			float actual = cuboid.getHeight();				
			// 3. Assert
		    assertEquals(expected, actual, 0.0f);
		}
		
		@Test
		@Parameters ({
			"12"
		})
		public void cuboidSetDepthTest(float x) {
			// 1. Arrange
			MessageBox messageBox = new MessageBox();
			Cuboid cuboid = new Cuboid(messageBox);
			float expected = 12;		
			// 2. Act
			cuboid.setDepth(x);
			float actual = cuboid.getDepth();				
			// 3. Assert
		    assertEquals(expected, actual, 0.0f);
		}
		
		@Test
		public void cuboidConstructorTest() {
			// 1. Arrange
			MessageBox messageBox = new MessageBox();
			Cuboid cuboid = new Cuboid(messageBox);
			Cuboid expected = new Cuboid(messageBox);		
			// 2. Act
			Cuboid actual = cuboid;			
			// 3. Assert
			assertEquals(actual.getMessageBox(), expected.getMessageBox());
		}
		
		@Test
		public void cuboidGetSurfaceAreaTest1() {
			// 1. Arrange
			MessageBox messageBox = new MessageBox();
			Cuboid cuboid = new Cuboid(messageBox);
			float expected = 0;		
			// 2. Act
			float actual = cuboid.surfaceArea();				
			// 3. Assert
		    assertEquals(expected, actual, 0.0f);
		}
		
		@Test
		@Parameters ({
			"10, 11, 12"
		})
		public void cuboidGetSurfaceAreaTest2(float width, float height, float depth) {
			// 1. Arrange
			MessageBox messageBox = new MessageBox();
			Cuboid cuboid = new Cuboid(messageBox);
			float expected = 4147f;		
			// 2. Act
			cuboid.setWidth(width);
			cuboid.setHeight(height);
			cuboid.setDepth(depth);
			float actual = cuboid.surfaceArea();				
			// 3. Assert
		    assertEquals(expected, actual, 1.0f);
		}
		
		@Test
		@Parameters ({
			"13, 14, 15"
		})
		public void cuboidGetSurfaceAreaTest3(float width, float height, float depth) {
			// 1. Arrange
			MessageBox messageBox = new MessageBox();
			Cuboid cuboid = new Cuboid(messageBox);
			float expected = 8577f;		
			// 2. Act
			cuboid.setWidth(width);
			cuboid.setHeight(height);
			cuboid.setDepth(depth);
			float actual = cuboid.surfaceArea();				
			// 3. Assert
		    assertEquals(expected, actual, 1.0f);
		}
		
		@Test
		public void cuboidGetVolumeTest1() {
			// 1. Arrange
			MessageBox messageBox = new MessageBox();
			Cuboid cuboid = new Cuboid(messageBox);
			float expected = 0;		
			// 2. Act
			float actual = cuboid.volume();				
			// 3. Assert
		    assertEquals(expected, actual, 0.0f);
		}
		
		@Test
		@Parameters ({
			"5,2,8"
		})
		public void cuboidGetVolumeTest2(float width, float height, float depth) {
			// 1. Arrange
			MessageBox messageBox = new MessageBox();
			Cuboid cuboid = new Cuboid(messageBox);
			float expected = 80;		
			// 2. Act
			cuboid.setWidth(width);
			cuboid.setHeight(height);
			cuboid.setDepth(depth);
			float actual = cuboid.volume();				
			// 3. Assert
		    assertEquals(expected, actual, 0.0f);
		}
		
		@Test
		@Parameters ({
			"6,4,15"
		})
		public void cuboidGetVolumeTest3(float width, float height, float depth) {
			// 1. Arrange
			MessageBox messageBox = new MessageBox();
			Cuboid cuboid = new Cuboid(messageBox);
			float expected = 360;		
			// 2. Act
			cuboid.setWidth(width);
			cuboid.setHeight(height);
			cuboid.setDepth(depth);
			float actual = cuboid.volume();				
			// 3. Assert
		    assertEquals(expected, actual, 0.0f);
		}
}
