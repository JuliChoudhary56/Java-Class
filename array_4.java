public class array_4 {
    public static void main(String[] args) {
        int n[]={45,65,77,71,90,67,82,19,31,52,88,57,36,97,54,62,37,25,11,13};
        for (int i = 0; i < n.length; i++) {
            boolean flag=true;
            for (int j = 2; j <= n[i] / 2; ++j) {
                // condition for nonprime number
                if (n[i] % j == 0) {
                  flag = false;
                  break;
                }
              }
              if (flag)
                System.out.println(n[i]);   
        }
    }
}
