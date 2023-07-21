import java.util.Scanner;

public class palindrome_9 {
    boolean Palin(String str){
        String revstr="";
        for(int i=str.length()-1;i>=0;i--)
            revstr=revstr+str.charAt(i);

        if(str.equals(revstr)) 
            return true;
        else 
            return false;
    }
    public static void main(String[] args) {
        palindrome_9 p=new palindrome_9();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string\t");
        String s=sc.nextLine();
        if(p.Palin(s))
            System.out.println(s+" is palindrome string");
        else
            System.out.println(s+" is not a palindrome string");
    }
}
