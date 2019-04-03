package 第四次上机;

class Date
{
	int year;
	int month;
	int day;
	Date(int a,int b,int c)
	{
		year = a;
		day = c;
		if( b>0 && b<13 )
			month = b;
		else month = -1;
		
		///判断2月的天数
		if(month == 2)
		{
			if((year%4==0&&year%100!=0)||(year%400==0))
			{
				if(day>29)
					day = -1;
			}
			else
			{
				if(day>28)
					day = -1;
			}
		}
		///判断其他月
		if(month == 1 || month ==3 || month ==5 || month ==7 || month ==8 || month ==10 || month ==12)
			if(day>31)
				day = -2;
		if(month == 4 || month ==6 || month ==9 || month ==11)
			if(day>30)
				day = -2;
		
			
	}
	Date()
	{
		year = 2000;
		month = 1;
		day = 1;
	}
	void print()
	{
		System.out.println(year+"/"+month+"/"+day);
	}
}

public class 日期类 {

	public static void main(String[] args) 
	{
		Date d = new Date(2015,0,28);
		d.print();
	}
}
