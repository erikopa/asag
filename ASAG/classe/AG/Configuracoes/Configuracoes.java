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
public class Configuracoes extends Object implements Cloneable{

    private CromossomoAbstrato mascara;
    private int tamanhoPopulacao;
    private int tamanhoCromossomo;
    private int[] pontosCorte;
    private double taxaCruzamento;
    private double taxaMutacao;
    private String tipoCruzamento;
    private String tipoMutacao;
    private String classeCromossomo;
    private String classeFitness;
    
    
    
    
    /**
     * 
     * @return
     */
    public int[] getDoisPontosCorte() {
        return pontosCorte;
    }

    /**
     * 
     * @param pontosCorte 
     */
    public void setDoisPontosCorte(int[] pontosCorte) {
        this.pontosCorte = new int[2];
        this.pontosCorte[0] = pontosCorte[0];
        this.pontosCorte[1] = pontosCorte[1];
    }

    /**
     * 
     * @return
     */
    public CromossomoAbstrato getMascara() {
        return mascara;
    }

    /**
     * 
     * @param mascara
     */
    public void setMascara(CromossomoAbstrato mascara) {
        this.mascara = mascara;
    }

    /**
     * 
     * @return
     */
    public String getClasseCromossomo() {
        return classeCromossomo;
    }

    /**
     * 
     * @param classeCromossomo
     */
    public void setClasseCromossomo(String classeCromossomo) {
        this.classeCromossomo = classeCromossomo;
    }

    /**
     * 
     * @return
     */
    public String getClasseFitness() {
        return classeFitness;
    }

    /**
     * 
     * @param classeFitness
     */
    public void setClasseFitness(String classeFitness) {
        this.classeFitness = classeFitness;
    }

    
    /**
     * 
     * @return
     */
    public int getQntPontosCorte() {
        return pontosCorte.length;
    }

    /**
     * 
     * @return
     */
    public int getTamanhoCromossomo() {
        return tamanhoCromossomo;
    }

    /**
     * 
     * @param tamanhoCromossomo
     */
    public void setTamanhoCromossomo(int tamanhoCromossomo) {
        this.tamanhoCromossomo = tamanhoCromossomo;
    }

    /**
     * 
     * @return
     */
    public int getTamanhoPopulacao() {
        return tamanhoPopulacao;
    }

    /**
     * 
     * @param tamanhoPopulacao
     */
    public void setTamanhoPopulacao(int tamanhoPopulacao) {
        this.tamanhoPopulacao = tamanhoPopulacao;
    }

    /**
     * 
     * @return
     */
    public double getTaxaCruzamento() {
        return taxaCruzamento;
    }

    /**
     * 
     * @param taxaCruzamento
     */
    public void setTaxaCruzamento(double taxaCruzamento) {
        this.taxaCruzamento = taxaCruzamento;
    }

    /**
     * 
     * @return
     */
    public double getTaxaMutacao() {
        return taxaMutacao;
    }

    /**
     * 
     * @param taxaMutacao
     */
    public void setTaxaMutacao(double taxaMutacao) {
        this.taxaMutacao = taxaMutacao;
    }

    /**
     * 
     * @return
     */
    public String getTipoCruzamento() {
        return tipoCruzamento;
    }

    /**
     * 
     * @param tipoCruzamento
     */
    public void setTipoCruzamento(String tipoCruzamento) {
        this.tipoCruzamento = tipoCruzamento;
    }

    /**
     * 
     * @return
     */
    public String getTipoMutacao() {
        return tipoMutacao;
    }

    /**
     * 
     * @param tipoMutacao
     */
    public void setTipoMutacao(String tipoMutacao) {
        this.tipoMutacao = tipoMutacao;
    }
    

}
