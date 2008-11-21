/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package AG.Configuracoes;

import Interfaces.CromossomoAbstrato;



/**
 *
 * @author JOÃO BOULHOSA
 */
public class Configuracoes extends Object implements Cloneable{

    private int tamanhoPopulacao;
    private int tamanhoCromossomo;
    private double taxaCruzamento;
    private double taxaMutacao;
    private int tipoCruzamento;
    private int tipoMutacao;
    private int pontoCorte;
    private int qntPontosCorte;
    private CromossomoAbstrato mascara;
    private int[] pontosCorte;

    public int[] getDoisPontosCorte() {
        return pontosCorte;
    }

    public void setDoisPontosCorte(int pontoCorte1,int pontoCorte2) {
        this.pontosCorte = new int[2];
        this.pontosCorte[0] = pontoCorte1;
        this.pontosCorte[1] = pontoCorte2;
    }

    public CromossomoAbstrato getMascara() {
        return mascara;
    }

    public void setMascara(CromossomoAbstrato mascara) {
        this.mascara = mascara;
    }
    private String classeCromossomo;

    public String getClasseCromossomo() {
        return classeCromossomo;
    }

    public void setClasseCromossomo(String classeCromossomo) {
        this.classeCromossomo = classeCromossomo;
    }

    public String getClasseFitness() {
        return classeFitness;
    }

    public void setClasseFitness(String classeFitness) {
        this.classeFitness = classeFitness;
    }
    private String classeFitness;

    /**
     * 
     * @return
     */
    public int getPontoCorte() {
        return pontoCorte;
    }

    /**
     * 
     * @param pontoCorte
     */
    public void setPontoCorte(int pontoCorte) {
        this.pontoCorte = pontoCorte;
    }

    /**
     * 
     * @return
     */
    public int getQntPontosCorte() {
        return qntPontosCorte;
    }

    /**
     * 
     * @param qntPontosCorte
     */
    public void setQntPontosCorte(int qntPontosCorte) {
        this.qntPontosCorte = qntPontosCorte;
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
    public int getTipoCruzamento() {
        return tipoCruzamento;
    }

    /**
     * 
     * @param tipoCruzamento
     */
    public void setTipoCruzamento(int tipoCruzamento) {
        this.tipoCruzamento = tipoCruzamento;
    }

    /**
     * 
     * @return
     */
    public int getTipoMutacao() {
        return tipoMutacao;
    }

    /**
     * 
     * @param tipoMutacao
     */
    public void setTipoMutacao(int tipoMutacao) {
        this.tipoMutacao = tipoMutacao;
    }
    

}
