import java.util.*;
public class Merging_Array {
    public static void main(String[] args) {
        int s1,s2;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of first array:\t");
        s1=sc.nextInt();
        System.out.println("Enter the size of second array:\t");
        s2=sc.nextInt();
        int a1[]=new int[s1];
        int a2[]=new int[s2];
        int am[]=new int[s1+s2];
        System.out.println("Enter the elements of first array:\t");
        for(int i=0;i<s1;i++)
            a1[i]=sc.nextInt();
        
        System.out.println("Enter the elements of second array:\t");
        for(int i=0;i<s2;i++)
            a2[i]=sc.nextInt();
        
        for(int i=0;i<s1;i++)
            am[i]=a1[i];
        for(int i=0;i<s2;i++)
            am[s1+i]=a2[i];
        System.out.println("Array after merging:\t");
        for(int i=0;i<am.length;i++)
            System.out.println(am[i]);
    }
}
