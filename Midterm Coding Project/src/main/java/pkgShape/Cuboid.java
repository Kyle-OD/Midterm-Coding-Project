package pkgShape;

import java.util.Comparator;

public class Cuboid  extends Rectangle{

	private int iDepth;
	
	public Cuboid(int width,int height, int depth) throws IllegalArgumentException{
		super(width,height);
		this.setiDepth(depth);
	}
	
	public void setiDepth(int iDepth) throws IllegalArgumentException{
		if(iDepth<=0) {
			throw new IllegalArgumentException("Depth value must be positive");
		}
		this.iDepth = iDepth;
	}

	public int getiDepth() {		 
		return iDepth;
	}
	
	public double volume() {
		return super.area()*this.iDepth;
	}
	
	@Override
	public double area() {
		return (double)(2*super.area()+2*(this.iDepth*this.getiLength())+2*(this.iDepth*this.getiWidth()));
	}
	
	@Override
	public double perimeter() {
		throw new UnsupportedOperationException("Perimeter not supported for a cuboid");
	}
	
	@Override
	public int compareTo(Object that) {
		throw new UnsupportedOperationException("CompareTo not supported for a cuboid, use SortByArea or SortByVolume");
	}
	
	public static class SortByArea implements Comparator<Cuboid>{		
		public int compare(Cuboid a, Cuboid b) {
			return (int)(a.area() - b.area());
		}
	}
	
	public static class SortByVolume implements Comparator<Cuboid>{
		public int compare(Cuboid a, Cuboid b) {
			return (int)(a.volume() - b.volume());
		}
	}
}
