package �������ϻ�;

import java.util.*;

public class ����ͳ�� 
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
			///ͳ����ĸ����
			for(int j=0;j<temp.length;j++)
			{
				if((temp[j]<='Z' && temp[j]>='A') || (temp[j]<='z' && temp[j]>='a'))
					count++;
			}
			///�����ִ�
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
			
			//the��Ϊa
			str[i] = str[i].replaceAll("the", "a");
		}	
		System.out.println("��ĸ����Ϊ��"+count);
		System.out.println("ȡthe����Ϊ��");
		for(int i=0;i<n;i++)
			System.out.println(str[i]);
	}

}
