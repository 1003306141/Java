package �ڰ˴��ϻ�;

///������
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
					///������Ϣʱ��
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
					System.out.println("���ӵ����յ㣡");
				}
			}

		}catch(InterruptedException e)
		{}
	}
}

///�ڹ���
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
					System.out.println("�ڹ굽���յ�");
				}
			}
		}catch(InterruptedException e)
		{}
	}
}




public class �������� {

	public static void main(String[] args) 
	{
		System.out.println("#########������ʼ#########");
		///�����߳�
		Rabbit r = new Rabbit();
		r.start();
		///�ڹ��߳�
		Tortoise t = new Tortoise();
		t.start();
		///�ȴ������߳�ִ�����
		
        try 
        {  
    		r.join();
    		t.join();
        } 
        catch (InterruptedException e) 
        {  
            e.printStackTrace();  
        }
        
        
        System.out.println("#########��������#########");
	}

}
