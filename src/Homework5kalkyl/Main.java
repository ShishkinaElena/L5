package Homework5kalkyl;
/*ДЗ доработать калькулятор на использование методов,
разнести функционал по методам: сумма отдельно, разность отдельно и т.д
Выполнить запрос новых данных в бесконечный цикл*/



import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        for (; ; ) {
            a();
            int a = scanner.nextInt();
            b();
            int b = scanner.nextInt();
            d();
            int d = scanner.nextInt();

            if (d == 1) {
                sums(a, b);
            } else if (d == 2) {
                differences(a, b);
            } else if (d == 3) {
                multipliers(a, b);
            } else if (d == 4) {
                divisions(a, b);

            } else if (d>4 || d<0){
                System.out.println("ERROR");
            }
            continue;
        }
    }
    static void a() {
        System.out.print("Введите первое число: ");
    }
    static void b() {
        System.out.print("Введите второе число: ");
    }
    static void d() {
        System.out.print("Введите число-действие от 1 до 4 соответственно '+' '-' '*' '/': ");
    }
    public static void sums(int a, int b) {
        System.out.println("Сумма=  " + (a + b));
    }
    public static void differences(int a, int b) {
        System.out.println("Разность = " +  (a - b));
    }
    public static void multipliers(int a, int b) {
        System.out.println("Произведение = " + ( a * b));
    }
    public static void divisions(int a, int b) {
        System.out.println("Частное = " + ((double) a / (double) b));
    }
}
















