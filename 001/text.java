package 第一次上机;

public class text {

	public static void main(String[] args) 
	{
		int x=23659;
		String m ="result=";
		while(x>0)
		{
			m = m + x%10;
			x = x/10;
		}
		System.out.println(m);
		
	}

}
