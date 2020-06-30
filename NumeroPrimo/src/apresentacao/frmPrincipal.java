package apresentacao;

import Modelo.Controle;

public class frmPrincipal extends javax.swing.JDialog
{

    public frmPrincipal(java.awt.Frame parent, boolean modal)
    {
        super(parent, modal);
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        btnVerificaPrimo = new javax.swing.JButton();
        lblResposta = new javax.swing.JLabel();
        txfNumero = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Primo");

        btnVerificaPrimo.setText("Verifica Primo");
        btnVerificaPrimo.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnVerificaPrimoActionPerformed(evt);
            }
        });

        lblResposta.setText("Resposta");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnVerificaPrimo, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
                    .addComponent(lblResposta)
                    .addComponent(txfNumero))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txfNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnVerificaPrimo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblResposta)
                .addGap(31, 31, 31))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnVerificaPrimoActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnVerificaPrimoActionPerformed
    {//GEN-HEADEREND:event_btnVerificaPrimoActionPerformed
        Controle controle = new Controle(txfNumero.getText());
        lblResposta.setText(controle.getMensagem());
    }//GEN-LAST:event_btnVerificaPrimoActionPerformed

    public static void main(String args[])
    {

        try
        {
            for (javax.swing.UIManager.LookAndFeelInfo info :
                    javax.swing.UIManager.getInstalledLookAndFeels())
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
            java.util.logging.Logger.getLogger(frmPrincipal.class.getName())
                    .log(java.util.logging.Level.SEVERE, null, ex);
        }
        catch (InstantiationException ex)
        {
            java.util.logging.Logger.getLogger(frmPrincipal.class.getName())
                    .log(java.util.logging.Level.SEVERE, null, ex);
        }
        catch (IllegalAccessException ex)
        {
            java.util.logging.Logger.getLogger(frmPrincipal.class.getName())
                    .log(java.util.logging.Level.SEVERE, null, ex);
        }
        catch (javax.swing.UnsupportedLookAndFeelException ex)
        {
            java.util.logging.Logger.getLogger(frmPrincipal.class.getName())
                    .log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable()
        {
            public void run()
            {
                frmPrincipal dialog = new frmPrincipal
        (new javax.swing.JFrame(), true);
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
    private javax.swing.JButton btnVerificaPrimo;
    private javax.swing.JLabel lblResposta;
    private javax.swing.JTextField txfNumero;
    // End of variables declaration//GEN-END:variables
}
