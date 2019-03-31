package 第一次上机;
import javax.swing.*;


public class wenduC {
	public static void main(String[] args)
	{
		String s = JOptionPane.showInputDialog("请输入摄氏温度C：");
		float f = Float.valueOf(s);
		
		JOptionPane.showMessageDialog(null, "华氏温度为："+(9.0/5.0)*f+32);
	}
}
