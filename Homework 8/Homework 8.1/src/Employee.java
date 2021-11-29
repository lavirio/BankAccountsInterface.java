public class Employee {
    String name;
    String employeeID;
    String company;

    public Employee(String name, String employeeID, String company) {
        this.name = name;
        this.employeeID = employeeID;
        this.company = company;
    }

    public String getName() {
        return name;
    }

    public String getEmployeeID() {
        return  employeeID;
    }

    public String getCompany() {
        return company;
    }
}
