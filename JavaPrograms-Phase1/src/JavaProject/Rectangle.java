package JavaProject;
public class Rectangle extends Shape { 
	private int length;
	private int width;
{
		this.length=length;
		this.width=width;
		
	}
public void displayArea() {
	System.out.println("Area of Rectangle:"+calculateArea());
	
}
public double calculateArea()
{
	return length*width;

}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
