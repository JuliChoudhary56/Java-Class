import java.util.*;
public class Discount {
    int cost;
    String name;
    double taxincome;
    double tax;
    Scanner sc=new Scanner(System.in);
    void input(){
        System.out.println("Enter the name:\t");
        name=sc.nextLine();
        System.out.println("Enter the cost number:\t");
        cost=sc.nextInt();
        System.out.println("Enter the taxable income:\t");
        taxincome=sc.nextDouble();   
    }
    void cal(){
        if(taxincome<=250000.0)
            tax=0.0;
        else if(taxincome>=250001.0 && taxincome<=500000.0)
            tax=((taxincome-250000.0)*10)/100.0;
        else if(taxincome>=500001.0 && taxincome<=1000000.0)
            tax=30000.0+((taxincome-500000.0)*20)/100.0;
        else
            tax=50000.0+((taxincome-1000000.0)*30)/100.0;
    }
    void display(){
        System.out.println(" Name\t Discount\t Amount to be paid");
        System.out.println("\t\t"+name+"\t"+discount+"\t"+amount);
    }
    public static void main(String[] args) {
        Discount dis=new Discount();
        dis.input();
        dis.cal();
        dis.display();
    }
}
