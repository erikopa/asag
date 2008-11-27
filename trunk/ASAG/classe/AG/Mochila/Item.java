/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package AG.Mochila;

/**
 *
 * @author JOÃO BOULHOSA
 */
public class Item extends Object{

    String nome;
    double volume;

    public Item() {
        nome = "Vazio";
        volume = 0;
    }

    public Item(String nome, double volume) {
        this.nome = nome;
        this.volume = volume;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }
    
    
}
