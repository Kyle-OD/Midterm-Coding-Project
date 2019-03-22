package pkgTestShape;

import static org.junit.Assert.*;

import org.junit.*;

import pkgShape.Rectangle;

public class RectangleTest {
	
	@Test
	public void Constructor_Test() {
		Rectangle rect = new Rectangle(1,2);
		assertTrue(rect instanceof Rectangle);
	}
	
	@Test
	public void GetWidth_Test() {
		Rectangle rect = new Rectangle(1,2);
		assertTrue(rect.getiWidth() == 1);
	}
	
	@Test
	public void GetLength_Test() {
		Rectangle rect = new Rectangle(1,2);
		assertTrue(rect.getiLength() == 2);
	}

	@Test
	public void SetWidth_Test1() {
		Rectangle rect = new Rectangle(1,2);
		rect.setiWidth(7);
		assertTrue(rect.getiWidth() == 7);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void SetWidth_Test2() {
		Rectangle rect = new Rectangle(1,2);
		rect.setiWidth(-5);
	}
	
	@Test
	public void SetLength_Test1() {
		Rectangle rect = new Rectangle(1,2);
		rect.setiLength(7);
		assertTrue(rect.getiLength() == 7);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void SetLength_Test2() {
		Rectangle rect = new Rectangle(1,2);
		rect.setiLength(-3);
	}
	
	@Test
	public void Area_Test() {
		Rectangle rect = new Rectangle(5,2);
		assertTrue(rect.area() == 10);
	}
	
	@Test
	public void Perimeter_Test() {
		Rectangle rect = new Rectangle(5,2);
		assertTrue(rect.perimeter() == 14);
	}
	
	@Test
	public void CompareTo_Test() {
		Rectangle rect1 = new Rectangle(5,2);
		Rectangle rect2 = new Rectangle(5,7);
		
		assertEquals(rect1.compareTo(rect2),-25);
	}


}
