public class Circle extends Shape
{

	private double radius;
	
	public Circle(){
		radius = 0;
	}//default constructor
	
	public Circle( double r){
		radius = r;
	}//overloaded constructor
	
	public double computeArea(){
		double area = Math.PI * radius * radius;
		return area;
	}
}