 import java.util.*;
public class Lsearch {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a[]=new int[10];
            for (int i = 0; i < a.length; i++) {
                System.out.println("Enter "+(i+1)+" the elements");
                a[i]=sc.nextInt();
            }
            int req;
            System.out.println("Enter the element to be searched:\t");
            req=sc.nextInt();
            search(a, req);
        }
        static void search(int arr[],int ele){
            int f=0;
            for (int i = 0; i < arr.length; i++) {
                if(arr[i]==ele){
                    f=1;
                    System.out.println(ele+" is present at position  "+(i+1));
                    break;
                }
            }
            if(f==0)
                System.out.println(ele+" is not present in the list.");  
        }   
}
