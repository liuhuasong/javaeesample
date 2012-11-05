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
public class MessageFacade extends AbstractFacade<Message> {
    
    @PersistenceContext(unitName = "javaeesamplePU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public MessageFacade() {
        super(Message.class);
    }
    
}
