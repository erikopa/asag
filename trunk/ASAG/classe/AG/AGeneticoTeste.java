/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package AG;

import AG.Binario.CromossomoBinario;
import AG.Binario.FitnessBinario;
import AG.Configuracoes.Configuracoes;
import AG.Operadores.Cruzamento;
import AG.Operadores.Mutacao;
import AG.Populacao.Populacao;
import AG.Selecao.Selecao;
import java.util.Collections;

/**
 *
 * @author JOÃO BOULHOSA
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
            algoritmo.setTamanhoCromossomo(30);
            algoritmo.setTamanhoPopulacao(3000);
            algoritmo.setTaxaSelecao(0.8);
            algoritmo.setTaxaMutacao(0.1);
            algoritmo.setTipoSelecao(Selecao.SUS);
            algoritmo.setTamanhoGrupoTorneio(5);
            algoritmo.setTipoCruzamento(Cruzamento.CRUZARNPONTOS);
            algoritmo.setTipoMutacao(Mutacao.MUTARBINARIO);
            algoritmo.setPontosCorte(new int[5]);
            algoritmo.iniciarProcesso("AG.Binario.CromossomoBinario", "AG.Binario.FitnessBinario");
            
            
//        Configuracoes parametros = new Configuracoes();
//        parametros.setClasseCromossomo("AG.Binario.CromossomoBinario");
//        parametros.setClasseFitness("AG.Binario.FitnessBinario");
//        parametros.setTamanhoCromossomo(30);
//        parametros.setTamanhoPopulacao(3000);
//        parametros.setTaxaSelecao(0.8);
//        parametros.setTaxaMutacao(0.1);
//        parametros.setMascara(new CromossomoBinario(parametros.getTamanhoCromossomo()));
//        parametros.setTipoSelecao(Selecao.SUS);
//        parametros.setTamanhoGrupoTorneio(5);
//        parametros.setTipoCruzamento(Cruzamento.CRUZARNPONTOS);
//        parametros.setTipoMutacao(Mutacao.MUTARBINARIO);
//        parametros.setPontosCorte(new int[5]);
//        FitnessBinario fitness = new FitnessBinario();
//        Populacao<CromossomoBinario> populacao =  new Populacao<CromossomoBinario>(parametros,false);
//        Populacao<CromossomoBinario> novaPopulacao =  new Populacao<CromossomoBinario>(parametros,true);
//        
//        
//        for (int i = 0; i < parametros.getQntPontosCorte(); i++) {
//            
//            parametros.getPontosCorte()[i] = (int) Math.random()*(parametros.getTamanhoCromossomo()-1);
//            
//        }
//                
//                
//        int numGeracao = 0;
////        double taxaCruzamento = 0.8;
////        int tamanho = 20;
////        int tamanhoPopulacao = 200;
////
////        ArrayList<CromossomoBinario> avaliados = new ArrayList<CromossomoBinario>();
////        ArrayList<CromossomoBinario> novaPopulacao = new ArrayList<CromossomoBinario>();
//
//        //Cria a população.        
////        for (int i = 0; i < tamanhoPopulacao; i++) {
////            populacao.add(new CromossomoBinario(tamanho));
////
////        }
//        
//
//
//
//        //Escreve a população na tela.
////        for (int i = 0; i < populacao.size(); i++) {
////
////            System.out.println("Cromossomo " + i + ": " + populacao.get(i).toString() + " Valor Decimal: " +
////                    Integer.parseInt(populacao.get(i).toString(), 2));
////
////        }
//        populacao.Avalia(fitness);
//        
//        while (true) {
//
//            if (populacao.get(0).getFitness() == 1) {
//                break;
//            }
//
//            numGeracao++;
//            System.out.println("Avaliando Geração " + numGeracao);
//            
//            
//
//            novaPopulacao = Selecao.Selecionar(parametros.getTipoSelecao(), parametros, populacao);
//            //SUS(taxaCruzamento, avaliados);
//            //Roleta(taxaCruzamento, avaliados);
//            //Torneio(taxaCruzamento, 5, avaliados);
//
//            novaPopulacao = Cruzamento.Cruzar(parametros.getTipoCruzamento(), parametros, novaPopulacao);
//            //CruzarDoisPontos(parametros.getDoisPontosCorte()[0],parametros.getDoisPontosCorte()[1], novaPopulacao);
//            //CruzarUmPonto(5, novaPopulacao);
//            //CruzarNPontos(1, novaPopulacao).clone();
//
////            for (int i = 0; i < novaPopulacao.size(); i++) {
////                if(novaPopulacao.get(i).size() > 20){
////            System.out.println("O cromossomo "+i+" esta errado");
////            System.exit(0);
////            }
////                
////            }
//
//            novaPopulacao = Mutacao.Mutar(parametros.getTipoMutacao(), parametros, novaPopulacao);
//
//            //SpinBinario.Spin(200, novaPopulacao);
//            
//            novaPopulacao.Avalia(fitness);
//            
//            for (int i = 0; i < novaPopulacao.size(); i++) {
//
//                populacao.add((CromossomoBinario) novaPopulacao.get(i).clone());
//
//            }
//
//            Collections.sort(populacao);
//
//            while (true) {
//                if (populacao.size() > parametros.getTamanhoPopulacao()) {
//                    populacao.remove(populacao.size() - 1);
//                } else {
//                    break;
//                }
//
//            }
//
//
//            System.out.println("Cromossomo: " + populacao.get(0).toString());
//        }
//        System.out.println("Geração " + numGeracao);






    }
}
