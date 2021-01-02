//Program to insert the element in the array

import java.util.*;

class InsertArray{
			
			public static void main(String args[])
					{
						int arr[]=new int[50];
						int n, x, pos;
						Scanner sc=new Scanner(System.in);

					System.out.println("Enter the No. of Elements");
					n=sc.nextInt();
					System.out.println("Enter the Elements");
					for(int i=0;i<n;i++)
							{
							arr[i]=sc.nextInt();
							}
					System.out.println("Details Recieved!");
					System.out.println("The Given Elements are");
					for(int i=0;i<n;i++)
							{
							System.out.print(arr[i]+", ");
							}
					System.out.println("Enter the Element you want to insert");
					x=sc.nextInt();
					System.out.println("Enter the position you want to insert");;
					pos=sc.nextInt();	

						for(int i=n;i>=pos;i--)
									{
										arr[i]=arr[i-1];//Shifting the elements

										arr[pos-1]=x;
									}
				System.out.println("The elements after insertion");									
				for(int i=0;i<n;i++)
							{
							System.out.print(arr[i]+", ");
							}
	



					}

}