package 第四次上机;
class ThreeJ
{
	ThreeJ(double x,double y,double z)
	{
		this.x=x;
		this.y=y;
		this.z=z;
	}
	double x;
	double y;
	double z;
	double area()
	{
		double s=(x+y+z)/2;
		return Math.sqrt(s*(s-x)*(s-y)*(s-z));
	}
	double perimeter()
	{
		return x+y+z;
	}
}



public class 三角形类 {
	public static void main(String[] args) 
	{
		ThreeJ a = new ThreeJ(3,4,5);
		ThreeJ b = new ThreeJ(7,8,9);
		System.out.println("第一个三角形面积为："+a.area());
		System.out.println("第一个三角形周长为："+a.perimeter());
		System.out.println("第二个三角形面积为："+b.area());
		System.out.println("第二个三角形周长为："+b.perimeter());
	}
}
