class Employee {
    private String name;
    private String position;
    private String email;
    private String phone;
    private int salary;
    private int age;

    int getAge() {
        return age;
    }

    Employee(String name, String position, String email, String phone, int salary, int age) {
        this.name = name;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }

    void print() {
        System.out.println("Name: " + name + " | " + " Position: " + position + " | " + " e-mail: " + email + " | "
                + " Phone: " + phone + " | " + " Salary: " + salary + " | " + " Age: " + age);

    }
    // public String toString() {
    // return name + " | " + position + " | " + email + " | " + phone + " | " +
    // salary + " | " + age;
}
