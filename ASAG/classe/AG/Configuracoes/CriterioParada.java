/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package AG.Configuracoes;

import Interfaces.CromossomoAbstrato;

/**
 *
 * @author Eriko Verissimo
 */
public class CriterioParada {

    
    public static boolean CriterioFitness(CromossomoAbstrato melhorCromossomo, double melhorFitness) {
        if (melhorCromossomo.getFitness() == melhorFitness) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean CriterioGeracoes(int numeroGeracao, int numeroGeracoes) {
        if (numeroGeracao == numeroGeracoes) {
            return true;
        } else {
            return false;
        }
    }
}
