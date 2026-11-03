public class Employee {
    private String name;
    private String position;
    private double salary;

    public Employee(String name, String position, double salary) {
        this.name = name;
        this.position = position;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        if(salary>0) {
            this.salary = salary;
        }
        else {
            return;
        }
    }

    public void raiseSalary(double percent) {
        this.salary += this.salary * (percent / 100.0);
    }

    public static void main(String[] args) {
        Employee employee = new Employee("Иван Иванов", "Разработчик", 100000.0);

        System.out.println("Текущая зарплата: " + employee.getSalary());

        employee.raiseSalary(10);

        System.out.printf("Новая зарплата: %.2f%n", employee.getSalary());
    }
}
