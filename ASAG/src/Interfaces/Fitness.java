/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Interfaces;

import AG.Populacao.Populacao;


/**
 *
 * @param <T> 
 * @author Eriko Verissimo
 */
public interface Fitness<T extends CromossomoAbstrato<T>> {
    
    
    /**
     * 
     * @param populacao
     * @return
     */
    public Populacao<T> Avalia(Populacao<T> populacao);


}
