/** Java 2. Homework 2
* 
* @author Artur
* @version 10.10.2021
*/

class lesson2 {
    public static void main(String[] args) {
        System.out.println("Task 1: " + (isRangeSum(11, 10)? "true" : "false"));
        // System.out.println(compareNumbers(9)? "Positive" : "Negative"));
        compareNumbers(); 
        System.out.println("Task 3: " + (task3(-1)? "true" : "false"));
        printLine("Hi", 2);
        // System.out.println(printLine("Hi", 2));
        System.out.println("Task 5: " + (doleapYear(2024)));
    }
/** task.1
* Написать метод, принимающий на вход два целых числа и проверяющий,
* что их сумма лежит в пределах от 10 до 20 (включительно),
* если да – вернуть true, в противном случае – false.
*/ 
    static boolean isRangeSum(int a, int b) {
        int res = a + b;
        return res > 9 && res < 21;
    }

/** task.2
* Написать метод, которому в качестве параметра передается целое число,
* метод должен напечатать в консоль, положительное ли число передали
* или отрицательное. Замечание: ноль считаем положительным числом.
*/
    static void compareNumbers() {
        int a = 9;
        if (a >= 0) {
            System.out.println("Task 2: " + a + " is positive");
        } else {
            System.out.println("Task 2: " + a + " is negative");
        }
    }
        
/** task.3
* 3. Написать метод, которому в качестве параметра передается целое число.
* Метод должен вернуть true, если число отрицательное, 
* и вернуть false если положительное.
*/
    static boolean task3(int c) {
        return c <= 0;
    }

/** task.4
* Написать метод, которому в качестве аргументов передается строка
* и число, метод должен отпечатать в консоль указанную строку,
* указанное количество раз;
*/
    static void printLine(String line, int n) {
        for (int i = 0; i < n; i++)
            System.out.println("Task 4: " + line);
    }
/** task.5
* Написать метод, который определяет, является ли год високосным,
* и возвращает boolean (високосный - true, не високосный - false). 
* Каждый 4-й год является високосным, кроме каждого 100-го, 
* при этом каждый 400-й – високосный.
*/
    static boolean doleapYear(int year) {
        return year % 100 != 0 && year % 4 == 0 || year % 400 ==0;
    }
}
