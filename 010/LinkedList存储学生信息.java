package ��ʮ���ϻ�;

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
		return "ѧ�ţ�"+id+" ������"+name+" ���䣺"+age+" �Ա�"+sex;
	}
}
public class LinkedList�洢ѧ����Ϣ {

	public static void main(String[] args) 
	{
		///����LinkedList����
		LinkedList<Student1> s = new LinkedList<Student1>();
		///����ѧ��
		s.add(new Student1("3160931053","̷˧˧","20","��"));
		s.add(new Student1("3160931052","Ԭ����","18","��"));
		///�г�����ѧ��
		System.out.println(s);	
		///ɾ��ѧ��
		for(int i=0;i<s.size();i++)
			if(s.get(i).id.equals("3160931053"))
			{
				s.remove(i);
				break;
			}
		///�г�����ѧ��
		System.out.println(s);	
	}

}
