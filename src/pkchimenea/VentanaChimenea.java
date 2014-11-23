/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pkchimenea;
import chimenea.Chimenea;
import java.text.DecimalFormat;
import java.util.Random;

/**
 *
 * @author Ignacio
 */
public class VentanaChimenea extends javax.swing.JFrame {

    Chimenea chimenea;
    private static final String FORM_TEMP = "# 'ºC'";
    private static final int TEMP_MIN_INI = 0;
    private static final int TEMP_MAX_INI = 15;    
    private static final int TEMP_MINIMA = 0;
    private static final int TEMP_MAXIMA = 300;
    private static final int CAPACIDAD = 56;
    private static final int UNA_HORA = 1;
    
    public VentanaChimenea() {
        initComponents();
        inicializaChimenea();
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
        jTFTemperatura = new javax.swing.JTextField();
        jPBTemperatura = new javax.swing.JProgressBar();
        jBLenhaFina = new javax.swing.JButton();
        jBLenhaMediana = new javax.swing.JButton();
        jBLenhaGorda = new javax.swing.JButton();
        jBPasarHora = new javax.swing.JButton();
        jBEncender = new javax.swing.JButton();
        jBApagar = new javax.swing.JButton();
        imagenChimenea = new javabean.chimenea.ChimeneaBean();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Temperatura:");

        jTFTemperatura.setEditable(false);

        jBLenhaFina.setText("Añadir leña fina");
        jBLenhaFina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBLenhaFinaActionPerformed(evt);
            }
        });

        jBLenhaMediana.setText("Añadir leña mediana");
        jBLenhaMediana.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBLenhaMedianaActionPerformed(evt);
            }
        });

        jBLenhaGorda.setText("Añadir leña gorda");
        jBLenhaGorda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBLenhaGordaActionPerformed(evt);
            }
        });

        jBPasarHora.setText("Pasar una hora");
        jBPasarHora.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBPasarHoraActionPerformed(evt);
            }
        });

        jBEncender.setText("Encender");
        jBEncender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBEncenderActionPerformed(evt);
            }
        });

        jBApagar.setText("Apagar");
        jBApagar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBApagarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jBLenhaFina)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jBPasarHora))
                                .addComponent(jBLenhaMediana)
                                .addComponent(jPBTemperatura, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTFTemperatura, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(imagenChimenea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jBLenhaGorda)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jBEncender)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jBApagar)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jTFTemperatura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jPBTemperatura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jBLenhaFina)
                            .addComponent(jBPasarHora))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jBLenhaMediana))
                    .addComponent(imagenChimenea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jBLenhaGorda)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jBApagar)
                        .addComponent(jBEncender)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void inicializaChimenea(){
        
        //Generamos la Temperatura Aleatoria Inicial
        Random generadorNum = new Random();
        int tempActual = generadorNum.nextInt(TEMP_MAX_INI + 1) + TEMP_MIN_INI;
        
        //Iniciamos el ProgressBar de Temperatura
        jPBTemperatura.setMinimum(TEMP_MINIMA);
        jPBTemperatura.setMaximum(TEMP_MAXIMA);
        
        //Iniciamos la Clase Externa Chimenea
        chimenea = new Chimenea(tempActual, CAPACIDAD);
        
        //Visualizamos la Temperatura
        visualizaTemperatura(tempActual);
    }
    
    private void visualizaTemperatura(int temperatura){
        
        //Establecemos la Temperatura en el TextField
        DecimalFormat formato = new DecimalFormat(FORM_TEMP);
        jTFTemperatura.setText(formato.format(temperatura));
        
        //Establecemos la Temperatura en el ProgressBar
        jPBTemperatura.setValue(temperatura);
    }
    
    private void actualizaTemperatura(){
        
        //Obtenemos la Temperatura Actual
        int tempActual = chimenea.getTemperatura();
        
        //Actualizamos Visualmente la Temperatura
        visualizaTemperatura(tempActual);
    }

    private void jBLenhaFinaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBLenhaFinaActionPerformed
        
        //Añadimos Leña Fina
        chimenea.añadirLeña(Chimenea.TRONCO_FINO);
        actualizaTemperatura();
    }//GEN-LAST:event_jBLenhaFinaActionPerformed

    private void jBLenhaMedianaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBLenhaMedianaActionPerformed
        
        //Añadimos Leña Mediana
        chimenea.añadirLeña(Chimenea.TRONCO_MEDIO);
        actualizaTemperatura();
    }//GEN-LAST:event_jBLenhaMedianaActionPerformed

    private void jBLenhaGordaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBLenhaGordaActionPerformed
        
        //Añadimos Leña Gorda
        chimenea.añadirLeña(Chimenea.TRONCO_GORDO);
        actualizaTemperatura();
    }//GEN-LAST:event_jBLenhaGordaActionPerformed

    private void jBPasarHoraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBPasarHoraActionPerformed
        
        //Hacemos que pase 1 hora
        chimenea.pasarTiempo(UNA_HORA);
        actualizaTemperatura();
    }//GEN-LAST:event_jBPasarHoraActionPerformed

    private void jBEncenderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBEncenderActionPerformed
        
        //Encendemos la Chimenea
        imagenChimenea.encender();
    }//GEN-LAST:event_jBEncenderActionPerformed

    private void jBApagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBApagarActionPerformed
        
        //Apagamos la Chimenea
        imagenChimenea.apagar();
        chimenea.pasarTiempo(100);
        actualizaTemperatura();
    }//GEN-LAST:event_jBApagarActionPerformed

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
            java.util.logging.Logger.getLogger(VentanaChimenea.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaChimenea.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaChimenea.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaChimenea.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaChimenea().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javabean.chimenea.ChimeneaBean imagenChimenea;
    private javax.swing.JButton jBApagar;
    private javax.swing.JButton jBEncender;
    private javax.swing.JButton jBLenhaFina;
    private javax.swing.JButton jBLenhaGorda;
    private javax.swing.JButton jBLenhaMediana;
    private javax.swing.JButton jBPasarHora;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JProgressBar jPBTemperatura;
    private javax.swing.JTextField jTFTemperatura;
    // End of variables declaration//GEN-END:variables
}
