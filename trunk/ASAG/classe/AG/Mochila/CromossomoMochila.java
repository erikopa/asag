/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package AG.Mochila;

import Interfaces.CromossomoAbstrato;
import java.util.ArrayList;

/**
 *
 * @author Eriko Verissimo
 */
public class CromossomoMochila extends CromossomoAbstrato<CromossomoMochila>{

    private int tamanho;
    private ArrayList<Double> volumes;
    private ArrayList<Double> valores;
    private ArrayList<String> nomes;
    private double volume;
    
    /**
     * Inicializa o cromossomo 
     * @param volumes 
     * @param valores 
     * @param nomes 
     */
    public CromossomoMochila(ArrayList<Double> volumes,ArrayList<Double> valores,ArrayList<String> nomes){
    this.tamanho = nomes.size();
    this.volumes = volumes;
    this.valores = valores;
    this.nomes = nomes;
    
    criaCromossomoMochila();
    }

    public double getVolume(){
        return volume;
    }
    
    
    /**
     * Cria um cromossomo aleatorio
     */
    public void criaCromossomoMochila(){
        double somaVolume = 0;
        for(int j=0;j<tamanho;j++){
                this.add( (int)(Math.random()* 2) );
                if(this.get(j) == "1")
                somaVolume += volumes.get(j);
            
            }
        this.volume = somaVolume;

    }
    
    
    
    
    public int compareTo(CromossomoMochila cromossomo) {
        return (int) (cromossomo.getFitness()*1000000) - (int) (this.getFitness()*1000000);
    }
    
    

}
