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
public class AtletaProfissionalIT {
    
    public AtletaProfissionalIT() {
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
     * Test of getValorParcelaFixa method, of class AtletaProfissional.
     */
    @Ignore
    public void testGetValorParcelaFixa() {
        System.out.println("getValorParcelaFixa");
        AtletaProfissional instance = new AtletaProfissional();
        float expResult = 0.0F;
        float result = instance.getValorParcelaFixa();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setValorParcelaFixa method, of class AtletaProfissional.
     */
    @Ignore
    public void testSetValorParcelaFixa() {
        System.out.println("setValorParcelaFixa");
        float valorParcelaFixa = 0.0F;
        AtletaProfissional instance = new AtletaProfissional();
        instance.setValorParcelaFixa(valorParcelaFixa);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getValorPremios method, of class AtletaProfissional.
     */
    @Ignore
    public void testGetValorPremios() {
        System.out.println("getValorPremios");
        AtletaProfissional instance = new AtletaProfissional();
        float expResult = 0.0F;
        float result = instance.getValorPremios();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setValorPremios method, of class AtletaProfissional.
     */
    @Ignore
    public void testSetValorPremios() {
        System.out.println("setValorPremios");
        float valorPremios = 0.0F;
        AtletaProfissional instance = new AtletaProfissional();
        instance.setValorPremios(valorPremios);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPercentParcelaVariavel method, of class AtletaProfissional.
     */
    @Ignore
    public void testGetPercentParcelaVariavel() {
        System.out.println("getPercentParcelaVariavel");
        float expResult = 0.0F;
        float result = AtletaProfissional.getPercentParcelaVariavel();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPercentParcelaVariavel method, of class AtletaProfissional.
     */
    @Ignore
    public void testSetPercentParcelaVariavel() {
        System.out.println("setPercentParcelaVariavel");
        float percentParcelaVariavel = 0.0F;
        AtletaProfissional.setPercentParcelaVariavel(percentParcelaVariavel);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getcontadorAtletaProfissional method, of class AtletaProfissional.
     */
    @Ignore
    public void testGetcontadorAtletaProfissional() {
        System.out.println("getcontadorAtletaProfissional");
        AtletaProfissional instance = new AtletaProfissional();
        int expResult = 0;
        int result = instance.getcontadorAtletaProfissional();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of calcularFreqCardTrabGordura method, of class AtletaProfissional.
     */
    @Ignore
    public void testCalcularFreqCardTrabGordura() {
        System.out.println("calcularFreqCardTrabGordura");
        AtletaProfissional instance = new AtletaProfissional();
        float expResult = 0.0F;
        float result = instance.calcularFreqCardTrabGordura();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of calcularFreqCardTrabCardio method, of class AtletaProfissional.
     */
    @Ignore
    public void testCalcularFreqCardTrabCardio() {
        System.out.println("calcularFreqCardTrabCardio");
        AtletaProfissional instance = new AtletaProfissional();
        float expResult = 0.0F;
        float result = instance.calcularFreqCardTrabCardio();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of calcularValorMensal method, of class AtletaProfissional.
     */
    @Test
    public void testCalcularValorMensal() {
        System.out.println("calcularValorMensal");
        AtletaProfissional instance = new AtletaProfissional(null, 0, null, 0, null, 0, 150, 500);
        float expResult = 250.0F;
        float result = instance.calcularValorMensal();
        assertEquals(expResult, result, 0.0);
        
    }

    /**
     * Test of toString method, of class AtletaProfissional.
     */
    @Ignore
    public void testToString() {
        System.out.println("toString");
        AtletaProfissional instance = new AtletaProfissional();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
