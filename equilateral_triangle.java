import java.util.*;
public class equilateral_triangle {
    public static void main(String []args) {
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the row number:\t");
        n=sc.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <=n-i+1; j++) {
                System.out.print(" ");
            }
            // for (int k = 0; k<(i*2)-1; k++) {
            //     System.out.print(i);
            // }
            for (int k = 1; k<=i; k++) {
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
}
