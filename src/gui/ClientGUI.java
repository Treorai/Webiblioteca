package gui;

import classes.pushArray;
import classes.Configs;
import classes.JsonLoader;
import com.formdev.flatlaf.intellijthemes.FlatCyanLightIJTheme;
//import com.formdev.flatlaf.intellijthemes.FlatGruvboxDarkSoftIJTheme; //deprecated brown theme
import com.formdev.flatlaf.intellijthemes.FlatArcDarkIJTheme;
import java.util.List;
import java.util.Map;
import java.io.File;
import java.io.IOException;
import java.awt.Desktop;
import java.io.FileWriter;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.json.simple.JSONObject;

public class ClientGUI extends javax.swing.JFrame {
    
    public ClientGUI(List<Map<String,String>> json, String version, Configs configs) {
        String[] lista = new String[json.size()];
        for(int i = 0; i < json.size(); i++){
            lista[i] = json.get(i).get("display");
        }
        
        beforeInitComponents(json, lista);
        initComponents();
        laterInitComponents(json, lista, version, configs);
        if(configs.getProp("LARGEICONS").equals("true")){
            bigLayoutInitComponents();
        }
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

        jScrollPane_Titles = new javax.swing.JScrollPane(list_titles);
        jPanel_Info = new javax.swing.JPanel();
        jl_author = new javax.swing.JLabel();
        jtx_author = new javax.swing.JTextField();
        jl_title = new javax.swing.JLabel();
        jtx_title = new javax.swing.JTextField();
        jl_sub = new javax.swing.JLabel();
        jtx_sub = new javax.swing.JTextField();
        jl_genre = new javax.swing.JLabel();
        jtx_genre = new javax.swing.JTextField();
        jl_vol = new javax.swing.JLabel();
        jtx_vol = new javax.swing.JTextField();
        jl_type = new javax.swing.JLabel();
        jtx_type = new javax.swing.JTextField();
        jl_edition = new javax.swing.JLabel();
        jtx_edition = new javax.swing.JTextField();
        jl_located = new javax.swing.JLabel();
        jtx_located = new javax.swing.JTextField();
        jl_lang = new javax.swing.JLabel();
        jtx_lang = new javax.swing.JTextField();
        jl_obs = new javax.swing.JLabel();
        jScrollPane_obs = new javax.swing.JScrollPane();
        jtxa_obs = new javax.swing.JTextArea();
        jl_displayOutdoor = new javax.swing.JLabel();
        jl_magnif = new javax.swing.JLabel();
        jtx_searchbox = new javax.swing.JTextField();
        jb_search = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jm_file = new javax.swing.JMenu();
        jm_file_new = new javax.swing.JMenuItem();
        jm_file_edit = new javax.swing.JMenuItem();
        jm_file_delete = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jm_file_exit = new javax.swing.JMenuItem();
        jm_options = new javax.swing.JMenu();
        jm_options_vf = new javax.swing.JMenuItem();
        jm_options_settings = new javax.swing.JMenuItem();
        jm_help = new javax.swing.JMenu();
        jm_help_manual = new javax.swing.JMenuItem();
        jm_help_about = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("WEBiblioteca");

        jPanel_Info.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jl_author.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        jl_author.setText("Autor:");

        jtx_author.setEditable(false);
        jtx_author.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N

        jl_title.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        jl_title.setText("T??tulo");

        jtx_title.setEditable(false);
        jtx_title.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N

        jl_sub.setText("Subt??tulo");

        jtx_sub.setEditable(false);

        jl_genre.setText("G??nero:");

        jtx_genre.setEditable(false);

        jl_vol.setText("Volume:");

        jtx_vol.setEditable(false);

        jl_type.setText("Tipo:");

        jtx_type.setEditable(false);

        jl_edition.setText("Edi????o:");

        jtx_edition.setEditable(false);

        jl_located.setText("Local:");

        jtx_located.setEditable(false);

        jl_lang.setText("Idioma:");

        jtx_lang.setEditable(false);

        jl_obs.setText("Observa????es");

        jtxa_obs.setEditable(false);
        jtxa_obs.setColumns(20);
        jtxa_obs.setRows(5);
        jScrollPane_obs.setViewportView(jtxa_obs);

        jl_displayOutdoor.setText(" ");

        javax.swing.GroupLayout jPanel_InfoLayout = new javax.swing.GroupLayout(jPanel_Info);
        jPanel_Info.setLayout(jPanel_InfoLayout);
        jPanel_InfoLayout.setHorizontalGroup(
            jPanel_InfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_InfoLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel_InfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel_InfoLayout.createSequentialGroup()
                        .addGroup(jPanel_InfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jl_located)
                            .addComponent(jl_obs))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel_InfoLayout.createSequentialGroup()
                        .addGroup(jPanel_InfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_InfoLayout.createSequentialGroup()
                                .addGroup(jPanel_InfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jl_title)
                                    .addComponent(jl_author))
                                .addGap(38, 38, 38)
                                .addGroup(jPanel_InfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jtx_title, javax.swing.GroupLayout.DEFAULT_SIZE, 571, Short.MAX_VALUE)
                                    .addComponent(jtx_author)
                                    .addComponent(jl_displayOutdoor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(jPanel_InfoLayout.createSequentialGroup()
                                .addGroup(jPanel_InfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jl_genre)
                                    .addComponent(jl_sub)
                                    .addComponent(jl_type))
                                .addGap(34, 34, 34)
                                .addGroup(jPanel_InfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane_obs, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel_InfoLayout.createSequentialGroup()
                                        .addGroup(jPanel_InfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jtx_located, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(jPanel_InfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jtx_type, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jtx_genre, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel_InfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jl_lang)
                                            .addComponent(jl_edition)
                                            .addComponent(jl_vol))
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel_InfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jtx_vol, javax.swing.GroupLayout.DEFAULT_SIZE, 189, Short.MAX_VALUE)
                                            .addComponent(jtx_edition)
                                            .addComponent(jtx_lang)))
                                    .addComponent(jtx_sub))))
                        .addContainerGap())))
        );
        jPanel_InfoLayout.setVerticalGroup(
            jPanel_InfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_InfoLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jl_displayOutdoor)
                .addGap(18, 18, 18)
                .addGroup(jPanel_InfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jl_author)
                    .addComponent(jtx_author, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel_InfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jl_title)
                    .addComponent(jtx_title, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(46, 46, 46)
                .addGroup(jPanel_InfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jl_sub)
                    .addComponent(jtx_sub, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel_InfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jl_genre)
                    .addComponent(jl_vol)
                    .addComponent(jtx_vol, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtx_genre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel_InfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jl_type)
                    .addComponent(jl_edition)
                    .addComponent(jtx_type, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtx_edition, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel_InfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jl_located)
                    .addComponent(jtx_located, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jl_lang)
                    .addComponent(jtx_lang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addComponent(jl_obs)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane_obs, javax.swing.GroupLayout.DEFAULT_SIZE, 165, Short.MAX_VALUE)
                .addContainerGap())
        );

        jl_magnif.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jl_magnif.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/pesquisar.png"))); // NOI18N

        jb_search.setText("Buscar");

        jm_file.setText("Arquivo");

        jm_file_new.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/icons/small/page-white-add-icon.png"))); // NOI18N
        jm_file_new.setText("Novo");
        jm_file.add(jm_file_new);

        jm_file_edit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/icons/small/page-white-edit-icon.png"))); // NOI18N
        jm_file_edit.setText("Editar");
        jm_file_edit.setEnabled(false);
        jm_file.add(jm_file_edit);

        jm_file_delete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/icons/small/page-white-delete-icon.png"))); // NOI18N
        jm_file_delete.setText("Excluir");
        jm_file_delete.setEnabled(false);
        jm_file.add(jm_file_delete);
        jm_file.add(jSeparator1);

        jm_file_exit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/icons/small/door_in.png"))); // NOI18N
        jm_file_exit.setText("Sair");
        jm_file_exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jm_file_exitActionPerformed(evt);
            }
        });
        jm_file.add(jm_file_exit);

        jMenuBar1.add(jm_file);

        jm_options.setText("Op????es");

        jm_options_vf.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/icons/small/folder-explore-icon.png"))); // NOI18N
        jm_options_vf.setText("Abrir pasta de arquivo");
        jm_options_vf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jm_options_vfActionPerformed(evt);
            }
        });
        jm_options.add(jm_options_vf);

        jm_options_settings.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/icons/small/brick-edit-icon.png"))); // NOI18N
        jm_options_settings.setText("Configura????es");
        jm_options_settings.setToolTipText("");
        jm_options.add(jm_options_settings);

        jMenuBar1.add(jm_options);

        jm_help.setText("Ajuda");

        jm_help_manual.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/icons/small/help-icon.png"))); // NOI18N
        jm_help_manual.setText("Manual");
        jm_help_manual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jm_help_manualActionPerformed(evt);
            }
        });
        jm_help.add(jm_help_manual);

        jm_help_about.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/icons/small/information-icon.png"))); // NOI18N
        jm_help_about.setText("Sobre");
        jm_help.add(jm_help_about);

        jMenuBar1.add(jm_help);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jl_magnif, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtx_searchbox, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jb_search, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane_Titles, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jPanel_Info, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jl_magnif, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jtx_searchbox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jb_search)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel_Info, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane_Titles))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        jPanel_Info.getAccessibleContext().setAccessibleName("");
        jPanel_Info.getAccessibleContext().setAccessibleDescription("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jm_file_exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jm_file_exitActionPerformed
        // Quit program
        System.exit(0);
    }//GEN-LAST:event_jm_file_exitActionPerformed

    private void jm_options_vfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jm_options_vfActionPerformed
        //Open windows files
        String env = System.getenv("APPDATA");
        String folderPath = env + "\\WebibliotecaFiles";
        
        Desktop d = null;
        File f = new File(folderPath);
        if(Desktop.isDesktopSupported()){
            d = Desktop.getDesktop();
            try{
                d.open(f);
            } catch (IOException ex) {
                Logger.getLogger(ClientGUI.class.getName()).log(Level.SEVERE, null, ex);
            } 
        }
    }//GEN-LAST:event_jm_options_vfActionPerformed

    private void jm_help_manualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jm_help_manualActionPerformed
        try {
            java.awt.Desktop.getDesktop().browse(new URI("https://github.com/Treorai/Webiblioteca/blob/main/User%20Manual/Manual%20do%20Usu%C3%A1rio.md"));
        } catch (URISyntaxException | IOException ex) {
            Logger.getLogger(ClientGUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jm_help_manualActionPerformed

    private void jm_options_settingsActionPerformed(java.awt.event.ActionEvent evt, Configs configs, List<Map<String, String>> json){
        SettingsGUI.main(this, configs, json);
    }
    
    private void jb_searchActionPerformed(java.awt.event.ActionEvent evt, List<Map<String,String>> json, String[] lista){
        findBook(json, lista);
        
        if(jb_search.getText().equals("Salvar")){
            //if editing
            runEditBook(json);
        } else if(jb_search.getText().equals("Atualizar")){
            jb_search.setText("Buscar");
        }
        
        jm_file_edit.setEnabled(false);
        jm_file_delete.setEnabled(false);
        
        
    }
    
    private void list_titlesMouseReleased(java.awt.event.MouseEvent evt, List<Map<String,String>> json, String[] lista){
        openBook(json, lista);
        jm_file_edit.setEnabled(true);
        jm_file_delete.setEnabled(true);
        closeFields(false);
    }
    
    private void list_titlesKeyReleased(java.awt.event.KeyEvent evt, List<Map<String,String>> json, String[] lista){
        try{
            openBook(json, lista);
            jm_file_edit.setEnabled(true);
            jm_file_delete.setEnabled(true);
            closeFields(false);
        }catch(Exception e){
            //do not crash if cannot find something to select
        }
    }
    
    private void jm_file_newActionPerformed(java.awt.event.ActionEvent evt, List<Map<String,String>> json, String[] lista){
        closeFields(true);
        NewBookGUI.main(this, json, lista);
    }
    
    private void jm_file_deleteActionPerformed(java.awt.event.ActionEvent evt, List<Map<String, String>> json, String[] lista){
        closeFields(true);
        dialog_ConfirmDelete.main(this, json, list_titles.getSelectedValue());
        
    }
    
    private void jm_file_editActionPerformed(java.awt.event.ActionEvent evt, List<Map<String, String>> json, String[] lista){
        //open fields
        jtx_author.setEditable(true);
        jtx_edition.setEditable(true);
        jtx_genre.setEditable(true);
        jtx_lang.setEditable(true);
        jtx_located.setEditable(true);
        jtx_sub.setEditable(true);
        jtx_title.setEditable(true);
        jtx_vol.setEditable(true);
        jtxa_obs.setEditable(true);
        jtx_type.setEditable(true); //v.1.0.5
        
        //change button
        jb_search.setText("Salvar");
        
    }
    
    private void jm_help_aboutActionPerformed(java.awt.event.ActionEvent evt, String version){
        dialog_About.main(this, version);
    }


    //custom InitComponents outside the ide auto generated code that must happen before initComponents()
    private void beforeInitComponents(List<Map<String,String>> json, String[] lista){
        list_titles = new javax.swing.JList<>();
        list_titles.setModel(new javax.swing.AbstractListModel<String>() {
            public int getSize() { return lista.length; }
            public String getElementAt(int i) { return lista[i]; }
        });
        list_titles.setName("");
        list_titles.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                list_titlesMouseReleased(evt, json, lista);
            }
        });
        list_titles.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                list_titlesKeyReleased(evt, json, lista);
            }
        });
        
    }
    
    private void bigLayoutInitComponents(){
        jm_file_new.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/icons/large/addbook-large.png")));
        jm_file_edit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/icons/large/editbook-large.png")));
        jm_file_delete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/icons/large/delbook-large.png")));
        jm_file_exit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/icons/large/exit-large.png")));
        jm_options_vf.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/icons/large/folder-large.png")));
        jm_options_settings.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/icons/large/gear-large.png")));
        jm_help_about.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/icons/large/infopg-large.png")));
        jm_help_manual.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/icons/large/book-icon-manual.png")));
    }
    
    //custom InitComponents outside the ide auto generated code that must happen after initComponents()
    private void laterInitComponents(List<Map<String,String>> json, String[] lista, String version, Configs configs){
        jb_search.addActionListener((java.awt.event.ActionEvent evt) -> {
            jb_searchActionPerformed(evt, json, lista);
        });
        jm_file_new.addActionListener((java.awt.event.ActionEvent evt) -> {
            jm_file_newActionPerformed(evt, json, lista);
        });
        jm_file_delete.addActionListener((java.awt.event.ActionEvent evt) -> {
            jm_file_deleteActionPerformed(evt, json, lista);
        });
        jm_file_edit.addActionListener((java.awt.event.ActionEvent evt) -> {
            jm_file_editActionPerformed(evt, json, lista);
        });
        jm_help_about.addActionListener((java.awt.event.ActionEvent evt) -> {
            jm_help_aboutActionPerformed(evt, version);
        });
        jm_options_settings.addActionListener((java.awt.event.ActionEvent evt) -> {
            jm_options_settingsActionPerformed(evt, configs, json);
        });
    }
    
    /**
     * @param json
     * @param version
     * @param configs
     */
    public static void main(List<Map<String,String>> json, String version, Configs configs) {
        
        //get theme settings
        if (configs.getProp("DARKTHEME").equals("true")){
            //FlatGruvboxDarkSoftIJTheme.setup(); //deprecated brown theme
            FlatArcDarkIJTheme.setup();
            
        } else {
            FlatCyanLightIJTheme.setup();
        }
        
        java.awt.EventQueue.invokeLater(() -> {
            new ClientGUI(json, version, configs).setVisible(true);
        });
        
    }
    
    //Print the book info on the pannel
    public void openBook(List<Map<String,String>> json, String[] lista){
        Map<String, String> tempObj = null;
        
        //Find the selected titles obj
        for(int i = 0; i < json.size(); i++){
            try{
            if(list_titles.getSelectedValue().equals(json.get(i).get("display"))){
                tempObj = json.get(i);
                break;
            }
            }catch(NullPointerException e){System.out.println("Err: Empty list");}
        }
        //Load full Object
        printBook(tempObj, json, lista);
        
    }
    
    public void findBook(List<Map<String,String>> json, String[] lista){
        String[] listaSearch = new String[0];
        //find matches
        for(int i = 0; i < json.size(); i++){
            if(json.get(i).get("display").contains(jtx_searchbox.getText())){
                listaSearch = pushArray.push(listaSearch, json.get(i).get("display"));
            }
        }
        
        //listaSearch must be final
        final var finalSearch = listaSearch;
        //print matches
        list_titles.setModel(new javax.swing.AbstractListModel<String>() {
            @Override
            public int getSize() { return finalSearch.length; }
            @Override
            public String getElementAt(int i) { return finalSearch[i]; }
        });
    }
    
    public void printBook(Map<String,String> tempObj, List<Map<String,String>> json, String[] lista){
        if (tempObj == null){
            findBook(json, lista);
        } else {
            jl_displayOutdoor.setText(tempObj.get("display"));
            jtx_title.setText(tempObj.get("title"));
            jtx_author.setText(tempObj.get("author"));
            jtx_sub.setText(tempObj.get("sub"));
            jtx_vol.setText(tempObj.get("vol"));
            jtx_edition.setText(tempObj.get("edition"));
            jtx_genre.setText(tempObj.get("genre"));
            jtx_lang.setText(tempObj.get("lang"));
            jtx_type.setText(tempObj.get("type"));
            jtx_located.setText(tempObj.get("located"));
            jtxa_obs.setText(tempObj.get("obs").replaceAll("\\\\n", System.getProperty("line.separator")));
        }
    }
    
    public void runEditBook(List<Map<String, String>> json){
        //check \" vulnerability
        if(jtx_author.getText().contains("\"") || jtx_title.getText().contains("\"") || jtx_sub.getText().contains("\"") || jtx_vol.getText().contains("\"") || jtx_edition.getText().contains("\"") || jtx_genre.getText().contains("\"") || jtx_lang.getText().contains("\"") || jtx_type.getText().contains("\"") || jtx_located.getText().contains("\"") || jtxa_obs.getText().contains("\"")  ){
            dialog_QMErr.main(new javax.swing.JDialog());
        } else if(jtx_author.getText().contains("\\") || jtx_title.getText().contains("\\") || jtx_sub.getText().contains("\\") || jtx_vol.getText().contains("\\") || jtx_edition.getText().contains("\\") || jtx_genre.getText().contains("\\") || jtx_lang.getText().contains("\\") || jtx_type.getText().contains("\\") || jtx_located.getText().contains("\\") || jtxa_obs.getText().contains("\\")  ){
            dialog_QMErr.main(new javax.swing.JDialog());
        } else{
            //erase old
            Map<String, String> tempObj = null;
            for(int i = 0; i < json.size(); i++){
                if(jl_displayOutdoor.getText().equals(json.get(i).get("display"))){
                    tempObj = json.get(i);
                    break;
                }
            }
            json.remove(tempObj);
            
            //build a jsonObj
            HashMap<String, String> pushItem = new HashMap<>();
                pushItem.put("display",jl_displayOutdoor.getText());
                pushItem.put("title",jtx_title.getText());
                pushItem.put("author",jtx_author.getText());
                pushItem.put("sub",jtx_sub.getText());
                pushItem.put("vol",jtx_vol.getText());
                pushItem.put("edition",jtx_edition.getText());
                pushItem.put("genre",jtx_genre.getText());
                pushItem.put("lang",jtx_lang.getText());
                pushItem.put("type",jtx_type.getText());
                pushItem.put("located",jtx_located.getText());
                pushItem.put("obs",jtxa_obs.getText().replaceAll("\\n", "\\\\\\n"));
            json.add(pushItem);
            
            JSONObject newObj = new JSONObject();
            newObj.put("items",json);
            
            //rewrite file
            String env = System.getenv("APPDATA");
            String path = env + "\\WebibliotecaFiles\\tablebooks.json";
            File f = new File(path);
            if(!f.exists()){
                System.exit(4);
            }
            
            try(FileWriter file = new FileWriter(path)){
                file.write(newObj.toJSONString().replaceAll("\\\\n", "\\n").replaceAll("\\\\r", "").replaceAll("\\r", ""));
            } catch (IOException ex) {
                Logger.getLogger(JsonLoader.class.getName()).log(Level.SEVERE, null, ex);
            }
            closeFields(true);
            
        }
    }
    
    public void closeFields(Boolean refresh){
        if(refresh.equals(true) || jb_search.getText().equals("Salvar")){
            jb_search.setText("Atualizar");
        }
        
        jtx_author.setEditable(false);
        jtx_edition.setEditable(false);
        jtx_genre.setEditable(false);
        jtx_lang.setEditable(false);
        jtx_located.setEditable(false);
        jtx_sub.setEditable(false);
        jtx_title.setEditable(false);
        jtx_vol.setEditable(false);
        jtxa_obs.setEditable(false);
        jtx_type.setEditable(false);
    }
    
