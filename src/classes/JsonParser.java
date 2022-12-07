package classes;

import static java.lang.System.exit;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;

public class JsonParser {
    
    private static final Pattern REGEX_ITEMS = Pattern.compile(".*\\[(.+)\\].*");
    private static final Pattern REGEX_ATRIBUTOS_JSON = Pattern.compile("\"(.+?)\":\"(.*?)\"");
    
    public List<Map<String, String>> parse(String json) {

        Matcher matcher = REGEX_ITEMS.matcher(json);
        if (!matcher.find()) {
            exempleWriter.main();
            matcher = REGEX_ITEMS.matcher(json);
        }

        //items must be declared outside try block
        String[] items = new String[1];
        try{
            items = matcher.group(1).split("\\},\\{");
        }catch(IllegalStateException e){
            String errTxt = "Não foi possível encontrar livros cadastrados. O livro de exemplo será restaurado na proxima inicialização do programa.\nTente restaurar um backup recente e tente novamente. Se o problema persistir, verifique o manual do usuário.\nPor favor, reinicie o aplicativo.";
            JOptionPane.showMessageDialog(null, errTxt, "Probleminha", 0);
            exit(5);
        }
        

        List<Map<String, String>> dados = new ArrayList<>();

        for (String item : items) {

            Map<String, String> atributosItem = new HashMap<>();

            Matcher matcherAtributosJson = REGEX_ATRIBUTOS_JSON.matcher(item);
            while (matcherAtributosJson.find()) {
                String atributo = matcherAtributosJson.group(1);
                String valor = matcherAtributosJson.group(2);
                atributosItem.put(atributo, valor);
            }

            dados.add(atributosItem);
        }

        return dados;

    }
}