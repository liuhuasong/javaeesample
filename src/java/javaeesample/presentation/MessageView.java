/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javaeesample.presentation;

import java.util.Date;
import java.util.List;
import javaeesample.entity.Message;
import javaeesample.entity.MessageFacade;
import javax.ejb.EJB;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;

/**
 *
 * @author zephiransas
 */
@Named(value = "MessageView")
@RequestScoped
public class MessageView {

    @EJB
    private MessageFacade messageFacade;
    
    private Message message;
    
    private Date date;

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
    
    /**
     * Creates a new instance of MessageView
     */
    public MessageView() {
        this.message = new Message();
    }
    
    public Message getMessage() {
        return this.message;
    }
    
    public String postMessage() {
        String value = date == null ? "" : date.toString();
        message.setMessage(message.getMessage() + value);
        messageFacade.create(message);
        
        date = null;
        message.setMessage("");
        
        return "index";
    }
    
    public int getNumberOfMessage() {
        return messageFacade.findAll().size();
    }
    
    public List<Message> all() {
        return messageFacade.findAll();
    }
    
}
