public class Rectangle extends Shape
{
	
	private double length;
	private double width;
	
	public Rectangle(){
		length = 0;
		width = 0;
		
	}//default constructor
	
	public Rectangle(double l, double w){
		length = l;
		width = w;
	}//overloaded constructor
	
	public double computeArea(){
		double area;
		area = length * width;
		return area;
	}//computeArea
	
}