package lambdaFunction;
@FunctionalInterface // Functional interface
interface C
{
	void display();
}
class B implements C //implements function with lambda function
{
	public void display() //method
	{
		System.out.println("Good Morning....");
	}
}
public class ImplementsEx //Main method
{

	public static void main(String[] args) {
		B b=new B(); //object create
		b.display(); //object display
	}

}
