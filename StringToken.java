//Program to illustrate the use of String Tokenizer
import java.util.*;
class StringToken{
	public static void main(String arg[])
		{
			Scanner ab=new Scanner(System.in);
			System.out.println("Enter the String");
			String st;
			st=ab.nextLine();
			StringTokenizer z=new StringTokenizer(st, ";");
			while(z.hasMoreTokens())
				{
					System.out.println(z.nextToken());
				System.out.println(z.countTokens());
				}

		}
}