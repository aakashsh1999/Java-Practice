//Program to illustrate the thread  in Java

class CurrentThreadDemo
{
	public static void main(String args[])
		{
				Thread t=Thread.currentThread();
				System.out.println("The Current Thread is" +t);
					//Setting Name of the thread
					t.setName("MyThread");
					System.out.println("After Change" +t);

					try
					{
					for(int n=5;n>0;n--)
							{
							System.out.println(n);
							Thread.sleep(1000);
							}
						
					}
						catch(InterruptedException e)
							{
							System.out.println("Main Thread is Interrupted");
							}

		}
}