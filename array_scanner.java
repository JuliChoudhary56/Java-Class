import java.util.*;
public class array_scanner {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        // int sum=0;
        int a[]=new int[5];
            for (int i = 0; i < a.length; i++) {
                System.out.println("Enter the elements");
                a[i]=sc.nextInt();
            }
        // for (int i = 0; i < a.length; i++) {
        //     sum=sum+a[i];
        // }
        // System.out.println("Sum: "+sum);
        
    }
}
