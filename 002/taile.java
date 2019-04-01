package 第二次上机;

import javax.swing.JOptionPane;

public class taile {

	public static void main(String[] args) 
	{
		/*
		double n;
		double x;
		String s1 =JOptionPane.showInputDialog("请输入项数N:");
		String s2 =JOptionPane.showInputDialog("请输入X:");
		n = Double.valueOf(s1);
		x = Double.valueOf(s2);
		*/
		double x=0.2;
		for(int i=0;i<5;i++)
		{
			int a=1;
			int b=1;
			int c=1;
			double sum=1;
			for(int j=0;j<10;j++)
			{
				sum=sum+Math.pow(x, a)/c;
				a++;
				b++;
				c=c*b;
			}
			if(x<0.7&&x>0.5)
				System.out.printf("e^"+"0.6"+"="+"%.5f\n", sum);
			else System.out.printf("e^"+x+"="+"%.5f\n", sum);
			x=x+0.2;
		}
	}
	
/*
	public static double add(double n,double x)
	{
		int a=1;
		int b=1;
		int c=1;
		double sum=1;
		for(int i=0;i<n;i++)
		{
			sum=sum+Math.pow(x, a)/c;
			a++;
			b++;
			c=c*b;
		}
		return sum;
	}
	*/

}
