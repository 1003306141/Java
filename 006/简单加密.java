package �������ϻ�;

import java.util.*;
public class �򵥼��� {

	public static void main(String[] args) 
	{
		
		Scanner S = new Scanner(System.in);
		String str = S.nextLine();
		S.close();
		char[] cs = str.toCharArray();
		for(int i=0;i<cs.length;i++)
		{
			///��д��ĸ���
			int temp = (int)cs[i];
			if(temp >= (int)'A' && temp <= (int)'Z')
			{
				temp = temp + 4;
				if(temp>(int)'Z')
					temp = temp - 26;
				cs[i]=(char)temp;
			}
			///Сд��ĸ���
			if(temp >= (int)'a' && temp <= (int)'z')
			{
				temp = temp + 4;
				if(temp>(int)'z')
					temp = temp - 26;
				cs[i]=(char)temp;
			}
			///ֻ����ĸ���м���
		}
		System.out.println(cs);
		System.out.println("asdasdas"+cs.toString());
	}
}
