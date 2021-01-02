//Program to illustrate the enumeration

enum Sharma{
	aakash, amit, abhishek, aakansha
}

class enumdemo
{
	public static void main(String args[])
	{
		Sharma sh;
		sh=Sharma.aakash;
		System.out.println("the name is " +sh);

	System.out.println("The List of the array");
			for(Sharma a: Sharma.values())
					{
							System.out.println("The value is" +a);
					}

//Illustrate the value of method of the enumeration class

			Sharma x;
		x=Sharma.valueOf("aakash");

			System.out.println(sh);		

}
}