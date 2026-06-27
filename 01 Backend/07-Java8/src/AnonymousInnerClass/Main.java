package AnonymousInnerClass;

public class Main {
    public static void main(String[] args) {
//        Employee employee = new SoftwareEngineer();
//        System.out.println(employee.getSalary());

        Employee employee = new Employee() {
            @Override
            public String getSalary() {
                return "100";
            }

            @Override
            public String getDesignation() {
                return "Editor";
            }
        };

        System.out.println(employee.getSalary());
        System.out.println(employee.getDesignation());
    }
}
