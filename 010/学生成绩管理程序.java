package 第十次上机;

import java.util.*;
import java.io.*;
/*测试数据
3160931053 谭帅帅 100 80 100
3160931052 袁绪东 90 90 100
3160931054 阎择一 99 89 98
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
public class 学生成绩管理程序 {
	static Student s[] = new Student[3];
	public static void main(String[] args) 
	{
		Write();
		Read();
		Print();
		PrintAll();
	}
	///键盘输入并写文件
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
	///从文件中读取数据
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
	///格式化
    public static Student transformToStudent(String str) {  
        Student stu;  
        String[] Str1 = str.split(" ");  
        if (Str1.length != 5) 
        {  
            System.out.println("信息有误");  
            return null;  
        } 
        else 
        {  
            stu = new Student(Str1[0], Str1[1], Str1[2],Str1[3],Str1[4]);  
            return stu;  
        }  
    }  
    ///打印每名学生的所有课程平均成绩
    public static void Print()
    {
    	System.out.println("-----------------------------");
    	for(int i=0;i<s.length;i++)
    	{
    		float average = (Float.parseFloat(s[i].math)+Float.parseFloat(s[i].English)+Float.parseFloat(s[i].Java))/3;
    		System.out.print(s[i].name+"所有课平均成绩为："+average+"\n");
    	}
    	System.out.println("-----------------------------");
    }
    public static void PrintAll()
    {
    	float total = 0;
    	for(int i=0;i<s.length;i++)
    		total = total + Float.parseFloat(s[i].math);
    	float average = total/s.length;
    	System.out.println("全部学生的数学平均分为："+average+"\n");
    }
}
