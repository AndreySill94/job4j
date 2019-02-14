import java.util.Scanner;


public class Calc {


    //addition function
    static void addFunction(int a, int b) {
        System.out.println(a + b);
    }

    //substraction function
    static void subFunction(int a, int b) {
        System.out.println(a - b);
    }

    //multiple function
    static void multFunction(int a, int b) {
        System.out.println(a * b);
    }

    //division function
    static void divFunction(int a, int b) {
        if (!(b == 0)) {
            System.out.println(a / b);
        } else {
            System.out.println("Делить на ноль нельзя****!!!!");
        }
    }

    static void assemblyFunction() {
        Scanner scan = new Scanner(System.in);

        System.out.print("Пожалуйста, введите два числа: ");
        int number1 = scan.nextInt();
        System.out.print("Пожалуйста, введите второе число: ");
        int number2 = scan.nextInt();
        System.out.print("Пожалуйста, введите арифметическую операцию: ");
        System.out.println("+ / * -");
        String select = scan.next();

        if (select.equals("*")) {
            multFunction(number1, number2);
        } else if (select.equals("/")) {
            divFunction(number1, number2);
        } else if (select.equals("-")) {
            subFunction(number1, number2);
        } else if (select.equals("+")) {
            addFunction(number1, number2);
        } else {
            System.out.println("Неверное значение");
        }
    }

    public static void main(String[] args) {
        assemblyFunction();
    }
}
