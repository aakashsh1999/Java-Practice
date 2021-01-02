//program to get Internet Address
import java.net.*;

public class Internet
{
	public static void main(String args[])
		{
			InetAddress inet= new InetAddress();
			System.out.println("The local Address is"+inet.getLocalHost());
			

		}

}

