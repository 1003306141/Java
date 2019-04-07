package 第八次上机;

///兔子类
class Rabbit extends Thread
{
	int pauseTime = 500;
	public void run()
	{
		try 
		{	for(int i=1;i<=100;i++)
			{
				if(i!=100)
				{
					///兔子休息时间
					if(i==20||i==40||i==60||i==80)
					{
						System.out.println("Now the Rabbit is Sleeping...............");
						Thread.sleep(5000);
					}
					System.out.println("Now the Rabbit is at "+i);
					Thread.sleep(pauseTime);
				}
				else
				{
					System.out.println("兔子到达终点！");
				}
			}

		}catch(InterruptedException e)
		{}
	}
}

///乌龟类
class Tortoise extends Thread
{
	int pauseTime = 690;
	public void run()
	{
		try 
		{	for(int i=1;i<=100;i++)
			{
				if(i!=100)
				{
					System.out.println("Now the Tortoise is at "+i);
					Thread.sleep(pauseTime);
				}
				else
				{
					System.out.println("乌龟到达终点");
				}
			}
		}catch(InterruptedException e)
		{}
	}
}




public class 龟兔赛跑 {

	public static void main(String[] args) 
	{
		System.out.println("#########比赛开始#########");
		///兔子线程
		Rabbit r = new Rabbit();
		r.start();
		///乌龟线程
		Tortoise t = new Tortoise();
		t.start();
		///等待两个线程执行完毕
		
        try 
        {  
    		r.join();
    		t.join();
        } 
        catch (InterruptedException e) 
        {  
            e.printStackTrace();  
        }
        
        
        System.out.println("#########比赛结束#########");
	}

}
