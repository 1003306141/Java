package ��һ���ϻ�;
import javax.swing.*;


public class wenduC {
	public static void main(String[] args)
	{
		String s = JOptionPane.showInputDialog("�����������¶�C��");
		float f = Float.valueOf(s);
		
		JOptionPane.showMessageDialog(null, "�����¶�Ϊ��"+(9.0/5.0)*f+32);
	}
}
