//Program to illustrate the Hostname and HostAddress of the local Host
import java.net.*;
class Local
{
	public static void main(String args[])
		{	
			try{
			InetAddress address=InetAddress.getLocalHost();
			System.out.println("The Host name is " +address.getHostName());
			System.out.println("The Address is "+address.getHostAddress());
		}
		catch(Exception e)
				{
					System.out.println("Error");
				}
		}
}