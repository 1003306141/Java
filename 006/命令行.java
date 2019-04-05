package 第六次上机;

public class 命令行 {

	public static void main(String[] args) 
	{
		int count=0;
		for(int i=0;i<args[0].length();i++)
		{
			if(args[0].charAt(i) == 'a')
				count++;	
		}
		System.out.println("该字符串中字母a出现次数："+count);
	}

}
