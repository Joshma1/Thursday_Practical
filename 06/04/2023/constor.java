/* write a program using constructor. 
 * create a class Person with Id, Name,
 *  Designation. Ask the user what are his
 *   inputs and according to that call the constructor */
//package pack;
import java.util.Scanner;
class Person12
{
   double id;
   String name;
   String designation;
   Person12(double id,String name,String designation)
   {
	 this.id=id;
	 this.name=name;
	 this.designation=designation;
	 System.out.println("id :"+id+"\n name :"+name+"\n designation :"+designation);
   }
   Person12(double id,String name)
   {
	   this.id=id;
	   this.name=name;
	   System.out.println("id :"+id+"\n name :"+name);
   }
}
public class constor {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
	    System.out.println("Enter ID :");
	    int id1=s.nextInt();
	    System.out.println("Enter name :");
	    String name1=s.next();
	    System.out.println("Enter Designation :");
	    String des=s.next();
	    Person12 p=new Person12(id1,name1,des);
	    Person12 p1=new Person12 (id1,name1);
	}
}

