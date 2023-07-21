public class ques_22 {
    public static void main(String[] args) {
        // take values and choice as user input and call the method accordingly
        // will be done by Kshirabdhi
    }
    void display(String str, char ch){
        if(str.charAt(0)==ch && str.charAt(str.length()-1)==ch)
            System.out.println("Special word");
        else System.out.println("No Special word");
    }
    void display(String str1, String str2){
        if(str1.equals(str2))
            System.out.println("Both are equal");
        else System.out.println("Both are not equal");
    }
    void display(String str, int n){
            System.out.println("Character present at "+n+
                                "th position in the word "+str+" is -"+str.charAt(n-1));
    }
}
