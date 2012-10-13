/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package BL.general;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author Alejandro
 */
public class Utilitarios {

    private Utilitarios() {
    }

    public static Utilitarios getInstance() {
        return UtilitariosHolder.INSTANCE;
    }

    private static class UtilitariosHolder {

        private static final Utilitarios INSTANCE = new Utilitarios();
    }

    public String getContents(File aFile) {
        //...checks on aFile are elided
        StringBuilder contents = new StringBuilder();

        try {
            //use buffering, reading one line at a time
            //FileReader always assumes default encoding is OK!
            BufferedReader input = new BufferedReader(new FileReader(aFile));
            try {
                String line;
                while ((line = input.readLine()) != null) {
                    contents.append(line);
                    contents.append(System.getProperty("line.separator"));
                }
            } finally {
                input.close();
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }

        return contents.toString();
    }
}
