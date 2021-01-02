//program to illustrat the use of multithreading
class A extends Thread{
	public void run(){
		System.out.println("Thread A Started");
		for(int i=0;i<10;i++)
			{
					System.out.println ("From Thread A is" +i);
			}

	}
}
class ThreadTest
{
	public static void main(String arg[])	{

	A a=new A();
a.start();

	}
}