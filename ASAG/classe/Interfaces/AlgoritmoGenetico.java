package Interfaces;

/**
 * @author Eriko Verissimo
 * @version 1.0
 * @created 10-ago-2008 23:29:24
 */
public interface AlgoritmoGenetico extends AlgoritmoEvolutivo {

	/**
	 * 
	 * @param taxaSobrevivencia
	 * @param taxaMutacao
	 * @param taxaCruzamento
	 * @param tamanhoPopulacao
	 * @param tamanhoCromossomo
	 * @param numGeracao
	 * @param metodoSelecao
	 * @param criterioParada
	 */
	public void AlgoritmoGenetico(int taxaSobrevivencia, double taxaMutacao, double taxaCruzamento, int tamanhoPopulacao, int tamanhoCromossomo, int numGeracao, String metodoSelecao, String criterioParada);

	/**
	 * Indica o Critério para a parada da execução do AG
	 * 
	 * @param criterioParada
	 */
	public void setCriterioParada(String criterioParada);

	/**
	 * 
	 * @param tipoFitness
	 * @param fitness
	 */
	public void setFitness(String tipoFitness, int fitness);

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
	 * @param taxaSobrevivencia
	 */
	public void setTaxaSobrevivencia(int taxaSobrevivencia);

}