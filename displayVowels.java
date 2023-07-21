import java.util.*;

public class displayVowels {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a word");
        String wo= sc.nextLine();
        display(wo);
        
    }

    static void display(String word) {
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == 'a' || word.charAt(i) == 'e' || word.charAt(i) == 'i' || word.charAt(i) == 'o' || word.charAt(i) == 'u')
                System.out.println(word.charAt(i));
        }
    }
}
