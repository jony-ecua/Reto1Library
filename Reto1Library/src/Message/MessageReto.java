/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Message;

import User.User;
import java.io.Serializable;

/**
 * Clase para definir los enum
 * @author Jonathan Viñan
 */
public class MessageReto implements Serializable{
    
    private User user;
    private Type type;
    
    public void setUser (User user){
        this.user = user;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public User getUser() {
        return user;
    }

    public Type getType() {
        return type;
    }
    
}

