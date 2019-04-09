package 第十次上机;

import java.util.*;


class Student1
{
	String id;
	String name;
	String age;
	String sex;
	Student1(){}
	Student1(String a,String b,String c,String d)
	{
		id = a;
		name = b;
		age = c;
		sex = d;
	}
	public String toString()
	{
		return "学号："+id+" 姓名："+name+" 年龄："+age+" 性别："+sex;
	}
}
public class LinkedList存储学生信息 {

	public static void main(String[] args) 
	{
		///创建LinkedList对象
		LinkedList<Student1> s = new LinkedList<Student1>();
		///增加学生
		s.add(new Student1("3160931053","谭帅帅","20","男"));
		s.add(new Student1("3160931052","袁绪东","18","男"));
		///列出所有学生
		System.out.println(s);	
		///删除学生
		for(int i=0;i<s.size();i++)
			if(s.get(i).id.equals("3160931053"))
			{
				s.remove(i);
				break;
			}
		///列出所有学生
		System.out.println(s);	
	}

}
