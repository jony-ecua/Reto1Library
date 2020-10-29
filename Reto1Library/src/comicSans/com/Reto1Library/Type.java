/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comicSans.com.Reto1Library;

/**
 *
 * @author jonyv
 */
public enum Type {
    
    SIGN_IN, //Para el proceso de inicio seccion
    SIGN_UP, //Para el proceso de registrado en la bda
    LOGOUT,  //Para el proceso de salida del usuario del programa
    ERROR_USER_EXIST, //Para el proceso comprobar el usuario ya existe
    ERROR_USER_NOT_EXIST,//Para el proceso de comprobar que el usuario no existe
    ERROR_PASSWORD;    //Para el proceos de comprobar la contraseña no es correcta   
       
}
