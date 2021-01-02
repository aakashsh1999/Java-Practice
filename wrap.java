//Program to illustrate the boxing and unboxing of object data

class Wrap
{
	public static void main(String args[])
			{
				Integer x=new Integer(120);//Value of wrap object

				//Assigning the value of objecet to the primitive data type

				int i=x.intValue();

				System.out.println(i+ " "+x);

			}
}