public class array_3 {
    public static void main(String[] args) {
        int a[]={-2,5,6,-7,-8,5,69,-77,-6,8};
        for (int i = 0; i < a.length; i++) {
            if(a[i]<0)
                System.out.println(a[i]);
        }
        for (int i = 0; i < a.length; i++) {
            if(a[i]>=0)
                System.out.println(a[i]);
        }
    }
}
// -2,-7,-8,-77,-6,5,6,5,69,8
//-2, -7, -8, -77, -6, 5, 6, 5, 69, 8