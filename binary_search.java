import java.util.*;
public class binary_search {
    public static void binarySearch(int arr[],int start,int end, int req){
        
        while(start<=end){
            int mid=start+(end-start)/2;
            if(arr[mid]==req){
                System.out.println("Position  "+(mid+1));
                break;
            }
            else if(arr[mid]<req){
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        if(start>end)
        System.out.println(req+" is not present in the list.");  
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a[]=new int[5];
            for (int i = 0; i < a.length; i++) {
                System.out.println("Enter "+(i+1)+" the elements");
                a[i]=sc.nextInt();
            }
            int req;
            int end=a.length-1;
            System.out.println("Enter the element to be searched:\t");
            req=sc.nextInt();
            binarySearch(a, 0, end, req);
        }
}
