import java.util.*;
public class pattern3 {
    public static void main(String []args) {
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of rows:\t");
        n=sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if(j<=i)
                    System.out.print(i+" ");
                else
                    System.out.print(j+" ");
            }
            System.out.print("\n");
        }
    }
}
//i,j
//i=1,j=1 to 5-- if(j<=i) print i else print j---12345
//i=2 j=1 to 5-- if(j<=i) print i else print j---22345
//i=3 j=1 to 5-- if(j<=i) print i else print j---33345 
//i=4 j=1 to 5-- if(j<=i) print i else print j---44445
//i=5 j=1 to 5-- if(j<=i) print i else print j---55555


//1AAAAA
//22BBBB
//333CCC
//4444DD
//55555E
