import java.util.*;
public class array_user_values {
    public static void main(String[] args) {
        String guestList[]=new String[10];
        Scanner sc=new Scanner(System.in);
        for (int i = 0; i < guestList.length; i++) {
            System.out.print("Enter name "+(i+1)+":\t");
            guestList[i]=sc.nextLine();
        }
        for (int i = 0; i < guestList.length; i++) {
            System.out.println(guestList[i]+" You're cordially invited at our home for my brother's birthday party on 15th May at 5 pm.");
        }
    }
}
