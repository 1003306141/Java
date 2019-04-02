package 第三次上机;

public class 姐妹素数 {

    public static void main(String[] args)
    {
        for (int i = 3; i < 98; i = i + 2) 
            if (isPrime(i) && isPrime(i + 2)) 
                System.out.println((i) + "和" + (i + 2) + "是姐妹素数");
    }

    public static boolean isPrime(int n) 
    {
        boolean flag = true;
        for (int i = 2; i < n; i++) 
        {
            if (n % i == 0) 
            {
                flag = false;
                break;
            }
        }
        return flag;
    }

}
