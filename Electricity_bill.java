import java.util.Scanner;

public class Electricity_bill {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter consumer number:\t");
        String consumerNo=sc.nextLine();
        System.out.println("Enter consumer name:\t");
        String consumerName=sc.nextLine();
        System.out.println("Enter number of units consumed:\t");
        int units=sc.nextInt();
        double a=cal(units);
        System.out.println("Consumer No. \t Name \t Units Consumed\t Amount");
        System.out.println(consumerNo+"\t "+consumerName+" \t " +units+"\t\t "+a);
    }
    static double cal(int u){
        double amount=0.0;
        if(u<=100)
            amount=u*1.25;
        else if(u<=200)
            amount=(100*1.25)+((u-100)*1.5);
        else
            amount=(100*1.25)+(100*1.5)+((u-200)*1.8);
  return amount;
      
    }
}
