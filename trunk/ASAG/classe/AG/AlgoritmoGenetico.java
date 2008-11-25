/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package AG;

import AG.Configuracoes.Configuracoes;
import AG.Operadores.Cruzamento;
import AG.Operadores.Mutacao;
import AG.Populacao.Populacao;
import AG.Selecao.Selecao;
import Interfaces.CromossomoAbstrato;
import Interfaces.FitnessAbstrato;
import java.util.ArrayList;
import java.util.Collections;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Eriko Verissimo
 */
public class AlgoritmoGenetico<T extends CromossomoAbstrato,J extends FitnessAbstrato> implements Interfaces.AlgoritmoGenetico{

    
    private Configuracoes parametros;
    private String criterioParada;
    private int numeroGeracoes;
    private ArrayList<String> saida;
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
     * @throws ClassCastException
     * @throws InstantiationException 
     */
    public void iniciarProcesso(String classeCromossomo,String classeFitness) throws ClassCastException,InstantiationException,IllegalAccessException{
        
       
        T cromossomo;
        J fitness;  
        setClasseCromossomo(classeCromossomo);
        setClasseFitness(classeFitness);
            
           
        try {
            
            cromossomo = (T) Class.forName(parametros.getClasseCromossomo()).newInstance();
            fitness = (J) Class.forName(parametros.getClasseFitness()).newInstance();
            setMascara(cromossomo.geraCromossomo(parametros.getTamanhoCromossomo()));
        
            
            Populacao<T> populacao =  new Populacao<T>(parametros,false);
            Populacao<T> novaPopulacao =  new Populacao<T>(parametros,true);
        
            
            for (int i = 0; i < parametros.getQntPontosCorte(); i++) {
            
            parametros.getPontosCorte()[i] = (int) Math.random()*(parametros.getTamanhoCromossomo()-1);
            
            }
                
                
            int numGeracao = 0;
            
            populacao.Avalia(fitness);
        
            while (true) {

            if (populacao.get(0).getFitness() == 1) {
                break;
            }

            numGeracao++;
            System.out.println("Avaliando Geração " + numGeracao);
            
            

            novaPopulacao = Selecao.Selecionar(parametros.getTipoSelecao(), parametros, populacao);
            novaPopulacao = Cruzamento.Cruzar(parametros.getTipoCruzamento(), parametros, novaPopulacao);
            novaPopulacao = Mutacao.Mutar(parametros.getTipoMutacao(), parametros, novaPopulacao);

            
            novaPopulacao.Avalia(fitness);
            
            for (int i = 0; i < novaPopulacao.size(); i++) {

                populacao.add((T) novaPopulacao.get(i).clone());

            }

            Collections.sort(populacao);

            while (true) {
                if (populacao.size() > parametros.getTamanhoPopulacao()) {
                    populacao.remove(populacao.size() - 1);
                } else {
                    break;
                }

            }


            System.out.println("Cromossomo: " + populacao.get(0).toString());
            
            
            }
            
        
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(AlgoritmoGenetico.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex){
            Logger.getLogger(AlgoritmoGenetico.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex){
            Logger.getLogger(AlgoritmoGenetico.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    /**
     * 
     * @return Saida para Interface
     */
    public ArrayList<String> getSaida(){
        return saida;
    }
    
    /**
     * 
     */ 
    public void setCriterioParada(String criterioParada) {
        this.criterioParada = criterioParada; 
    }
    /**
     * 
     */
    public void setTipoSelecao(int selecao) {
        parametros.setTipoSelecao(selecao);
    }
    /**
     * 
     */
    public void setNumGeracoes(int numGeracoes) {
        this.numeroGeracoes = numGeracoes;
    }
    /**
     * 
     */
    public void setTamanhoCromossomo(int tamanhoCromossomo) {
        parametros.setTamanhoCromossomo(tamanhoCromossomo);
    }
    /**
     * 
     */
    public void setTamanhoPopulacao(int tamanhoPopulacao) {
        parametros.setTamanhoPopulacao(tamanhoPopulacao);
    }
    /**
     * 
     */
    public void setTaxaCruzamento(double taxaCruzamento) {
        parametros.setTaxaCruzamento(taxaCruzamento);
    }
    /**
     * 
     */
    public void setTaxaMutacao(double taxaMutacao) {
        parametros.setTaxaMutacao(taxaMutacao);
    }
    /**
     * 
     * @param taxaSelecao 
     */
    public void setTaxaSelecao(double taxaSelecao) {
        parametros.setTaxaSelecao(taxaSelecao);
    }
    /**
     * 
     */
    public void setClasseCromossomo(String classecromossomo) {
        parametros.setClasseCromossomo(classecromossomo);
    }
    /**
     * 
     */
    public void setClasseFitness(String classefitness) {
        parametros.setClasseFitness(classefitness);
    }
    /**
     * 
     */
    public void setElitismo(double taxaElitismo) {
        parametros.setTaxaElitismo(taxaElitismo);
    }
    /**
     * 
     */
    public void setTaxaSelecao(int taxaSelecao) {
        parametros.setTaxaSelecao(taxaSelecao);
    }
    /**
     * 
     */
    public void setMascara(CromossomoAbstrato mascara) {
        parametros.setMascara(mascara);
    }
    /**
     * 
     */
    public void setPontosCorte(int[] pontosCorte) {
        parametros.setPontosCorte(pontosCorte);
    }
    /**
     * 
     */
    public void setTipoCruzamento(int tipoCruzamento) {
        parametros.setTipoCruzamento(tipoCruzamento);
    }
    /**
     * 
     */
    public void setTipoMutacao(int tipoMutacao) {
        parametros.setTipoMutacao(tipoMutacao);
    }

    public void setAlfabeto(ArrayList<Object> alfabeto) {
        parametros.setAlfabeto(alfabeto);
    }

    public void setTamanhoGrupoTorneio(int tamGrupoTorneio) {
        
    }
    
    
   
}
