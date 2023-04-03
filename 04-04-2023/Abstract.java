/* "Create an abstract class called "Shape" with an abstract method called "calculateArea". 
Create two subclasses called "Circle" and "Rectangle" that inherit from Shape and implement
 the "calculateArea" method. Create objects of both the Circle and Rectangle classes and call their respective "calculateArea" methods. */
 
//package pack; 

abstract class Shape
{
	abstract void calculateArea();
}
class Circle extends Shape
{
	void calculateArea()
	{
		double area,r;
		r=10;
		area=3.14*r*r;
		System.out.println("Area of Circle :"+area);
	}
}
class MRectangle extends Shape
{
	void calculateArea()
	{
		double area1,l,b;
		l=10;
		b=5;
		area1=(l*b);
		System.out.println("Area of Rectangle :"+area1);
		
	}
}
public class Abstract 
{

	public static void main(String[] args)
	 {
		Circle c=new Circle();
		c.calculateArea();
		MRectangle r=new MRectangle();
               r.calculateArea();
	}

}
