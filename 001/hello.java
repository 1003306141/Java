package ��һ���ϻ�;
import javax.swing.*;


public class hello {
	public static void main(String[] args)
	{
		String s = JOptionPane.showInputDialog("��������εĳ���");
		int h = Integer.parseInt(s);
		
		s = JOptionPane.showInputDialog("��������εĿ�");
		int w = Integer.parseInt(s);

		JOptionPane.showMessageDialog(null, "���ε��ܳ�Ϊ��"+2*(h+w)+" ���ε����Ϊ��"+h*w);
	}
}
