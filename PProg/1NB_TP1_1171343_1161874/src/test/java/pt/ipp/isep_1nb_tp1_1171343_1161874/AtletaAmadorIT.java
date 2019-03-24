/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pt.ipp.isep_1nb_tp1_1171343_1161874;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Ignore;

/**
 *
 * @author ssilv
 */
public class AtletaAmadorIT {
    
    public AtletaAmadorIT() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getValorPremios method, of class AtletaAmador.
     */
    @Ignore
    public void testGetValorPremios() {
        System.out.println("getValorPremios");
        AtletaAmador instance = new AtletaAmador();
        float expResult = 0.0F;
        float result = instance.getValorPremios();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setValorPremios method, of class AtletaAmador.
     */
    @Ignore
    public void testSetValorPremios() {
        System.out.println("setValorPremios");
        float valorPremios = 0.0F;
        AtletaAmador instance = new AtletaAmador();
        instance.setValorPremios(valorPremios);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPercentParcelaVariavelDois method, of class AtletaAmador.
     */
    @Ignore
    public void testGetPercentParcelaVariavelDois() {
        System.out.println("getPercentParcelaVariavelDois");
        AtletaAmador instance = new AtletaAmador();
        float expResult = 0.0F;
        float result = instance.getPercentParcelaVariavelDois();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPercentParcelaVariavelDois method, of class AtletaAmador.
     */
    @Ignore
    public void testSetPercentParcelaVariavelDois() {
        System.out.println("setPercentParcelaVariavelDois");
        float percentParcelaVariavelDois = 0.0F;
        AtletaAmador instance = new AtletaAmador();
        instance.setPercentParcelaVariavelDois(percentParcelaVariavelDois);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getValorParcelaVariavelDois method, of class AtletaAmador.
     */
    @Ignore
    public void testGetValorParcelaVariavelDois() {
        System.out.println("getValorParcelaVariavelDois");
        AtletaAmador instance = new AtletaAmador();
        float expResult = 0.0F;
        float result = instance.getValorParcelaVariavelDois();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setValorParcelaVariavelDois method, of class AtletaAmador.
     */
    @Ignore
    public void testSetValorParcelaVariavelDois() {
        System.out.println("setValorParcelaVariavelDois");
        float valorFixoParcelaVariavelDois = 0.0F;
        AtletaAmador instance = new AtletaAmador();
        instance.setValorParcelaVariavelDois(valorFixoParcelaVariavelDois);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getContadorAtletaAmador method, of class AtletaAmador.
     */
    @Ignore
    public void testGetContadorAtletaAmador() {
        System.out.println("getContadorAtletaAmador");
        AtletaAmador instance = new AtletaAmador();
        int expResult = 0;
        int result = instance.getContadorAtletaAmador();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of calcularFreqCardTrabGordura method, of class AtletaAmador.
     */
    @Ignore
    public void testCalcularFreqCardTrabGordura() {
        System.out.println("calcularFreqCardTrabGordura");
        AtletaAmador instance = new AtletaAmador();
        float expResult = 0.0F;
        float result = instance.calcularFreqCardTrabGordura();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of calcularFreqCardTrabCardio method, of class AtletaAmador.
     */
    @Ignore
    public void testCalcularFreqCardTrabCardio() {
        System.out.println("calcularFreqCardTrabCardio");
        AtletaAmador instance = new AtletaAmador();
        float expResult = 0.0F;
        float result = instance.calcularFreqCardTrabCardio();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of calcularValorMensal method, of class AtletaAmador.
     */
    @Test
    public void testCalcularValorMensal() {
        System.out.println("calcularValorMensal");
        AtletaAmador instance = new AtletaAmador(null, 0, null, 0, null, 0, 10, 200);
        float expResult = 23.0F;
        
        float result = instance.calcularValorMensal();
        assertEquals(expResult, result, 0.0);
        
    }

    /**
     * Test of toString method, of class AtletaAmador.
     */
    @Ignore
    public void testToString() {
        System.out.println("toString");
        AtletaAmador instance = new AtletaAmador();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