// <editor-fold defaultstate="collapsed" desc="Vars">

    // Variables declaration - do not modify//GEN-BEGIN:variables
    javax.swing.JMenuBar jMenuBar1;
    javax.swing.JPanel jPanel_Info;
    javax.swing.JScrollPane jScrollPane_Titles;
    javax.swing.JScrollPane jScrollPane_obs;
    javax.swing.JPopupMenu.Separator jSeparator1;
    javax.swing.JButton jb_search;
    javax.swing.JLabel jl_author;
    javax.swing.JLabel jl_displayOutdoor;
    javax.swing.JLabel jl_edition;
    javax.swing.JLabel jl_genre;
    javax.swing.JLabel jl_lang;
    javax.swing.JLabel jl_located;
    javax.swing.JLabel jl_magnif;
    javax.swing.JLabel jl_obs;
    javax.swing.JLabel jl_sub;
    javax.swing.JLabel jl_title;
    javax.swing.JLabel jl_type;
    javax.swing.JLabel jl_vol;
    javax.swing.JMenu jm_file;
    javax.swing.JMenuItem jm_file_delete;
    javax.swing.JMenuItem jm_file_edit;
    javax.swing.JMenuItem jm_file_exit;
    javax.swing.JMenuItem jm_file_new;
    javax.swing.JMenu jm_help;
    javax.swing.JMenuItem jm_help_about;
    javax.swing.JMenuItem jm_help_manual;
    javax.swing.JMenu jm_options;
    javax.swing.JMenuItem jm_options_settings;
    javax.swing.JMenuItem jm_options_vf;
    javax.swing.JTextField jtx_author;
    javax.swing.JTextField jtx_edition;
    javax.swing.JTextField jtx_genre;
    javax.swing.JTextField jtx_lang;
    javax.swing.JTextField jtx_located;
    javax.swing.JTextField jtx_searchbox;
    javax.swing.JTextField jtx_sub;
    javax.swing.JTextField jtx_title;
    javax.swing.JTextField jtx_type;
    javax.swing.JTextField jtx_vol;
    javax.swing.JTextArea jtxa_obs;
    // End of variables declaration//GEN-END:variables

    // Custom variables declaration
    javax.swing.JList<String> list_titles;
    // End of custom variables declaration
}


// </editor-fold>