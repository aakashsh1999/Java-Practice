//Progam to increment the digit by on
class digit
{
	public static void main(String args[])	
		{
			int a=5264, digit,i=1, counter=0;
			while(a>0)
				{
					
				digit=a%10;
				counter=counter*10+digit;
				a=a/10;
				}

				System.out.println("The digit after incrementing by 1: "+counter);

		}
	}
