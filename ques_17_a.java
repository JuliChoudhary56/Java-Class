import java.util.Scanner;

public class ques_17_a {
    public static void main(String[] args) {
        ques_17_a a=new ques_17_a();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of p:\t");
        int p=sc.nextInt();
        System.out.println("Enter the string:\t");
        String str= sc.nextLine();
        sc.nextLine();
        char chr = sc.next().charAt(0);
        
        a.display(str,p);
        a.display(str,chr);
    }

    void display(String str, int p) {
        if(p==1){
            for (int i = 0; i < str.length()-1; i++) {
                if(Character.isUpperCase(str.charAt(i))){
                    System.out.println(str.charAt(i));
                }
            }
        }
        else{
            for (int i = 0; i < str.length()-1; i++) {
                if(Character.isLowerCase(str.charAt(i))){
                    System.out.println(str.charAt(i));
                }
            }
        }
    }

    void display(String str, char chr) {
        if(chr=='Y'){
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u'
                    || str.charAt(i) == 'A' || str.charAt(i) == 'E' || str.charAt(i) == 'I' || str.charAt(i) == 'O' || str.charAt(i) == 'U')
                    System.out.println(str.charAt(i));
            }
        }
        else{
            for (int i = 0; i < str.length(); i++) {
                    System.out.println(str.charAt(i));
            }
        }
    }
}
