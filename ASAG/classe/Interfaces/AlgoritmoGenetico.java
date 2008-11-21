package Interfaces;

/**
 * @author Eriko Verissimo
 * @version 1.0
 * @created 10-ago-2008 23:29:24
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
        

}