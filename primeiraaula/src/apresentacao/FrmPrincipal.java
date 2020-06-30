package apresentacao;

import modelo.Controle;

public class FrmPrincipal extends javax.swing.JDialog
{
     modelo.Controle controle = new Controle();
     
    public FrmPrincipal(java.awt.Frame parent, boolean modal)
    {
        super(parent, modal);
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        jTextField3 = new javax.swing.JTextField();
        lblcalculadora = new javax.swing.JLabel();
        txfprimeiroNumero = new javax.swing.JTextField();
        txfsegundoNumero = new javax.swing.JTextField();
        lblresultado = new javax.swing.JLabel();
        lblprimeiroNumero = new javax.swing.JLabel();
        lblsegundoNumero = new javax.swing.JLabel();
        btnsomar = new javax.swing.JButton();
        btnsubtrair = new javax.swing.JButton();
        btndividir = new javax.swing.JButton();
        btnmultiplicar = new javax.swing.JButton();

        jTextField3.setText("jTextField3");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Calculadora");
        setBackground(new java.awt.Color(51, 204, 255));

        lblcalculadora.setText("Calculadora");

        txfsegundoNumero.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                txfsegundoNumeroActionPerformed(evt);
            }
        });

        lblresultado.setText("Resultado");

        lblprimeiroNumero.setText("Digite o primeiro numero:");

        lblsegundoNumero.setText("Digite o segundo numero:");

        btnsomar.setBackground(new java.awt.Color(51, 255, 255));
        btnsomar.setText("Somar");
        btnsomar.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnsomarActionPerformed(evt);
            }
        });

        btnsubtrair.setBackground(new java.awt.Color(51, 255, 255));
        btnsubtrair.setText("Subtrair");
        btnsubtrair.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnsubtrairActionPerformed(evt);
            }
        });

        btndividir.setBackground(new java.awt.Color(51, 255, 255));
        btndividir.setText("Dividir");
        btndividir.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btndividirActionPerformed(evt);
            }
        });

        btnmultiplicar.setBackground(new java.awt.Color(51, 255, 255));
        btnmultiplicar.setText("Multiplicar");
        btnmultiplicar.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnmultiplicarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txfsegundoNumero, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblsegundoNumero)
                            .addComponent(lblprimeiroNumero)
                            .addComponent(lblcalculadora)
                            .addComponent(lblresultado))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btndividir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnsomar, javax.swing.GroupLayout.DEFAULT_SIZE, 85, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnmultiplicar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnsubtrair, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(txfprimeiroNumero))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(lblcalculadora)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblprimeiroNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addComponent(txfprimeiroNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblsegundoNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txfsegundoNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnsomar)
                    .addComponent(btnsubtrair))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btndividir)
                    .addComponent(btnmultiplicar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                .addComponent(lblresultado, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        lblcalculadora.getAccessibleContext().setAccessibleName("lblcalculadora");
        txfprimeiroNumero.getAccessibleContext().setAccessibleName("txfprimeiroNumero");
        txfsegundoNumero.getAccessibleContext().setAccessibleName("txfsegundoNumero");
        lblresultado.getAccessibleContext().setAccessibleName("lblresultado");
        lblprimeiroNumero.getAccessibleContext().setAccessibleName("lblprimeiroNumero");
        lblsegundoNumero.getAccessibleContext().setAccessibleName("lblsegundoNumero");
        btnsomar.getAccessibleContext().setAccessibleName("btnsomar");

        getAccessibleContext().setAccessibleDescription("");

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txfsegundoNumeroActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_txfsegundoNumeroActionPerformed
    {//GEN-HEADEREND:event_txfsegundoNumeroActionPerformed
        
    }//GEN-LAST:event_txfsegundoNumeroActionPerformed
    
            
    private void btnsomarActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnsomarActionPerformed
    {//GEN-HEADEREND:event_btnsomarActionPerformed
        
        lblresultado.setText(controle.calcular(txfprimeiroNumero.getText(), txfsegundoNumero.getText() ,"+"));
    }//GEN-LAST:event_btnsomarActionPerformed

    private void btnsubtrairActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnsubtrairActionPerformed
    {//GEN-HEADEREND:event_btnsubtrairActionPerformed
        lblresultado.setText(controle.calcular(txfprimeiroNumero.getText(), txfsegundoNumero.getText() ,"-"));
    }//GEN-LAST:event_btnsubtrairActionPerformed

    private void btndividirActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btndividirActionPerformed
    {//GEN-HEADEREND:event_btndividirActionPerformed
        lblresultado.setText(controle.calcular(txfprimeiroNumero.getText(), txfsegundoNumero.getText() ,"/"));
    }//GEN-LAST:event_btndividirActionPerformed

    private void btnmultiplicarActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnmultiplicarActionPerformed
    {//GEN-HEADEREND:event_btnmultiplicarActionPerformed
        lblresultado.setText(controle.calcular(txfprimeiroNumero.getText(), txfsegundoNumero.getText() ,"*"));
    }//GEN-LAST:event_btnmultiplicarActionPerformed

    public static void main(String args[])
    {

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
    private javax.swing.JButton btndividir;
    private javax.swing.JButton btnmultiplicar;
    private javax.swing.JButton btnsomar;
    private javax.swing.JButton btnsubtrair;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JLabel lblcalculadora;
    private javax.swing.JLabel lblprimeiroNumero;
    private javax.swing.JLabel lblresultado;
    private javax.swing.JLabel lblsegundoNumero;
    private javax.swing.JTextField txfprimeiroNumero;
    private javax.swing.JTextField txfsegundoNumero;
    // End of variables declaration//GEN-END:variables
}
