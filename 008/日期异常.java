package �ڰ˴��ϻ�;

import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.util.*;




public class �����쳣 {
    public static void main(String[] args) 
    {
    	Scanner S = new Scanner(System.in);
    	///"2018/04/24";
        String strDate = S.nextLine();
        S.close();
        SimpleDateFormat simpleDateFormat=new SimpleDateFormat("yyyy/MM/dd");
        //���벶���쳣
        try {
            Date date = simpleDateFormat.parse(strDate);
            System.out.println(date);
        } catch(ParseException px) {
            px.printStackTrace();
        }
        
    }
}