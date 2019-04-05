package 第六次上机;

import java.util.*;

public class 文字统计 
{

	public static void main(String[] args) 
	{
		Scanner S = new Scanner(System.in);
		int n=0;
		int count=0;
		String str[] = new String[10];
		for(int i=0;;i++)
		{
			str[i] = new String(S.nextLine());
			if(str[i].compareTo("end")==0)
			{
				n=i;
				S.close();
				break;
			}
		}
		for(int i=0;i<n;i++)
		{
			char temp[] = str[i].toCharArray();
			///统计字母个数
			for(int j=0;j<temp.length;j++)
			{
				if((temp[j]<='Z' && temp[j]>='A') || (temp[j]<='z' && temp[j]>='a'))
					count++;
			}
			///找数字串
			char cs[] = new char[20];
			
			for(int k=0;k<temp.length-1;k++)
			{
				if(Character.isDigit(str[i].charAt(k)) == true)
				{
					cs[k] = str[i].charAt(k);
					if(Character.isDigit(str[i].charAt(k+1)) == false)
						break;	
				}
			}
			System.out.println(cs);
			
			//the改为a
			str[i] = str[i].replaceAll("the", "a");
		}	
		System.out.println("字母数量为："+count);
		System.out.println("取the后结果为：");
		for(int i=0;i<n;i++)
			System.out.println(str[i]);
	}

}
