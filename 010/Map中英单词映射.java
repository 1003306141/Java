package ��ʮ���ϻ�;

import java.util.*;
public class Map��Ӣ����ӳ�� {
	public static void main(String[] args) 
	{
		Map<String,String> m = new HashMap<String,String>();
		Scanner s = new Scanner(System.in);
		///�ֶ����ӳ���ϵ
		System.out.println("��������Ӣ�Ķ�Ӧ��ϵ��");
		String str1 = s.nextLine();
		String str2 = s.nextLine();
		m.put(str1, str2);
		m.put(str2, str1);
		///��Ӣ��ӳ��
		System.out.println("��Ӣ���룺");
		m.put("ƻ��", "Apple");
		m.put("Apple", "ƻ��");
		m.put("���", "Hello");
		m.put("Hello", "���");
		m.put("����", "Health");
		m.put("Health", "����");
		System.out.println(m.get(s.nextLine()));
		s.close();
	}
}
