import java.util.*;
public class pattern_h {
    public static void main(String []args){
        // int n;
        // Scanner sc=new Scanner(System.in);
        // System.out.println("Enter the number of rows:\t");
        // n=sc.nextInt();
        for(int i=5;i>=1;i--){
            for(int j=5;j>5-i;j--){
                System.out.print(j+" ");
            }
            System.out.print("\n");
        }
    }
}

// 5 4 3 2 1
// 5 4 3 2
// 5 4 3
// 5 4
// 5