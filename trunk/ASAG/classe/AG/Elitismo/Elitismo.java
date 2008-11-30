/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package AG.Elitismo;

import AG.Populacao.Populacao;
import Interfaces.CromossomoAbstrato;
import java.util.Collections;

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
    public static <T extends CromossomoAbstrato<T>> Populacao<T> Elitismo(double taxaElitismo, Populacao<T> populacao) throws InstantiationException, ClassNotFoundException, IllegalAccessException{
    
        
        Populacao<T> tempPopulacao = new Populacao<T>(populacao.getParametros(), true);

        while (populacao.getParametros().getTaxaElitismo() > ((double) tempPopulacao.size() / (double) populacao.getParametros().getTamanhoPopulacao())) {
                    
                    tempPopulacao.add((T) Collections.max(populacao).clone());
                    populacao.remove((T) Collections.max(populacao));
                }
        return tempPopulacao;
        
    }
    
}
