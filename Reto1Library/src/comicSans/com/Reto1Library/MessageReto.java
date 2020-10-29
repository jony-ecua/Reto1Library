/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comicSans.com.Reto1Library;

import comicSans.com.Reto1Library.User.User;
import java.io.Serializable;

/**
 * Clase que define los diferentes estados de un proceso X.
 * @author Jonathan Viñan
 */

public class MessageReto implements Serializable{
    
    private static final long serialVersionUID = 1646384092668845627L;
   
    private User user;
    public String nombre;
    public Type type;
    
    public void setUser(User aux) {
        this.user = aux;
    }

    public void setNmbre(String aux) {
        this.nombre = nombre;
    }

    public User getUser() {
        return user;
    }

    public String getNombre() {
        return nombre;
    }

    public Type getType() {
        return type;
    }
  
    
}

