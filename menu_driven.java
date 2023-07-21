import java.util.*;
public class menu_driven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your choice:\nEnter 1 for fibonacci series\nEnter 2 for sum of digts\t");
        int c = sc.nextInt();
        switch (c) {
            case 1:
                int a = 0;
                int b = 1;
                System.out.print(a + " " + b + " ");
                for (int i = 1; i < 9; i++) {
                    int next = a + b;
                    System.out.print(next + " ");
                    a = b;
                    b = next;
                }
                break;
            case 2:
                System.out.println("Enter the number:\t");
                int num = sc.nextInt();
                int sum = 0;
                while (num > 0) {
                    int temp = num % 10;
                    sum = sum + temp;
                    num = num / 10;
                }
                System.out.println("Sum of the digits:\t" + sum);
                break;
            default:
                System.out.println("Invalid choice");
                break;
        }
    }
}
