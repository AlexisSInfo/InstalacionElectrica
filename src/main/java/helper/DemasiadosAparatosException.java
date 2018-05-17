/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helper;

/**
 *
 * @author dci
 */
public class DemasiadosAparatosException extends Exception{

    public DemasiadosAparatosException() {
    }

    public String lanzarMensaje() {
        String texto = "Existen demasiados aparatos conectados";
        return texto;
    }
}
