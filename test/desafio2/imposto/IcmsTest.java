/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package desafio2.imposto;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Marcos Escritório
 */
public class IcmsTest {
    
    public IcmsTest() {
    }
   
    @Test
    public void testCalcularImposto() {
        System.out.println("calcular icms teste");
        
        Icms icms = new Icms();
        double valor = 10.0;
        double expResult = 1.2;
        double result = icms.calcularImposto(valor);
        assertEquals(expResult, result);
        
        fail("Falha");
    }
    
}
