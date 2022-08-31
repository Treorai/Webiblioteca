package gui;

import classes.Configs;
import java.io.File;
import java.io.FileWriter;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.filechooser.FileSystemView;
import org.json.simple.JSONObject;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import static java.nio.file.StandardCopyOption.REPLACE_EXISTING;

public class SettingsGUI extends javax.swing.JDialog {

    /**
     * Creates new form SettingsGUI
     * @param parent
     * @param configs
     * @param json
     */
    public SettingsGUI(java.awt.Frame parent, Configs configs, List<Map<String, String>> json) {
        super(parent, true);
        initComponents();
        laterInitComponents(configs, json);
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

        bg_theme = new javax.swing.ButtonGroup();
        jPanel_theme = new javax.swing.JPanel();
        theme_jr_dark = new javax.swing.JRadioButton();
        theme_jr_light = new javax.swing.JRadioButton();
        jckb_largeicons = new javax.swing.JCheckBox();
        jb_apply = new javax.swing.JButton();
        jb_cancel = new javax.swing.JButton();
        jb_save = new javax.swing.JButton();
        jPanel_backup = new javax.swing.JPanel();
        jl_import = new javax.swing.JLabel();
        jb_importbutton = new javax.swing.JButton();
        jl_export = new javax.swing.JLabel();
        jb_exportbutton = new javax.swing.JButton();
        effectlabeladv = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Configura��es");

        jPanel_theme.setBorder(javax.swing.BorderFactory.createTitledBorder("Tema"));

        bg_theme.add(theme_jr_dark);
        theme_jr_dark.setText("Escuro");

        bg_theme.add(theme_jr_light);
        theme_jr_light.setText("Claro");

        jckb_largeicons.setText("Usar �cones Grandes");

        javax.swing.GroupLayout jPanel_themeLayout = new javax.swing.GroupLayout(jPanel_theme);
        jPanel_theme.setLayout(jPanel_themeLayout);
        jPanel_themeLayout.setHorizontalGroup(
            jPanel_themeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_themeLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel_themeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jckb_largeicons)
                    .addComponent(theme_jr_light)
                    .addComponent(theme_jr_dark))
                .addGap(59, 59, 59))
        );
        jPanel_themeLayout.setVerticalGroup(
            jPanel_themeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_themeLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(theme_jr_dark)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(theme_jr_light)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addComponent(jckb_largeicons)
                .addGap(17, 17, 17))
        );

        jb_apply.setText("Aplicar");

        jb_cancel.setText("Cancelar");
        jb_cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_cancelActionPerformed(evt);
            }
        });

        jb_save.setText("Salvar");

        jPanel_backup.setBorder(javax.swing.BorderFactory.createTitledBorder("Backup"));

        jl_import.setText("Importar Biblioteca");

        jb_importbutton.setText("Selecionar Arquivo");
        jb_importbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_importbuttonActionPerformed(evt);
            }
        });

        jl_export.setText("Exportar Biblioteca");

        jb_exportbutton.setText("  Salvar Como...");

        javax.swing.GroupLayout jPanel_backupLayout = new javax.swing.GroupLayout(jPanel_backup);
        jPanel_backup.setLayout(jPanel_backupLayout);
        jPanel_backupLayout.setHorizontalGroup(
            jPanel_backupLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_backupLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel_backupLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jl_import)
                    .addComponent(jl_export))
                .addGap(44, 44, 44)
                .addGroup(jPanel_backupLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jb_importbutton, javax.swing.GroupLayout.DEFAULT_SIZE, 151, Short.MAX_VALUE)
                    .addComponent(jb_exportbutton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        jPanel_backupLayout.setVerticalGroup(
            jPanel_backupLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_backupLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel_backupLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jb_importbutton)
                    .addComponent(jl_import))
                .addGap(18, 18, 18)
                .addGroup(jPanel_backupLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jl_export)
                    .addComponent(jb_exportbutton))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        effectlabeladv.setForeground(new java.awt.Color(102, 102, 102));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel_backup, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel_theme, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jb_save)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jb_cancel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jb_apply))
                            .addComponent(effectlabeladv, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel_theme, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel_backup, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addComponent(effectlabeladv)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jb_apply)
                    .addComponent(jb_cancel)
                    .addComponent(jb_save))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jb_cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_cancelActionPerformed
        this.dispose();
    }//GEN-LAST:event_jb_cancelActionPerformed

    private void jb_importbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_importbuttonActionPerformed
        
        JFileChooser j = new JFileChooser(FileSystemView.getFileSystemView().getHomeDirectory());
        j.setAcceptAllFileFilterUsed(false);
        j.setDialogTitle("Selecione um arquivo de backup");
        j.addChoosableFileFilter(new FileNameExtensionFilter("wblibbk files", "wblibbk"));
        int r = j.showOpenDialog(null);
        
        // if user selects a file
        if (r == JFileChooser.APPROVE_OPTION) {
            String env = System.getenv("APPDATA");
            String newpath = env + "\\WebibliotecaFiles\\tablebooks.json";
            String windir = env + "\\WebibliotecaFiles";
            File wdir = new File(windir);
            if (! wdir.exists()){
                wdir.mkdirs();
            }
            Path destpath = Paths.get(newpath);
            try {
                Files.copy(j.getSelectedFile().toPath(), destpath, REPLACE_EXISTING );
            } catch (IOException ex) {
                Logger.getLogger(SettingsGUI.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            effectlabeladv.setText("� necess�ro reiniciar o programa para ter efeito.  ");
        }
    }//GEN-LAST:event_jb_importbuttonActionPerformed

    private void jb_exportbuttonActionPerformed(java.awt.event.ActionEvent evt, List<Map<String, String>> json){
        
        JFileChooser fc = new JFileChooser(FileSystemView.getFileSystemView().getHomeDirectory());
        fc.setAcceptAllFileFilterUsed(false);
        fc.setDialogTitle("Salvar arquivo de backup");
        fc.addChoosableFileFilter(new FileNameExtensionFilter("wblibbk files", "wblibbk"));
        int r = fc.showSaveDialog(this);
        
        // if user selects a file
        if (r == JFileChooser.APPROVE_OPTION){
            File f = fc.getSelectedFile();
            
            try(FileWriter fw = new FileWriter(f+".wblibbk");) {   
                
                JSONObject newObj = new JSONObject();
                newObj.put("items",json);
                fw.write(newObj.toJSONString().replaceAll("\\\\n", "\\n" ));
                fw.close();
            } catch (IOException ex) {
                Logger.getLogger(SettingsGUI.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    private void theme_jr_darkActionPerformed(java.awt.event.ActionEvent evt, Configs configs){
        enableApplyButton(configs);
    }
    
    private void theme_jr_lightActionPerformed(java.awt.event.ActionEvent evt, Configs configs){
        enableApplyButton(configs);
    }
    
    private void jckb_largeiconsActionPerformed(java.awt.event.ActionEvent evt, Configs configs){
        enableApplyButton(configs);
    }
    
    private void enableApplyButton(Configs configs){
        if(String.valueOf(theme_jr_dark.isSelected()).equals(configs.getProp("DARKTHEME")) && String.valueOf(jckb_largeicons.isSelected()).equals(configs.getProp("LARGEICONS")) ){
            jb_apply.setEnabled(false);
            effectlabeladv.setText("");
            
        } else {
            jb_apply.setEnabled(true);
            effectlabeladv.setText("� necess�ro reiniciar o programa para ter efeito.  ");
        }
        
    }
    
    private void jb_applyActionPerformed(java.awt.event.ActionEvent evt, Configs configs){
        //save new configs
        configs.saveProp("LARGEICONS", String.valueOf(jckb_largeicons.isSelected()));
        configs.saveProp("DARKTHEME", String.valueOf(theme_jr_dark.isSelected()));
        jb_apply.setEnabled(false);
    }
    
    private void jb_saveActionPerformed(java.awt.event.ActionEvent evt, Configs configs){
        jb_applyActionPerformed(evt, configs);
        this.dispose();
    }
    
    private void laterInitComponents(Configs configs, List<Map<String, String>> json){
        //start layout with the current configuration
        if (configs.getProp("DARKTHEME").equals("true")){
            theme_jr_dark.setSelected(true);
        } else {
            theme_jr_light.setSelected(true);
        }
        
        if(configs.getProp("LARGEICONS").equals("true")){
            jckb_largeicons.setSelected(true);
        } else{
            jckb_largeicons.setSelected(false);
        }
        //other components
        jb_apply.addActionListener((java.awt.event.ActionEvent evt) -> {
            jb_applyActionPerformed(evt, configs);
        });
        jb_save.addActionListener((java.awt.event.ActionEvent evt) -> {
            jb_saveActionPerformed(evt, configs);
        });
        theme_jr_dark.addActionListener((java.awt.event.ActionEvent evt) -> {
            theme_jr_darkActionPerformed(evt, configs);
        });

        theme_jr_light.addActionListener((java.awt.event.ActionEvent evt) -> {
            theme_jr_lightActionPerformed(evt, configs);
        });

        jckb_largeicons.addActionListener((java.awt.event.ActionEvent evt) -> {
            jckb_largeiconsActionPerformed(evt, configs);
        });
        jb_apply.setEnabled(false);
        
        jb_exportbutton.addActionListener((java.awt.event.ActionEvent evt) -> {
            jb_exportbuttonActionPerformed(evt, json);
        });
        
    }
    /**
     * @param parent
     * @param configs
     * @param json
     */
    public static void main(java.awt.Frame parent, Configs configs, List<Map<String, String>> json) {
        
        java.awt.EventQueue.invokeLater(() -> {
            new SettingsGUI(parent, configs, json).setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup bg_theme;
    private javax.swing.JLabel effectlabeladv;
    private javax.swing.JPanel jPanel_backup;
    private javax.swing.JPanel jPanel_theme;
    private javax.swing.JButton jb_apply;
    private javax.swing.JButton jb_cancel;
    private javax.swing.JButton jb_exportbutton;
    private javax.swing.JButton jb_importbutton;
    private javax.swing.JButton jb_save;
    private javax.swing.JCheckBox jckb_largeicons;
    private javax.swing.JLabel jl_export;
    private javax.swing.JLabel jl_import;
    private javax.swing.JRadioButton theme_jr_dark;
    private javax.swing.JRadioButton theme_jr_light;
    // End of variables declaration//GEN-END:variables
}
