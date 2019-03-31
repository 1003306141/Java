package 第一次上机;
import javax.swing.*;


public class shu {
	public static void main(String[] args)
	{
		String s = JOptionPane.showInputDialog("请输入一个实数：");
		double d = Double.valueOf(s);
		int a = (int)d;
		
		System.out.println("直接输出为："+(d-a));
		System.out.printf("精确到小数点后4位为：%.4f",(d-a));
	}
}
