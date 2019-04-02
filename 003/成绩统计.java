package 第三次上机;
import java.util.*;

public class 成绩统计 {

	public static void main(String[] args) 
	{
		Scanner S = new Scanner(System.in);
		System.out.println("请输入学生数量：");
		int n = S.nextInt();
		int arr[] = new int[n];
		int level[]= new int[5];
		///读入并统计各分段人数
		for(int i=0;i<n;i++)
		{
			arr[i] = S.nextInt();
			
			if(arr[i] < 60)
				level[0]++;
			else if(arr[i]>=60 && arr[i]<70)
				level[1]++;
			else if(arr[i]>=70 && arr[i]<80)
				level[2]++;
			else if(arr[i]>=80 && arr[i]<90)
				level[3]++;
			else if(arr[i]>=90 && arr[i]<=100)
				level[4]++;
			else 
			{
				arr[i] = 0;
				level[0]++;
			}
		}
		S.close();
		///平均分
		double sum=0;
		for(int i=0;i<n;i++)
			sum+=arr[i];
		double average = sum/n;
		///求最高分
		int max=0;
		for(int i=0;i<n-1;i++)
			if(arr[i]<arr[i+1])
				max = arr[i+1];
			else max = arr[i];
			
		///输出结果
		System.out.println("最高分："+max);
		System.out.println("平均分："+average);
			
		System.out.println("得优人数："+level[4]);
		System.out.println("得良人数："+level[3]);
		System.out.println("得中人数："+level[2]);
		System.out.println("及格人数："+level[1]);
		System.out.println("不及格人数："+level[0]);
			
			
		


		
	}

}
