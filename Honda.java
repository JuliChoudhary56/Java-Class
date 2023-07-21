import java.util.Scanner;
public class Honda {
    int type;
    int cost;
    Scanner sc=new Scanner(System.in);
    void gettype(){
        System.out.println("Enter the type of stroke (2/4):\t");
        type=sc.nextInt();
        System.out.println("Enter the previous cost of vehicle:\t");
        cost=sc.nextInt();
    }
    void find(){
        if(type==2){
            cost=cost+(cost*10/100);
        }
        if(type==4){
            cost=cost+(cost*12/100);
        }
    }
    void printcost(){
        System.out.println("type of engine\t new cost");
        System.out.println(type+"\t\t"+cost);
    }
    public static void main(String[] args) {
        Honda honda=new Honda();
        honda.gettype();
        honda.find();
        honda.printcost();
    }
}
