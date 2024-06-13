import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Alternate first & Last Patern
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		for(int i=0;i<(s.length()+1)/2;i++){
		    for(int j=0;j<s.length();j++){
		        if(j==i||j+i+1==s.length()) continue;
		        else
		        { 
		            System.out.print(s.charAt(j)+"");
		    }}
		    System.out.print("\n");
		}
		
}}

private static void leftShiftUnitDigits(int arr[], int N) {
    int fd=arr[0];
    for(int i=0;i<N-1;i++){
        arr[i]=(arr[i]/10)*10+arr[i+1]%10;
    }arr[N-1]=(arr[N-1]/10)*10+fd%10;
}
