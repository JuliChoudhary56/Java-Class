public class array_1 {
    public static void main(String[] args) {
     int a[]={20,25,26,24,26,28,29,24,28,30,20,25,26,24,26,28,29,24,28,30};

        int sum_even=0;
        int sum_odd=0;
  
        for(int i=0;i<a.length;i++){
          if(a[i]%2==0)  sum_even=sum_even+a[i];
          else sum_odd=sum_odd+a[i];
        }
        System.out.println("Sum of odd:\t"+sum_odd);
        System.out.println("Sum of even:\t"+sum_even);
        // System.out.println(a.length);
    }
}
