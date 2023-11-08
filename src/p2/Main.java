package p2;

public class Main {

    public static void main(String[] args) {
        String test = test(); // к методу со String
        superTest();  // к методу 2
        superTest();
        // sum(10, 20);  // К методу 3
        int a = sum(10, 20);  // К методу 4
        int b = sum(a, 12); // К методу 4 смогли отдать сюда - int a - на подсчёт
        System.out.println(b);
        //sums("Array",1,2,3); //  К методу 5 напечатает Array сумма
       // sums("Array") к методу 5
        int[] ar = {1,2,3}; // к  методу 6  подходит
        sums("Array", ar); // к  методу 6  подходит
        System.out.println(dayTime(15)); //метод 7
        dayTime("test", 10); // метод 9
    }

    public static String test(){ // это возвращаемый метод String c return
        return "";
    }

    public static void superTest(){ // это возвращаемый метод 2
        System.out.println("Super");
    }

   /* public static int sum(int x, int y){  // Метод 3 У методов могут быть параметры sum(int x, int y)
        int z = x + y;
        System.out.println(z);*/

    public static int sum(int x, int y){  // Метод 4 У методов могут быть параметры sum(int x, int y)
        int z = x + y;
        System.out.println(z);
        return z;
    }

    /* public static void sums(int ...nums){ // Метод 5 переменной длины( набор чисел и вычислить их сумму) три точки это указывает что будет необязательным может быть массив
        int sum = 0;
        for (int el:nums){  // цикл по массиву
            sum += el;  // необязательный параметр в конце указывается
        }
        System.out.println(message + " " + sum); напечатает Array 0
    */

    public static void sums(String message, int ...nums){ // Метод 6 переменной длины( набор чисел и вычислить их сумму)
        int sum = 0;
        for (int el:nums){
            sum += el;
        }
        System.out.println(message + " " + sum);
    }

    static String dayTime(int hour){ // Метод 7
        if ((hour>24) || (hour<0)) return "ERROR";
        else if (hour >6 && hour<11) return "Morning";
        else return "I dont know";
    }

    static String dayTime(short hour){   //Метод 8
        if ((hour>24) || (hour<0)) return "ERROR";
        else if (hour >6 && hour<11) return "Morning";
        else return "I dont know";
    }

    static void dayTime(String mes, int hour){  // метод 9
        if ((hour>24) || (hour<0)) return;
        else if (hour >6 && hour<11) System.out.println("Morning");
        else System.out.println("I dont know");
    }
}
