
package classes;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import webiblioteca.WebibliotecaApp;
import org.apache.commons.io.IOUtils;

public class JsonLoader {
    
    public List<Map<String,String>> jsonLoader(){
        //build path
        String env = System.getenv("APPDATA");
        String path = env + "\\WebibliotecaFiles\\tablebooks.json";
        
        File f = new File(path);
        
        String windir = env + "\\WebibliotecaFiles";
        File wdir = new File(windir);
        
        if (! wdir.exists()){
            wdir.mkdirs();
        }
        
        //file not found
        if( !f.exists() ){
            exempleWriter.main();
        }
        
        InputStream istream = null;
            
            try {
                istream = new FileInputStream(path);
            } catch (FileNotFoundException ex) { Logger.getLogger(WebibliotecaApp.class.getName()).log(Level.SEVERE, null, ex); }
            
            String jsonTxt = null;
            
            try {
                jsonTxt = IOUtils.toString(istream, "UTF-8");
            } catch (IOException ex) { Logger.getLogger(WebibliotecaApp.class.getName()).log(Level.SEVERE, null, ex); }
            
            JsonParser mapper = new JsonParser();
            List<Map<String, String>> books = mapper.parse(jsonTxt);
            
            return books;
        
    }
    
}
