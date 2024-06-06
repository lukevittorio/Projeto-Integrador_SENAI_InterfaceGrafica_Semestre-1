/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package lk.projetointegrador;
import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.JOptionPane;
/**
 *
 * @author lukev
 */
public class Salario extends javax.swing.JFrame {

    /**
     * Creates new form Cliente
     */
    public Salario() {
        initComponents();
        
        setTitle("Cadastro Salários");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        LISTA = new javax.swing.JLabel();
        lista = new javax.swing.JScrollPane();
        area = new javax.swing.JTextArea();
        menu = new javax.swing.JButton();
        clean = new javax.swing.JButton();
        save = new javax.swing.JButton();
        valores = new javax.swing.JTextField();
        codfunc = new javax.swing.JTextField();
        codcont = new javax.swing.JTextField();
        RAMO = new javax.swing.JLabel();
        CNPJ = new javax.swing.JLabel();
        NOME = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        LISTA.setFont(new java.awt.Font("OCR A Extended", 1, 18)); // NOI18N
        LISTA.setForeground(new java.awt.Color(255, 255, 255));
        LISTA.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LISTA.setText("Salários Cadastrados");
        getContentPane().add(LISTA, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 150, 240, -1));

        area.setColumns(20);
        area.setRows(5);
        lista.setViewportView(area);

        getContentPane().add(lista, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 180, 280, 220));

        menu.setFont(new java.awt.Font("OCR A Extended", 1, 18)); // NOI18N
        menu.setText("Menu");
        menu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuActionPerformed(evt);
            }
        });
        getContentPane().add(menu, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 360, 120, 40));

        clean.setFont(new java.awt.Font("OCR A Extended", 1, 18)); // NOI18N
        clean.setText("Limpar");
        clean.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cleanActionPerformed(evt);
            }
        });
        getContentPane().add(clean, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 360, 120, 40));

        save.setFont(new java.awt.Font("OCR A Extended", 1, 18)); // NOI18N
        save.setText("Salvar");
        save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveActionPerformed(evt);
            }
        });
        getContentPane().add(save, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 360, 120, 40));

        valores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                valoresActionPerformed(evt);
            }
        });
        getContentPane().add(valores, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 290, 310, 30));

        codfunc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                codfuncActionPerformed(evt);
            }
        });
        getContentPane().add(codfunc, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 240, 190, 30));

        codcont.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                codcontActionPerformed(evt);
            }
        });
        getContentPane().add(codcont, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 190, 60, 30));

        RAMO.setFont(new java.awt.Font("OCR A Extended", 1, 18)); // NOI18N
        RAMO.setForeground(new java.awt.Color(255, 255, 255));
        RAMO.setText("Valor:");
        getContentPane().add(RAMO, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 290, -1, 30));

        CNPJ.setFont(new java.awt.Font("OCR A Extended", 1, 18)); // NOI18N
        CNPJ.setForeground(new java.awt.Color(255, 255, 255));
        CNPJ.setText("Cód. Funcionário:");
        getContentPane().add(CNPJ, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 240, -1, 30));

        NOME.setFont(new java.awt.Font("OCR A Extended", 1, 18)); // NOI18N
        NOME.setForeground(new java.awt.Color(255, 255, 255));
        NOME.setText("Cód. Tipo de Conta (Padrão):");
        getContentPane().add(NOME, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 190, -1, 30));

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon("D:\\LIP\\Projeto Integrador\\Cadastro - Salários.png")); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 40, 330, 90));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon("D:\\LIP\\Projeto Integrador\\Fundo - Início.png")); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 880, 440));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void codcontActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_codcontActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_codcontActionPerformed

    private void codfuncActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_codfuncActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_codfuncActionPerformed

    private void valoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_valoresActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_valoresActionPerformed

    private void saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveActionPerformed
        // TODO add your handling code here:
        int valor = JOptionPane.showConfirmDialog(null, "Confirma Salvar?", "Opções", JOptionPane.YES_NO_CANCEL_OPTION);
        boolean invalido = true;
        
        if(valor == 0){
            // Sim
            Sal s = new Sal();
            try{
                s.setCodcont(Integer.parseInt(codcont.getText()));
                s.setCodfunc(Integer.parseInt(codfunc.getText()));
                invalido = false;
            }
            catch(NumberFormatException e){
                JOptionPane.showMessageDialog(null, "Cód. Conta ou Cód. Funcionário digitado incorretamente!\n" +e.getMessage(), "ERRO", JOptionPane.ERROR_MESSAGE);
                codcont.setText("");
                codfunc.setText("");
            }
                    
            s.setValores(valores.getText());
            
            if(invalido == false){
                area.setText(s.status());
            }
        }
        else if(valor == 1){
            // Não
        }
        else{
            // Cancela
        }
    }//GEN-LAST:event_saveActionPerformed

    private void cleanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cleanActionPerformed
        // TODO add your handling code here:
        codcont.setText("");
        codfunc.setText("");
        valores.setText("");
    }//GEN-LAST:event_cleanActionPerformed

    private void menuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuActionPerformed
        // TODO add your handling code here:
        dispose();
        new Financeiro().setVisible(true);
    }//GEN-LAST:event_menuActionPerformed

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
            java.util.logging.Logger.getLogger(Salario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Salario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Salario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Salario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Salario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel CNPJ;
    private javax.swing.JLabel LISTA;
    private javax.swing.JLabel NOME;
    private javax.swing.JLabel RAMO;
    private javax.swing.JTextArea area;
    private javax.swing.JButton clean;
    private javax.swing.JTextField codcont;
    private javax.swing.JTextField codfunc;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane lista;
    private javax.swing.JButton menu;
    private javax.swing.JButton save;
    private javax.swing.JTextField valores;
    // End of variables declaration//GEN-END:variables
}
