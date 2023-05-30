package lambdaFunction;
@FunctionalInterface
interface A
{
	void display();
}

public class LambdaEx {

	public static void main(String[] args) {

		A obj=()->{
			System.out.println("Hello Josham.");
		};
		obj.display();
	}

}
