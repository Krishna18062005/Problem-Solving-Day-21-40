import java.util.*;
public class Hello {
    public static String checkAlternate(int[] a){
        
        for(int i=1;i<a.length;i++){
            if(a[i]%2==a[i-1]%2) return "no";
        }
        return "yes";
    }

    public static void main(String[] args) {
		//Check alternative odd Even
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] ar=new int[n];
		for(int i=0;i<n;i++){
		    ar[i]=sc.nextInt();
		}
		System.out.print(checkAlternate(ar));

	}
}
