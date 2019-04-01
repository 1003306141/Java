package 第二次上机;

public class biao99 {

	public static void main(String[] args) 
	{
		for(int i=1;i<=9;i++)
		{
			for(int j=1;j<=9;j++)
			{
				if(j>i)
				{
					break;
				}
				else System.out.print(j+"*"+i+"="+i*j+"\t");
			}
			System.out.print("\n");
		}
	}

}
