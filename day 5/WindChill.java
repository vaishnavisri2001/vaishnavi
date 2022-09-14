import java.util.Scanner;

public class WindChill {
    static void windChill(double t, double v) {

        double w = 35.74 + 0.62158 * t + (0.4275 * t - 35.75) * Math.pow(v, 0.16);
        System.out.println("Wind Chill : "+ w);
    }


    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner s = new Scanner(System.in);
        try {
            System.out.println("Enter temperature in fahrenheit");
            double t = s.nextDouble();
            System.out.println("Enter wind speed in miles per hour");
            double v = s.nextDouble();
            if (Math.abs(t) > 50 || v > 120 || v < 3) {
                System.out.println("enter correct input");
            } else {
                windChill(t, v);
            }
        } catch (Exception e) {
            System.out.println("enter valid input");
        }
        s.close();

    }

}