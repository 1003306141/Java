package ���ߴ��ϻ�;

///����һ���ӿ�
interface A
{
	void display();
}

class Call implements A
{
	String s = "this is the news";
	public void display()
	{
		System.out.println(s);
	}
}

class Car implements A
{
	int n = 10;
	public void display()
	{
		System.out.println("Car oil volume��"+n);
	}
}

class Advertisement implements A
{
	String news = "this is a Advertisement";
	public void display()
	{
		System.out.println(news);
	}
}



public class �ӿ�display���� {

	public static void main(String[] args) 
	{
		Call c = new Call();
		Car a = new Car();
		Advertisement ad = new Advertisement();
		System.out.println("֪ͨ�����ýӿ�:");
		c.display();
		System.out.println("���������ýӿ�:");
		a.display();
		System.out.println("��������ýӿ�:");
		ad.display();

	}

}
