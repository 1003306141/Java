package 第二次上机;
import javax.swing.*;

/*
 *测试数据
 * x2+2x+1
 * x2+10x+21
 * x2+x+1
 */

public class jisuan 
{
	public static void main(String[] args)
	{
		double a,b,c;
		double theta;
		double x1,x2;
		String s1 =JOptionPane.showInputDialog("请输入第一个数a:");
		a = Double.valueOf(s1);
		String s2 =JOptionPane.showInputDialog("请输入第一个数b:");
		b = Double.valueOf(s2);
		String s3 =JOptionPane.showInputDialog("请输入第一个数c:");
		c = Double.valueOf(s3);
		theta = Math.sqrt(Math.pow(b,2) - 4*a*c);
		if(theta == 0)
		{
			x1 = (-b+theta)/2*a;
			System.out.print("唯一解为：" + x1);	
		}
		else if(theta > 0)
		{
			x1 = (-b+theta)/2*a;
			x2 = (-b-theta)/2*a;
			System.out.print("第一个根为：" + x1 + "\n第二个根为：" + x2);			
		}
		else if(Math.pow(b,2) - 4*a*c < 0)
		{
			System.out.print("该方程无根");		
		}
			
	}

}
