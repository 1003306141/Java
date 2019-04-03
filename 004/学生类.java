package 第四次上机;
class Student
{
	String name;
	int id;
	int age;
	Student()
	{
		this("0",0,0);
	}
	Student(String na,int a,int b)
	{
		name = na;
		id = a;
		age = b;
	}
	void addone()
	{
		age++;
	}
	void print()
	{
		System.out.println("name:"+name);
		System.out.println("id:"+id);
		System.out.println("age:"+age);
		System.out.println("----------------");
	}
}

public class 学生类 {

	public static void main(String[] args) 
	{
		Student s[] =   {
							new Student("A",1000,20),
							new Student("B",1001,19),
							new Student("C",1002,18),
							new Student("D",1003,25),
							new Student("E",1004,31),
						};
		///年龄全部加一
		for(int i=0;i<s.length;i++)
			s[i].addone();
		///按数组顺序打印
		System.out.println("按数组顺序打印结果为：");
		for(int i=0;i<s.length;i++)
			s[i].print();
		///打印年龄大于20岁名单
		System.out.println("年龄大于20岁名单为为：");
		for(int i=0;i<s.length;i++)
		{
			if(s[i].age > 20)
				s[i].print();
		}
	}

}
