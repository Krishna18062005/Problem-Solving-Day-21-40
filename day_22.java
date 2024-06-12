import java.util.*;
public class Hello {
    //Krishnaa!
    public static int rotate(int N){
        String Num=Integer.toString(N);
        N=Integer.parseInt(Num.substring(1,Num.length())+Num.charAt(0));
        return N;
    }

    public static void main(String[] args) {
		//Rotate digits-Repeat Pattern
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		String orN=String.valueOf(N);
		int copyN=N;
		int size=(int)Math.log10(N)+1;
		for(int i=0;i<size;i++){
		    String num=Integer.toString(copyN);
		    for(int j=0;j<size;j++){
                int numb=orN.charAt(j)-'0';
                int numbe=num.charAt(j)-'0';
                for(int k=0;k<numbe;k++){
                    System.out.print(numb+"");
                }
                if(j<size-1)
                System.out.print("-");
		    }
		    copyN=rotate(copyN);
		    System.out.println();
		}
	}
}
