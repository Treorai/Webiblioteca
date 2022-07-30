
package classes;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import webiblioteca.WebibliotecaApp;
import org.apache.commons.io.IOUtils;
import org.json.simple.JSONObject;

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
            //build exemple map
            List<Map<String, String>> arrayItem = new ArrayList<>();
            
            HashMap<String, String> exempleItem = new HashMap<>();
                exempleItem.put("display", "Exemplo");
                exempleItem.put("title","Título do Livro");
                exempleItem.put("author","Autor do Livro");
                exempleItem.put("sub","Complemento do Livro");
                exempleItem.put("vol","1");
                exempleItem.put("edition","2");
                exempleItem.put("genre","Literatura Estrangeira");
                exempleItem.put("lang","Português");
                exempleItem.put("type","e-book");
                exempleItem.put("located","Computador da sala");
                exempleItem.put("obs","Este é um item gerado como exemplo na crição do arquivo onde serão armazenados os dados dos livros.");
                
            arrayItem.add(exempleItem);

            JSONObject exempleObj = new JSONObject();
            exempleObj.put("items",arrayItem);
            exempleObj.put("errorMessage","");
            
            try (
                FileWriter file = new FileWriter(path)) {
                file.write(exempleObj.toJSONString());
            } catch (IOException ex) {
                Logger.getLogger(JsonLoader.class.getName()).log(Level.SEVERE, null, ex);
            }
            
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
