/* Write a program in Java showing overloading of Add method with 2 
and 3 parameters. In the user passes 2 values method with 2 parameter 
should be called if the passes 3 values method with 3 parameters should be called */
class O
{
	public void add(int a,int b)
	{
		System.out.println("2 Arguments method is called...!");
	}
	public void add(int a,int b,int c)
	{
		System.out.println("3 Arguments method is called...!");
	}
}
public class OverloadingEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        O o1=new O();
        o1.add(10,2,30);
	}

}