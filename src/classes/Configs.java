package classes;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Configs {
    
    public static Properties prop = new Properties();
    
    public void saveProp(String key, String value){
        String env = System.getenv("APPDATA");
        String path = env + "\\WebibliotecaFiles\\config";
        
        String windir = env + "\\WebibliotecaFiles";
        File wdir = new File(windir);
        if (! wdir.exists()){
            wdir.mkdirs();
        }
        
        try {
            prop.setProperty(key, value);
            prop.store(new FileOutputStream(path), null);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Configs.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex){
            Logger.getLogger(Configs.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public String getProp(String key){
        String env = System.getenv("APPDATA");
        String path = env + "\\WebibliotecaFiles\\config";
        
        String windir = env + "\\WebibliotecaFiles";
        File wdir = new File(windir);
        if (! wdir.exists()){
            wdir.mkdirs();
        }
        
        String value = "";
        try {
            prop.load(new FileInputStream(path));
            value = prop.getProperty(key);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Configs.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex){
            Logger.getLogger(Configs.class.getName()).log(Level.SEVERE, null, ex);
        }
        return value;
    }
    
}
