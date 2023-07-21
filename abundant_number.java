import java.util.*;

public class abundant_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num, sum = 0;
        System.out.println("Enter the number:\t");
        num = sc.nextInt();
        for (int i = 1; i <= num / 2; i++) {
            if (num % i == 0)
                sum += i;
        }
        if (num < sum)
            System.out.println("The number is abundant number.");
        else
            System.out.println("The number is not an abundant number.");
    }
}

// int i=1;
// while(i<=num/2){
// if(num%i==0)
// sum+=i; //sum=sum+i;
// i++;
// }