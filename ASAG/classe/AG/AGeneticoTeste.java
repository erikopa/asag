/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package AG;

import AG.Configuracoes.Configuracoes;
import AG.Mochila.Item;
import AG.Operadores.Cruzamento;
import AG.Operadores.Mutacao;
import AG.Selecao.Selecao;
import java.util.ArrayList;

/**
 *
 * @author Eriko Verissimo
 */
public class AGeneticoTeste {

    /**
     * @param args the command line arguments
     * @throws InstantiationException
     * @throws ClassNotFoundException
     * @throws IllegalAccessException 
     */
    public static void main(String[] args) throws InstantiationException, ClassNotFoundException, IllegalAccessException {

        // TODO code application logic here
        
        
        
        
            AlgoritmoGenetico algoritmo = new AlgoritmoGenetico();
            algoritmo.setTamanhoCromossomo(20);
            algoritmo.setTamanhoPopulacao(300);
            algoritmo.setElitismo(0.01);
            algoritmo.setTaxaSelecao(0.7);
            algoritmo.setTaxaMutacao(0.06);
            algoritmo.setTipoSelecao(Selecao.TORNEIO);
            algoritmo.setTamanhoGrupoTorneio(5);
            algoritmo.setTipoCruzamento(Cruzamento.CRUZARNPONTOS);
            algoritmo.setTipoMutacao(Mutacao.MUTARBINARIO);
            algoritmo.setPontosCorte(new int[5]);
            algoritmo.setCriterioParada(Configuracoes.PARADAGERACAO);
            algoritmo.setParadaGeracoes(1000);
            algoritmo.setParadaFitness(1000);
            algoritmo.iniciarProcesso("AG.Binario.CromossomoBinario", "AG.Binario.FitnessBinario");
            
            
    }
}
