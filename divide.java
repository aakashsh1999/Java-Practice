class divide
{
	public static void main(String args[])
		{
			try
			{
					int i=0;
					int j;
					j=i/0;
				}
			catch(ArithmeticException e)
				{
				System.out.println("Can't divide by zero");
				}

			finally
			{

					System.out.println("All Exceptions are catched");
					}

		}
}