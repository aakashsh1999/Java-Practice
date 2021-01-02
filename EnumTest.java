//program to illustrate the use of enumerator
enum Apple{
	mango(50), banana(20), grapes(56), fruits(75);
	int price;
	Apple(int p)
		{
		price=p;
		}
		int getprice()
		{
		return price;
		}
}
class EnumTest{
	public static void main(String args[])
		{
			Apple ap;

		System.out.println("The Mango price is" +Apple.mango.getprice()+"Rupees");
		
		System.out.println("The List of the fruits is");
		for(Apple a : Apple.values())
			{
			System.out.println("The Cost of" +a+ "is" +a.getprice());
						}


		}
}