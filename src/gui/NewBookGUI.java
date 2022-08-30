package gui;

import classes.JsonLoader;
import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.json.simple.JSONObject;

public class NewBookGUI extends javax.swing.JDialog {
    private String campoDisplay;
    private String campoAuthor;
    private String campoTitle;
    private String campoSub;
    private String campoVol;
    private String campoEdition;
    private String campoGenre;
    private String campoLang;
    private String campoType;
    private String campoLocated;
    private String campoObs;

    
    public NewBookGUI(java.awt.Frame parent, List<Map<String,String>> json, String[] lista) {
        
        super(parent, true); //only one NewBookGUI at a time
        
        initComponents();
        myInitComponents(json, lista);
        
        setLocationRelativeTo(null);
        setResizable(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        nb_button_cancel = new javax.swing.JButton();
        nb_button_save = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        nb_jl_display = new javax.swing.JLabel();
        nb_tf_txtdisplay = new javax.swing.JTextField();
        nb_jl_author = new javax.swing.JLabel();
        nb_jl_title = new javax.swing.JLabel();
        nb_jl_sub = new javax.swing.JLabel();
        nb_jl_vol = new javax.swing.JLabel();
        nb_jl_edition = new javax.swing.JLabel();
        nb_jl_genre = new javax.swing.JLabel();
        nb_jl_lang = new javax.swing.JLabel();
        nb_jl_located = new javax.swing.JLabel();
        nb_jl_type = new javax.swing.JLabel();
        nb_tf_author = new javax.swing.JTextField();
        nb_tf_title = new javax.swing.JTextField();
        nb_tf_sub = new javax.swing.JTextField();
        nb_tf_vol = new javax.swing.JTextField();
        nb_tf_edition = new javax.swing.JTextField();
        nb_tf_genre = new javax.swing.JTextField();
        nb_tf_lang = new javax.swing.JTextField();
        nb_tf_located = new javax.swing.JTextField();
        nb_jl_obs = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        nb_txtArea_obs = new javax.swing.JTextArea();
        nb_cb_type = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastrar novo livro");

        nb_button_cancel.setText("Cancelar");
        nb_button_cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nb_button_cancelActionPerformed(evt);
            }
        });

        nb_button_save.setText("Salvar");

        nb_jl_display.setText("Nome de Exibi��o:");

        nb_tf_txtdisplay.setToolTipText("Nome que ser� exibido na lista de livros");

        nb_jl_author.setText("Autor:");

        nb_jl_title.setText("T�tulo");

        nb_jl_sub.setText("Subt�tulo:");

        nb_jl_vol.setText("Volume:");

        nb_jl_edition.setText("Edi��o:");

        nb_jl_genre.setText("G�nero:");

        nb_jl_lang.setText("Idioma:");

        nb_jl_located.setText("Local:");

        nb_jl_type.setText("Tipo:");

        nb_tf_author.setToolTipText("");

        nb_tf_title.setToolTipText("");

        nb_tf_sub.setToolTipText("Complemento do t�tulo");

        nb_tf_located.setToolTipText("Local onde o livro � guardado, computador em que est� gravado ou outra especifica��o");

        nb_jl_obs.setText("Observa��o:");

        nb_txtArea_obs.setColumns(20);
        nb_txtArea_obs.setRows(5);
        nb_txtArea_obs.setToolTipText("Coloque observa��es ou detalhes adicionais aqui");
        jScrollPane1.setViewportView(nb_txtArea_obs);

        nb_cb_type.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Outro", "Impresso", "e-Book", "Xerox", "Audiobook" }));
        nb_cb_type.setToolTipText("");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1)
                    .addComponent(nb_tf_txtdisplay)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nb_jl_author)
                            .addComponent(nb_jl_title)
                            .addComponent(nb_jl_sub)
                            .addComponent(nb_jl_vol)
                            .addComponent(nb_jl_edition)
                            .addComponent(nb_jl_genre)
                            .addComponent(nb_jl_lang)
                            .addComponent(nb_jl_located)
                            .addComponent(nb_jl_type)
                            .addComponent(nb_jl_display)
                            .addComponent(nb_jl_obs))
                        .addGap(3, 3, 3)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nb_tf_author)
                            .addComponent(nb_tf_title)
                            .addComponent(nb_tf_sub)
                            .addComponent(nb_tf_vol)
                            .addComponent(nb_tf_edition)
                            .addComponent(nb_tf_genre)
                            .addComponent(nb_tf_lang)
                            .addComponent(nb_tf_located)
                            .addComponent(jScrollPane1)
                            .addComponent(nb_cb_type, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(nb_jl_display)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(nb_tf_txtdisplay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nb_jl_author)
                    .addComponent(nb_tf_author, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nb_jl_title)
                    .addComponent(nb_tf_title, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nb_jl_sub)
                    .addComponent(nb_tf_sub, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nb_jl_vol)
                    .addComponent(nb_tf_vol, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nb_jl_edition)
                    .addComponent(nb_tf_edition, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nb_jl_genre)
                    .addComponent(nb_tf_genre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nb_jl_lang)
                    .addComponent(nb_tf_lang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nb_jl_located)
                    .addComponent(nb_tf_located, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nb_jl_type)
                    .addComponent(nb_cb_type, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(nb_jl_obs)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 132, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(232, Short.MAX_VALUE)
                .addComponent(nb_button_save, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(nb_button_cancel, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nb_button_cancel)
                    .addComponent(nb_button_save))
                .addGap(15, 15, 15))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void myInitComponents(List<Map<String,String>> json, String[] lista){
        nb_button_save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nb_button_saveActionPerformed(evt, json, lista);
            }
        });
    
    }
    private void nb_button_cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nb_button_cancelActionPerformed
        close();
    }//GEN-LAST:event_nb_button_cancelActionPerformed

    private void nb_button_saveActionPerformed(java.awt.event.ActionEvent evt, List<Map<String,String>> json, String[] lista) {
        //Build camps
        this.campoDisplay = this.nb_tf_txtdisplay.getText();
        this.campoAuthor = this.nb_tf_author.getText();
        this.campoTitle = this.nb_tf_title.getText();
        this.campoSub = this.nb_tf_sub.getText();
        this.campoVol = this.nb_tf_vol.getText();
        this.campoEdition = this.nb_tf_edition.getText();
        this.campoGenre = this.nb_tf_genre.getText();
        this.campoLang = this.nb_tf_lang.getText();
        this.campoType = this.nb_cb_type.getSelectedItem().toString();
        this.campoLocated = this.nb_tf_located.getText();
        this.campoObs = this.nb_txtArea_obs.getText();
        
        
        //boolean check for already existing displayname
        boolean newDisplay = true;
        for(int i = 0; i < json.size(); i++){
            if (json.get(i).get("display").equals(this.getCampoDisplay() ) ){
                newDisplay = false;
                break;
            }
        }
        
        //Se titulo vazio ou repetido throw err
        if(this.getCampoDisplay().equals("")){
            dialog_EmptyDisplay.main(this);
        } else if(newDisplay == false){
            dialog_AlreadyExists.main(this);
        } else if(this.campoDisplay.contains("\"") || this.campoAuthor.contains("\"") || this.campoTitle.contains("\"") || this.campoSub.contains("\"") || this.campoVol.contains("\"") || this.campoEdition.contains("\"") || this.campoGenre.contains("\"") || this.campoLang.contains("\"") || this.campoType.contains("\"") || this.campoLocated.contains("\"") || this.campoObs.contains("\"")  ){
            //check for " vulnerabilities
            qMarksErr();
        } else{
            //Construir um jsonObj
        
            HashMap<String, String> pushItem = new HashMap<>();
                pushItem.put("display",this.getCampoDisplay());
                pushItem.put("title",this.getCampoTitle());
                pushItem.put("author",this.getCampoAuthor());
                pushItem.put("sub",this.getCampoSub());
                pushItem.put("vol",this.getCampoVolume());
                pushItem.put("edition",this.getCampoEdition());
                pushItem.put("genre",this.getCampoGenre());
                pushItem.put("lang",this.getCampoLang());
                pushItem.put("type",this.getCampoType());
                pushItem.put("located",this.getCampoLocated());
                pushItem.put("obs",this.getCampoObs());
                
            json.add(pushItem);

            JSONObject newObj = new JSONObject();
            newObj.put("items",json);
            
            //setup for rewrite
            String env = System.getenv("APPDATA");
            String path = env + "\\WebibliotecaFiles\\tablebooks.json";
            File f = new File(path);
            if(!f.exists()){
                System.exit(4);
            }
            
            //Update no db
            try (
                FileWriter file = new FileWriter(path)) {
                file.write(newObj.toJSONString());
            } catch (IOException ex) {
                Logger.getLogger(JsonLoader.class.getName()).log(Level.SEVERE, null, ex);
            }
            this.dispose();
        }
        
    }   
    
    public static void main(java.awt.Frame parent, List<Map<String,String>> json, String[] lista) {
        java.awt.EventQueue.invokeLater(() -> {
            new NewBookGUI(parent, json, lista).setVisible(true);
        });
        
    }
    
    
    public void close(){
        WindowEvent closeWindow = new WindowEvent(this, WindowEvent.WINDOW_CLOSING);
        Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(closeWindow);
    }
    
    private void qMarksErr(){
        dialog_QMErrGUI.main(this);
    }
    
