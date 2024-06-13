import java.util.*;
public class Hello {
    public static void main(String[] args) {
		//Matrix same Characters
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		if(N<=1){ System.out.print("YES");
		return;}
		boolean rslt;
		char[][] matri=new char[N][N];
		for(int i=0;i<N;i++){
		for(int j=0;j<N;j++){
		    matri[i][j]=sc.next().charAt(0);
		}}
		rslt=get(matri,N);
		System.out.print((rslt)?"YES":"NO");
	}
	public static boolean get(char[][] ma,int n){
	    char dia =ma[0][0];
	    char nondia=ma[0][1];
	   
	    for(int i=0;i<n;i++)
	    {
	        for(int j=0;j<n;j++)
	        {
	          if(i==j||n==j+i+1)
	          {
	           if(ma[i][j]!=dia) 
	            {
	                
	            return false;
	               }
	             }
	             
	        
	               
	              
	          else{
	            if((ma[i][j]!=(nondia))&&i!=j&&i!=j-n+1)
	            
	            { 
	                return false;
	            }
	              }
	         }}
	    
	    return true;
	}
}
