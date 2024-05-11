import java.util.Scanner;

public class InterpolacionLineal {
    
    public static double interpolar(double x0, double y0, double x1, double y1, double x) {
        // Fórmula de interpolación lineal
        return y0 + (y1 - y0) * ((x - x0) / (x1 - x0));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ingresar los puntos conocidos para la interpolación
        System.out.println("Ingrese el valor d x0:");
        double x0 = scanner.nextDouble();
        System.out.println("Ingrese el valor de y0:");
        double y0 = scanner.nextDouble();
        System.out.println("Ingrese el valor de x1:");
        double x1 = scanner.nextDouble();
        System.out.println("Ingrese el valor de y1:");
        double y1 = scanner.nextDouble();

        // Valor de x para el cual queremos interpolar y
        System.out.println("Ingrese el valor de x para interpolar:");
        double x = scanner.nextDouble();

        // Interpolar y para el valor dado de x
        double y = interpolar(x0, y0, x1, y1, x);

        // Imprimir el resultado
        System.out.println("Para x = " + x + ", y = " + y);

        scanner.close();
    }
}
