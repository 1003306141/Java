package �ھŴ��ϻ�;
import java.io.*;
import java.util.Scanner;

public class ��ȡ�ļ� {
	public static void main(String[] args) 
	{
		try
		{
			Scanner S = new Scanner(System.in);
			String pathName = new String(S.nextLine());
			S.close();
			File filename = new File(pathName);
			InputStreamReader reader = new InputStreamReader(new FileInputStream(filename));	
			BufferedReader br = new BufferedReader(reader);
			String line = "";
			line = br.readLine();
			while(line != null)
			{
				System.out.println(line);
				line = br.readLine();
			}
			br.close();
		}catch (Exception e) 
		{  
            e.printStackTrace(); 
        }
		///�ļ�·��
		///C:\\Users\\10033\\Desktop\\data.txt
	}
}
