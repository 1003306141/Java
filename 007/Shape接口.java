package 第七次上机;

///定义一个接口
interface Shape
{
	double size();
}

class rectangle implements Shape
{
	double x;
	double y;
	rectangle(double x,double y)
	{
		this.x = x;
		this.y = y;
	}
	public double size()
	{
		return x*y;
	}
}

class circular implements Shape
{
	double r;
	circular(double r)
	{
		this.r = r;
	}
	public double size()
	{
		return Math.PI*r*r;
	}
}

class Cylinder implements Shape
{
	double r;
	double h;
	Cylinder(double r,double h)
	{
		this.r = r;
		this.h = h;
	}
	public double size()
	{
		return Math.PI*r*r*h;
	}
	
}


public class Shape接口 {

	public static void main(String[] args) 
	{
		///定义接口数组
		Shape s[] = {new rectangle(2,3),new circular(2),new Cylinder(2,3)};
		///循环打印输出
		for(int i=0;i<3;i++)
			System.out.println("大小分别为："+s[i].size());
	}

}
