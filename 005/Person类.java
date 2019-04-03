package 第五次上机;

public class Person类 {
	public static void main(String[] args) 
	{
		Teacher t = new Teacher("Mrtan","man",20,"student","school");	
		System.out.println(t);
		Student s= new Student("谭帅帅","男",20,"2016/9/30","网络工程");
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
		name = "无";
		sex = "无";
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
		return "姓名："+name+" 性别："+sex+" 年龄："+age;
	}
}

class Teacher extends Person
{
	String workName;
	String workFrom;
	Teacher()
	{
		super("无","无",0);
		workName = "无";
		workFrom = "无";
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
		return super.toString()+" 职位："+workName+" 部门："+workFrom;
	}
}

class Student extends Person
{
	int id;
	String time;
	String subject;
	Student()
	{
		super("无","无",0);
		time = "无";
		subject = "无";
	}
	Student(String na,String s,int a,String t,String j)
	{
		super(na,s,a);
		time = t;
		subject = j;
	}
	public String toString()
	{
		return "姓名："+name+" 性别："+sex+" 年龄："+age+" 入学时间："+time+" 专业："+subject;
	}
}