/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clientDaoInterface;

import user.User;

/**
 *
 * @author xabig
 */
public interface Signable {
    
    public void signUp(User user);
    public void signIn(User user);
}
