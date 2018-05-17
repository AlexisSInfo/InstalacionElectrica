/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import helper.DemasiadosAparatosException;

import java.util.ArrayList;

/**
 *
 * @author dci
 */
public class InstalacionElectrica {

    private final ArrayList<Aparato> ap;
    public double consumoTotal;

    public InstalacionElectrica() {
        this.ap = new ArrayList<>();
        this.consumoTotal = 0.0;
    }

    public void conectarAparato(Aparato aparato) {
        System.out.println("Conectando aparato " + aparato.getConsumo());
        this.ap.add(aparato);
    }

    public void calcularConsumoTotal() {

        for (Aparato a : this.ap) {
            this.consumoTotal += a.getConsumo();
        }

    }
    
    public void encenderAparato(int posicion) throws NullPointerException{
        if (posicion>ap.size()) {
            throw new NullPointerException();
        }else{
            Aparato aparato = this.ap.get(posicion);
            aparato.encender();
            this.ap.set(posicion, aparato);
        }
    }

    public void apagarAparato(int posicion) throws NullPointerException{
        if (posicion>ap.size()) {
            throw new NullPointerException();
        }else{
            Aparato aparato = this.ap.get(posicion);
            aparato.apagar();
            this.ap.set(posicion, aparato);
        }
    }
    
    public double obtenerConsumoTotal() throws DemasiadosAparatosException {

        if (this.consumoTotal > 4000) {
            throw new DemasiadosAparatosException();
        } else {
            return this.consumoTotal;
        }
    }

}
