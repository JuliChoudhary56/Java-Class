import java.util.*;
public class pronic_number {
int checkPronic(int num){
        int x=0;
        for(int i=1;i<=num;i++){
            if(i*(i+1)==num)
                x=1;
        }
      return x;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of n:\t");
        int n=sc.nextInt();
        pronic_number p=new pronic_number();
        // for(int i=1;i<=n;i++){
        //     int isPronic=checkPronic(i);
        //     if(isPronic==1)
        //     System.out.print(i+" ");
        // }
        if(p.checkPronic(n))
        System.out.println("pronic number");
        else System.out.println("not a pronic number");

    }
}
