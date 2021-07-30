import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("ax^2+bx+c=-7");
        System.out.println("Введите параметры квадратного уравнения");

        System.out.print("a = ");
        double a = scan.nextDouble();
        System.out.print("b = ");
        double b = scan.nextDouble();
        System.out.print("c = ");
        double c = scan.nextDouble();

        double value = -7;
        double[] resolve = resolveQuadraticEquation(a, b, c - value); // c + 7 т.к. уравнение вида а^2 + bx + c = -7;

        switch (resolve.length) {
            case 2:
                double x1 = resolve[0];
                double x2 = resolve[1];
                System.out.printf("x1=%f; x2=%f\n", x1, x2);
                break;
            case 1:
                double x = resolve[0];
                System.out.println("x =" + x);
                break;
            case 0:
                System.out.println("Нет действительных корней");
                break;
        }

    }

    /**
     * Метод решения квадратных уравнений
     * @param a параметр перед x^2
     * @param b параметр перед x
     * @param c число
     * @return Возвращает массив, содержащий корни уравнений (1 или 2). Если корней нет - возвращается пустой массив.
     */
    public static double[] resolveQuadraticEquation(double a, double b, double c) {
        if (a == 0)
            return new double[] {resolveLinearEquation(b, c)};

        double d = b * b - 4 * a * c;

        if (d > 0) {
            double x1 = -b - Math.sqrt(d) / (2 * a);
            double x2 = -b + Math.sqrt(d) / (2 * a);
            return new double[] {x1, x2};
        } else if (d == 0) {
            double x = -b / (2 * a);
            return new double[] {x};
        } else
            return new double[0];
    }

    /**
     * Метод решения линейных уравнений
     * @param a Параметр перед х
     * @param b число
     * @return Возвращает корень уравнения
     * @exception IllegalArgumentException при а = 0
     */
    public static double resolveLinearEquation(double a, double b) {
        if (a == 0)
            throw new IllegalArgumentException("Не является уравнением");

        return -b / a;
    }

}
