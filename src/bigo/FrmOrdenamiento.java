/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bigo;

import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

/**
 *
 * @author 59399
 */
public class FrmOrdenamiento extends javax.swing.JFrame {
    DefaultListModel modelo = new DefaultListModel();
    int iteracion,elementos,salir,numero,numero2,auxiliar,contador=0;
    int[] vector=new int[elementos];

    /**
     * Creates new form FrmOrdenamiento
     */
    public FrmOrdenamiento() {
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

        btnAgregar = new javax.swing.JButton();
        btnBusquedaLineal = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        lstNumeros = new javax.swing.JList();
        txtBusqueda = new javax.swing.JTextField();
        txtNumero = new javax.swing.JTextField();
        btnBusquedaBinaria = new javax.swing.JButton();
        btnBusquedaSeleccion = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnAgregar.setText("Agregar");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        btnBusquedaLineal.setText("lineal");
        btnBusquedaLineal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBusquedaLinealActionPerformed(evt);
            }
        });

        lstNumeros.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "56", "34", "2", "10", "77", "51", "93", "30", "5", "52" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(lstNumeros);

        txtBusqueda.setText("jTextField1");

        txtNumero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNumeroActionPerformed(evt);
            }
        });

        btnBusquedaBinaria.setText("binaria");

        btnBusquedaSeleccion.setText("seleccion");
        btnBusquedaSeleccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBusquedaSeleccionActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(txtBusqueda, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
                    .addComponent(jScrollPane1))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(txtNumero, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnAgregar, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnBusquedaLineal, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnBusquedaBinaria, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnBusquedaSeleccion, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addGap(27, 27, 27))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(38, 38, 38)
                        .addComponent(btnAgregar)
                        .addGap(30, 30, 30)
                        .addComponent(btnBusquedaLineal)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnBusquedaBinaria))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                        .addComponent(txtBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(46, 46, 46))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnBusquedaSeleccion)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
    modelo.addElement(txtNumero.getText());
        lstNumeros.setModel(modelo);
    // TODO add your handling code here:
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnBusquedaLinealActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBusquedaLinealActionPerformed
//    while(lstNumeros.
//    {
//        if(lstNumeros.getSelected Value()==txtBusqueda.getText())
//        {
//            JOptionPane.showMessageDialog(null,iteracion);
//        }
//        iteracion ++;
//       
//    }
        while(iteracion<elementos && salir ==0)
        {
            lstNumeros.setSelectedIndex(iteracion);
            if(lstNumeros.getSelectedValue().toString().equals(txtBusqueda.getText()))
            {
                JOptionPane.showMessageDialog(null,iteracion);
                salir=1;
            }
            iteracion ++;
        }
// TODO add your handling code here:
    }//GEN-LAST:event_btnBusquedaLinealActionPerformed

    private void txtNumeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNumeroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNumeroActionPerformed

    private void btnBusquedaSeleccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBusquedaSeleccionActionPerformed
       
        for (numero=0; numero<=elementos; numero++)
        {
            lstNumeros.setSelectedIndex(numero);
            vector[numero] = IntegerValueOf(lstNumeros.getSelectedValue());
            
            
        }
        
        
        
        for (numero=0; numero<=elementos; numero++)
        {    
            
        
            contador=numero;
            for (numero2=0; numero2<=elementos; numero2++)
            {
               
               if(vector[contador]<= vector[numero2])
               {
                  contador=numero2; 
               }  
            }
            auxiliar=vector[numero2];
            vector[numero2]=vector[contador];
            vector[contador]=auxiliar;    
        }
        
        for (numero=0; numero<=elementos; numero++)
        {
        
            System.out.print(vector[numero]);
        
            
            
        }
    }//GEN-LAST:event_btnBusquedaSeleccionActionPerformed

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
            java.util.logging.Logger.getLogger(FrmOrdenamiento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmOrdenamiento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmOrdenamiento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmOrdenamiento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmOrdenamiento().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnBusquedaBinaria;
    private javax.swing.JButton btnBusquedaLineal;
    private javax.swing.JButton btnBusquedaSeleccion;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList lstNumeros;
    private javax.swing.JTextField txtBusqueda;
    private javax.swing.JTextField txtNumero;
    // End of variables declaration//GEN-END:variables

    private int IntegerValueOf(Object selectedValue) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
