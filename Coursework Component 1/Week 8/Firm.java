package Java_Coursework;
public class Firm {
    public static void main(String[] args) {
        // Create employees of different types
        Employee[] staff = new Employee[4];

        staff[0] = new Executive("Alice", 90000);
        staff[1] = new Staff("Bob", 50000);
        staff[2] = new Hourly("Charlie", 20.5);
        staff[3] = new Volunteer("Diana");

        // Print vacation days for each employee
        System.out.println("--- Vacation Days for Employees ---");
        for (Employee emp : staff) {
            System.out.println(emp.getName() + " (" + emp.getClass().getSimpleName() +
                               ") has " + emp.getVacationDays() + " vacation days.");
        }
    }

    // Abstract Employee class
    public static abstract class Employee {
        protected String name;
        protected int vacationDays;

        public Employee(String name) {
            this.name = name;
            this.vacationDays = 0; // default
        }

        public String getName() {
            return name;
        }

        public int getVacationDays() {
            return vacationDays;
        }
    }

    // Executive class
    public static class Executive extends Employee {
        private double salary;

        public Executive(String name, double salary) {
            super(name);
            this.salary = salary;
            this.vacationDays = 30; // Executives get 30 days
        }
    }

    // Staff class
    public static class Staff extends Employee {
        private double salary;

        public Staff(String name, double salary) {
            super(name);
            this.salary = salary;
            this.vacationDays = 15; // Staff get 15 days
        }
    }

    // Hourly class
    public static class Hourly extends Employee {
        private double rate;

        public Hourly(String name, double rate) {
            super(name);
            this.rate = rate;
            this.vacationDays = 10; // Hourly employees get 10 days
        }
    }

    // Volunteer class
    public static class Volunteer extends Employee {
        public Volunteer(String name) {
            super(name);
            this.vacationDays = 0; // Volunteers get no vacation
        }
    }
}
