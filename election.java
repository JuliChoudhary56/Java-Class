import java.util.*;
public class election {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num_of_voters;
        System.out.println("Enter the total number of voters:\t");
        num_of_voters=sc.nextInt();
        int votes_casted=num_of_voters*80/100;
        int votes_X=votes_casted*60/100;
        int votes_Y=votes_casted*40/100;
        System.out.println("Votes received by X:\t"+votes_X);
        System.out.println("Votes received by Y:\t"+votes_Y);
    }
}
