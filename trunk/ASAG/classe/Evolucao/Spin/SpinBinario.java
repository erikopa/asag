/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Evolucao.Spin;

import Interfaces.CromossomoAbstrato;
import java.util.ArrayList;

/**
 *
 * @author Eriko Verissimo
 */
public class SpinBinario {

    /**
     * 
     * @param <T> Tipo do Cromossomo
     * @param quantidadeSpin 
     * @param populacao
     */
    public static <T extends CromossomoAbstrato<T>> void Spin(int quantidadeSpin, ArrayList<T> populacao) {

        int tamanho = populacao.get(0).size();
        int posicao = 0;
        ArrayList ListaPosicao = new ArrayList();
        ArrayList cromossomo = new ArrayList(tamanho);
        for (int j = 0; j < tamanho; j++) {

            cromossomo.add((int) (Math.random() * 2));

        }
        while (true) {
            posicao = (int) (Math.random() * (populacao.size() - 1));
            if (ListaPosicao.contains(posicao) == false) {
                populacao.get(posicao).setCromossomo(cromossomo);
            }
            if (ListaPosicao.size() != quantidadeSpin) {
                break;
            }
        }

    }
}
