//Program to illustrate the use of thread
class PrintThread{

		public void run()
		{
			for(int i=0;i<10;i++)
			{
			System.out.println("Printing the Document " +i);
			}
	
			}

}
class TestThread extends Thread{
	public static void main(String args[])
		{
			Thread t=new Thread();
			t.start();


		}

}