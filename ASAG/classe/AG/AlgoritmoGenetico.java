/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package AG;

import AG.Configuracoes.Configuracoes;

/**
 *
 * @author Eriko Verissimo
 */
public class AlgoritmoGenetico implements Interfaces.AlgoritmoGenetico{

    
    private Configuracoes parametros;
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
    public void iniciarProcesso() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    /**
     * 
     */ 
    public void setCriterioParada(String criterioParada) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    /**
     * 
     */
    public void setMetodoSelecao(String selecao) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    /**
     * 
     */
    public void setNumGeracoes(int numGeracoes) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    /**
     * 
     */
    public void setTamanhoCromossomo(int tamanhoCromossomo) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    /**
     * 
     */
    public void setTamanhoPopulacao(int tamanhoPopulacao) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    /**
     * 
     */
    public void setTaxaCruzamento(double taxaCruzamento) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    /**
     * 
     */
    public void setTaxaMutacao(double taxaMutacao) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    /**
     * 
     * @param taxaSelecao 
     */
    public void setTaxaSelecao(double taxaSelecao) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    /**
     * 
     */
    public void setClasseCromossomo(String classecromossomo) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    /**
     * 
     */
    public void setClasseFitness(String classefitness) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    /**
     * 
     */
    public void setElitismo(double taxaElitismo) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void setTaxaSelecao(int taxaSelecao) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
    
   


}
