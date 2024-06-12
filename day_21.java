import java.util.*;
public class Hello {
    public static String removeDigits(String Nu){
        String ans="";
        for(char N:Nu.toCharArray()){
            if(N=='1'||N=='0'){
                ans+=N;
            }
        }
        return ans;//returns zero and ones only
    } 
    public static long decimalValue(String N){
        if(N.length()<=0&&N.length()>31)   return 0;
        //int num=Integer.parseInt(N);
        long s=0;
       // int poi=0;
        // while(num>0){
        //     int r=(int)num%10;
        //     s=s+((int)Math.pow(2,poi)*r);
        //     poi++;
        //     num/=10;
        // }
        int l=N.length()-1;
        for(char i : N.toCharArray()){
            int nu=Integer.parseInt(String.valueOf(i));
            s+=(long)Math.pow(2,l--)*nu;
        }
        return s;//returns the equivalent decimal value 
    }
    public static void main(String[] args) {
		//Remove digits-Except 0's and 1's and print the decimal value
		Scanner sc=new Scanner(System.in);
		String N=sc.next();
		String numExcept=removeDigits(N);
		if(numExcept.equals("")){
		    System.out.print("-1");
		    return;
		}
		long val=decimalValue(numExcept);
		System.out.print((val<=0)?"-1":val);
	}
}
