import java.util.*;

public class staticAndNonStatic {
    static int addNum(int n1, int n2) {
        return n1 + n2;
    }

    int addNums(int n1, int n2) {
        return n1 + n2;
    }

    public static void main(String args[]) {
        staticAndNonStatic a = new staticAndNonStatic();

        Scanner scan = new Scanner(System.in);
        int n1 = scan.nextInt();
        int n2 = scan.nextInt();
        // calling a static method from a static method, will not require any object, we can
        // call it directly.
        int sum = addNum(n1, n2);
        // calling a non static method needs an object of the class
        int sum1 = a.addNums(n1, n2);
        System.out.println("Sum using non static method: " + sum1);
        System.out.println("SUM using static method: " + sum);
    }

}
