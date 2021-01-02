//Program to illustrate the maths method

class math{
	public static void main(String arsg[])
	{
		Integer i=5;	// Object of int 
		int j=i.intValue();		//Conversion the object in the Primitive
		System.out.println("The value is in Primitive Data type "+j);

		System.out.println(i.compareTo(11));	//used to compare the number object
		Integer b=15;
		System.out.println(i.equals(b));	//determine the number object is equal or not
		System.out.println(i.equals(j));		//Determining the number object with the primitive data type

	//Use of value of method i.e. used to convert primitive to number object

		Integer a=Integer.valueOf(50);
		Integer c=Integer.valueOf("12",5);	//String with the radix
		System.out.println("A= "+a+" B="+b);
	//Use of to String
		System.out.println(a.toString());
		System.out.println(Integer.toString(50));	
		//Use of parseInt 
		//it is use to get primitive data type from the String 
	int d;
	d=Integer.parseInt("5641");
	System.out.println("the number is "+d);
	int e= -2550;
	System.out.println(Math.abs(e));

	System.out.println(Math.min(20,30));
	System.out.println(Math.exp(-125.785));

	System.out.println("The value of the 2^10 is"+Math.pow(2,10));

	//Use of random number

			}

}