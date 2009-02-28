/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.my.bean;

import AG.AlgoritmoGenetico;
import AG.Operadores.Cruzamento;
import AG.Operadores.Mutacao;
import AG.Selecao.Selecao;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.faces.model.SelectItem;

/**
 *
 * @author renatohidaka
 */
public class Algoritmo {

    private AlgoritmoGenetico algoritmo;
    private UpLoad cromossomo;
    private UpLoad fitness;
    private Integer primeiroPontoDeCorte;

    /** Creates a new instance of Algoritmo */
    public Algoritmo() {
        algoritmo = new AlgoritmoGenetico();
        cromossomo = new UpLoad();
        fitness = new UpLoad();     
    }

    public List<SelectItem> getCruzamentos() {
        List<SelectItem> tiposCruzamentos = new ArrayList<SelectItem>();
        tiposCruzamentos.add(new SelectItem(Cruzamento.CRUZARDOISPONTOS, "cruzar dois pontos"));
        tiposCruzamentos.add(new SelectItem(Cruzamento.CRUZARMASCARA, "cruzar mascara"));
        tiposCruzamentos.add(new SelectItem(Cruzamento.CRUZARNPONTOS, "cruzar n pontos"));
        tiposCruzamentos.add(new SelectItem(Cruzamento.CRUZARUMPONTO, "cruzar um ponto"));
        return tiposCruzamentos;
    }

    public List<SelectItem> getSelecao() {
        List<SelectItem> tipoSelecao = new ArrayList<SelectItem>();
        tipoSelecao.add(new SelectItem(Selecao.ROLETA, "roleta"));
        tipoSelecao.add(new SelectItem(Selecao.SUS, "SUS"));
        tipoSelecao.add(new SelectItem(Selecao.TORNEIO, "torneio"));
        return tipoSelecao;
    }

    public List<SelectItem> getMutacao() {
        List<SelectItem> tipoMutacao = new ArrayList<SelectItem>();
        tipoMutacao.add(new SelectItem(Mutacao.MUTARBINARIO, "mutar binário"));
        return tipoMutacao;
    }

    public List<SelectItem> getBoolean() {
        List<SelectItem> listBoolean = new ArrayList<SelectItem>();
        listBoolean.add(new SelectItem(true, "sim"));
        listBoolean.add(new SelectItem(false, "não"));
        return listBoolean;
    }

    public List<SelectItem> getCromossomos() {
        List<SelectItem> listCromossomos = new ArrayList<SelectItem>();        
        for (int i = 1; i < algoritmo.getParametros().getTamanhoCromossomo(); i++) {
            listCromossomos.add(new SelectItem(i));
        }
        return listCromossomos;
    }

    public String button() throws IOException {
        cromossomo.salvar();
        fitness.salvar();
        return "";
    }

    public AlgoritmoGenetico getAlgoritmo() {
        return algoritmo;
    }

    public void setAlgoritmo(AlgoritmoGenetico algoritmo) {
        this.algoritmo = algoritmo;
    }

    public UpLoad getCromossomo() {
        return cromossomo;
    }

    public void setCromossomo(UpLoad cromossomo) {
        this.cromossomo = cromossomo;
    }

    public UpLoad getFitness() {
        return fitness;
    }

    public void setFitness(UpLoad fitness) {
        this.fitness = fitness;
    }

    public Integer getPrimeiroPontoDeCorte() {
        return primeiroPontoDeCorte;
    }

    public void setPrimeiroPontoDeCorte(Integer primeiroPontoDeCorte) {
        this.primeiroPontoDeCorte = primeiroPontoDeCorte;
    }
    
    
}
