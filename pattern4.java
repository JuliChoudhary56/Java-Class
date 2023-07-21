import java.util.*;
public class pattern4 {
    public static void main(String []args) {
        int n,alpha=97;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of rows:\t");
        n=sc.nextInt();
        for(int i=1;i<n;i++){
            for(int j=1;j<=n;j++){
                if(j<=i)
                    System.out.print(i+" ");
                else
                    System.out.print((char)alpha+" ");
            }
            alpha++;
            System.out.print("\n");
        }
    }
}

//1AAAAA
//22BBBB
//333CCC
//4444DD
//55555E
