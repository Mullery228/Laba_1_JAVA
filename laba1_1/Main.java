import java.util.Scanner;

//1) Вычислить n-ое треугольного число (сумма чисел от 1 до n), n! (произведение чисел от 1 до n)
public class Main {
    public static void main(String[] args) {
        System.out.print("Введите любое число для получения треугольного числа: ");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        in.close();
        int k = 1;
        int treangle = (n*(n + 1)) / 2; // формула взята из вики - без всяких циклов
        for (int i = 1; i <= n; i++) {
            k *= i;
        }
        System.out.println("Треугольное число T(n) = " + treangle);
        System.out.println(n + "! = " + k);
    }
}