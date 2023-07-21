import java.util.*;

public class prog2 {
    // static int sum(int n){
    // int total=0;
    // for(int i=1;i<=n;i++){
    // total+=(i*(i+1));
    // }
    // return total;
    // }
    int sum(int n) {
        int total = 0;
        for (int i = 1; i <= n; i++) {
            total += (i * (i + 1));
        }
        return total;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        prog2 p = new prog2();
        // int s=sum(num);
        int s = p.sum(num);
        System.out.println("Sum of the series:\t" + s);
    }
}
