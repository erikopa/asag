/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package AG.Mochila;

import java.util.ArrayList;
import AG.Populacao.Populacao;
import Interfaces.FitnessAbstrato;

/**
 *
 * @author Eriko Verissimo
 */
public class FitnessMochila extends FitnessAbstrato<CromossomoMochila> {

    /**
     * 
     * @param populacao
     * @return
     */
    public Populacao<CromossomoMochila> Avalia(Populacao<CromossomoMochila> populacao) {
        double temp = 0;
        double temprel = 0;

        for (int i = 0; i < populacao.size(); i++) {


            temp = populacao.get(i).getVolumeCromossomo() - populacao.get(i).getVolumeMochila();
            populacao.get(i).setFitness(temp);
            temprel += temp;
        }

        for (int i = 0; i < populacao.size(); i++) {

            populacao.get(i).setFitnessRel(populacao.get(i).getFitness() / temprel);
        }


        return populacao;
            
    }
}
