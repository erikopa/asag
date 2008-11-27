/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package AG.Binario;



import AG.Populacao.Populacao;
import Interfaces.FitnessAbstrato;

/**
 *
 * @author Eriko Verissimo
 */
public class FitnessBinario extends FitnessAbstrato<CromossomoBinario>{
/**
     * 
     * @param populacao 
     * @return
     */
    public Populacao<CromossomoBinario> Avalia(Populacao<CromossomoBinario> populacao) {
        
        double temp=0;
        double temprel=0;
        
        for (int i = 0; i < populacao.size(); i++) {
                        
            temp = (double) Math.abs(Long.parseLong(populacao.get(i).toString(),2)-(double) populacao.getParametros().getParadaMelhorFitness());
            //temp  += (double)populacao.getParametros().getParadaMelhorFitness();
            populacao.get(i).setFitness(temp);
            temprel += temp;
        }
        
        for (int i = 0; i < populacao.size(); i++) {
        
        populacao.get(i).setFitnessRel(populacao.get(i).getFitness()/temprel);
        }
        
                
    return populacao;   
       
    }

    

   
}
