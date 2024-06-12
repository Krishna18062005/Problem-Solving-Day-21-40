import java.util.*;
public class Hello {
    public static boolean UniqueAl(String a,int k){
        Set<Character> set=new HashSet<>();
        for(char i : a.toCharArray()){
            set.add(i);
        }
        return set.size()==k;
    }

    public static void main(String[] args) {
		//Longest substring K unique Alphabets
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		int k=sc.nextInt();
		
		int max=0;
		for(int i=0;i<str.length();i++){
		    for(int j=i;j<str.length();j++){
		        if(UniqueAl(str.substring(i,j+1),k)){
		            int mm=(str.substring(i,j+1)).length();
		            if(mm>max){
		                max=mm;
		            }
		        }
		    }
		}System.out.print(max);

	}
}
import java.util.*;
public class Hello {
    public static ArrayList<Integer> MakeFibSeries(int max){
        ArrayList<Integer> a=new ArrayList<>();
        a.add(0);
        a.add(1);
        int i=1;
        while((a.get(i)+a.get(i-1))<=max){
           a.add(a.get(i-1)+a.get(i));
           i++;
        }
        return a;
    }

    public static void main(String[] args) {
		//Fibonacci Sum -N Integers
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] ar=new int[n];
		int max=0;
		for(int i=0;i<n;i++) {
		    ar[i]=sc.nextInt();
		    max=Math.max(max,ar[i]);
		}
		int sum=0;
		ArrayList<Integer> fibArr=MakeFibSeries(max);
	//	System.out.print(fibArr);
		for(int i=0;i<n;i++){
		    if(Collections.binarySearch(fibArr,ar[i])>0){
		        sum+=ar[i];
		    }
		}
		Arrays.sort(ar);
		if(sum>0){
		    System.out.print(sum);
		}
		else if(Arrays.binarySearch(ar,0)>=0){
		    System.out.print(0);
		}
		else
		System.out.print("-1");
	}
}
