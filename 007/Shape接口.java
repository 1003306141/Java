package ���ߴ��ϻ�;

///����һ���ӿ�
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


public class Shape�ӿ� {

	public static void main(String[] args) 
	{
		///����ӿ�����
		Shape s[] = {new rectangle(2,3),new circular(2),new Cylinder(2,3)};
		///ѭ����ӡ���
		for(int i=0;i<3;i++)
			System.out.println("��С�ֱ�Ϊ��"+s[i].size());
	}

}
