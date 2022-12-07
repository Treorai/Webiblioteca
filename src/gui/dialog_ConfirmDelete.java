package gui;

import classes.JsonLoader;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.json.simple.JSONObject;

public class dialog_ConfirmDelete extends javax.swing.JDialog {

    /**
     * Creates new form dialog_ConfirmDelete
     * @param parent
     * @param json
     * @param displayName
     */
    public dialog_ConfirmDelete(java.awt.Frame parent, List<Map<String, String>> json, String displayName) {
        super(parent, true);
        initComponents();
        myInitComponents(json, displayName);
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

        jLabel1 = new javax.swing.JLabel();
        OK_button = new javax.swing.JButton();
        Cancel_button = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Confirmação");

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("<NOME DO LIVRO>");

        OK_button.setText("OK");

        Cancel_button.setText("Cancelar");
        Cancel_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Cancel_buttonActionPerformed(evt);
            }
        });

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/windows-warning.png"))); // NOI18N
        jLabel2.setText("Tem certeza que deseja apagar o seguinte livro?");

        jLabel3.setText("Não poderá ser desfeito!");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(220, 220, 220)
                        .addComponent(OK_button)
                        .addGap(18, 18, 18)
                        .addComponent(Cancel_button))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(112, 112, 112)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addComponent(jLabel3)))
                .addContainerGap(22, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(OK_button)
                    .addComponent(Cancel_button))
                .addGap(15, 15, 15))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Cancel_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Cancel_buttonActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_Cancel_buttonActionPerformed

    private void OK_buttonActionPerformed(java.awt.event.ActionEvent evt, List<Map<String, String>> json, String displayName) {
        
        //get the obj
        Map<String, String> tempObj = null;
        for(int i = 0; i < json.size(); i++){
            if(displayName.equals(json.get(i).get("display"))){
                tempObj = json.get(i);
                break;
            }
        }
        
        json.remove(tempObj);
        JSONObject newObj = new JSONObject();
        newObj.put("items",json);
            
        //rewrite file
            //setup for rewrite
            String env = System.getenv("APPDATA");
            String path = env + "\\WebibliotecaFiles\\tablebooks.json";
            File f = new File(path);
            if(!f.exists()){
                System.exit(4);
            }
            //Update no db
            try(FileWriter file = new FileWriter(path)){
                file.write(newObj.toJSONString().replaceAll("\\\\n", "\\n").replaceAll("\\\\r", "").replaceAll("\\r", ""));
            } catch (IOException ex) {
                Logger.getLogger(JsonLoader.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        this.dispose();
    }
    
    private void myInitComponents(List<Map<String, String>> json, String displayName){
        jLabel1.setText(displayName);
        OK_button.addActionListener((java.awt.event.ActionEvent evt) -> {
            OK_buttonActionPerformed(evt, json, displayName);
        });
    }
    
    public static void main(java.awt.Frame parent, List<Map<String, String>> json, String displayName) {
        
        java.awt.EventQueue.invokeLater(() -> {
            new dialog_ConfirmDelete(parent, json, displayName).setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Cancel_button;
    private javax.swing.JButton OK_button;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables
}
