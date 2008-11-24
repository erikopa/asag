/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package AG.Configuracoes;

import Interfaces.CromossomoAbstrato;
import java.util.ArrayList;



/**
 *
 * @author Eriko Verissimo
 */
public class Configuracoes extends Object implements Cloneable{

    private CromossomoAbstrato mascara;
    private ArrayList<Object> alfabeto;
    private int tamanhoPopulacao;
    private int tamanhoCromossomo;
    private int tamanhoGrupoTorneio;
    private int[] pontosCorte;
    private double taxaCruzamento;
    private double taxaMutacao;
    private double taxaSelecao;
    private double taxaElitismo;
    private String tipoCruzamento;
    private String tipoMutacao;
    private String tipoSelecao;
    private String classeCromossomo;
    private String classeFitness;

    
    
    
    
    /**
     * 
     * @return
     */
    public int getTamanhoGrupoTorneio() {
        return tamanhoGrupoTorneio;
    }

    /**
     * 
     * @param tamanhoGrupoTorneio
     */
    public void setTamanhoGrupoTorneio(int tamanhoGrupoTorneio) {
        this.tamanhoGrupoTorneio = tamanhoGrupoTorneio;
    }
    
    
    /**
     * 
     * @return
     */
    public ArrayList<Object> getAlfabeto() {
        return alfabeto;
    }

    /**
     * 
     * @param alfabeto
     */
    public void setAlfabeto(ArrayList<Object> alfabeto) {
        this.alfabeto = alfabeto;
    }

    
    /**
     * 
     * @return
     */
    public double getTaxaElitismo() {
        return taxaElitismo;
    }

    /**
     * 
     * @param taxaElitismo
     */
    public void setTaxaElitismo(double taxaElitismo) {
        this.taxaElitismo = taxaElitismo;
    }
    
    
    /**
     * 
     * @return
     */
    public double getTaxaSelecao() {
        return taxaSelecao;
    }

    /**
     * 
     * @param taxaSelecao
     */
    public void setTaxaSelecao(double taxaSelecao) {
        this.taxaSelecao = taxaSelecao;
    }

    /**
     * 
     * @return
     */
    public String getTipoSelecao() {
        return tipoSelecao;
    }

    /**
     * 
     * @param tipoSelecao
     */
    public void setTipoSelecao(String tipoSelecao) {
        this.tipoSelecao = tipoSelecao;
    }
    
    /**
     * 
     * @return
     */
    public int[] getPontosCorte() {
        return this.pontosCorte;
    }

    /**
     * 
     * @param pontosCorte 
     */
    public void setPontosCorte(int[] pontosCorte) {
        this.pontosCorte = pontosCorte;
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
