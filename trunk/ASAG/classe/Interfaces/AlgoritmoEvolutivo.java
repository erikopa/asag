package Interfaces;

/**
 * @author Eriko Verissimo
 * @version 1.0
 * @created 10-ago-2008 23:29:24
 */
public interface AlgoritmoEvolutivo {

    /**
     * 
     */
    public void configurar();

        /**
         * 
         * @param classeCromossomo 
         * @param classeFitness 
         * @throws ClassCastException
         * @throws InstantiationException
         * @throws IllegalAccessException 
         */
        public void iniciarProcesso(String classeCromossomo,String classeFitness) throws ClassCastException,InstantiationException,IllegalAccessException;

}