package �������ϻ�;

public class ������ {

	public static void main(String[] args) 
	{
		int count=0;
		for(int i=0;i<args[0].length();i++)
		{
			if(args[0].charAt(i) == 'a')
				count++;	
		}
		System.out.println("���ַ�������ĸa���ִ�����"+count);
	}

}
