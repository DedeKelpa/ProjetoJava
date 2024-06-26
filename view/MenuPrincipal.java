/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;


/**
 *
 * @author Pichau
 */
public class MenuPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form MenuPrincipal
     */
    public MenuPrincipal() {
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

        lblMenu = new javax.swing.JLabel();
        btMenuConsultarSaldo = new javax.swing.JButton();
        btMenuConsultarExtrato = new javax.swing.JButton();
        btMenuDepositar = new javax.swing.JButton();
        btMenuSacar = new javax.swing.JButton();
        btMenuComprarCripto = new javax.swing.JButton();
        btMenuVenderCripto = new javax.swing.JButton();
        btMenuAtualizarCot = new javax.swing.JButton();
        btMenuSair = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblMenu.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblMenu.setText("MENU");

        btMenuConsultarSaldo.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btMenuConsultarSaldo.setText("1 - Consultar Saldo");
        btMenuConsultarSaldo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btMenuConsultarSaldoActionPerformed(evt);
            }
        });

        btMenuConsultarExtrato.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btMenuConsultarExtrato.setText("2 - Consultar Extrato");
        btMenuConsultarExtrato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btMenuConsultarExtratoActionPerformed(evt);
            }
        });

        btMenuDepositar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btMenuDepositar.setText("3 - Depositar");
        btMenuDepositar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btMenuDepositarActionPerformed(evt);
            }
        });

        btMenuSacar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btMenuSacar.setText("4 - Sacar");
        btMenuSacar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btMenuSacarActionPerformed(evt);
            }
        });

        btMenuComprarCripto.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btMenuComprarCripto.setText("5 - Comprar Criptomoedas");
        btMenuComprarCripto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btMenuComprarCriptoActionPerformed(evt);
            }
        });

        btMenuVenderCripto.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btMenuVenderCripto.setText("6 - Vender Criptomoedas");
        btMenuVenderCripto.setActionCommand("6 - Vender ");
        btMenuVenderCripto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btMenuVenderCriptoActionPerformed(evt);
            }
        });

        btMenuAtualizarCot.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btMenuAtualizarCot.setText("7 - Atualizar Cotação");
        btMenuAtualizarCot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btMenuAtualizarCotActionPerformed(evt);
            }
        });

        btMenuSair.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btMenuSair.setText("8 - Sair");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(109, 109, 109)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btMenuComprarCripto, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btMenuSair, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btMenuAtualizarCot, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btMenuVenderCripto, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btMenuDepositar, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btMenuConsultarExtrato, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btMenuConsultarSaldo, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btMenuSacar, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(91, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lblMenu)
                .addGap(194, 194, 194))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(lblMenu)
                .addGap(31, 31, 31)
                .addComponent(btMenuConsultarSaldo, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btMenuConsultarExtrato, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btMenuDepositar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btMenuSacar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btMenuComprarCripto, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btMenuVenderCripto, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btMenuAtualizarCot, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btMenuSair, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(39, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btMenuConsultarSaldoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btMenuConsultarSaldoActionPerformed
    MenuConsultarSaldo mcs = new MenuConsultarSaldo();
    mcs.setVisible(true);   
    }//GEN-LAST:event_btMenuConsultarSaldoActionPerformed

    private void btMenuConsultarExtratoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btMenuConsultarExtratoActionPerformed
    MenuConsultarExtrato mce = new MenuConsultarExtrato();
    mce.setVisible(true);       
    }//GEN-LAST:event_btMenuConsultarExtratoActionPerformed

    private void btMenuDepositarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btMenuDepositarActionPerformed
    MenuDepositar md = new MenuDepositar();
    md.setVisible(true);
    }//GEN-LAST:event_btMenuDepositarActionPerformed

    private void btMenuSacarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btMenuSacarActionPerformed
    MenuSacar ms = new MenuSacar();
    ms.setVisible(true);
    }//GEN-LAST:event_btMenuSacarActionPerformed

    private void btMenuComprarCriptoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btMenuComprarCriptoActionPerformed
    MenuComprarCripto mcc = new MenuComprarCripto();
    mcc.setVisible(true);
    }//GEN-LAST:event_btMenuComprarCriptoActionPerformed

    private void btMenuVenderCriptoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btMenuVenderCriptoActionPerformed
    MenuVenderCripto mvc = new MenuVenderCripto();
    mvc.setVisible(true);
    }//GEN-LAST:event_btMenuVenderCriptoActionPerformed

    private void btMenuAtualizarCotActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btMenuAtualizarCotActionPerformed
        
    }//GEN-LAST:event_btMenuAtualizarCotActionPerformed

    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new MenuPrincipal().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btMenuAtualizarCot;
    private javax.swing.JButton btMenuComprarCripto;
    private javax.swing.JButton btMenuConsultarExtrato;
    private javax.swing.JButton btMenuConsultarSaldo;
    private javax.swing.JButton btMenuDepositar;
    private javax.swing.JButton btMenuSacar;
    private javax.swing.JButton btMenuSair;
    private javax.swing.JButton btMenuVenderCripto;
    private javax.swing.JLabel lblMenu;
    // End of variables declaration//GEN-END:variables
}
