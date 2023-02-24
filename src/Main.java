import java.lang.*;
public class Main {
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
        double y1 = 30;
        double y2 = 60;
        for (int i=0;i<2;i++){
            double x;
            if (i==0){
                x = y1;
            }else {
                x = y2;
            }

            double radians = Math.PI * x / 180;
            sin(x,radians);
            cos(x,radians);

        }

    }
}