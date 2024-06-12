import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Expiry date After M Months
		Scanner sc=new Scanner(System.in);
		String Mda=sc.next();
		int val=sc.nextInt();
		String[] Ar=Mda.split("-");
		int[] m=new int[2];
		m[0]=(Integer.parseInt(Ar[0]));
		m[1]=(Integer.parseInt(Ar[1]));
		m[0]+=val;
		while(m[0]>12){
		    m[0]-=12;
		    m[1]+=1;
		}
		if(m[0]>9) System.out.print(m[0]+"-"+m[1]); 
		else
		System.out.printf("0%d+%d",m[0],m[1]);
		
		
	}
}
