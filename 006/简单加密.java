package 第六次上机;

import java.util.*;
public class 简单加密 {

	public static void main(String[] args) 
	{
		
		Scanner S = new Scanner(System.in);
		String str = S.nextLine();
		S.close();
		char[] cs = str.toCharArray();
		for(int i=0;i<cs.length;i++)
		{
			///大写字母情况
			int temp = (int)cs[i];
			if(temp >= (int)'A' && temp <= (int)'Z')
			{
				temp = temp + 4;
				if(temp>(int)'Z')
					temp = temp - 26;
				cs[i]=(char)temp;
			}
			///小写字母情况
			if(temp >= (int)'a' && temp <= (int)'z')
			{
				temp = temp + 4;
				if(temp>(int)'z')
					temp = temp - 26;
				cs[i]=(char)temp;
			}
			///只对字母进行加密
		}
		System.out.println(cs);
		System.out.println("asdasdas"+cs.toString());
	}
}
