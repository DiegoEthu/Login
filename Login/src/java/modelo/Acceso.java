/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author diego tello
 */
public class Acceso {
    public Boolean autentificar(String username, String password){
        Boolean respuesta;
        if(username.equals("PROFESOR") && password.equals("CONTRASEÑA")){
            respuesta = true;
        }else{
            respuesta = false;
        }
        return respuesta;
    }
}
