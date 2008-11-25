package Interfaces;

import java.util.ArrayList;


/**
 * @param <T> 
 * @author Eriko Verissimo Campos de Morais
 * @version 1.0
 * @created 10-ago-2008 23:29:24
 */

public abstract class CromossomoAbstrato<T> extends ArrayList implements Cromossomo<T> {

    private double fitness;
    private double fitnessRel;

    
    /**
     * 
     * @param tamanho
     * @return 
     */
    public CromossomoAbstrato geraCromossomo(int tamanho){
        return this;
    }
    
    
    /*
     * Retorna o gene do cromossomo
     */
    public Object getGene(int posicao) {
        return this.get(posicao);
    }

    /**
     * Altera o gene do cromossomo
     */
    public void setGene(int posicao, Object valor) {
        this.set(posicao, valor);
    }

    /**
     * Retorna o fitness do cromossomo
     * @return  
     */
    public double getFitness() {
        return fitness;
    }

    /**
     * Altera o fitness do cromossomo
     * 
     */
    public void setFitness(double fitness) {
        this.fitness = fitness;
    }

    /**
     * Retorna o fitness relativo do cromossomo
     * @return  
     */
    public double getFitnessRel() {
        return fitnessRel;
    }

    /**
     * Altera o fitness relativo do cromossomo
     * 
     */
    public void setFitnessRel(double fitnessRel) {
        this.fitnessRel = fitnessRel;
    }

    /**
     * Valida o alfabeto gerado pelo cromossomo
     * @return
     */
    public boolean validaCromossomo() {
        return true;
    }

    

    /**
     * Retorna o Cromossomo
     * @return
     */
    @Override
    public String toString() {
        String temp = "";
        for (int i = 0; i < size(); i++) {
            temp += this.get(i);
        }
        return temp;
    }

    public void setCromossomo(Object[] o) {
        for (int i = 0; i < o.length; i++) {
            this.set(i, o[i]);
        }
    }

    public void setCromossomo(ArrayList o) {
        for (int i = 0; i < o.size(); i++) {
            this.set(i, o.get(i));
        }
    }
}