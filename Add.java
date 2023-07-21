import java.util.*;

public class Add {
    int num1, num2, total, diff, product, quotient, remainder;
   
    Scanner sc = new Scanner(System.in);
    public static int addNum(int n1,int n2){
        return n1+n2;
    }
    public int addNums(int n1,int n2){
        return n1+n2;
    }
    void input() {
        num1 = sc.nextInt();
        num2 = sc.nextInt();
    }

    void sum() {
        total = num1 + num2;
    }

    void sub() {
        diff = num1 - num2;
    }

    void prod() {
        product = num1 * num2;
    }

    void divide() {
        quotient = num1 / num2;
    }

    void modDiv() {
        remainder = num1 % num2;
    }

    void print() {
        System.out.println("Total: " + total);
        System.out.println("Difference: " + diff);
        System.out.println("Product: " + product);
        System.out.println("Quotient: " + quotient);
        System.out.println("Remainder: " + remainder);
    }

    public static void main(String args[]) {
         Add a = new Add();
        // a.input();
        // a.sum();
        // a.sub();
        // a.prod();
        // a.divide();
        // a.modDiv();
        // a.print();
        Scanner scan=new Scanner(System.in);
        int n1=scan.nextInt();
        int n2=scan.nextInt();
        //calling a static method from a static, will not require any object, we can call it directly.
        int sum=addNum(n1, n2);
        //calling a non static method needs an object of the class
        int sum1=a.addNums(n1, n2);
        System.out.println("Sum using non static method: "+sum1);
        System.out.println("SUM using static method: "+sum);
    }
}