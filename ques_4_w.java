import java.util.*;
public class ques_4_w {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        char ch;
        int nou=0,nol=0;
        int num;
        System.out.println("Enter the number of characters:\t ");
        num=sc.nextInt();
        for (int i = 0; i < num; i++) {
            ch=sc.next().charAt(0);
            if(Character.isUpperCase(ch))
                nou++;
            else
                nol++;
        }
        System.out.println("UpperCase character:\t"+nou);
        System.out.println("LowerCase character:\t"+nol);
    }
}
