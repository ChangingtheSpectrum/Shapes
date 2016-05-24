
public class Triangle extends Shape
{
	
	private double base;
	private double height;
	
	public Triangle(){
		base = 0;
		height = 0;
	}//constructor
	
	public Triangle(double b, double h){
		base = b;
		height = h;
	}//overloaded constructor
	
	public double computeArea(){
		double area = 0.5 * base * height;
		return area;
	}
	
}