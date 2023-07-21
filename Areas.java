import java.util.Scanner;

public class Areas {
    public static void main(String[] args) {
        Areas ar=new Areas();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 1 for finding the area of circle\n2 for finding the area of square\n Enter 3 for finding the area of rectangle\t");
        int choice=sc.nextInt();
        if(choice==1){
            System.out.println("Enter radius: ");
            double r=sc.nextDouble();
            double areaCircle= ar.area(r);
            System.out.println("Area: "+areaCircle);
        }
        if(choice==2){
            System.out.println("Enter side: ");
            int s=sc.nextInt();
            int areaSquare= ar.area(s);
            System.out.println("Area: "+areaSquare);
        }
        if(choice==3){
            System.out.println("Enter length: ");
            int l=sc.nextInt();
            System.out.println("Enter breadth: ");
            int b=sc.nextInt();
            int areaRect= ar.area(l,b);
            System.out.println("Area: "+areaRect);
        }
    }   
    double area(double radius){
        return 3.14*radius*radius;
    }
    int area(int side){
        return side*side;
    }
    int area(int length,int breadth){
        return length*breadth;
    }
}
