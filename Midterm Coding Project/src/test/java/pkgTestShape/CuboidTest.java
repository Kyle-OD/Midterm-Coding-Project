package pkgTestShape;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import org.junit.Test;

import pkgShape.Cuboid;
import pkgShape.Cuboid.*;
import pkgShape.Rectangle;

public class CuboidTest {

	@Test
	public void Constructor_Test() {
		Cuboid cubd  = new Cuboid(2,4,6);
		assertTrue(cubd instanceof Cuboid);
	}
	
	@Test
	public void GetDepth_Test() {
		Cuboid cubd  = new Cuboid(2,4,6);
		assertEquals(cubd.getiDepth(),6);
	}
	
	@Test
	public void SetDepth_Test1() {
		Cuboid cubd  = new Cuboid(2,4,6);
		cubd.setiDepth(7);
		assertEquals(cubd.getiDepth(),7);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void SetDepth_Test2() {
		Cuboid cubd  = new Cuboid(2,4,6);
		cubd.setiDepth(-5);
	}
	
	@Test
	public void Volume_Test() {
		Cuboid cubd  = new Cuboid(2,4,6);
		assertEquals(cubd.volume(),2*4*6,0.1);
	}
	
	@Test
	public void Area_Test() {
		Cuboid cubd  = new Cuboid(2,4,6);
		assertEquals(cubd.area(), 2*(2*4+2*6+4*6),0.1);
	}
	
	@Test(expected = UnsupportedOperationException.class)
	public void Perimeter_Test() {
		Cuboid cubd  = new Cuboid(2,4,6);
		cubd.perimeter();
	}
	
	@Test(expected = UnsupportedOperationException.class)
	public void CompareTo_Test() {
		Cuboid cubd  = new Cuboid(2,4,6);
		cubd.compareTo(cubd);
	}
	
	@Test
	public void SortByArea_Test() {
		Cuboid cubd1  = new Cuboid(2,4,6);
		Cuboid cubd2  = new Cuboid(1,3,6);
		Cuboid cubd3  = new Cuboid(4,8,12);
		
		ArrayList<Cuboid> cubdList1 = new ArrayList<>();
		
		cubdList1.add(cubd1);
		cubdList1.add(cubd2);
		cubdList1.add(cubd3);
		
		List<Cuboid> cubdList2 = new ArrayList<>();
		
		cubdList2.add(cubd2);
		cubdList2.add(cubd1);
		cubdList2.add(cubd3);
		
		Collections.sort(cubdList1, new SortByArea());
		
		assertEquals(cubdList1,cubdList2);
		
		

		//assertArrayEquals(cubdList1,cubdList2);
	}
	
	@Test
	public void SortByVolume_Test() {
		Cuboid cubd1  = new Cuboid(2,4,6);
		Cuboid cubd2  = new Cuboid(1,3,6);
		Cuboid cubd3  = new Cuboid(4,8,12);
		
		ArrayList<Cuboid> cubdList1 = new ArrayList<>();
		
		cubdList1.add(cubd1);
		cubdList1.add(cubd2);
		cubdList1.add(cubd3);
		
		List<Cuboid> cubdList2 = new ArrayList<>();
		
		cubdList2.add(cubd2);
		cubdList2.add(cubd1);
		cubdList2.add(cubd3);
		
		Collections.sort(cubdList1, new SortByVolume());
		
		assertEquals(cubdList1,cubdList2);
	}
}
