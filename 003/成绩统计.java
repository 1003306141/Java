package �������ϻ�;
import java.util.*;

public class �ɼ�ͳ�� {

	public static void main(String[] args) 
	{
		Scanner S = new Scanner(System.in);
		System.out.println("������ѧ��������");
		int n = S.nextInt();
		int arr[] = new int[n];
		int level[]= new int[5];
		///���벢ͳ�Ƹ��ֶ�����
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
		///ƽ����
		double sum=0;
		for(int i=0;i<n;i++)
			sum+=arr[i];
		double average = sum/n;
		///����߷�
		int max=0;
		for(int i=0;i<n-1;i++)
			if(arr[i]<arr[i+1])
				max = arr[i+1];
			else max = arr[i];
			
		///������
		System.out.println("��߷֣�"+max);
		System.out.println("ƽ���֣�"+average);
			
		System.out.println("����������"+level[4]);
		System.out.println("����������"+level[3]);
		System.out.println("����������"+level[2]);
		System.out.println("����������"+level[1]);
		System.out.println("������������"+level[0]);
			
			
		


		
	}

}
