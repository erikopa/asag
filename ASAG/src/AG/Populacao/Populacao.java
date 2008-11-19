/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package AG.Populacao;

import AG.Configuracoes.Configuracoes;
import Interfaces.CromossomoAbstrato;
import Interfaces.Fitness;
import java.util.ArrayList;

/**
 *
 * @param <T> 
 * @author Eriko Verissimo
 */
public class Populacao<T extends CromossomoAbstrato> extends ArrayList<T> {

    private Configuracoes parametros;

    /**
     * 
     * @param parametros
     * @param populacaoVazia 
     * @throws java.lang.InstantiationException
     * @throws java.lang.ClassNotFoundException
     * @throws java.lang.IllegalAccessException
     */
    public Populacao(Configuracoes parametros, boolean populacaoVazia) throws InstantiationException, ClassNotFoundException, IllegalAccessException {
        this.parametros = parametros;

        if (!populacaoVazia) {
            for (int i = 0; i < parametros.getTamanhoPopulacao(); i++) {
                T cromossomo = (T) Class.forName(parametros.getClasseCromossomo()).newInstance();
                cromossomo.geraCromossomo(parametros.getTamanhoCromossomo());
                this.add(cromossomo);
            }
        }

    }

    /**
     * 
     * @param fitness 
     */
    public void Avalia(Fitness fitness) {


            fitness.Avalia(this);
        

    }
    
    
    public Configuracoes getParametros(){
        return this.parametros;
    }
}
