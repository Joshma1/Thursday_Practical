package lambdaFunction;
@FunctionalInterface
interface C
{
	void display();
}
class B implements C
{
	public void display()
	{
		System.out.println("GM..");
	}
}
public class ImplementsEx {

	public static void main(String[] args) {
		B b=new B();
		b.display();
	}

}
