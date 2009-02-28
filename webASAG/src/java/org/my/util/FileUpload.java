/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.my.util;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import org.richfaces.model.UploadItem;

/**
 *
 * @author renatohidaka
 */
public class FileUpload {

        private UploadItem uploadedFile;

    public FileUpload() {
    }

    public void salvarArquivo(UploadItem arquivo, String diretorio, String fileName) throws IOException {

        //criacao de um arquivo vazio no servidor
        File arquivoServidor = new File(diretorio, fileName);

        //salva o arquivo no servidor
        BufferedOutputStream output = null;
        FileInputStream input = null;
        PrintWriter print = null;
        try {

            input = new FileInputStream(arquivo.getFile());
            output = new BufferedOutputStream(new FileOutputStream(arquivoServidor));
            int count = 0;
            while ((count = input.read()) != -1) {
                output.write(count);
            }
            output.flush();
        } finally {
            if (output != null) {
                output.close();
            }
            if (input != null) {
                input.close();
            }
        }
    }

    public UploadItem getUploadedFile() {
        return uploadedFile;
    }

    public void setUploadedFile(UploadItem uploadedFile) {
        this.uploadedFile = uploadedFile;
    }
}

