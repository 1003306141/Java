package 第十次上机;

import java.util.*;
public class Map中英单词映射 {
	public static void main(String[] args) 
	{
		Map<String,String> m = new HashMap<String,String>();
		Scanner s = new Scanner(System.in);
		///手动添加映射关系
		System.out.println("请输入中英文对应关系：");
		String str1 = s.nextLine();
		String str2 = s.nextLine();
		m.put(str1, str2);
		m.put(str2, str1);
		///中英文映射
		System.out.println("中英互译：");
		m.put("苹果", "Apple");
		m.put("Apple", "苹果");
		m.put("你好", "Hello");
		m.put("Hello", "你好");
		m.put("健康", "Health");
		m.put("Health", "健康");
		System.out.println(m.get(s.nextLine()));
		s.close();
	}
}
