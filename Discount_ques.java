import java.util.Scanner;

class Discount_ques{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Print price of the article\t");
        int price=sc.nextInt();
        Discount_ques discountQues=new Discount_ques();
        System.out.println("Enter 1 for single discount,\nEnter 2 for two successive discounts\nEnter 3 for three successive discounts\t");
        int choice = sc.nextInt();
        if(choice==1){
            System.out.println("Enter the discount rate");
            int disc1=sc.nextInt();
            discountQues.discount(disc1,price);
        }
        if(choice==2){
            System.out.println("Enter the discount rates");
            int disc1=sc.nextInt();
            int disc2=sc.nextInt();
            discountQues.discount(disc1,disc2,price);
        }
         if(choice==3){
            System.out.println("Enter the discount rates");
            int disc1=sc.nextInt();
            int disc2=sc.nextInt();
            int disc3=sc.nextInt();
            discountQues.discount(disc1,disc2,disc3,price);
        } 
    }
    void discount(int d,int price){
        int amount=price-(price*d/100);
        System.out.println("Single doscount amount:"+amount);
    }
    void discount(int d1,int d2,int price){
        int amount=price-(price*d1/100);
        amount=amount-(amount*d2/100);
        System.out.println("Successive Discount amount:"+amount);
    }
    void discount(int d1,int d2,int d3,int price){
        int amount=price-(price*d1/100);
        amount=amount-(amount*d2/100);
        amount=amount-(amount*d3/100);
        System.out.println("Successive Discount amount:"+amount);
    }
}