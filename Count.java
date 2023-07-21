import java.util.Scanner;

public class Count {

    String s;
    int t1, t2;

    void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string");
        String str = sc.nextLine();

        this.s = str;
        this.t1 = 0;
        this.t2 = 0;
    }

    void countwords() {
        String sArray[] = s.split(" ");
        for (int i = 0; i < sArray.length; i++) {
            if (sArray[i].charAt(0) >= 65 && sArray[i].charAt(0) <= 90)
                t1++;
            else
                t2++;
        }
    }

    void display() {
        System.out.println("String\t\t\t\t UpperCase\t LowerCase");
        System.out.println(s + "\t\t" + t1 + "\t\t" + t2);
    }

    public static void main(String[] args) {
        Count c = new Count();
        c.input();
        c.countwords();
        c.display();
    }
}
