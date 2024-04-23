import java.util.*;

public class day2 {
    public static void main(String args[]) {
        int a[] = { 10, 20, 30, 40, 50, 60, 70 };
        int k = 60;
        int first = 0;
        int last = a.length - 1;
        while (first <= last) {
            int mid = (first + last) / 2;
            if (a[mid] == k) {
                System.out.print("YES");
                break;
            } else if (a[mid] < k) {
                first = mid + 1;
            } else
                last = mid - 1;
        }
    }

}
