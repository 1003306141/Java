package ������ϻ�;

public class Person�� {
	public static void main(String[] args) 
	{
		Teacher t = new Teacher("Mrtan","man",20,"student","school");	
		System.out.println(t);
		Student s= new Student("̷˧˧","��",20,"2016/9/30","���繤��");
		System.out.println(s);
	}
}
class Person
{
	String name;
	String sex;
	int age;
	Person()
	{
		name = "��";
		sex = "��";
		age = 0;
	}
	Person(String na,String s,int a)
	{
		name = na;
		sex = s;
		age = a;
	}
	public String toString()
	{
		return "������"+name+" �Ա�"+sex+" ���䣺"+age;
	}
}

class Teacher extends Person
{
	String workName;
	String workFrom;
	Teacher()
	{
		super("��","��",0);
		workName = "��";
		workFrom = "��";
	}
	Teacher(String na,String s,int a,String Name,String From)
	{
		super(na,s,a);
		workName = Name;
		workFrom = From;
	}
	public String toString()
	{
		///return super.toString();
		return super.toString()+" ְλ��"+workName+" ���ţ�"+workFrom;
	}
}

class Student extends Person
{
	int id;
	String time;
	String subject;
	Student()
	{
		super("��","��",0);
		time = "��";
		subject = "��";
	}
	Student(String na,String s,int a,String t,String j)
	{
		super(na,s,a);
		time = t;
		subject = j;
	}
	public String toString()
	{
		return "������"+name+" �Ա�"+sex+" ���䣺"+age+" ��ѧʱ�䣺"+time+" רҵ��"+subject;
	}
}