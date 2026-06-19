import java.util.Scanner;

public class Findmidwithoutusefun {
    public static void main(String[] args) {
        Scanner sin = new Scanner(System.in);
        System.out.println("enter start val:");
        int start = sin.nextInt();
        int end = sin.nextInt();
        double dd = ((start + end) / 2.0);
        System.out.println("Mid val b/w range is:" + dd);

    }
}
