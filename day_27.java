import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Files & Extension
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		String[] Ar=new String[a];
		for(int i=0;i<a;i++){
		    String in=sc.next();
		    int ind=in.lastIndexOf(".");
		    Ar[i]=in.substring(ind);
		    
		}
		HashMap<String,Integer> map=new HashMap<>();
		for(int i=0;i<a;i++){
		    if(map.containsKey(Ar[i])){
		        int c=map.get(Ar[i]);
		        map.put(Ar[i],c+1);
		    }
		    else{
		        map.put(Ar[i],1);
		    }
		}
		for(int i=0;i<a;i++){
		    if(map.get(Ar[i])!=-1)
		    System.out.println(map.get(Ar[i])+" "+Ar[i]);
		    map.put(Ar[i],-1);
		}

	}
}
