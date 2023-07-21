import java.util.Scanner;

public class ChangeCharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string:\t");
        String str= sc.nextLine();
        change(str);
    }
    static void change(String str) 
    {   char a=str.charAt(0);
        if(Character.isUpperCase(a)) System.out.println(Character.toLowerCase(a));
        else System.out.println(Character.toUpperCase(a));
    
        for (int i = 1; i < str.length()-1; i++) {
            if(str.charAt(i)==' '){
                if(Character.isUpperCase(str.charAt(i+1))) 
                    System.out.println(Character.toLowerCase(str.charAt(i+1)));
                else System.out.println(Character.toUpperCase(str.charAt(i+1)));
            }
        }
    }
}
