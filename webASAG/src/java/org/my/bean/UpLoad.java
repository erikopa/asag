/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.my.bean;

import java.io.IOException;
import org.my.util.FileUpload;
import com.sun.tools.javac.Main;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpServletRequest;
import org.my.util.Enuns;

/** 
 *
 * @author renatohidaka
 * @version 
 */
public class UpLoad {

    private String geracao;
    private FileUpload fileUpload;
    private String plotar;

    public UpLoad() {
        fileUpload = new FileUpload();
    }

    public String salvar() throws IOException {
        if(fileUpload.getUploadedFile() != null && fileUpload.getUploadedFile().getFileName() != null){          
        fileUpload.salvarArquivo(fileUpload.getUploadedFile(), getRequest().getRealPath("") + "/WEB-INF/classes/AG/Binario", fileUpload.getUploadedFile().getFileName());
        compilarClasse();
        }
        
        return Enuns.SUCESSO;
    }

    public void compilarClasse() throws IOException {
        PrintWriter log = new PrintWriter(new FileWriter("log.txt"));
        String path = getRequest().getRealPath("") + "/WEB-INF/classes/AG/Binario/" + fileUpload.getUploadedFile().getFileName();

        //verifica se o .class já existe      
        int rc = Main.compile(new String[]{path, "-d", getRequest().getRealPath("") + "/WEB-INF/classes/"}, log);

        if (rc == 0) {
            System.out.println("compilado com sucesso!");
        } else {
            System.out.println(rc);
        }
    }

    public void instanciarClasse() throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, IllegalArgumentException, InvocationTargetException, FileNotFoundException {
//        URLClassLoader url = URLClassLoader.newInstance(
//                new URL[]{
//                    getClass().getResource("org.my.upload.Main")
//                });       

        String nomeClasse = fileUpload.getUploadedFile().getFileName().substring(0, fileUpload.getUploadedFile().getFileName().length() - 5);
        Class classe = Class.forName("org.my.upload." + nomeClasse);

        // cria instância da classe  
        Object instancia = classe.newInstance();
        // obtém o método desejado  
        Method metodo = classe.getMethod(
                "teste");

        // invoca o método, passando como parâmetro   
        // uma instância da classe que ele pertence  
        plotar = (String) metodo.invoke(instancia);
    
    }

    

    public HttpServletRequest getRequest() {

        ExternalContext externalContext = FacesContext.getCurrentInstance().getExternalContext();

        return (HttpServletRequest) externalContext.getRequest();
    }

    public synchronized void  uploadFile(org.richfaces.event.UploadEvent event) {
        if (null != event.getUploadItem().getFileName()) {
            fileUpload.setUploadedFile(event.getUploadItem());
           
        }
    }

    public FileUpload getFileUpload() {
        return fileUpload;
    }

    public void setFileUpload(FileUpload fileUpload) {
        this.fileUpload = fileUpload;
    }

    public String getGeracao() {
        return geracao;
    }

    public void setGeracao(String geracao) {
        this.geracao = geracao;
    }

    public String getPlotar() {
        return plotar;
    }

    public void setPlotar(String plotar) {
        this.plotar = plotar;
    }
}
    