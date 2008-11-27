/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package AG.Binario;


import Interfaces.CromossomoAbstrato;

/**
 *
 * @author Eriko Verissimo
 */
public class CromossomoBinario extends CromossomoAbstrato<CromossomoBinario> {

    private int tamanho;
    /**
     * Inicializa o cromossomo com tamanho 10
     */
    public CromossomoBinario(){
   
    }
    
    @Override
    public CromossomoBinario geraCromossomo(int tamanho){
        this.tamanho = tamanho;
        criaCromossomoBinario();
        return this;
    }
    
    /**
     * Inicializa o cromossomo com tamanho personalizado
     * @param tamanho
     */
    public CromossomoBinario(int tamanho){
    this.tamanho = tamanho;
    criaCromossomoBinario();
    }
    
    /**
     * Cria um cromossomo aleatorio
     */
    public void criaCromossomoBinario(){
        for(int j=0;j<tamanho;j++){
                this.add( (int)(Math.random()* 2) );
            }
    
    }
    
    /**
     * 
     * @param o
     * @return
     */
    @Override
    public int compareTo(CromossomoBinario o) {
        if(o.getFitness()<=this.getFitness()){
            return 0;
        }else{
            return 1;
        }
        //return (int) (o.getFitness()*1000000) - (int) (this.getFitness()*1000000);
    }

}
