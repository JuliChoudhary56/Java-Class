
import java.util.*;

public class prime_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:\t");
        int num = sc.nextInt();
        // boolean isPrime = true;
        int isPrime=0;
        if(num==0 || num==1)
        System.out.println("Neither prime nor composite");
        else{
            for (int i = 2; i <= num / 2; i++) {
                if (num % i == 0) {
                    isPrime = 1;
                    break;
                }
            }
            if (isPrime == 0)
                System.out.println(num + " is a prime number.");
            else
                System.out.println(num + " is not a prime number.");
        }
        
    }
}
