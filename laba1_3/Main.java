import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int result;
        char oper;
        System.out.print("Введите первое число: ");
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        System.out.print("Введите второе число: ");
        int b = in.nextInt();
        System.out.println("Выберите операцию + - * / ");
        oper = in.next().charAt(0);
        in.close();
        switch (oper){
            case '+':
                result = a + b;
                System.out.print("Результат сложения: " + result);
                break;
            case '-':
                result = a - b;
                System.out.print("Результат вычитания: " + result);
                break;
            case '*':
                result = a * b;
                System.out.print("Результат умножения: " + result);
                break;
            case '/':
                result = a / b;
                System.out.print("Результат деления: " + result);
        }
    }
}