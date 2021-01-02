//Program to Print the Host Name and Host Address that taken by the user
import java.util.*;
import java.net.*;
public class Host{
	public static void main(String args[])
			{		
				try{
					String host;
					Scanner sc=new Scanner(System.in);
					System.out.println("Enter the Url");
					host=sc.nextLine();
					InetAddress address=netAddress.getByName(host);
					System.out.println("The Host name is" +address.getHostName());
					System.out.println("The Address is" +address.getHostAddress());
			}
			catch(Exception e)
					{
						System.out.println("Error");
					}
		}

}