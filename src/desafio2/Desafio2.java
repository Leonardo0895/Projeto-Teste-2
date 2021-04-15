package desafio2;

import desafio2.imposto.Icms;
import desafio2.imposto.Ipi;
import desafio2.imposto.Iss;

/**
 *
 * @author Marcos Escritório
 */
public class Desafio2 {

    public static void main(String[] args) {
        
        Imposto impostoIcms = new Icms();
        Imposto impostoIpi = new Ipi();
        Imposto impostoIss = new Iss();
        
        double icms = impostoIcms.calcularImposto(10.0);
        System.out.println(icms);
        
        double ipi = impostoIpi.calcularImposto(10.0);
        System.out.println(ipi);
        
        double iss = impostoIss.calcularImposto(10.0);
        System.out.println(iss);

    }

}
