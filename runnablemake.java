//Creating a new Thread Using Runnable Interface

class MyThread implements Runnable
{
		Thread t;		//Object of the runnable thread

			MyThread()
				{
				 t=new Thread(this,"Thread Demo");
				 System.out.println("Child Thread" +t);
				 t.start();
				}
				public void run()
				{
					try{
					for(int i=0;i<=5;i--)
					{
						System.out.println("Child Thread" +i);
							Thread.sleep(500);
							}
							}
							catch(InterruptedException e)
								{
								System.out.println("Child Thread is Interrupted");
								}
								System.out.println("Exiting the Child Thread");
					}
	}

class MainThread
	{
	public static void main(String args[])
		{
			new MyThread();	//Calling the Constructor of My thread
		
			{ try{
					for(int i=0;i<=5;i++)
						{
						System.out.println("The Main Thread" +i);
						Thread.sleep(1000);
						}
					}
					catch(InterruptedException e)
						{
						System.out.println("Main Thread Interrupted");
						}
					System.out.println("Main Thread Exititng");

			}


			}
	}