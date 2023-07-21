import java.util.*;
public class ques_6_w {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a letter:\t");
        char ch=sc.next().charAt(0);
        int val;
        if(Character.isUpperCase(ch))
            val=(int)(ch+5);
        else
            val=(int)(ch+3);
        System.out.println((char)val);
    }
}
