/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package AG.Operadores;

import AG.Configuracoes.Configuracoes;
import AG.Populacao.Populacao;
import Interfaces.CromossomoAbstrato;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author Eriko Verissimo
 */
public class Cruzamento{
    
    public static final int CRUZARUMPONTO = 0;
    public static final int CRUZARDOISPONTOS = 1;
    public static final int CRUZARNPONTOS = 3;
    public static final int CRUZARMASCARA = 4;
    
    
    
    public static <T extends CromossomoAbstrato<T>> Populacao<T> Cruzar(int metodoCruzamento, Configuracoes parametros, Populacao<T> populacao) throws InstantiationException, ClassNotFoundException, IllegalAccessException{
    
        switch(metodoCruzamento){
            case CRUZARUMPONTO : return CruzarUmPonto(parametros.getPontosCorte()[0], populacao);
            case CRUZARDOISPONTOS : return CruzarDoisPontos(parametros.getPontosCorte()[0],parametros.getPontosCorte()[1], populacao);
            case CRUZARNPONTOS : return CruzarNPontos(parametros.getPontosCorte(), populacao);
            case CRUZARMASCARA : return CruzarMascara((T) parametros.getMascara(), populacao);
            default :  return CruzarNPontos(parametros.getPontosCorte(), populacao);
        }
    }
    
    
    
    /**
     * 
     * @param <T>
     * @param pontoCorte
     * @param ListaPais
     * @return
     * @throws InstantiationException
     * @throws ClassNotFoundException
     * @throws IllegalAccessException 
     */
  
    public static <T extends CromossomoAbstrato<T>> Populacao<T> CruzarUmPonto(int pontoCorte, Populacao<T> ListaPais) throws InstantiationException, ClassNotFoundException, IllegalAccessException{
        List A1, A2, B1, B2;
        //Cria os cromossomos filhos e o cromossomo de cruzamento
        Populacao<T> pais = new Populacao<T>(ListaPais.getParametros(),true);
        Populacao<T> maes = new Populacao<T>(ListaPais.getParametros(),true);
        Populacao<T> filhos = new Populacao<T>(ListaPais.getParametros(),true);
        pais.addAll(ListaPais.subList(0, (ListaPais.size() / 2)));
        maes.addAll(ListaPais.subList((ListaPais.size() / 2), ListaPais.size()));


        for (int i = 0; i < ListaPais.size(); i++) {
            filhos.add((T) pais.get(0).clone());
            filhos.get(i).clear();

        }


        int j = -1;
        //Definição de Cortes
        for (int i = 0; i < (ListaPais.size() / 2); i++) {
            A1 = pais.get(i).subList(0, pontoCorte);
            A2 = maes.get(i).subList(0, pontoCorte);
            B1 = pais.get(i).subList(pontoCorte, pais.get(0).size());
            B2 = maes.get(i).subList(pontoCorte, maes.get(0).size());

            //Primeiro Cruzamento

            j++;
            Collections.addAll(filhos.get(j), B2.toArray());
            Collections.addAll(filhos.get(j), A1.toArray());

            //Segundo Cruzamento
            j++;
            Collections.addAll(filhos.get(j), B1.toArray());
            Collections.addAll(filhos.get(j), A2.toArray());
        }

        if(filhos.size()%2 != 0){
            filhos.remove(filhos.size()-1);
        }
        return filhos;

    }

