public class a{
    public static void main(String[] args) {
        int x=2;
int y=50;
int count=0;
do{
  ++x;
  y-=x++;
  count++;
}while(x<=10);
System.out.println("count="+count);
System.out.println("y="+y);
System.out.println("x="+x);
    }
}

