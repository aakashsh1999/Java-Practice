//Program to illustrate the classes methods and instances in the Enumeration

enum Mangoes{
				
	alphanso(20), langra(9), dussheri(15);

	private int price; //Declaration of the price of the Mangoes

		Mangoes(int p)		//Constructor of the Mangoes
		{
				price=p;
		}
			int getPrice()
					{
					return price;
					}

}
class EnumDemo3
		{
			public static void main(String args[])
					{
						Mangoes m;

					//Displaying the price of the Alphanso Mango
					System.out.println("The Alphanso price is :" +Mangoes.alphanso.getPrice()+" Rupees");		

				//Displaying the Price of the Other Variety of Mangoes
					for(Mangoes a: Mangoes.values())
								{
										System.out.println("The Price of " +a+ " is " +a.getPrice()+ " Rupees");
								}

					}
		}