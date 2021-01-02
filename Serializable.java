//Program to illustrate the use of Serialization
import java.io.*;

class Employee{
	String name;
	int age;
	 Employee(String name, int age)
	 	{
	 	this.name=name;
	 	this.age=age;
	 	}
	 	void display()
	 		{
	 		System.out.println("The Name is" +name);
	 		System.out.println("The Age is" +age);
	 		}
}

class SerialTest implements Serializable {
	public static void main(String args[])
		{	try{
			FileOutputStream fr=new FileOutputStream("oob.ser");
			ObjectOutputStream ob=new ObjectOutputStream(fr);
			Employee e1=new Employee("Aakash",20);
			Employee e2=new Employee("Suraj",40);
			Employee e3=new Employee("Mukul",30);
			Employee e4=new Employee("Vineet",50);
			e1.display();
			e4.display();
			e3.display();
			e2.display();
			ob.writeObject(e1);
			ob.writeObject(e3);
			ob.writeObject(e2);
			ob.writeObject(e4);
			ob.flush();
			ob.close();
			fr.close();
		}
		catch(IOException e)
			{
			System.out.println("Exception found");
			}
}
}