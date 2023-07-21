import java.util.*;
public class linear_search {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a[]=new int[5];
            for (int i = 0; i < a.length; i++) {
                System.out.println("Enter "+(i+1)+" the elements");
                a[i]=sc.nextInt();
            }
            int req;
            System.out.println("Enter the element to be searched:\t");
            req=sc.nextInt();
            int f=0;
            for (int i = 0; i < a.length; i++) {
                if(a[i]==req){
                    f=1;
                    System.out.println("Position  "+(i+1));
                    break;
                }
            }
            if(f==0)
                System.out.println(req+" is not present in the list.");  
    }
}
