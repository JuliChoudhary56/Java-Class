import java.io.*;
public class array_input_stream_reader {
    public static void main(String[] args) {
        InputStreamReader inp_read=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(inp_read);
        int sum=0;
        int a[]=new int[5];
        try {
            for (int i = 0; i < a.length; i++) {
                System.out.println("Enter the elements");
                a[i]=Integer.parseInt(br.readLine());
            }
        } catch (IOException  e) {
            // TODO: handle exception
        }
        for (int i = 0; i < a.length; i++) {
            sum=sum+a[i];
        }
        System.out.println("Sum: "+sum);
    }
}
