/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfacesgraficas;

import classededados.Categoria;
import classededados.GeradorDeId;
import java.awt.Color;
import static javafx.scene.paint.Color.color;
import static javafx.scene.paint.Color.color;
import static javafx.scene.paint.Color.color;
import javax.swing.JColorChooser;
import javax.swing.JOptionPane;
import persistencia.ContatoDAO;


/**
 *
 * @author Pedro
 */
public class TelaCadastroCategoria extends javax.swing.JFrame {
    Categoria grupo = null;
    GeradorDeId idCategoria = null;
    Color cor;
    /**
     * Creates new form TelaCadastroCategoria
     */
    public TelaCadastroCategoria() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTextFieldNome = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jPanelColor = new javax.swing.JPanel();
        jButtonIncluir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("Cadastrar Categoria");

        jPanel1.setBackground(new java.awt.Color(247, 247, 247));
        jPanel1.setForeground(new java.awt.Color(195, 195, 195));

        jLabel1.setText("Nome:");

        jButton1.setText("Escolher Cor");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jPanelColor.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        javax.swing.GroupLayout jPanelColorLayout = new javax.swing.GroupLayout(jPanelColor);
        jPanelColor.setLayout(jPanelColorLayout);
        jPanelColorLayout.setHorizontalGroup(
            jPanelColorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 19, Short.MAX_VALUE)
        );
        jPanelColorLayout.setVerticalGroup(
            jPanelColorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 19, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTextFieldNome, javax.swing.GroupLayout.DEFAULT_SIZE, 283, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(113, 113, 113)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanelColor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextFieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1)
                    .addComponent(jPanelColor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jButtonIncluir.setText("Incluir");
        jButtonIncluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonIncluirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(86, 86, 86)
                        .addComponent(jLabel2))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(145, 145, 145)
                        .addComponent(jButtonIncluir)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButtonIncluir)
                .addGap(7, 7, 7))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       grupo = new Categoria();
        
       cor = Color.LIGHT_GRAY;
       cor = JColorChooser.showDialog(
                                TelaCadastroCategoria.this, "Escolher a color", cor );
                        if( cor == null ){
                            cor = Color.LIGHT_GRAY;}
                        
        grupo.setCor(String.valueOf(cor));
        jPanelColor.setBackground(cor);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButtonIncluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonIncluirActionPerformed
      grupo = new Categoria();
     
        int resposta  = JOptionPane.showConfirmDialog(rootPane, "Confirmar Cadastro?");

        if(resposta == JOptionPane.YES_OPTION){
            try {

                idCategoria = new GeradorDeId();
                grupo = new Categoria();
                
                grupo.setId(idCategoria.getIdCategoria());
                grupo.setDescricao(jTextFieldNome.getText());
                grupo.setCor(String.valueOf(cor));
                
            ContatoDAO categoria = new ContatoDAO();
            categoria.incluirCategoria(grupo);
            idCategoria.finalize();
            JOptionPane.showMessageDialog(rootPane, "Cadastro efetuado com sucesso!");
        } catch (Exception e) {
        }
        }

//
//                ArrayList<Telefone> telefones = new ArrayList<>();
//                telefones.add(new Telefone(idCont,Integer.parseInt(jTextFieldDDI.getText()),Integer.parseInt(jTextFieldDDD.getText()),Integer.parseInt(jTextFieldNumero.getText())));
//
//                ArrayList<Email> emails = new ArrayList<>();
//                emails.add(new Email(idCont, jTextFieldEmail.getText()));
//                ArrayList<Endereco> enderecos = new ArrayList<>();
//
//                if((!jTextFieldLogradouro.getText().equals("")) && (!jTextFieldN.getText().equals("")) && (!jTextFieldCep.getText().equals("")) &&
//                    (!jTextFieldBairro.getText().equals("")) && (!jTextFieldCidade.getText().equals("")) &&
//                    (!jTextFieldEstado.getText().equals("")) && (!jTextFieldPais.getText().equals(""))){
//                    enderecos.add(new Endereco(idCont, jTextFieldLogradouro.getText(), Integer.parseInt(jTextFieldN.getText()),
//                        Integer.parseInt(jTextFieldCep.getText()), jTextFieldBairro.getText(), jTextFieldCidade.getText(),
//                        jTextFieldEstado.getText(), jTextFieldPais.getText(), jTextFieldComplemento.getText()));
//            }
//
//            pessoa1.setNome(jTextFieldNome.getText());
//            pessoa1.setId(idCont);
//            pessoa1.setTelefones(telefones);
//            pessoa1.setEndereco(enderecos);
//            pessoa1.setEmail(emails);
//

//        JColorChooser cor = jColorChooser1;
//        String corz = String.valueOf(cor);
//        
//        JOptionPane.showMessageDialog(rootPane, corz);

    }//GEN-LAST:event_jButtonIncluirActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroCategoria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroCategoria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroCategoria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroCategoria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaCadastroCategoria().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButtonIncluir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanelColor;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField jTextFieldNome;
    // End of variables declaration//GEN-END:variables
}