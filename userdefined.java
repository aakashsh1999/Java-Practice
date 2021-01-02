//Program to create the User defined exception
class UDEX
{
	public static void main(String args[]) 
		{
			try
			{
				throw new MyException(5);

			}
			catch(Exception e)
			{
				System.out.println("Exception is caught");
			}
		}
}
class MyException extends Exception
{
		int a;
		MyException(int b)
			{
				a=b;
					}		
}