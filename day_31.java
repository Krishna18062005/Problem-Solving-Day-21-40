import java.util.*;
public class Hello {
    public static char[] binVal(String a){
        char[] b=a.toCharArray();
        char k='a';
        for(int i=0;i<b.length;i++){
            if(b[i]=='1'){
                b[i]=k;
                k=(char)((int)k+1);
            }
        }
        char al='A';
        for(int i=b.length-1;i>=0;i--){
            if(b[i]=='0'){
                b[i]=al;
                al=(char)((int)al+1);
            }
        }
        return b;
    }

    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		System.out.print(binVal(Integer.toBinaryString(a)));

	}
}
import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//patients Token
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		String[] ar=new String[size];
		int[] arT=new int[size];
		for(int i=0;i<size;i++){
		    ar[i]=sc.next();
		    String tim=sc.next();
		    String[] timeAr=tim.split(":");
		    arT[i]=(Integer.parseInt(timeAr[0])*60)+Integer.parseInt(timeAr[1]);
		    
		}
		for(int i=0;i<size;i++){
		    for(int j=i+1;j<size;j++){
		        if(arT[i]>arT[j]){
		            int tmp=arT[i];
		            arT[i]=arT[j];
		            arT[j]=tmp;
		            String tem=ar[i];
		            ar[i]=ar[j];
		            ar[j]=tem;
		        }
		    }
		}
		for(int i=0;i<size;i++)
		System.out.println(ar[i]+" "+(i+1));
	}
}
