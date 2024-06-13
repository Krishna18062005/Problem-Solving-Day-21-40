import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Shift Binary -Largest Integer;
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		String numStr=Integer.toBinaryString(num);
		int max=0;
		for(int i=0;i<numStr.length();i++){
		    String newStr=numStr.substring(i)+numStr.substring(0,i);
		    int newInt=Integer.parseInt(newStr,2);
		    max=(newInt>max)?newInt:max;
		    
		}
		System.out.print(max);

	}
}

import java.util.*;
public class Hello {
    public static void main(String[] args) {
		//W Pattern String 
		Scanner sc=new Scanner(System.in);
		String s1=sc.nextLine();
		String s2=sc.nextLine();
		String s3=sc.nextLine();
		String A,B,cS;
		A=(s1.length()>s2.length()&&s1.length()>s3.length())?s1:(s2.length()>s3.length())?s2:s3;
		if(A==s3){
		    s3=s1;
		    s1=A;
		}
		else if(A==s2){
		    s2=s1;
		    s1=A;
		}
		if(A.charAt(0)!=s2.charAt(s2.length()-1)){
		        B=s2;
		        cS=s3;
		    }else{
		        B=s3;
		        cS=s2;
		    }
		    s1=A;
		    s2=B;
		    s3=cS;
		int fi=s1.length()/2;
		int li=s1.length()/2;
		for(int i=0;i<s3.length();i++){
		    for(int j=0;j<s1.length();j++){
		        if(j==0){
		            System.out.print(s2.charAt(i));
		        }
		        else if(j==s1.length()-1){
		            System.out.print(s3.charAt(i));
		        }
		        else if(j==li){
		            System.out.print(s1.charAt(li));
		        }
		        else if(j==fi){
		            System.out.print(s1.charAt(fi));
		        }
		        else{
		            System.out.print("*");
		        }
		        
		    }fi--;
		    li++;
		    System.out.println();
		}
	}
}//150 minutes
