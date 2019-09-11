package user;

import java.util.List;

public class Employee extends User {

    private String employeeId;


    public Employee(String username, String password, String employeeId){
    super(username,password);
    this.employeeId = employeeId;
}

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }
}
