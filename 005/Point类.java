package 第五次上机;

public class Point类 {

	public static void main(String[] args) 
	{
		Point p = new Point(2,3);
		///测试第一个方法
		Point p1 = new Point(2,8);
		System.out.println(p.distance(p1));
		///测试第二个方法
		System.out.println(p.distance(2,8));
		///测试第三个方法
		System.out.println(Point.distance(p, p1));
	}

}

class Point
{
	double x;
	double y;
	Point()
	{
		x=0;
		y=0;
	}
	Point(double x,double y)
	{
		this.x=x;
		this.y=y;
	}
	public double distance(Point p)
	{
		return Math.sqrt(Math.pow((x-p.x),2)+Math.pow((y-p.y),2));
		
	}
	public double distance(double x,double y)
	{
		return Math.sqrt(Math.pow((this.x-x),2)+Math.pow((this.y-y),2));
	}
	public static double distance(Point x,Point y)
	{
		return Math.sqrt(Math.pow((x.x-y.x),2)+Math.pow((x.y-y.y),2));
	}

}