    /**
     * 
     * @param <T>
     * @param NumPontos
     * @param ListaPais
     * @return
     * @throws java.lang.InstantiationException
     * @throws java.lang.ClassNotFoundException
     * @throws java.lang.IllegalAccessException
     */
    public static <T extends CromossomoAbstrato<T>> Populacao<T> CruzarNPontos(int[] NumPontos, Populacao<T> ListaPais) throws InstantiationException, ClassNotFoundException, IllegalAccessException{
        ArrayList<Integer> pontos = new ArrayList<Integer>();
        //Cria os cromossomos filhos e o cromossomo de cruzamento
        Populacao<T> pais = new Populacao<T>(ListaPais.getParametros(),true);
        Populacao<T> maes = new Populacao<T>(ListaPais.getParametros(),true);
        Populacao<T> filhos = new Populacao<T>(ListaPais.getParametros(),true);
        int tamanhoCromossomo = ListaPais.getParametros().getTamanhoCromossomo();
        
        pais.addAll(ListaPais.subList(0, (ListaPais.size() / 2)));
        maes.addAll(ListaPais.subList((ListaPais.size() / 2), ListaPais.size()));


        for (int i = 0; i < ListaPais.size(); i++) {
            filhos.add((T) pais.get(0).clone());
            filhos.get(i).clear();

        }
        int contador=0;
        while(true){
            
            pontos.add(NumPontos[contador]);
            
            if(pontos.size() == NumPontos.length)
                break;
            
            contador++;
        }
        
        Collections.sort(pontos);
        int a = 0;
        int j = -1;
        for (int i = 0; i < pais.size(); i++) {
            //filho 1
            j++;
            a=0;
            for (int m = 0; m < pontos.size(); m++) {
                if (m % 2 == 0) {
                    Collections.addAll(filhos.get(j), pais.get(i).subList(a, pontos.get(m)).toArray());
                    a = pontos.get(m);
                    if (a == pontos.get((pontos.size() - 1))) {
                        Collections.addAll(filhos.get(j), maes.get(i).subList(a, tamanhoCromossomo).toArray());
                        break;
                    }
                    
                } else {
                    Collections.addAll(filhos.get(j), maes.get(i).subList(a, pontos.get(m)).toArray());
                    a = pontos.get(m);
                    if (a == pontos.get((pontos.size() - 1))) {
                        Collections.addAll(filhos.get(j), pais.get(i).subList(a, tamanhoCromossomo).toArray());
                        break;
                    }
                }
            
            }
            
            
            //filho 2
            j++;
            a=0;
            for (int m = 0; m <  pontos.size(); m++) {
                if (m % 2 == 0) {
                    Collections.addAll(filhos.get(j), maes.get(i).subList(a, pontos.get(m)).toArray());
                    a = pontos.get(m);
                    if (a == pontos.get((pontos.size() - 1))) {
                        Collections.addAll(filhos.get(j), pais.get(i).subList(a, pais.get(i).size()).toArray());
                        break;
                    }
                } else {
                    Collections.addAll(filhos.get(j), pais.get(i).subList(a,pontos.get(m)).toArray());
                    a = pontos.get(m);
                    if (a == pontos.get((pontos.size() - 1))) {
                        Collections.addAll(filhos.get(j), maes.get(i).subList(a, maes.get(i).size()).toArray());
                        break;
                    }
                }
            }
            
        }
        if(filhos.size()%2 != 0){
            filhos.remove(filhos.size()-1);
        }

        return filhos;
    }

