/**
 * Java 1. Homework 5
 * 
 * @author Artur
 * @version 20.10.2021
 */

class Lesson5 {
    public static void main(String[] args) {
        Employee[] employeeArray = new Employee[5];
        employeeArray[0] = new Employee("Ivanov Ivan", "Engineer", "java1@mail.ru", "892312312", 30000, 30);
        employeeArray[1] = new Employee("Ivanov Pike", "Engineer", "java2@mail.ru", "892312313", 30000, 41);
        employeeArray[2] = new Employee("Ivanov Like", "Engineer", "java3@mail.ru", "892312314", 30000, 41);
        employeeArray[3] = new Employee("Ivanov Mike", "Engineer", "java4@mail.ru", "892312315", 30000, 30);
        employeeArray[4] = new Employee("Ivanov Nike", "Engineer", "java5@mail.ru", "892312316", 30000, 30);

        for (int i = 0; i < employeeArray.length; i++) {
            if (employeeArray[i].getAge() > 40) {
                employeeArray[i].print();
                // System.out.println(toString());
            }
        }
    }
}