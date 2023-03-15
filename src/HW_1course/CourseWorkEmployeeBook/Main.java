package HW_1course.CourseWorkEmployeeBook;

public class Main {
    private static final Employee[] EMPLOYEES = new Employee[10];

//    private static final String[] NAMES = {"Иван", "Петр", "Вася"};
//    private static final String[] SURNAMES = {"Иванов", "Петров", "Васяков"};
//    private static final String[] PATRONYMIC_NAMES = {"Иванич", "Петрович", "Васильевич"};
    // private static final Random RANDOM = new Random(13);
   public static void main(String[] args) {
      // for (int i = 0; i < 7; i++) {
        //   EMPLOYEES(i) = generateEmployee();
       //}
        EMPLOYEES[0] = new Employee("Орлов Антоний Александрович", 2, 55000);
        EMPLOYEES[1] = new Employee("Волков Николай Петрович", 3, 33700);
        EMPLOYEES[2] = new Employee("Тигров Александр Николаевич", 5, 36400);
        EMPLOYEES[3] = new Employee("Безухов Алексей Александрович", 4, 39800);
        EMPLOYEES[4] = new Employee("Майоров Михаил Алексеевич", 1, 44000);
        EMPLOYEES[5] = new Employee("Птицын Сергей Генадьеевич", 2, 35555);
        EMPLOYEES[6] = new Employee("Королев Кадмий Ермолаевич", 5, 37200);
        EMPLOYEES[7] = new Employee("Субботов Артем Михайлович", 4, 46666);
        EMPLOYEES[8] = new Employee("Кузнецов Иван Иванович", 3, 35990);
        EMPLOYEES[9] = new Employee("Кураносов Пьер Абромович", 2, 38880);
        printEmployee();
        int totalSalaries = getTotalSalaries();
        System.out.println("Сумма затрат на зарплаты в месяц: " + totalSalaries + " рублей");
        Employee employeeWithMinSalary = findEmployeeWithMinSalary();
        System.out.println("Сотрудник с минимальной зарплатой - " + employeeWithMinSalary + " рублей");
        Employee employeeWithMaxSalary = findEmployeeWithMaxSalary();
        System.out.println("Сотрудник с максимальной зраплатой - " + employeeWithMaxSalary + " рублей");
        double averageSalary = findAverageSalary();
        System.out.println("Среднее значение зарплат: " + averageSalary + " рублей");
        printFullName();
    }
//    public static int[] generateRandomArray() {
//       java.util.Random random = new java.util.Random();
//       int[] arr = new int[30];
//       for (int i = 0; i < arr.length; i++) {
//           arr[i] = random.nextInt(100_000) + 100_000;
//       }
//       return arr;
//   }

//    private static Employee generateEmployee() {
//        String fullName = SURNAMES[RANDOM.nextInt(SURNAMES.length)] + " " +
//                NAMES[RANDOM.nextInt(NAMES.length)] + " " +
//                PATRONYMIC_NAMES[RANDOM.nextInt(PATRONYMIC_NAMES.length)];
//        return new Employee(
//                fullName,
//               RANDOM.nextInt(1, 6),
//               RANDOM.nextInt(50_000, 100_000)
//        );
//    }
    private static void printEmployee() {
        for (Employee employee : EMPLOYEES) {
            if (employee != null) {
                System.out.println(employee);
            }
        }
    }
    private static int getTotalSalaries() {
        int sum = 0;
        for (Employee employee : EMPLOYEES) {
            if (employee != null) {
                sum = sum + employee.getSalary();
            }
        }
        return sum;
    }
    private static Employee findEmployeeWithMinSalary() {
        int min = Integer.MAX_VALUE;
        Employee employeeWithMinSalary = null;
        for (Employee employee : EMPLOYEES) {
            if (employee != null && employee.getSalary() < min) {
                min = employee.getSalary();
                employeeWithMinSalary = employee;
                }
            }
        return employeeWithMinSalary;
    }
    private static Employee findEmployeeWithMaxSalary() {
        int max = Integer.MIN_VALUE;
        Employee employeeWithMaxSalary = null;
        for (Employee employee : EMPLOYEES) {
            if (employee != null && employee.getSalary() > max) {
                max = employee.getSalary();
                employeeWithMaxSalary = employee;
            }
        }
        return employeeWithMaxSalary;
    }
    private static double findAverageSalary() {
        int count = 0;
        for (Employee employee : EMPLOYEES) {
            if (employee != null) {
                count++;
            }
        }
        if (count != 0) {
            return (double) getTotalSalaries() / count;
        }
        return 0;
    }
    private static void printFullName() {
        for (Employee employee : EMPLOYEES) {
            if (employee != null)
                System.out.println(employee.getFullName());
        }
    }
}