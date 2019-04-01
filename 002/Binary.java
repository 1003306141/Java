package 第二次上机;

import javax.swing.JOptionPane;

public class Binary 
{
	public static void main(String[] args) 
	{
		int a;
		String s1 =JOptionPane.showInputDialog("请输入这个整数:");
		a = Integer.valueOf(s1);
		System.out.println(Integer.toBinaryString(a));
	}
}
