public class ques_21 {
    public static void main(String[] args) {
        // take values and choice as user input and call the method accordingly
        // will be done by Kshirabdhi
    }
    void display(int n){
        // check if n is a perfect square or not
        if(n==1 || n==0) System.out.println("Yes perfect square");
        else{
            for(int i=2;i<=n/2;i++)
                if((i*i)==n){
                    System.out.println("Yes perfect square");
                return;
                }
            System.out.println("Not a  perfect square");
        }
    }
    void display(String str, char ch){
        //check if str containing ch 
        String s=ch+"";
        if(str.contains(s)) System.out.println("yes "+ch+" is present in the string"+str);
        else System.out.println("No"+ch+" is not present in the string"+str);
    }
    void display(String str){
        //check and print the length of the str
        System.out.println("Number of characters:\t "+str.length());
    }
}
