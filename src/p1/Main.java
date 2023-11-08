package p1;

public class Main {
    public static void main(String[] args) {

        int[] mas = {1,2,3,4}; //  одномерный массив

        int[][] mas2 = new int[3][3]; // двумерный массив 3 на 3
        for (int i = 0; i < mas2.length; i++) {    // цикл
            for (int j = 0; j < mas2[i].length; j++) {  // второй цикл внутри первого - вложенный цикл с элементом i
                mas2[i][j] = (int)(Math.random()*100);  // от 0 до 100
            }
        }

        for (int i = 0; i < mas2.length; i++) {

            for (int j = 0; j < mas2[i].length; j++) {
                System.out.print(mas2[i][j] + " "); // распечатывем массив
            }
            System.out.println();
        }

        int[][] numbers = {     // Можно заполнить по другому массив, каждая строка отдельная строка элементов
                {1,2,3},
                {4,5},
                {7}
        };


    }
}