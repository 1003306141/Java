package ���ߴ��ϻ�;
///����һ��������
abstract class Fruit
{
	abstract double getWeight();
}
///����һ��ƻ����
class Apple extends Fruit
{
	double weight;
	Apple(double w)
	{
		weight = w;
	}
	public double getWeight()
	{
		return weight;
	}
}
///����һ��������
class Peach extends Fruit
{
	double weight;
	Peach(double w)
	{
		weight = w;
	}
	public double getWeight()
	{
		return weight;
	}
}
///����һ��������
class orange extends Fruit
{
	double weight;
	orange(double w)
	{
		weight = w;
	}
	public double getWeight()
	{
		return weight;
	}
}

public class ������ {

	public static void main(String[] args) 
	{
		Fruit f[] = {new Apple(10),new Peach(20),new orange(30)};
		for(int i=0;i<3;i++)
		{
			///��ȡ���������������
			System.out.print(f[i].getClass().getName());
			System.out.println(" weight:"+f[i].getWeight());
		}

	}

}
