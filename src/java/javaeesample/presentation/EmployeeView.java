/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javaeesample.presentation;

import java.util.List;
import javaeesample.entity.Employee;
import javaeesample.entity.EmployeeFacade;
import javax.ejb.EJB;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

/**
 *
 * @author zephiransas
 */
@Named(value="employeeView")
@RequestScoped
public class EmployeeView {
   
    @EJB
    private EmployeeFacade employeeFacade;
    
    public List<Employee> all() {
        return employeeFacade.findAll();
    }
    
}
