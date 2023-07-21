import java.util.*;
public class Insertion_Array {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int sum=0;
        int a[]=new int[50];
            for (int i = 0; i <5; i++) {
                System.out.println("Enter the elements");
                a[i]=sc.nextInt();
            }
        System.out.print("Please enter the value and position");
        int val=sc.nextInt();
        int pos=sc.nextInt();
        for (int i = 4; i >=pos; i--) {
            a[i+1]=a[i];
        }
        a[pos]=val;
        System.out.println("After insertion:\t");
        for (int i = 0; i < 6; i++) {
            System.out.println(a[i]);
        }
    }
}
