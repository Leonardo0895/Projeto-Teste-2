/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package desafio2.imposto;

import desafio2.Imposto;

/**
 *
 * @author Marcos Escritório
 */
public class Ipi implements Imposto {

    @Override
    public double calcularImposto(double valor) {
        return valor * 0.6;
    }
    
}
