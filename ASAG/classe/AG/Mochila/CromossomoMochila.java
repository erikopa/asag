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
public class CromossomoMochila extends CromossomoAbstrato<CromossomoMochila> {

    private int tamanho;
    private ArrayList<Item> alfabetoItens;
    private ArrayList<Item> itens;
    private double volumeMochila;
    private double volumeCromossomo;

    public CromossomoMochila(){
    
//        this.tamanho = 10;
//        this.volumeMochila = 350;
//    
//        itens.add(new Item("Caixa1", 80));
//        itens.add(new Item("Caixa2", 100));
//        itens.add(new Item("Caixa3", 50));
//        itens.add(new Item("Caixa4", 1));
//        itens.add(new Item("Caixa5", 30));
//        itens.add(new Item("Caixa6", 20));
//        itens.add(new Item("Caixa7", 15));
//        itens.add(new Item("Caixa8", 7));
//        itens.add(new Item("Caixa9", 5));
//        itens.add(new Item("Caixa10", 10));
//        itens.add(new Item());
//    
    itens = new ArrayList<Item>();
    
    }
    /**
     * Inicializa o cromossomo 
     * @param alfabetoItens 
     * @param volumeMochila
     * @param tamanhoCromossomo 
     */
    public CromossomoMochila(int tamanhoCromossomo) {
        this.tamanho = tamanhoCromossomo;
        this.volumeMochila = 350;
        itens.add(new Item("Caixa1", 80));
        itens.add(new Item("Caixa2", 100));
        itens.add(new Item("Caixa3", 50));
        itens.add(new Item("Caixa4", 1));
        itens.add(new Item("Caixa5", 30));
        itens.add(new Item("Caixa6", 20));
        itens.add(new Item("Caixa7", 15));
        itens.add(new Item("Caixa8", 7));
        itens.add(new Item("Caixa9", 5));
        itens.add(new Item("Caixa10", 10));
        itens.add(new Item());
    
        
        criaCromossomoMochila();
    }

    public void criaItemVazio() {
        itens.add(new Item());
    }

    public double getVolumeMochila() {
        return volumeMochila;
    }

    public double getVolumeCromossomo() {
        return volumeCromossomo;
    }

    @Override
    public CromossomoMochila geraCromossomo(int tamanho) {
        
        for (int i = 0; i < tamanho; i++) {
            criaItemVazio();
        }
        return this;
    }

    @Override
    public ArrayList getAlfabeto() {
        return itens;
    }

    /**
     * Cria um cromossomo aleatorio
     */
    public void criaCromossomoMochila() {

        int qtnItens = alfabetoItens.size();
        int indexItemSelecionado = 0;

        indexItemSelecionado = (int) Math.random() * qtnItens;

        this.itens.add(alfabetoItens.get(indexItemSelecionado));
        this.volumeCromossomo += alfabetoItens.get(indexItemSelecionado).volume;

    }
    

    public int compareTo(CromossomoMochila cromossomo) {
        return (int) (cromossomo.getFitness() * 1000000) - (int) (this.getFitness() * 1000000);
    }

    @Override
    public String toString() {
        String saida = "";
        for (int i = 0; i < this.itens.size(); i++) {

            saida += "[" + itens.get(i).nome + "]";

        }

        return saida;
    }

    
}
