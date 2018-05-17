/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import helper.DemasiadosAparatosException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author dci
 */
public class InstalacionElectricaTest {
    
    private InstalacionElectrica ia;
    
    @Before
    public void setUp() {
        ia = new InstalacionElectrica();
       // Aparato a1 = new Aparato(0, 0, nombre, modelo);
        
        
    }
    
    @After
    public void tearDown() {
        ia = null;
    }
    
    @Test(expected = DemasiadosAparatosException.class)
    public void verificarExcepcion(){
    
        Aparato a1 = new Aparato();
        a1.setConsumo(3500);
        Aparato a2 = new Aparato();
        a2.setConsumo(1500);
        
        this.ia.conectarAparato(a1);
        this.ia.conectarAparato(a2);
 
    }
    
    @Test
    public void testConsumoAparatos(){
        double consumoEsperado;
        double consumoReal = 2510;
        
        Aparato a1 = new Aparato(1000, 0, "plancha", "modelo");
        Aparato a2 = new Aparato(750, 0, "apiradora", "modelo");
        Aparato a3 = new Aparato(760, 0, "televisor", "modelo");
        
        this.ia.conectarAparato(a1);
        this.ia.conectarAparato(a2);
        this.ia.conectarAparato(a3);

        consumoEsperado = (a1.getConsumo()+ a2.getConsumo()+ a3.getConsumo());
        assertEquals(consumoReal, consumoEsperado, 0.01);
        
    }
    
}
