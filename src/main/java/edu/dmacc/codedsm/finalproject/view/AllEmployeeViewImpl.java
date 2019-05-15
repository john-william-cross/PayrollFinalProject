package edu.dmacc.codedsm.finalproject.view;

import edu.dmacc.codedsm.finalproject.model.Employee;
import edu.dmacc.codedsm.finalproject.controller.EmployeeController;

import java.util.Collections;
import java.util.List;

public class AllEmployeeViewImpl implements EmployeeView{
    private List<Employee> employees;
    EmployeeViewImpl employeeView = new EmployeeViewImpl();

    public void display() {
        for (Employee employee : EmployeeController.gatherEmployees()) {
            employeeView.setEmployee(employee);
            employeeView.display();

        }

    }

    public void setEmployees( List <Employee> employees ) {
        this.employees = employees;

    }
}