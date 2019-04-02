import javax.swing.*;

public class yunshu {

	public static void main(String[] args) 
	{
		double prince,weight,s;
		double discount=0;
		double freight;
		
		String s1 =JOptionPane.showInputDialog("请输入基本运费prince:");
		prince = Double.valueOf(s1);
		
		String s2 =JOptionPane.showInputDialog("请输入货物重量weight:");
		weight = Double.valueOf(s2);
		
		String s3 =JOptionPane.showInputDialog("请输入距离s:");
		s = Double.valueOf(s3);
		
		if(s<250)
			discount = 0;
		else if(s>=250 && s<500)
			discount = 0.02;
		else if(s>=500 && s<1000)
			discount = 0.05;
		else if(s>=1000 && s<2000)
			discount = 0.08;
		else if(s>=2000 && s<3000)
			discount = 0.10;
		else if(s>=3000)
			discount = 0.15;
		
		freight = prince*weight*s*(1-discount);
		
		System.out.println("运费价格为："+freight);
		
	}

}
