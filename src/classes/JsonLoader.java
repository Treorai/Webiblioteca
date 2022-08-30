
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
                exempleItem.put("display","LEWIS, As Crônicas de Nárnia");
                exempleItem.put("title","The Chronicles of Narnia");
                exempleItem.put("author","C. S. Lewis");
                exempleItem.put("sub","");
                exempleItem.put("vol","1 ao 7");
                exempleItem.put("edition","1");
                exempleItem.put("genre","Literatura Estrangeira");
                exempleItem.put("lang","Inglês");
                exempleItem.put("type","Impresso");
                exempleItem.put("located","Casa do Wagner");
                exempleItem.put("obs","Livros:\nVol.1 : The Magician's Nephew;\nVol.2 : The Lion, The Witch and the Wardrobe;\nVol.3 : The Horse and His Boy;\nVol.4 : Prince Caspian;\nVol.5 : The Voyage of the Dawn Treader;\nVol.6 : The Silver Chair;\nVol.7 : The Last Battale;");
                
            arrayItem.add(exempleItem);

            JSONObject exempleObj = new JSONObject();
            exempleObj.put("items",arrayItem);
            
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
                jsonTxt = IOUtils.toString(istream, "ISO-8859-1");
            } catch (IOException ex) { Logger.getLogger(WebibliotecaApp.class.getName()).log(Level.SEVERE, null, ex); }
            
            JsonParser mapper = new JsonParser();
            List<Map<String, String>> books = mapper.parse(jsonTxt);
            
            return books;
        
    }
    
}
