/* write a program.create a class calculation add methods addition,substraction,multiplication and division to it.create object and access those methods.*/
class Calculation1
{
  int a=5,b=8;
  void add()
  {
    System.out.println("Addition is:"+(a+b));
  }
  void sub()
  {
    System.out.println("Substraction is:"+(a-b));
  }
  void mul()
  {
    System.out.println("Multiplication is:"+(a*b));
  }
  void div()
  {
    System.out.println("Division is:"+(a%b));
  }
}
class MainCalculation3
{
  public static void main(String args[])
  {
     Calculation1 c1=new Calculation1();
     c1.add();
     c1.sub();
     c1.mul();
     c1.div();
  }
}