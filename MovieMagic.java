import java.util.Scanner;

public class MovieMagic {
    int year;
    String title;
    float rating;

    public MovieMagic(int y, String t, float r) {
        year = y;
        title = t;
        rating = r;
    }

    void accept() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the year");
        int y = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter the title");
        String t = sc.nextLine();
        System.out.println("Enter the rating");
        float r = sc.nextFloat();
        this.year = y;
        this.title = t;
        this.rating = r;
    }

    void display() {
        String message = "";
        if (rating >= 0.0 && rating <= 2.0)
            message = "Flop";
        else if (rating >= 2.1 && rating <= 3.4)
            message = "Semi-Hit";
        else if (rating >= 3.5 && rating <= 4.5)
            message = "Hit";
        else
            message = "Super Hit";

        System.out.println("Title\t Message\t");
        System.out.println(title + "\t" + message + "\t");
    }

    public static void main(String[] args) {
        MovieMagic m = new MovieMagic(0, "", 0.0f);
        m.accept();
        m.display();
    }
}
