package 第一次上机;
import javax.swing.*;


public class hello {
	public static void main(String[] args)
	{
		String s = JOptionPane.showInputDialog("请输入矩形的长：");
		int h = Integer.parseInt(s);
		
		s = JOptionPane.showInputDialog("请输入矩形的宽：");
		int w = Integer.parseInt(s);

		JOptionPane.showMessageDialog(null, "矩形的周长为："+2*(h+w)+" 矩形的面积为："+h*w);
	}
}
