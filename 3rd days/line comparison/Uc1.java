package LineComparison;

        import java.util.Scanner;

public class Uc1 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        System.out.println("Welcome to Line Comparison Computation Program on CSE");
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Co-ordinates of x1 and y1 : ");
        int x1 = sc.nextInt();
        int y1 = sc.nextInt();
        System.out.println("Enter the Co-ordinates of x2 and y2 : ");
        int x2 = sc.nextInt();
        int y2 = sc.nextInt();
        double len = Math.sqrt((x2 - x1) * (x2 - x1)  +  (y2 - y1) * (y2 - y1));
        System.out.println("Length of the given Line is : " + len + " units" );

    }

}
