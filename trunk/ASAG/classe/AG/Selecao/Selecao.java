/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package AG.Selecao;

import AG.Configuracoes.Configuracoes;
import AG.Populacao.Populacao;
import Interfaces.CromossomoAbstrato;
import java.util.Collections;


/**
 *
 * @author Eriko Verissimo
 */
public class Selecao {

    
    public static final int ROLETA = 0;
    public static final int SUS = 1;
    public static final int TORNEIO = 2;
    
    
    
    public static <T extends CromossomoAbstrato<T>> Populacao<T> Selecionar(int metodoSelecao,Configuracoes parametros,Populacao<T> populacao) throws InstantiationException, ClassNotFoundException, IllegalAccessException{
    
        switch(metodoSelecao){
            case ROLETA : return Roleta(parametros.getTaxaSelecao(), populacao);
            case SUS : return SUS(parametros.getTaxaSelecao(), populacao);
            case TORNEIO : return Torneio(parametros.getTaxaSelecao(), parametros.getTamanhoGrupoTorneio(), populacao);
            default :  return SUS(parametros.getTaxaSelecao(), populacao);
        }
    }
    
    
    
    
    
    /**
     * 
     * @param <T>
     * @param pop
     * @param taxaEscolhidos
     * @return
     * @throws InstantiationException
     * @throws ClassNotFoundException
     * @throws IllegalAccessException 
     */
    public static <T extends CromossomoAbstrato<T>> Populacao<T> Roleta(double taxaEscolhidos, Populacao<T> pop) throws InstantiationException, ClassNotFoundException, IllegalAccessException {


        Populacao<T> populacao = new Populacao<T>(pop.getParametros(),true);
        int sorteio = 0;
        double fitnessEscolhido = 0;
        int indiceEscolhido = 0;
        while (true) {

            if (populacao.size() == (taxaEscolhidos * pop.size())) {
                break;
            }
            sorteio = (int) (Math.random() * (int) (pop.get(0).getFitnessRel() * 1000000000));

            fitnessEscolhido = (double) sorteio / 1000000000;

            for (int i = pop.size() - 1; i >= 0; i--) {
                if (pop.get(i).getFitnessRel() <= fitnessEscolhido) {
                    indiceEscolhido = i;
                } else {
                    break;
                }
            }


            populacao.add(pop.get(indiceEscolhido));

        }

        return populacao;

    }

    /**
     * 
     * @param <T>
     * @param pop 
     * @param taxaEscolhidos
     * @return
     * @throws InstantiationException
     * @throws ClassNotFoundException
     * @throws IllegalAccessException 
     */
    public static <T extends CromossomoAbstrato<T>> Populacao<T> SUS(double taxaEscolhidos, Populacao<T> pop) throws InstantiationException, ClassNotFoundException, IllegalAccessException {


        Populacao<T> populacao = new Populacao<T>(pop.getParametros(),true);
        int sorteio = 0;
        double fitnessEscolhido = 0;
        int indiceEscolhido = 0;
        double agulha = pop.get(0).getFitnessRel() / (taxaEscolhidos * 100);
        
        sorteio = (int) (Math.random() * (int) (pop.get(0).getFitnessRel() * 1000000000));

        fitnessEscolhido = (double) sorteio / 1000000000;

        for (int j = 0; j < (taxaEscolhidos * 100); j++) {

            fitnessEscolhido = fitnessEscolhido + agulha;

            for (int i = pop.size() - 1; i >= 0; i--) {
                if (pop.get(i).getFitnessRel() <= fitnessEscolhido) {
                    indiceEscolhido = i;
                } else {
                    break;
                }

            }
            populacao.add(pop.get(indiceEscolhido));
        }


        return populacao;
    }

    /**
     * 
     * @param <T>
     * @param populacao
     * @param grupoTorneio quantidade de cromossomos para o torneio
     * @param taxaEscolhidos
     * @return
     * @throws InstantiationException
     * @throws ClassNotFoundException
     * @throws IllegalAccessException 
     */
    public static <T extends CromossomoAbstrato<T>> Populacao<T> Torneio(double taxaEscolhidos, int grupoTorneio, Populacao<T> populacao) throws InstantiationException, ClassNotFoundException, IllegalAccessException {

        Populacao<T> poptemp = new Populacao<T>(populacao.getParametros(),true);
        Populacao<T> populacaoEscolhida = new Populacao<T>(populacao.getParametros(),true);


        while (true) {

            if (taxaEscolhidos <= (double) populacaoEscolhida.size() / (double) populacao.size()) {
                break;
            }
            int ponto = 0;
            for (int i = 0; i < grupoTorneio; i++) {

                ponto = (int) (Math.random() * populacao.size());
                if (poptemp.contains(populacao.get(ponto)) == false) {
                    poptemp.add(populacao.get(ponto));
                } else {
                    i--;
                }
            }
            Collections.sort(poptemp);
            populacaoEscolhida.add((T) poptemp.get(0).clone());
            poptemp = new Populacao<T>(populacao.getParametros(),true);

        }


        return populacaoEscolhida;

    }
}
