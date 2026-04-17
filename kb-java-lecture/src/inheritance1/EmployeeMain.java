package inheritance1;

public class EmployeeMain {
    public static void main(String[] args) {
        Employee e = new Employee();
        e.gotoWork();
        e.getSalary();

        System.out.println();

        Intern i = new Intern();
        i.gotoWork();
        i.getSalary();
        i.threeMonthLater();

        System.out.println();

        Manager m = new Manager();
        m.gotoWork();
        m.getSalary();
        m.oneYearLater();

        System.out.println();

        Assistant a = new Assistant();
        a.gotoWork();
        a.getSalary();
        a.sixMothLater();
    }
}
