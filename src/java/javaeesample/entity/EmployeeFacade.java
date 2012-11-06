/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javaeesample.entity;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author zephiransas
 */
@Stateless
public class EmployeeFacade extends AbstractFacade<Employee> {

    @PersistenceContext
    private EntityManager em;

    public EmployeeFacade() {
        super(Employee.class);
    }    
    
    @Override
    protected EntityManager getEntityManager() {
        return this.em;
    }
    
}
