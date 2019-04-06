package 第七次上机;
///定义一个抽象类
abstract class Fruit
{
	abstract double getWeight();
}
///定义一个苹果类
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
///定义一个桃子类
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
///定义一个橘子类
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

public class 抽象类 {

	public static void main(String[] args) 
	{
		Fruit f[] = {new Apple(10),new Peach(20),new orange(30)};
		for(int i=0;i<3;i++)
		{
			///获取对象所属类的名称
			System.out.print(f[i].getClass().getName());
			System.out.println(" weight:"+f[i].getWeight());
		}

	}

}
