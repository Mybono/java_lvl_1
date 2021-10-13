/** Java lvl 1. Homework 3
* @author Artur
* @version 13.10.2021
*/

class hw3 {
    public static void main(String[] args) {
        int[] replaceValues = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0}; 
        int[] multiplyOn2 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};

        System.out.println("Task 1: ");
        task1(replaceValues);
        System.out.println("\nTask 2: ");
        task2(100);
        System.out.println("\nTask 3: ");
        task3(multiplyOn2);
        System.out.println("\nTask 4: ");
        task4();
        System.out.println("\nTask 5: ");
        task5(2, 3);
        // System.out.println("\nTask 6: ");
        // task6();
    }

/** Task 1
 * 1. Задать целочисленный массив, состоящий из элементов 0 и 1. 
 * Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ]. 
 * С помощью цикла и условия заменить 0 на 1, 1 на 0;
 */
    public static void task1(int[] replaceValues) {
        for (int i = 0; i < replaceValues.length; i++) {
            replaceValues[i] = (replaceValues[i] > 0)? 0 : 1;
            System.out.print(replaceValues[i] + " ");
        }
    }

/** Task 2
 *2. Задать пустой целочисленный массив длиной 100. 
 * С помощью цикла заполнить его значениями 1 2 3 4 5 6 7 8 … 100; 
 */
    public static void task2(int size) {
        int[] fillArr = new int[size];
        for (int i = 0; i < fillArr.length; i++) {
            fillArr[i] = i + 1;
            System.out.print(fillArr[i] + " ");
        }
    }

/** Task 3
 * Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] 
 * пройти по нему циклом, и числа меньшие 6 умножить на 2;
 */
    public static void task3(int[] multiplyOn2) {
        for (int i = 0; i < multiplyOn2.length; i++) {
            if (multiplyOn2[i] < 6) {
                multiplyOn2[i] = multiplyOn2[i] * 2;
            }
            System.out.print(multiplyOn2[i] + " ");
        }
    }

/** Task 4
 * 4. Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое),
 *  и с помощью цикла(-ов) заполнить его диагональные элементы единицами 
 * (можно только одну из диагоналей, если обе сложно). 
 * Определить элементы одной из диагоналей можно по следующему принципу:
 *  индексы таких элементов равны, то есть [0][0], [1][1], [2][2], …, [n][n];
 */

    public static void task4() {
        int[][] arr = new int[3][3];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0, x = arr[i].length - 1; j < arr[i].length; j++, x--) {
                if (i == j || i == x) arr[i][j] = 1;
                else arr[i][j] = 0;
                System.out.print(arr[i][j] + " ");
            }
            System.out.print("\n");
        }
    }

/** Task 5
 * 5. Написать метод, принимающий на вход два аргумента: len и initialValue,
 *  и возвращающий одномерный массив типа int длиной len, каждая ячейка которого 
 *  равна initialValue;
 */

    public static void task5(int len, int initialValue){
        int[] arr = new int[len];
        for (int i = 0; i < len; i++) {
            arr[i] = initialValue;
            System.out.print("[" + i + "]" + arr[i] + " ");
        }
    }

}