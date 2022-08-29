package webiblioteca;

import classes.JsonLoader;
import gui.ClientGUI;

public class WebibliotecaApp {
    
    public static void main(String[] args) {
        String version = "1.0.0 (Build 6)";

        //load the local file
        var jsonfile = new JsonLoader();
        var json = jsonfile.jsonLoader();
        
        //load GUI
        ClientGUI.main(json, version);
        
    }
}