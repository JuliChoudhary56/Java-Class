import java.util.Scanner;

public class Volume {
    // static int volume(int side){
    //     int v=side*side*side;
    //     return v;
    // }
    static double volume(double radius){
        //double v=(4*3.14*radius*radius*radius)/3;
        return (4*3.14*radius*radius*radius)/3;
    }
    static int volume(int length,int breadth,int height){
        // int v=length*breadth*height;
        return length*breadth*height;
    }
    static double volume(double radius, double height){
        //double v=(3.14*radius*radius)/height;
        return (3.14*radius*radius)/height;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
       // System.out.println("Enter the side of cube:\t");
        //int side=sc.nextInt();
        System.out.println("Enter the radius of the sphere:\t");
        double radius=sc.nextDouble();
        System.out.println("Enter the length, breadth and height of the cuboid:\t");
        int length=sc.nextInt();
        int breadth=sc.nextInt();
        int height=sc.nextInt();

        System.out.println("Enter the radius and height of the cylinder:\t");
        double r=sc.nextDouble();
        double h=sc.nextDouble();

        //int vc=volume(side);
        double vs=volume(radius);
        int vcd=volume(length, breadth, height);
        double vcylinder=volume(radius, height);
        System.out.println( //"Volume of cube:\t"+vc+
        "\nVolume of sphere:\t"+vs+"\nVolume of cuboid:\t"+vcd+
        "\nVolume of cylinder:\t"+vcylinder);
    }
}
