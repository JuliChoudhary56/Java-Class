public class array_example_2 {
    public static void main(String[] args) {
        int num_val[]=new int[10];
        int avg=0;
        num_val[0]=4;
        num_val[1]=9;
        num_val[2]=8;
        num_val[3]=5;
        num_val[4]=11;
        num_val[5]=70;
        num_val[6]=42;
        num_val[7]=13;
        num_val[8]=10;
        num_val[9]=8;
        for (int i = 0; i < num_val.length; i++) {
            avg+=num_val[i];
        }
        avg=avg/num_val.length;
        System.out.println("Avergae: "+avg);
    }
}
