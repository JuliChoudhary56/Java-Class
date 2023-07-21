import java.util.*;
public class Employee {
    int pan;
    String name;
    double taxincome;
    double tax;
    Scanner sc=new Scanner(System.in);
    void input(){
        System.out.println("Enter the name:\t");
        name=sc.nextLine();
        System.out.println("Enter the pan number:\t");
        pan=sc.nextInt();
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
        System.out.println("PAN Number\t Name\t Taxable-Income\t Tax");
        System.out.println(pan+"\t\t"+name+"\t"+taxincome+"\t"+tax);
    }
    public static void main(String[] args) {
        Employee emp=new Employee();
        emp.input();
        emp.cal();
        emp.display();
    }
}
