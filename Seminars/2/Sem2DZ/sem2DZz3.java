//Реализовать простой калькулятор
// Введите первое число: 12
// Введите операцию: +
// Введите второе число: 1
// Ответ: 13
import java.util.Scanner;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class sem2DZz3 {
    public static void main(String[] args) {
        String str = "";
        String fileStr = "calculatorLog.txt";
        File file = new File(fileStr);
        

        Scanner iScanner = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        int num1 = iScanner.nextInt();
        str = Integer.toString(num1);
        calcLog(str, file);
        System.out.print("Введите операцию: ");
        String oper = iScanner.next();
        str = oper;
        calcLog(str, file);
        System.out.print("Введите второе число: ");
        int num2 = iScanner.nextInt();
        iScanner.close();
        str = Integer.toString(num2);
        calcLog(str, file);
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
        //System.out.printf("Ответ: %d", num1, " ", oper, " ", num2, " = ", res);
        System.out.printf("%d %s %d = %d", num1, oper, num2, res);
        str = "=";
        calcLog(str, file);
        str = Integer.toString(res);
        calcLog(str, file);
        str = "\n";
        calcLog(str, file);
    }
    public static void calcLog(String str, File file) {
        try{
            FileWriter writer = new FileWriter(file, true);
            writer.write(str);
            writer.close();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}