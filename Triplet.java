import java.util.*;
public class Triplet {
    
    int a,b,c;
    Scanner sc=new Scanner(System.in);
    void getdata(){
        System.out.println("Enter the value of a:\t");
        a=sc.nextInt();
        System.out.println("Enter the value of b:\t");
        b=sc.nextInt();
        System.out.println("Enter the value of c:\t");
        c=sc.nextInt();
    }
    void findprint(){
        if(Math.pow(a,2)+Math.pow(b,2)==Math.pow(c,2) ||
           Math.pow(b,2)+Math.pow(c,2)==Math.pow(a,2) ||
           Math.pow(c,2)+Math.pow(a,2)==Math.pow(b,2))
            System.out.println("yes, "+a+" "+b+" "+c+" are pythagorean triplets.");
        else
            System.out.println("no, "+a+" "+b+" "+c+" are not pythagorean triplets.");
    }
    public static void main(String[] args) {
        Triplet triplet = new Triplet();
        triplet.getdata();
        triplet.findprint();
    }
}
