
import java.lang.*;
import java.util.Scanner;
public class Z2 {
    public static void cos(double x, double radians){
        double cos = Math.cos(radians);
        String result = String.format("%.3f",cos);
        System.out.println("Cos ("+x+") = "+result);

    }
    public static void sin(double x, double radians){
        double sin = Math.sin(radians);
        String result = String.format("%.3f",sin);
        System.out.println("Sin ("+x+") = "+result);

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        double y = Double.parseDouble(str);
        double radians = Math.PI * y / 180;
        sin(y,radians);
        cos(y,radians);

    }
}