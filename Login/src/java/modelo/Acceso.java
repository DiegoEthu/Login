/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author Juan Carlos
 */
public class Acceso {
    public String autentificar(String username, String password){
        String respuesta;
        if(username.equals("PROFESOR") && password.equals("TRENTINO")){
            respuesta = "Bienvenido";
        }else{
            respuesta = "Usuario incorrecto";
        }
        return respuesta;
    }
}
