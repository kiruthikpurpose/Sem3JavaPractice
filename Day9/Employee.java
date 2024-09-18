class Employee {
    private String name;
    private int id;
    private Department department;

    public Employee(String name, int id, String deptName, String location) {
        this.name = name;
        this.id = id;
        this.department = new Department(deptName, location);
    }

    class Department {
        private String deptName;
        private String location;

        public Department(String deptName, String location) {
            this.deptName = deptName;
            this.location = location;
        }

        public String getDepartmentDetails() {
            return "Department: " + deptName + ", Location: " + location;
        }
    }

    public String getEmployeeDetails() {
        return "Employee Name: " + name + ", ID: " + id + ", " + department.getDepartmentDetails();
    }

    public static void main(String[] args) {
        Employee employee1 = new Employee("Alice", 101, "HR", "New York");
        System.out.println(employee1.getEmployeeDetails());

        Employee employee2 = new Employee("Bob", 102, "IT", "San Francisco");
        System.out.println(employee2.getEmployeeDetails());

        Employee employee3 = new Employee("Charlie", 103, "Finance", "Chicago");
        System.out.println(employee3.getEmployeeDetails());
    }
}
