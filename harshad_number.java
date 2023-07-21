import java.util.*;
public class harshad_number {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number:\t");
        int num=sc.nextInt();
        int num_copy=num;
        int sum=0;
        while(num_copy>0){
            int temp=num_copy%10;
            sum=sum+temp;
            num_copy=num_copy/10;
        }
        if(num%sum==0){
            System.out.println("The number entered by you is Harshad Number.");
        }
        else{
            System.out.println("The number entered by you is not a Harshad Number.");
        }
    }
}
