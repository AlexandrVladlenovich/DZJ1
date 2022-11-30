import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите первое число: ");
        double num1 = input.nextDouble();
        System.out.println("Введите действие: ");
        String oper = input.next();
        System.out.println("Введите второе число: ");
        double num2 = input.nextDouble();
        input.close();
        double res;
        switch (oper){
            case "+":
                res = num1 + num2;
                System.out.printf("%f %s %f = %f", num1, oper, num2, res);
                break;
            case "-":
                res = num1 - num2;
                System.out.printf("%f %s %f = %f", num1, oper, num2, res);
                break;
            case "*":
                res = num1 * num2;
                System.out.printf("%f %s %f = %f", num1, oper, num2, res);
                break;
            case "/":
                res = num1 / num2;
                System.out.printf("%f %s %f = %f", num1, oper, num2, res);
                break;
            default:
                System.out.print("Неверно введены данные");
                break;
        }
    }
}