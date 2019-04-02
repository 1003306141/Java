import javax.swing.JOptionPane;

public class jianxu {

	public static void main(String[] args) 
	{
		int arr[] = new int[10];
		String s1 =JOptionPane.showInputDialog("请输入需要判断的数:");
		for(int i=0;i<s1.length();i++)
			arr[i] = Integer.parseInt(String.valueOf(s1.charAt(i)));		
		
		for(int i=0;i<arr.length-1;i++)
		{
			if(arr[i]<arr[i+1])
			{
				System.out.println("false");
				break;
			}
			if(i==arr.length-2)
				System.out.println("true");
		}
	}
}
