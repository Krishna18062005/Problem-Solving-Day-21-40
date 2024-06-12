import java.util.*;
public class Hello {
    public static boolean isprime(int a){
        if(a<=1) return false;
        if(a==2||a==3) return true;
        if(a%2==0||a%3==0) return false;
        //to skip the 2 and 3 multiples we increement 2 and 4 alternatively;
        for(int i=5,k=2;i*i<=a;i+=k,k=6-k){
            if(a%i==0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
		//Prime Integer Add Smallest Value;
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		while(n-->0){
		    int a=sc.nextInt();
		    int copy=a;
		    while(!isprime(copy)) copy++;
		    System.out.print(copy-a+" ");
		}

	}
}
