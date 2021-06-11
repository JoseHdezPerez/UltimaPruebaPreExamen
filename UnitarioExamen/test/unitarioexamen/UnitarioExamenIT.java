/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unitarioexamen;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author josic
 */
public class UnitarioExamenIT {
    
    public UnitarioExamenIT() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of funcion method, of class UnitarioExamen.
     */
    @Test
    public void UnitarioExamen1(){
    
        UnitarioExamen ex = new UnitarioExamen();
        int expResult =0;
        int result = ex.funcion(1);
        assertEquals(expResult,result);
    
    
    }
     @Test
    public void UnitarioExamen2(){
    
        UnitarioExamen ex = new UnitarioExamen();
        int expResult =3;
        int result = ex.funcion(2);
        assertEquals(expResult,result);
    
    
    }
     @Test
    public void UnitarioExamen3(){
    
        UnitarioExamen ex = new UnitarioExamen();
        int expResult =9;
        int result = ex.funcion(3);
        assertEquals(expResult,result);
    
    
    }
}
