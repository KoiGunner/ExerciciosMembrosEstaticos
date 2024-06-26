package POO;

import java.util.Locale;
import java.util.Scanner;

public class Calculate {

    /*
    Primeira solução do problema do raio, usando atributos estáticos
    * */

    public static final double PI = 3.14159;

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Radius: ");
        double radius = sc.nextDouble();

        double c = circunference(radius);

        double v = volume(radius);

        System.out.printf("Circunference: %.2f%n", c);
        System.out.printf("Volume: %.2f%n", v);
        System.out.printf("PI value: %.2f%n", PI);

        sc.close();
    }

    public static double circunference(double radius){
        return 2 * PI * radius;
    }

    public static double volume(double radius){
        return 4.0 * PI * radius * radius * radius /3;
    }

}
