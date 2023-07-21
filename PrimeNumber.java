import java.util.*;

public class PrimeNumber {
    static int check(int n) {
        int flag = 1;
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                flag = 0;
                break;
            }
        }
        return flag;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if (num == 1 || num == 0) {
            System.out.println("Neither prime nor composite.");
        } 
        else {
            int isPrime = check(num);
            if (isPrime == 1) {
                System.out.println("prime.");
            } else {
                System.out.println("composite.");
            }
        }
    }
}
