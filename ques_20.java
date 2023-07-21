import java.util.Scanner;

public class ques_20{
    public static void main(String[] args) {
        ques_20 obj=new ques_20();
        Scanner sc=new Scanner(System.in);
        double n,a;
        System.out.println("Enter the value of n:\t");
        n=sc.nextDouble();

        System.out.println("Enter the value of a:\t");
        a=sc.nextDouble();
        double res=0;
        System.out.println("Enter 1 for series a)- (1/1)+(1/2)+(1+3)");
        System.out.println("Enter 2 for series b)- (1/a^2)+(4/a^5)+(7+a^8)");
        int choice =sc.nextInt();
        if(choice==1) res=obj.series(n);
        if(choice==2) res=obj.series(a,n);
        if(choice!=1 && choice!=2) System.out.println("Invalid choice..");
        System.out.println("Ans:-" +res);
    }
    double series(double n){
        double sum=0;
        for(double i=1;i<=n;i++)
            sum=sum+(1/i);

        return sum;
    }
    double series(double a, double n){
        double sum=0.0;
        double i=1;
            for(double j=1;j<=n;j++){
                sum+= i/(Math.pow(a,(i+1)));
                i+=3;
            }
        return sum;
    }
}