package ���Ĵ��ϻ�;
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

public class ѧ���� {

	public static void main(String[] args) 
	{
		Student s[] =   {
							new Student("A",1000,20),
							new Student("B",1001,19),
							new Student("C",1002,18),
							new Student("D",1003,25),
							new Student("E",1004,31),
						};
		///����ȫ����һ
		for(int i=0;i<s.length;i++)
			s[i].addone();
		///������˳���ӡ
		System.out.println("������˳���ӡ���Ϊ��");
		for(int i=0;i<s.length;i++)
			s[i].print();
		///��ӡ�������20������
		System.out.println("�������20������ΪΪ��");
		for(int i=0;i<s.length;i++)
		{
			if(s[i].age > 20)
				s[i].print();
		}
	}

}
