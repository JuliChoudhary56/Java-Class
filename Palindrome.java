import java.util.*;

public class Palindrome {
    static int reverse(int n) {
        int rev = 0;
        while (n != 0) {
            int rem = (n % 10);
            rev = (rev * 10) + rem;
            n = n / 10;
        }
        return rev;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int reverseNum = reverse(num);
        if (num == reverseNum)
            System.out.println(num + " is a palindrome number.");
        else
            System.out.println(num + " is not a palindrome number.");
    }
}
