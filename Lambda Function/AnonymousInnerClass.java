package lambdaFunction;
@FunctionalInterface
interface D
{
	void display();
}
public class AnonymousInnerClass {

	public static void main(String[] args) {
		D obj=new  D(){
			public void display()
			{
				System.out.println("Hi...");
			}
		};
		obj.display();
	}

}
