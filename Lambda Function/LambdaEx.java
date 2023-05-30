package lambdaFunction;
//Lambda function Ex
@FunctionalInterface // Functional interface
interface A
{
	void display();
}

public class LambdaEx//Main method 
{

	public static void main(String[] args) {

		A obj=()->{ //Lambda function (->)
			System.out.println("Hello Josham."); //print function
		};
		obj.display(); //display function
	}

}
