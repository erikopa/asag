/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package AG;

import AG.Configuracoes.Configuracoes;
import Interfaces.CromossomoAbstrato;
import java.util.ArrayList;

/**
 *
 * @author Eriko Verissimo
 */
public class AlgoritmoGenetico implements Interfaces.AlgoritmoGenetico{

    
    private Configuracoes parametros;
    private String criterioParada;
    private int numeroGeracoes;
    private ArrayList<String> saida;
    /**
     * 
     */
    public AlgoritmoGenetico(){
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
     */
    public void iniciarProcesso(){
        
        
    }
    
    /**
     * 
     * @return Saida para Interface
     */
    public ArrayList<String> getSaida(){
        return saida;
    }
    
    /**
     * 
     */ 
    public void setCriterioParada(String criterioParada) {
        this.criterioParada = criterioParada; 
    }
    /**
     * 
     */
    public void setMetodoSelecao(String selecao) {
        parametros.setTipoSelecao(selecao);
    }
    /**
     * 
     */
    public void setNumGeracoes(int numGeracoes) {
        this.numeroGeracoes = numGeracoes;
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
    public void setTipoCruzamento(String tipoCruzamento) {
        parametros.setTipoCruzamento(tipoCruzamento);
    }
    /**
     * 
     */
    public void setTipoMutacao(String tipoMutacao) {
        parametros.setTipoMutacao(tipoMutacao);
    }

    public void setAlfabeto(ArrayList<Object> alfabeto) {
        parametros.setAlfabeto(alfabeto);
    }

    public void setTamanhoGrupoTorneio(int tamGrupoTorneio) {
        
    }
    
    
   
}
