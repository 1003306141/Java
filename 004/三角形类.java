package ���Ĵ��ϻ�;
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



public class �������� {
	public static void main(String[] args) 
	{
		ThreeJ a = new ThreeJ(3,4,5);
		ThreeJ b = new ThreeJ(7,8,9);
		System.out.println("��һ�����������Ϊ��"+a.area());
		System.out.println("��һ���������ܳ�Ϊ��"+a.perimeter());
		System.out.println("�ڶ������������Ϊ��"+b.area());
		System.out.println("�ڶ����������ܳ�Ϊ��"+b.perimeter());
	}
}
