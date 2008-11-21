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
                        
            temp = (double)(Long.parseLong(populacao.get(i).toString(),2))/(Math.pow(2, populacao.get(i).size())-1);
            populacao.get(i).setFitness(temp);
            temprel += temp;
        }
        
        for (int i = 0; i < populacao.size(); i++) {
        
        populacao.get(i).setFitnessRel(populacao.get(i).getFitness()/temprel);
        }
        
                
    return populacao;   
       
    }

    

   
}
