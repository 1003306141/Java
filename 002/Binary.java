package �ڶ����ϻ�;

import javax.swing.JOptionPane;

public class Binary 
{
	public static void main(String[] args) 
	{
		int a;
		String s1 =JOptionPane.showInputDialog("�������������:");
		a = Integer.valueOf(s1);
		System.out.println(Integer.toBinaryString(a));
	}
}
