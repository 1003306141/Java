package 第三次上机;

public class 阶乘求解 {

	public static void main(String[] args) 
	{
		long sum = A(2)+A(5)+A(9)+A(3);
		System.out.println("计算结果为："+sum);
		
	}
	public static int A(int n)
	{
		if(n==1)
			return 1;
		else return n*A(n-1);
	}

}
