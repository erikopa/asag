package Interfaces;

import java.util.ArrayList;

/**
 * @author Eriko Verissimo
 * @version 2.0
 * @created 24-nov-2008 15:10:24
 */
public interface AlgoritmoGenetico extends AlgoritmoEvolutivo {

	
	
	/**
	 * Indica o Critério para a parada da execução do AG
	 * 
	 * @param criterioParada
	 */
	public void setCriterioParada(String criterioParada);

	
	/**
	 * Seleciona o Método de Seleção
	 * 
	 * @param selecao
	 */
	public void setMetodoSelecao(String selecao);

	/**
	 * 
	 * @param numGeracoes
	 */
	public void setNumGeracoes(int numGeracoes);

	/**
	 * 
	 * @param tamanhoCromossomo
	 */
	public void setTamanhoCromossomo(int tamanhoCromossomo);

	/**
	 * 
	 * @param tamanhoPopulacao
	 */
	public void setTamanhoPopulacao(int tamanhoPopulacao);

	/**
	 * 
	 * @param taxaCruzamento
	 */
	public void setTaxaCruzamento(double taxaCruzamento);

	/**
	 * 
	 * @param taxaMutacao
	 */
	public void setTaxaMutacao(double taxaMutacao);

	/**
	 * Percentual de Individuos da População que passar
         * para a proxima Geração
	 * 
	 * @param taxaSelecao
	 */
	public void setTaxaSelecao(int taxaSelecao);
        
        /**
         * 
         * @param classecromossomo 
         */
        public void setClasseCromossomo(String classecromossomo);
        
        /**
         * 
         * @param classefitness
         */
        public void setClasseFitness(String classefitness);
        
        /**
         * 
         * @param taxaElitismo
         */
        public void setElitismo(double taxaElitismo);
        
        /**
         * 
         * @param mascara
         */
        public void setMascara(CromossomoAbstrato mascara);
        
        /**
         * 
         * @param pontosCorte
         */
        public void setPontosCorte(int[] pontosCorte);
        
        /**
         * 
         * @param tipoCruzamento
         */
        public void setTipoCruzamento(String tipoCruzamento);
        
        /**
         * 
         * @param tipoMutacao
         */
        public void setTipoMutacao(String tipoMutacao);
        
        /**
         * 
         * @param alfabeto
         */
        public void setAlfabeto(ArrayList<Object> alfabeto);
        
        /**
         * 
         * @param tamGrupoTorneio
         */
        public void setTamanhoGrupoTorneio(int tamGrupoTorneio);
        
        

}