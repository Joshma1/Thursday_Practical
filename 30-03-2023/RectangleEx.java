/* Create a class named 'Rectangle' with two data members 'length'
 and 'breadth' and  two methods to print the area and perimeter of the rectangle 
 respectively. It's constructor having parameters for length and breadth is used
 to initialize length and breadth of the rectangle. Print the area and perimeter of a rectangle */
class Rect1
{
	int l;
	int b;
	Rect1()
	{
		l=5;
		b=9;
	}
	public void area()
	{
		System.out.println("Area of Ractangle :"+(l*b));
	}
	public void perimeter()
	{
		System.out.println("Perimeter of Rectangle :"+(2*l*b));
	}
}
public class RectangleEx {

	public static void main(String[] args) {
		Rect1 r=new Rect1();
		r.area();
        r.perimeter();
	}

}