package lambdaFunction;
@FunctionalInterface //FunctionalInterface
interface D
{
	void display();
}
public class AnonymousInnerClass //Main Function With Anonymous Inner Class.
{

	public static void main(String[] args) 
	{
		D obj=new  D(){ //object create with Anonymous inner class
			public void display()
			{
				System.out.println("Hi..."); //print function
			}
		};
		obj.display(); // called display method 
	}

}
