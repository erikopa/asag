/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package AG.Operadores;

import AG.Populacao.Populacao;
import Interfaces.CromossomoAbstrato;
import java.util.ArrayList;

/**
 *
 * @author Eriko Verissimo
 */
public class Mutacao {

    /**
     * 
     * @param <T> Tipo de Cromossomo
     * @param taxa Indica o percentual de mutação
     * @param ListaCromossomos População a ser testada para mutação
     * @return
     */
    public static <T extends CromossomoAbstrato<T>> Populacao<T> MutarBinario(double taxa, Populacao<T> ListaCromossomos) {

        T cromossomo;

        for (int i = 0; i < ListaCromossomos.size(); i++) {
            cromossomo = ListaCromossomos.get(i);
            for (int j = 0; j < cromossomo.size(); j++) {

                if (taxa >= (1 + Math.random() * 1000) / 1000) {
                    if (cromossomo.get(j) == (Object) 1) {
                        cromossomo.setGene(j, 0);
                    } else {
                        cromossomo.setGene(j, 1);
                    }
                }

            }
        }
        return ListaCromossomos;
    }

    /**
     * 
     * @param <T> Tipo de Cromossomo
     * @param taxa Indica o percentual de mutação
     * @param alfabeto Alfabeto utilizado
     * @param ListaCromossomos População a ser testada para mutação
     * @return
     */
    public static <T extends CromossomoAbstrato<T>> Populacao<T> MutarAlfabeto(double taxa, ArrayList alfabeto, Populacao<T> ListaCromossomos) {
        T cromossomo;
        Object letra;
        for (int i = 0; i < ListaCromossomos.size(); i++) {
            cromossomo = ListaCromossomos.get(i);
            for (int j = 0; j < cromossomo.size(); j++) {

                if (taxa >= (1 + Math.random() * 1000) / 1000) {
                    letra = alfabeto.get((int)Math.random() * alfabeto.size());
                    if (cromossomo.get(j) == letra) {
                        cromossomo.setGene(j, alfabeto.get(alfabeto.indexOf(letra)+1));
                    } else {
                        cromossomo.setGene(j, letra);
                    }
                }

            }
        }
        return ListaCromossomos;
    }
}
