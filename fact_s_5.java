import java.util.Scanner;

public class fact_s_5 {
    static int fact(int n){
        int factorial=1;
        for(int i=1;i<=n;i++){
            factorial=factorial*i;
        }
        return factorial;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of n:\t");
        int n=sc.nextInt();
        System.out.println("Enter the value of m:\t");
        int m=sc.nextInt();
        int S=fact(n)/(fact(m)*fact(n-m));
        System.out.println("The value of S:\t"+S);
    }
}


