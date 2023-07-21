import java.util.*;

public class twinPrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int result = twin(num1, num2);
        if (result == 1)
            System.out.println("Twin Prime");
        else
            System.out.println("Not a Twin Prime");
    }

    static int twin(int num1, int num2) {
        if (num2 - num1 == 2) {
            int flag1 = 1;
            int flag2 = 1;
            for (int i = 2; i <= num1 / 2; i++) {
                if (num1 % i == 0) {
                    flag1 = 0;
                    break;
                }
            }
            for (int i = 2; i <= num2 / 2; i++) {
                if (num2 % i == 0) {
                    flag2 = 0;
                    break;
                }
            }
            if (flag1 == 1 && flag2 == 1)
                return 1;
        }
        return 0;
    }
}
