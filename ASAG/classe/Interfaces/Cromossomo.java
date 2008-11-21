package Interfaces;

import java.util.Collection;





/**
 * @param <T> 
 * @author Eriko Verissimo Campos de Morais
 * @version 1.0
 * @created 10-ago-2008 23:29:24
 */
public abstract interface Cromossomo<T> extends Comparable<T> , Collection {

    
    /**
     * 
     * @param posicao
     * @param valor
     */
    public void setGene(int posicao, Object valor);
    
    /**
     * 
     * @param posicao
     * @return 
     */
    public Object getGene(int posicao);
    
    
    /**
     * Retorna a fitness do cromossomo
     * @return
     */
    public double getFitness();
    
    /**
     * Altera o Fitness do cromossomo
     * @param fitness
     */
    public void setFitness(double fitness);
    
    
    /**
     * Retorna o fitness relativo do cromossomo
     * @return 
     */
    public double getFitnessRel();
    
    
    /**
     * Altera o Fitness Relativo do cromossomo
     * @param fitnessRel 
     */
    public void setFitnessRel(double fitnessRel);
    
    /**
     * Retorna a cadeia de genes do cromossomo 
     * @return
     */
    @Override
    public String toString();
    
    
    
    /**
     * Verifica se o alfabeto gerado é válido
     * @return
     */
    public boolean validaCromossomo();
    
    
    /**
     * Compara o cromossomo para a ordenação
     * @param cromossomo 
     * @return
     */
    @Override
    public int compareTo(T cromossomo);
    

}