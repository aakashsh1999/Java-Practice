//Program to find the Largest in array
class Max
{
	public static void main(String args[])
		{try{
			int[] arr={50,30,20,40,11,0,65,75,99,80};
			int max=0;
				Array.sort(arr);
			System.out.println("The elements in the array is");
			for(int i=0;i<arr.length;i++)
				{
					System.out.println(arr[i]);
				}
			for(int i=0;i<arr.length;i++)
					{
						if(max<arr[i])
							{
								max=arr[i-2];
								}							
					}

			System.out.println("The Maximum value is" +max);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Array out of index Bound Error");
		}
				}
}