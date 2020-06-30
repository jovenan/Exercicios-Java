package Apresentacao;

import javax.swing.JOptionPane;

public class FrmPrincipal extends javax.swing.JDialog
{
    
    public FrmPrincipal(java.awt.Frame parent, boolean modal)
    {
        super(parent, modal);
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        lvlL1 = new javax.swing.JLabel();
        txfLado1 = new javax.swing.JTextField();
        txfLado2 = new javax.swing.JTextField();
        lblLado2 = new javax.swing.JLabel();
        txfLado3 = new javax.swing.JTextField();
        lblLado3 = new javax.swing.JLabel();
        lblResposta = new javax.swing.JLabel();
        btnVerificar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Testa Tipo de Triangulo");

        lvlL1.setText("Lado 1");

        txfLado2.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                txfLado2ActionPerformed(evt);
            }
        });

        lblLado2.setText("Lado 2");

        lblLado3.setText("Lado 3");

        lblResposta.setText("Resposta");

        btnVerificar.setText("Verificar");
        btnVerificar.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnVerificarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblResposta)
                    .addComponent(lblLado3)
                    .addComponent(lblLado2)
                    .addComponent(lvlL1)
                    .addComponent(txfLado1)
                    .addComponent(txfLado2)
                    .addComponent(txfLado3)
                    .addComponent(btnVerificar, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE))
                .addContainerGap(35, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lvlL1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txfLado1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblLado2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txfLado2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblLado3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txfLado3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnVerificar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
                .addComponent(lblResposta)
                .addGap(32, 32, 32))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txfLado2ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_txfLado2ActionPerformed
    {//GEN-HEADEREND:event_txfLado2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txfLado2ActionPerformed

    private void btnVerificarActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnVerificarActionPerformed
    {//GEN-HEADEREND:event_btnVerificarActionPerformed
        Modelo.Controle controle = new Modelo.Controle(txfLado1.getText(), txfLado2.getText(), txfLado3.getText());
        if (controle.getMensagem().equals(""))
        {
            lblResposta.setText(controle.getResposta());
        }
        else
        {
            JOptionPane.showMessageDialog(null, controle.getMensagem());
        }
    }//GEN-LAST:event_btnVerificarActionPerformed

    public static void main(String args[])
    {
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try
        {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels())
            {
                if ("Nimbus".equals(info.getName()))
                {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        }
        catch (ClassNotFoundException ex)
        {
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        catch (InstantiationException ex)
        {
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        catch (IllegalAccessException ex)
        {
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        catch (javax.swing.UnsupportedLookAndFeelException ex)
        {
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable()
        {
            public void run()
            {
                FrmPrincipal dialog = new FrmPrincipal(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter()
                {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e)
                    {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnVerificar;
    private javax.swing.JLabel lblLado2;
    private javax.swing.JLabel lblLado3;
    private javax.swing.JLabel lblResposta;
    private javax.swing.JLabel lvlL1;
    private javax.swing.JTextField txfLado1;
    private javax.swing.JTextField txfLado2;
    private javax.swing.JTextField txfLado3;
    // End of variables declaration//GEN-END:variables
}