// <editor-fold defaultstate="collapsed" desc="Getters">

    public String getCampoAuthor() {
        return campoAuthor;
    }

    public String getCampoTitle() {
        return campoTitle;
    }

    public String getCampoSub() {
        return campoSub;
    }

    public String getCampoVolume() {
        return campoVol;
    }

    public String getCampoEdition() {
        return campoEdition;
    }

    public String getCampoGenre() {
        return campoGenre;
    }

    public String getCampoLang() {
        return campoLang;
    }

    public String getCampoType() {
        return campoType;
    }

    public String getCampoLocated() {
        return campoLocated;
    }

    public String getCampoObs() {
        return campoObs;
    }
    
    public String getCampoDisplay() {
        return campoDisplay;
    }
// </editor-fold>
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JButton nb_button_cancel;
    private javax.swing.JButton nb_button_save;
    private javax.swing.JComboBox<String> nb_cb_type;
    private javax.swing.JLabel nb_jl_author;
    private javax.swing.JLabel nb_jl_display;
    private javax.swing.JLabel nb_jl_edition;
    private javax.swing.JLabel nb_jl_genre;
    private javax.swing.JLabel nb_jl_lang;
    private javax.swing.JLabel nb_jl_located;
    private javax.swing.JLabel nb_jl_obs;
    private javax.swing.JLabel nb_jl_sub;
    private javax.swing.JLabel nb_jl_title;
    private javax.swing.JLabel nb_jl_type;
    private javax.swing.JLabel nb_jl_vol;
    private javax.swing.JTextField nb_tf_author;
    private javax.swing.JTextField nb_tf_edition;
    private javax.swing.JTextField nb_tf_genre;
    private javax.swing.JTextField nb_tf_lang;
    private javax.swing.JTextField nb_tf_located;
    private javax.swing.JTextField nb_tf_sub;
    private javax.swing.JTextField nb_tf_title;
    private javax.swing.JTextField nb_tf_txtdisplay;
    private javax.swing.JTextField nb_tf_vol;
    private javax.swing.JTextArea nb_txtArea_obs;
    // End of variables declaration//GEN-END:variables
}
