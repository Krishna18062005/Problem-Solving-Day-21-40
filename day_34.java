import java.util.*;
public class Hello {
    public static boolean checkprime(String a){
        int nu=Integer.valueOf(a);
        if(nu<=1) return false;
        if(nu==2||nu==3) return true;
        if(nu%2==0||nu%3==0) return false;
        for(int i=4,j=2;i*i<nu;i+=j,j=6-j){
            if(nu%i==0) return false;
        }
        return true;
    }
    public static void main(String[] args) {
		//Split & Check Prime Integers
		Scanner sc=new Scanner(System.in);
		String num=sc.next();
		for(int i=0;i<num.length()-1;i++){
		    if(checkprime(num.substring(0,i+1))&&checkprime(num.substring(i+1)))
		    {
		        System.out.print(num.substring(0,i+1)+" "+num.substring(i+1));
		        return;
		        
		    }
		}
		System.out.print(-1);

	}
}
