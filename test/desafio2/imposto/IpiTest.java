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
public class IpiTest {
    
    public IpiTest() {
    }

    @Test
    public void testCalcularImposto() {
        System.out.println("calcular ipi teste");
        
        Ipi ipi = new Ipi();
        double valor = 10.0;
        double expResult = 6.0;
        double result = ipi.calcularImposto(valor);
        assertEquals(expResult, result);
        
        fail("Falha");
    }
    
}
