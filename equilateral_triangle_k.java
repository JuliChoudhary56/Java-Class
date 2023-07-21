public class equilateral_triangle_k {
    public static void main(String []args) {
        int j;
        // Scanner sc=new Scanner(System.in);
        // System.out.println("Enter the row number:\t");
        // n=sc.nextInt();
        for(int i=1; i<=5;i++){
            for (j =1 ; j<=5-i+1 ; j++) {
                System.out.print(" ");
            }
            for (int k =1 ; k<=2*i-1 ; k++) {
                System.out.print(i);
            }
            System.out.println();
        }
    }
}
