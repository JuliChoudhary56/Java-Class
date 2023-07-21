import java.util.*;
public class duck_number {
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        int num,temp;
        boolean flag=false;
        System.out.println("Enter the number to be checked:\t");
        num=sc.nextInt();
        while(num>0){
            temp=num%10;
            if(temp==0){
                flag=true;
                break;
            }
            num/=10;
        }
        if(flag==true){
            System.out.println("Duck number");
        }
        else{
            System.out.println("Not a duck number");        
        }
    }
}
