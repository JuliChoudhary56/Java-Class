public class Main
{   
    void test2(int a,int b){
        while(a!=b){
            if(a>b) a=a-b;
            else a=b-a;
        }
        System.out.println(a);
    }
    public static void main(String[] args) {
        Main m=new Main();
		m.test2(4,17);
	}
}