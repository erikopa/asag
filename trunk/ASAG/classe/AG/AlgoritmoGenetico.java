/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package AG;

import AG.Configuracoes.Configuracoes;
import AG.Operadores.Cruzamento;
import AG.Operadores.Mutacao;
import AG.Populacao.Populacao;
import AG.Selecao.Selecao;
import Interfaces.CromossomoAbstrato;
import Interfaces.FitnessAbstrato;
import java.util.ArrayList;
import java.util.Collections;
import java.util.logging.Level;
import java.util.logging.Logger;
import AG.Configuracoes.CriterioParada;
import AG.Elitismo.Elitismo;

/**
 *
 * @param <T> 
 * @param <J> 
 * @author Eriko Verissimo
 */
public class AlgoritmoGenetico<T extends CromossomoAbstrato, J extends FitnessAbstrato> implements Interfaces.AlgoritmoGenetico {

    private Configuracoes parametros;
    private int criterioParada;
    private ArrayList<String> saida;

    /**
     * 
     */
    public AlgoritmoGenetico() {
        this.parametros = new Configuracoes();
    }

    /**
     * Reinicia os parâmetros, zerando todos os dados passados.
     */
    public void configurar() {
        this.parametros = new Configuracoes();
    }

    /**
     * 
     * @throws ClassCastException
     * @throws InstantiationException 
     */
    public void iniciarProcesso(String classeCromossomo, String classeFitness) throws ClassCastException, InstantiationException, IllegalAccessException {


        T cromossomo;
        J fitness;
        setClasseCromossomo(classeCromossomo);
        setClasseFitness(classeFitness);


        try {

            cromossomo = (T) Class.forName(parametros.getClasseCromossomo()).newInstance();
            fitness = (J) Class.forName(parametros.getClasseFitness()).newInstance();
            //setMascara((T) cromossomo.geraCromossomo(parametros.getTamanhoCromossomo()).clone());


            Populacao<T> populacao = new Populacao<T>(parametros, false);
            Populacao<T> novaPopulacao = new Populacao<T>(parametros, true);
            Populacao<T> tempPopulacao = new Populacao<T>(parametros, true);

            for (int i = 0; i < parametros.getQntPontosCorte(); i++) {

                parametros.getPontosCorte()[i] = (int) Math.random() * (parametros.getTamanhoCromossomo() - 1);

            }


            int numGeracao = 0;
            boolean parada = false;
            populacao.Avalia(fitness);

            while (true) {
                
                switch (this.criterioParada) {

                    case Configuracoes.PARADAFITNESS: {
                        if(CriterioParada.CriterioFitness(Collections.max(populacao), parametros.getParadaMelhorFitness())){
                        parada = true;
                        }break;
                    }
                    case Configuracoes.PARADAGERACAO: {
                        if(CriterioParada.CriterioGeracoes(numGeracao, parametros.getParadaNumeroGeracoes())){
                        parada = true;
                        }break;
                    }
                    default: {
                        if(CriterioParada.CriterioFitness(Collections.max(populacao), 1)){
                        parada = true;
                        }break;
                    }

                }
                
                if(parada){
                break;
                }
                numGeracao++;


                novaPopulacao.clear();
                tempPopulacao.clear();
                novaPopulacao = Selecao.Selecionar(parametros.getTipoSelecao(), parametros, populacao);
                novaPopulacao = Cruzamento.Cruzar(parametros.getTipoCruzamento(), parametros, novaPopulacao);
                novaPopulacao = Mutacao.Mutar(parametros.getTipoMutacao(), parametros, novaPopulacao);


                tempPopulacao.addAll(Elitismo.Elitismo(parametros.getTaxaElitismo(), populacao));
                //Execução de elitismo
//                while (parametros.getTaxaElitismo() > ((double) tempPopulacao.size() / (double) parametros.getTamanhoPopulacao())) {
//                    
//                    tempPopulacao.add((T) Collections.max(populacao).clone());
//                    populacao.remove((T) Collections.max(populacao));
//                }
              

                tempPopulacao.addAll((Populacao<T>) novaPopulacao.clone());


                int temp = (parametros.getTamanhoPopulacao() - tempPopulacao.size());
                if (tempPopulacao.size() < parametros.getTamanhoPopulacao()) {

                    for (int i = 0; i < temp; i++) {
                        cromossomo.clear();
                        tempPopulacao.add((T) cromossomo.geraCromossomo(parametros.getTamanhoCromossomo()).clone());

                    }
                }

                populacao.clear();
                populacao.addAll((Populacao<T>) tempPopulacao.clone());
                //System.out.println("Cromossomo: " + Collections.max(populacao).toString()+" Fitness: "+Collections.max(populacao).getFitness()
                //        + " Valor  "+Long.parseLong(Collections.max(populacao).toString(),2)
               //         );
                
                System.out.println("Avaliando Geração " + numGeracao);
                populacao.Avalia(fitness);
                //Collections.sort(populacao);
                //Collections.reverse(populacao);
                //Collections.sort(tempPopulacao);
                
                System.out.println("Cromossomo: " + Collections.max(populacao).toString()+" Fitness: "+Collections.max(populacao).getFitness()
                        + " Valor decimal "+Long.parseLong(Collections.max(populacao).toString(),2)                        );
                //System.out.println("Cromossomo: " + Collections.max(tempPopulacao).toString());


            }


        } catch (ClassNotFoundException ex) {
            Logger.getLogger(AlgoritmoGenetico.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            Logger.getLogger(AlgoritmoGenetico.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(AlgoritmoGenetico.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    /**
     * 
     * @return Saida para Interface
     */
    public ArrayList<String> getSaida() {
        return saida;
    }

    /**
     * 
     */
    public void setCriterioParada(int criterioParada) {
        this.criterioParada = criterioParada;
    }

    /**
     * 
     */
    public void setTipoSelecao(int selecao) {
        parametros.setTipoSelecao(selecao);
    }

    /**
     * 
     */
    public void setParadaGeracoes(int numGeracoes) {
        parametros.setParadaNumeroGeracoes(numGeracoes);
    }

    /**
     * 
     */
    public void setTamanhoCromossomo(int tamanhoCromossomo) {
        parametros.setTamanhoCromossomo(tamanhoCromossomo);
    }

    /**
     * 
     */
    public void setTamanhoPopulacao(int tamanhoPopulacao) {
        parametros.setTamanhoPopulacao(tamanhoPopulacao);
    }

    /**
     * 
     */
    public void setTaxaCruzamento(double taxaCruzamento) {
        parametros.setTaxaCruzamento(taxaCruzamento);
    }

    /**
     * 
     */
    public void setTaxaMutacao(double taxaMutacao) {
        parametros.setTaxaMutacao(taxaMutacao);
    }

    /**
     * 
     * @param taxaSelecao 
     */
    public void setTaxaSelecao(double taxaSelecao) {
        parametros.setTaxaSelecao(taxaSelecao);
    }

    /**
     * 
     */
    public void setClasseCromossomo(String classecromossomo) {
        parametros.setClasseCromossomo(classecromossomo);
    }

    /**
     * 
     */
    public void setClasseFitness(String classefitness) {
        parametros.setClasseFitness(classefitness);
    }

    /**
     * 
     */
    public void setElitismo(double taxaElitismo) {
        parametros.setTaxaElitismo(taxaElitismo);
    }

    /**
     * 
     */
    public void setTaxaSelecao(int taxaSelecao) {
        parametros.setTaxaSelecao(taxaSelecao);
    }

    /**
     * 
     */
    public void setMascara(CromossomoAbstrato mascara) {
        parametros.setMascara(mascara);
    }

    /**
     * 
     */
    public void setPontosCorte(int[] pontosCorte) {
        parametros.setPontosCorte(pontosCorte);
    }

    /**
     * 
     */
    public void setTipoCruzamento(int tipoCruzamento) {
        parametros.setTipoCruzamento(tipoCruzamento);
    }

    /**
     * 
     */
    public void setTipoMutacao(int tipoMutacao) {
        parametros.setTipoMutacao(tipoMutacao);
    }

    public void setAlfabeto(ArrayList alfabeto) {
        parametros.setAlfabeto(alfabeto);
    }

    public void setTamanhoGrupoTorneio(int tamGrupoTorneio) {
        parametros.setTamanhoGrupoTorneio(tamGrupoTorneio);
    }

    public void setFitnessObjetivo(double fitness) {
        parametros.setParadaMelhorFitness(fitness);
    }

    public Configuracoes getParametros() {
        return parametros;
    }

    public void setParametros(Configuracoes parametros) {
        this.parametros = parametros;
    }
}
