//Реализовать простой калькулятор
// Введите первое число: 12
// Введите операцию: +
// Введите второе число: 1
// Ответ: 13
import java.util.Scanner;
public class sem1DZz3 {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        int num1 = iScanner.nextInt();
        System.out.print("Введите операцию: ");
        String oper = iScanner.next();
        System.out.print("Введите второе число: ");
        int num2 = iScanner.nextInt();
        iScanner.close();
        int res = 0;
        switch (oper) {
            case "/":
                res = num1 / num2;
                break;
            case "*":
                res = num1 * num2;
                break;
            case "-":
                res = num1 - num2;
                break;
            case "+":
                res = num1 + num2;
                break;
        }
        // if (oper.equals("/")){
        //     res = num1 / num2;
        // }
        // else if (oper.equals("*")){
        //     res = num1 * num2;
        // }
        // else if (oper.equals("-")){
        //     res = num1 - num2;
        // }
        // else if (oper.equals("+")){
        //     res = num1 + num2;
        // }
        System.out.printf("Ответ: %d", res);
    }
}