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
public class IssTest {
    
    public IssTest() {
    }

    @Test
    public void testCalcularImposto() {
        System.out.println("calcular iss teste");
        
        Iss iss = new Iss();
        double valor = 10.0;
        double expResult = 4.0;
        double result = iss.calcularImposto(valor);
        assertEquals(expResult, result, 0.0);
        
        fail("falha");
    }
    
}
