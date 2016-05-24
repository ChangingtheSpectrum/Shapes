import java.util.*;
public class TestShapes 
{

	public static void main(String[] args) 
	{
		ArrayList<Shape> list = new ArrayList<Shape>();
		Scanner in = new Scanner(System.in);
		int choice;
		System.out.println("Enter '1' for Rectangle, '2' for Circle, or '3' for Triangle.");
		for(int i=0; i<10; i++)
		{
			System.out.println("Shape " + (i+1) + ":");
			choice=in.nextInt();
			inputs(list, choice);
		}
		for(int i=0; i<list.size(); i++)
		{
			System.out.println("Area of shape " + (i+1) + ": " + list.get(i).computeArea());
		}
	}//main
	
	public static void inputs(ArrayList list, int choice)
	{
		Scanner in = new Scanner(System.in);
		switch(choice)
		{
			case 1:
				System.out.println("Enter height and width.");
				int h=in.nextInt(); int w=in.nextInt();
				list.add(new Rectangle(h, w));
				break;
			case 2:
				System.out.println("Enter radius.");
				int r=in.nextInt();
				list.add(new Circle(r));
				break;
			case 3:
				System.out.println("Enter base and height.");
				int b=in.nextInt(); int triangleH=in.nextInt();
				list.add(new Triangle(b, triangleH));
				break;
			default:
				System.out.println("Bruh that's not a choice.");
		}//switch
	}//inputs
}//class