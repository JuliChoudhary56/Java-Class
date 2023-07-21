public class pattern_i {
    public static void main(String args[]) {
        
        int val=1;
        for(int i=1;i<=5;i++){
            for(int j=1;j<=i;j++){
                System.out.print(val);
                if(val<10)
                    System.out.print("  ");
                else
                    System.out.print(" ");
                val++;
            }
            System.out.print("\n");
        }
    }   
}
