package ��һ���ϻ�;
import javax.swing.*;


public class shu {
	public static void main(String[] args)
	{
		String s = JOptionPane.showInputDialog("������һ��ʵ����");
		double d = Double.valueOf(s);
		int a = (int)d;
		
		System.out.println("ֱ�����Ϊ��"+(d-a));
		System.out.printf("��ȷ��С�����4λΪ��%.4f",(d-a));
	}
}