    /**
     * 
     * @param <T>
     * @param ponto1
     * @param ponto2
     * @param ListaPais
     * @return
     * @throws java.lang.InstantiationException
     * @throws java.lang.ClassNotFoundException
     * @throws java.lang.IllegalAccessException
     */
    public static <T extends CromossomoAbstrato<T>> Populacao<T> CruzarDoisPontos(int ponto1,int ponto2, Populacao<T> ListaPais) throws InstantiationException, ClassNotFoundException, IllegalAccessException{
        ArrayList<Integer> pontos = new ArrayList<Integer>();
        //Cria os cromossomos filhos e o cromossomo de cruzamento
        Populacao<T> pais = new Populacao<T>(ListaPais.getParametros(),true);
        Populacao<T> maes = new Populacao<T>(ListaPais.getParametros(),true);
        Populacao<T> filhos = new Populacao<T>(ListaPais.getParametros(),true);
        pais.addAll(ListaPais.subList(0, (ListaPais.size() / 2)));
        maes.addAll(ListaPais.subList((ListaPais.size() / 2), ListaPais.size()));


        for (int i = 0; i < ListaPais.size(); i++) {
            filhos.add((T) pais.get(0).clone());
            filhos.get(i).clear();

        }

            pontos.add(ponto1);
            pontos.add(ponto2);
        
        Collections.sort(pontos);
        int a = 0;
        int j = -1;
        for (int i = 0; i < pais.size(); i++) {
            //filho 1
            j++;
            a=0;
            for (int m = 0; m < pontos.size(); m++) {
                if (m % 2 == 0) {
                    Collections.addAll(filhos.get(j), pais.get(i).subList(a, pontos.get(m)).toArray());
                    a = pontos.get(m);
                    if (a == pontos.get((pontos.size() - 1))) {
                        Collections.addAll(filhos.get(j), maes.get(i).subList(a, maes.get(i).size()).toArray());
                        break;
                    }
                } else {
                    Collections.addAll(filhos.get(j), maes.get(i).subList(a, pontos.get(m)).toArray());
                    a = pontos.get(m);
                    if (a == pontos.get((pontos.size() - 1))) {
                        Collections.addAll(filhos.get(j), pais.get(i).subList(a, pais.get(i).size()).toArray());
                        break;
                    }
                }
            }
            
            //filho 2
            j++;
            a=0;
            for (int m = 0; m <  pontos.size(); m++) {
                if (m % 2 == 0) {
                    Collections.addAll(filhos.get(j), maes.get(i).subList(a, pontos.get(m)).toArray());
                    a = pontos.get(m);
                    if (a == pontos.get((pontos.size() - 1))) {
                        Collections.addAll(filhos.get(j), pais.get(i).subList(a, pais.get(i).size()).toArray());
                    }
                } else {
                    Collections.addAll(filhos.get(j), pais.get(i).subList(a,pontos.get(m)).toArray());
                    a = pontos.get(m);
                    if (a == pontos.get((pontos.size() - 1))) {
                        Collections.addAll(filhos.get(j), maes.get(i).subList(a, maes.get(i).size()).toArray());
                    }
                }
            }

        }
         if(filhos.size()%2 != 0){
            filhos.remove(filhos.size()-1);
        }
        return filhos;
    }

    /**
     * 
     * @param <T>
     * @param cromossomo
     * @param ListaPais
     * @return
     * @throws java.lang.InstantiationException
     * @throws java.lang.ClassNotFoundException
     * @throws java.lang.IllegalAccessException
     */
    public static <T extends CromossomoAbstrato<T>> Populacao<T> CruzarMascara(T cromossomo, Populacao<T> ListaPais) throws InstantiationException, ClassNotFoundException, IllegalAccessException{
     
        //Cria os cromossomos filhos e o cromossomo de cruzamento
        Populacao<T> pais = new Populacao<T>(ListaPais.getParametros(),true);
        Populacao<T> maes = new Populacao<T>(ListaPais.getParametros(),true);
        Populacao<T> filhos = new Populacao<T>(ListaPais.getParametros(),true);
        pais.addAll(ListaPais.subList(0, (ListaPais.size() / 2)));
        maes.addAll(ListaPais.subList((ListaPais.size() / 2), ListaPais.size()));
        for (int i = 0; i < ListaPais.size(); i++) {
            filhos.add((T) pais.get(0).clone());
            filhos.get(i).clear();

        }
        int j=0;
        for(int i=0;i<pais.size();i++){
            for(int m=0;m<cromossomo.size();m++){
                if(cromossomo.getGene(m).equals(1)){
                    filhos.get(j).add(m, maes.get(i).getGene(m));
                    filhos.get(j+1).add(m, pais.get(i).getGene(m));
                }else{
                    filhos.get(j).add(m, pais.get(i).getGene(m));
                    filhos.get(j+1).add(m, maes.get(i).getGene(m));
                }
            }
            j++;
            j++;
        }

         if(filhos.size()%2 != 0){
            filhos.remove(filhos.size()-1);
        }
        return filhos;

     }

    
}
