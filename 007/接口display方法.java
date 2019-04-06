package 第七次上机;

///定义一个接口
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
		System.out.println("Car oil volume："+n);
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



public class 接口display方法 {

	public static void main(String[] args) 
	{
		Call c = new Call();
		Car a = new Car();
		Advertisement ad = new Advertisement();
		System.out.println("通知类引用接口:");
		c.display();
		System.out.println("汽车类引用接口:");
		a.display();
		System.out.println("广告类引用接口:");
		ad.display();

	}

}
