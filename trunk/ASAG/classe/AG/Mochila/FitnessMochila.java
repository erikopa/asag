/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package AG.Mochila;

import java.util.ArrayList;

/**
 *
 * @author Eriko Verissimo
 */
public class FitnessMochila {
    
    
    
    /**
     * 
     * @param populacao
     * @return
     */
    public static ArrayList<CromossomoMochila> Avalia(ArrayList<CromossomoMochila> populacao) {
        
        double temp=0;
        double temprel=0;
        
        for (int i = 0; i < populacao.size(); i++) {
        
            populacao.get(i).getVolume();
            
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
