package ��ʮ���ϻ�;

import java.util.*;
import java.io.*;
/*��������
3160931053 ̷˧˧ 100 80 100
3160931052 Ԭ���� 90 90 100
3160931054 ����һ 99 89 98
 */
class Student
{
	public String id;
	public String name;
	public String math;
	public String English;
	public String Java;
	Student(String a,String b,String c,String d,String e)
	{
		id = a;
		name = b;
		math = c;
		English = d;
		Java = e;
	}
	Student()
	{}
}
public class ѧ���ɼ�������� {
	static Student s[] = new Student[3];
	public static void main(String[] args) 
	{
		Write();
		Read();
		Print();
		PrintAll();
	}
	///�������벢д�ļ�
	public static void Write()
	{
		Scanner S = new Scanner(System.in);
		try
		{
			OutputStream fw = new FileOutputStream("C:\\Users\\10033\\Desktop\\student.txt");
			OutputStreamWriter out = new OutputStreamWriter(fw,"UTF-8");
			for(int i=0;i<s.length;i++)
			{
				out.write(S.nextLine());
				out.write("\r\n");	
			}
			out.close();
		}catch(Exception e) {}		
		S.close();
	}
	///���ļ��ж�ȡ����
	public static void Read()
	{
		try
		{
			InputStreamReader reader = new InputStreamReader(new FileInputStream("C:\\Users\\10033\\Desktop\\student.txt"),"UTF-8");
			BufferedReader br = new BufferedReader(reader);
			for(int i=0;i<s.length;i++)
				s[i] = transformToStudent(br.readLine());
			br.close();
		}catch(Exception e) {}
	}
	///��ʽ��
    public static Student transformToStudent(String str) {  
        Student stu;  
        String[] Str1 = str.split(" ");  
        if (Str1.length != 5) 
        {  
            System.out.println("��Ϣ����");  
            return null;  
        } 
        else 
        {  
            stu = new Student(Str1[0], Str1[1], Str1[2],Str1[3],Str1[4]);  
            return stu;  
        }  
    }  
    ///��ӡÿ��ѧ�������пγ�ƽ���ɼ�
    public static void Print()
    {
    	System.out.println("-----------------------------");
    	for(int i=0;i<s.length;i++)
    	{
    		float average = (Float.parseFloat(s[i].math)+Float.parseFloat(s[i].English)+Float.parseFloat(s[i].Java))/3;
    		System.out.print(s[i].name+"���п�ƽ���ɼ�Ϊ��"+average+"\n");
    	}
    	System.out.println("-----------------------------");
    }
    public static void PrintAll()
    {
    	float total = 0;
    	for(int i=0;i<s.length;i++)
    		total = total + Float.parseFloat(s[i].math);
    	float average = total/s.length;
    	System.out.println("ȫ��ѧ������ѧƽ����Ϊ��"+average+"\n");
    }
}
