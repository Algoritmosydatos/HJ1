/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Darwin Rivas
 */
public class RadiodecarroTest {
    
    public RadiodecarroTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
     

    }
    
    @AfterClass
    public static void tearDownClass() {
        
        
    }

    /**
     * Test of setEstado method, of class Radiodecarro.
     */
    @Test
    public void testSetEstado() {
        System.out.println("setEstado");
        boolean nEstado = false;
        Radiodecarro instance = new Radiodecarro();
        instance.setEstado(nEstado);
       
    }

    /**
     * Test of getEstado method, of class Radiodecarro.
     */
    @Test
    public void testGetEstado() {
        System.out.println("getEstado");
        Radiodecarro instance = new Radiodecarro();
        boolean expResult = false;
        boolean result = instance.getEstado();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of setAMFM method, of class Radiodecarro.
     */
    @Test
    public void testSetAMFM() {
        System.out.println("setAMFM");
        int banda = 0;
        Radiodecarro instance = new Radiodecarro();
        instance.setAMFM(banda);
        
    }

    /**
     * Test of getAMFM method, of class Radiodecarro.
     */
    @Test
    public void testGetAMFM() {
        System.out.println("getAMFM");
        Radiodecarro instance = new Radiodecarro();
        int expResult = 0;
        int result = instance.getAMFM();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of sintonizar method, of class Radiodecarro.
     */
    @Test
    public void testSintonizar() {
        System.out.println("sintonizar");
        boolean ud = false;
        Radiodecarro instance = new Radiodecarro();
        instance.sintonizar(ud);
        
    }

    /**
     * Test of guardar method, of class Radiodecarro.
     */
    @Test
    public void testGuardar() {
        System.out.println("guardar");
        int pos = 1;
        Radiodecarro instance = new Radiodecarro();
        instance.guardar(pos);
       
    }

    /**
     * Test of memoria method, of class Radiodecarro.
     */
    @Test
    public void testMemoria() {
        System.out.println("memoria");
        int pos = 1;
        Radiodecarro instance = new Radiodecarro();
        instance.memoria(pos);
      
    }

    /**
     * Test of getEmisora method, of class Radiodecarro.
     */
    @Test
    public void testGetEmisora() {
        System.out.println("getEmisora");
        Radiodecarro instance = new Radiodecarro();
        float expResult = 530.00f;
        float result = instance.getEmisora();
        assertEquals(expResult, result, 0.0);
       
    }
}