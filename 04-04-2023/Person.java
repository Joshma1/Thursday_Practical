/* Create a parent class called "Person" with attributes such as name, age, and a method 
called "speak". Create a child class called "Student" that inherits from Person 
and has an additional attribute called "grade" and a method called "study". 
Create an object of the Student class and call both the "speak" and "study" methods.*/

//package pack;

class Persons
{
	
      String name;
      int age;
      void speak(String name,int age)
      {
    	  System.out.println("\n name:"+name+"\n age:"+age);
      }
     // 
}
class Student extends Persons
{ 
	String gread;
	void study(String name,int age,String gread)
	{
		System.out.println("\n name:"+name+"\n age:"+age+"\n Gread :"+gread);
	}
}

public class Person 
{

	public static void main(String[] args)
	{
		Student s=new Student();
		s.speak("ABC", 40);
		s.study("Joshma", 20, "A+");
	}

}

