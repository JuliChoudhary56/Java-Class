import java.util.Scanner;

public class ques15_area {
    public static void main(String[] args) {
        ques15_area ar=new ques15_area();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 1 for finding the area of parellelogram\n2 for finding the area of rhombus\n Enter 3 for finding the area of trapezium\t");
        int choice=sc.nextInt();
        if(choice==1){
            System.out.println("Enter base: ");
            int base=sc.nextInt();
            System.out.println("Enter height: ");
            int height=sc.nextInt();
            int areaPG= ar.area(base,height);
            System.out.println("Area: "+areaPG);
        }
        if(choice==2){
            System.out.println("Enter diagonal1: ");
            double d1=sc.nextInt();
            System.out.println("Enter diagonal2: ");
            double d2=sc.nextInt();
            double areaRhombus= ar.area(d1,d2);
            System.out.println("Area: "+areaRhombus);
        }
        if(choice==3){
            System.out.println("Enter first side: ");
            int a=sc.nextInt();
            System.out.println("Enter second side: ");
            int b=sc.nextInt();
            System.out.println("Enter height: ");
            int h=sc.nextInt();
            int areatrapezium= ar.area(a,b,h);
            System.out.println("Area: "+areatrapezium);
        }
    }   
    double area(double d1, double d2){
        return (d1*d2)/2;
    }
    int area(int base, int height){
        return base*height;
    }
    int area(int side1,int side2, int height){
        return ((side1+side2)*height)/2;
    }

}
