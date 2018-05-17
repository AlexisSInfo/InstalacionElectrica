/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author dci
 */
public class Aparato {

    public double consumo;
    private double consumoPasivo;
    private boolean encendido;
    private String nombre;
    private String modelo;

    public Aparato(double consumo, double consumoPasivo, String nombre, String modelo) {
        this.consumo = consumo;
        this.consumoPasivo = consumoPasivo;
        this.nombre = nombre;
        this.modelo = modelo;
        this.encendido = false;
    }

    public Aparato() {
    }

    public double getConsumo() {
        return consumo;
    }

    public void setConsumo(double consumo) {
        this.consumo = consumo;
    }

    public void encender() {

        if (!encendido) {
            this.encendido = true;
        }
    }

    public double obtenerConsumo() {
        return this.consumo;
    }

    public String getNombre() {
        return nombre;
    }

}
