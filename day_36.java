import java.util.*;
public class Hello {
   

    public static void main(String[] args) {
		//Missing digit;
		Scanner sc=new Scanner(System.in);
		String nu=sc.next();
		String du=nu;//duplicate to store value
		for(int i=0;i<10;i++){
		    if(nu.indexOf('X')==0) continue;
		    nu=nu.replace("X",""+i);
		    //System.out.print(nu+" ");
		    if(Integer.parseInt(nu)%8==0){
		        System.out.print(i);
		        return;
		    }
		    nu=du;//if(not divisible change to its original)
		}
		System.out.print(-1);
	

	}
}
