/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package AG.Elitismo;

import AG.Populacao.Populacao;
import Interfaces.CromossomoAbstrato;

/**
 *
 * @author Eriko Verissimo
 */
public class Elitismo {

    /**
     * 
     * @param <T>
     * @param taxaElitismo 
     * @param populacao 
     * @return
     */
    public static <T extends CromossomoAbstrato<T>> Populacao<T> Elitismo(double taxaElitismo, Populacao<T> populacao){
    
//        int j = 0;
//                while (true) {
//                    if (populacao.getParametros().getTaxaElitismo() <= ((double) tempPopulacao.size() / (double) parametros.getTamanhoPopulacao())) {
//                        break;
//                    }
//                    tempPopulacao.add((T) Collections.max(populacao).clone());
//                    populacao.remove((T) Collections.max(populacao));
//                    j++;
//                }
//        
        return populacao;
        
    }
    
}
