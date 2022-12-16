package webiblioteca;

import classes.Configs;
import classes.JsonLoader;
import gui.ClientGUI;
import java.io.File;

public class WebibliotecaApp {
    
    static Configs configs = new Configs();
    
    public static void main(String[] args) {
        String version = "1.0.5 (Build 17)";
        
        //config check
        String env = System.getenv("APPDATA");
        String path = env + "\\WebibliotecaFiles\\config";
        String windir = env + "\\WebibliotecaFiles";
        File wdir = new File(windir);
        if (! wdir.exists()){
            wdir.mkdirs();
        }
        File f = new File(path);
        if (! f.exists()){
            configs.saveProp("LARGEICONS", "true");
            configs.saveProp("DARKTHEME", "false");
        }
        
        //load the local file
        var jsonfile = new JsonLoader();
        var json = jsonfile.jsonLoader();
        
        //load GUI
        ClientGUI.main(json, version, configs);
        
    }
}