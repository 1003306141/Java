package 第十一次上机;
import java.io.*;
import java.net.*;
import java.util.*;
class User
{
	String id;
	String passwd;
	User(String id,String passwd)
	{
		this.id = id;
		this.passwd = passwd;
	}
	User(){}
}
public class mul extends Thread
{
	MulticastSocket mSocket;
	InetAddress inetAddress;
	String name;
	static User[] u = new User[4];
	public mul(String name)
	{
		try
		{
			this.name = name;
			mSocket = new MulticastSocket(7777);
			inetAddress = InetAddress.getByName("230.0.0.1");
			mSocket.joinGroup(inetAddress);
		}catch(IOException e){}
	}
	public void send()
	{
		while(true)
		{
			try
			{
				Scanner s = new Scanner(System.in);
				String str = name+": "+s.nextLine();
				byte[] data = str.getBytes();
				DatagramPacket packet = new DatagramPacket(data,data.length,inetAddress,7777);
				mSocket.send(packet);
			}catch(IOException e){}
		}
	}
	public static String Register()
	{
		try
		{
			Scanner s = new Scanner(System.in);
			InputStream fi = new FileInputStream("C:\\Users\\10033\\Desktop\\user.dat");
			BufferedReader in = new BufferedReader(new InputStreamReader(fi,"UTF-8"));
			for(int i=0;i<u.length;i++)
			{
				String str = in.readLine();
				String str1[] = str.split(" ");
				u[i] = new User(str1[0],str1[1]);
			}
			System.out.println("please input username and passwd!");
			String str = s.nextLine();
			String str1[] = str.split(" ");
			User stu = new User(str1[0],str1[1]);
			in.close();

			for(int i=0;i<u.length;i++)
				if(u[i].id.equals(stu.id) && u[i].passwd.equals(stu.passwd))
				{
					System.out.println("Successful!");
					return u[i].id;
				}
			System.out.println("username or passwd is Error!");
			System.exit(0);
		}catch(IOException e){}
		return null;
	}
	public static void main(String[] args)
	{
		mul s = new mul(Register());
		s.start();
		s.send();
	}
	public void run()
	{
		try
		{
			byte[] data = new byte[200];
			DatagramPacket packet = new DatagramPacket(data,data.length);
			while(true)
			{
				mSocket.receive(packet);
				System.out.println(new String(data,0,packet.getLength()));
			}
		}catch(IOException e){}
	}
}

