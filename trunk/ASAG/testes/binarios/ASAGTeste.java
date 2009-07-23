/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package binarios;

import AG.AlgoritmoGenetico;
import AG.Configuracoes.Configuracoes;
import AG.Operadores.Cruzamento;
import AG.Operadores.Mutacao;
import AG.Selecao.Selecao;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author Eriko Verissimo
 */
public class ASAGTeste {
    @Test
    public void ASAGTest01(){
        AlgoritmoGenetico algoritmo = new AlgoritmoGenetico();
        algoritmo.setTamanhoCromossomo(30);
        algoritmo.setTamanhoPopulacao(300);
        algoritmo.setElitismo(0.01);
        algoritmo.setTaxaSelecao(0.7);
        algoritmo.setTaxaMutacao(0.06);
        algoritmo.setTipoSelecao(Selecao.ROLETA);
        //algoritmo.setTamanhoGrupoTorneio(5);
        algoritmo.setTipoCruzamento(Cruzamento.CRUZARNPONTOS);
        algoritmo.setTipoMutacao(Mutacao.MUTARBINARIO);
        algoritmo.setPontosCorte(new int[5]);
        algoritmo.setCriterioParada(Configuracoes.PARADAGERACAO);
        algoritmo.setParadaGeracoes(1000);
        algoritmo.setFitnessObjetivo(1000);
        try {
            algoritmo.iniciarProcesso("AG.Binario.CromossomoBinario", "AG.Binario.FitnessBinario");
        } catch (ClassCastException ex) {
            Logger.getLogger(ASAGTeste.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            Logger.getLogger(ASAGTeste.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(ASAGTeste.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}

}