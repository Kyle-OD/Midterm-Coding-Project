package pkgShape;

public class Rectangle extends Shape{

	private int iWidth;
	private int iLength;
	
	public Rectangle(int width, int length) throws IllegalArgumentException {
		super();
		this.setiLength(length);
		this.setiWidth(width);
	}

	public int getiWidth() {
		return iWidth;
	}

	public void setiWidth(int iWidth) throws IllegalArgumentException{
		if(iWidth<=0) {
			throw new IllegalArgumentException("Width value must be positive");
		}
		this.iWidth = iWidth;
	}

	public int getiLength() {
		return iLength;
	}

	public void setiLength(int iLength) throws IllegalArgumentException{
		if(iLength<=0) {
			throw new IllegalArgumentException("Length value must be positive");
		}
		this.iLength = iLength;
	}
	
	@Override
	public double area() {
		return (double)(this.iLength*this.iWidth);
	}
	
	@Override
	public double perimeter() {
		return (double)(2*this.iLength+2*this.iWidth);
	}
	
	public int compareTo(Object that) {
		return (int)(this.area() - ((Rectangle) that).area());
	}
}
