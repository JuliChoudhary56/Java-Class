import java.util.*;
import java.lang.Math;

public class Automorphic {
    static int check(int n) {
        int squareOfNumber=(int)Math.pow(n,2);
        int digits=0;
        int count=0;
        while(n!=0){
            count++;
            n=n/10;
        }
        int temp=(int)Math.pow(10,count);
        digits=squareOfNumber%temp;
        return digits;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int digitsOfSquare=check(num);
        System.out.println("digits: "+digitsOfSquare);
        if(num==digitsOfSquare)
            System.out.println("Automorphic.");
        else
            System.out.println(" Not an automorphic.");
    }
}
