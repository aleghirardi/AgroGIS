/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * frmRegistrarCereal.java
 *
 * Created on 05/11/2011, 22:23:20
 */
package Ventanas_Carga;

import Clases_Modulo_Carga.CaracteristicasCereal;
import Clases_Modulo_Carga.*;
import Gestores_Vista.gestorRegistrarCereal;
import Hibernate.GestorHibernate;
import java.awt.*;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Iterator;
import java.util.TimeZone;
import javax.swing.JOptionPane;

/**
 *
 * @author Charito
 */
public class frmRegistrarCereal extends javax.swing.JInternalFrame {

    /** Creates new form frmRegistrarCereal */
    public frmRegistrarCereal() {
        initComponents();
        gestorRegistrarCereal gRegistroCereal = new gestorRegistrarCereal();
        cmbMesInicioSiembra.setModel(gRegistroCereal.rellenaComboMes());
        cmbMesFinSiembra.setModel(gRegistroCereal.rellenaComboMes());
        cmbMesInicioCosecha.setModel(gRegistroCereal.rellenaComboMes());
        cmbMesFinCosecha.setModel(gRegistroCereal.rellenaComboMes());
       
        
        txtFecha.setEnabled(false);
        txtFecha.setEditable(false);
        txtHora.setEditable(false);
        txtHora.setEnabled(false);
        //setear el campo de fecha con la del sistema
        GregorianCalendar gc=new GregorianCalendar();
        GregorianCalendar.getInstance();
        gc.setTimeZone(TimeZone.getTimeZone("GMT-3"));
        gc.get(Calendar.DAY_OF_WEEK);
        gc.get(Calendar.MONTH);
        gc.get(Calendar.YEAR);
        SimpleDateFormat formateador= new SimpleDateFormat("dd-MM-yyyy");
        txtFecha.setText(formateador.format(gc.getTime()));
        //setear el campo de hora con la del sistema
        GregorianCalendar calendario=new GregorianCalendar();
        GregorianCalendar.getInstance();
        gc.setTimeZone(TimeZone.getTimeZone("GMT-3"));
        calendario.get(Calendar.HOUR);
        calendario.get(Calendar.MINUTE);
        SimpleDateFormat formateadorHora=new SimpleDateFormat("hh:mm");
        txtHora.setText(formateadorHora.format(calendario.getTime()));
        
        
        
        
        
        
        //Las siguientes lineas son para dar a la pantalla el tamaño requerido y luego centrarla en la pantalla.
        Toolkit kit = Toolkit.getDefaultToolkit();
        Dimension tamanioPantalla = kit.getScreenSize();
        int ancho = 655;
        int alto = 470;
        int posX = (int) ((tamanioPantalla.width - ancho) / 2);
//        int posY = (int) ((tamanioPantalla.height - alto) / 2);
        this.setSize(ancho, alto);
        this.setLocation(posX, 60);
        
        
        
        
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtNombreCereal = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        areaCereal = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        cmbMesInicioCosecha = new javax.swing.JComboBox();
        cmbMesFinCosecha = new javax.swing.JComboBox();
        jLabel9 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        cmbMesInicioSiembra = new javax.swing.JComboBox();
        cmbMesFinSiembra = new javax.swing.JComboBox();
        jPanel4 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txtFecha = new javax.swing.JTextField();
        txtHora = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        txtPesoH = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtHumedad = new javax.swing.JTextField();
        btnCancelar = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("Cereal");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Datos Cereal", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 0, 14))); // NOI18N
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel1.setText("Nombre");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(60, 20, 80, 20);

        txtNombreCereal.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombreCerealKeyTyped(evt);
            }
        });
        jPanel1.add(txtNombreCereal);
        txtNombreCereal.setBounds(110, 20, 160, 20);

        jLabel2.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel2.setText("Descripción");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(40, 90, 80, 15);

        areaCereal.setColumns(20);
        areaCereal.setRows(5);
        jScrollPane1.setViewportView(areaCereal);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(110, 50, 450, 96);

        jLabel3.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel3.setText("Tipo Temporada");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(10, 160, 110, 20);

        jLabel4.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel4.setText("Mes Comienzo");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(300, 190, 90, 20);

        jLabel5.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel5.setText("Mes Fin");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(330, 220, 50, 20);

        jLabel16.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel16.setText("Cosecha");
        jPanel1.add(jLabel16);
        jLabel16.setBounds(110, 160, 90, 20);

        jLabel14.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel14.setText("Siembra");
        jPanel1.add(jLabel14);
        jLabel14.setBounds(390, 160, 90, 20);

        jLabel8.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel8.setText("Tipo Temporada");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(290, 160, 110, 20);

        jPanel1.add(cmbMesInicioCosecha);
        cmbMesInicioCosecha.setBounds(110, 190, 100, 20);

        jPanel1.add(cmbMesFinCosecha);
        cmbMesFinCosecha.setBounds(110, 220, 100, 20);

        jLabel9.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel9.setText("Mes Comienzo");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(20, 190, 90, 20);

        jLabel15.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel15.setText("Mes Fin");
        jPanel1.add(jLabel15);
        jLabel15.setBounds(50, 220, 50, 20);

        jPanel1.add(cmbMesInicioSiembra);
        cmbMesInicioSiembra.setBounds(390, 190, 100, 20);

        jPanel1.add(cmbMesFinSiembra);
        cmbMesFinSiembra.setBounds(390, 220, 100, 20);

        jPanel4.setLayout(null);

        jLabel10.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel10.setText("Fecha");
        jPanel4.add(jLabel10);
        jLabel10.setBounds(10, 13, 40, 15);

        jLabel11.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel11.setText("Hora");
        jPanel4.add(jLabel11);
        jLabel11.setBounds(210, 10, 40, 20);

        jLabel12.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel12.setText("Usuario");
        jPanel4.add(jLabel12);
        jLabel12.setBounds(520, 10, 50, 15);
        jPanel4.add(txtFecha);
        txtFecha.setBounds(60, 10, 80, 20);
        jPanel4.add(txtHora);
        txtHora.setBounds(250, 10, 70, 20);

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/UsuarioLogueado.png"))); // NOI18N
        jPanel4.add(jLabel13);
        jLabel13.setBounds(570, 0, 30, 30);

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Caracteristicas Cereal", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 0, 14))); // NOI18N

        jLabel6.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel6.setText("Peso Hectolítrico");

        txtPesoH.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPesoHKeyTyped(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel7.setText("% Humedad");

        txtHumedad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtHumedadKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtPesoH, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtHumedad, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtPesoH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(txtHumedad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 623, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 633, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Cancelar.png"))); // NOI18N
        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        btnGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Guardar.png"))); // NOI18N
        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(216, 216, 216)
                .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 8, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
    int respuesta = JOptionPane.showConfirmDialog(null, "Confirma que desea cancelar la operación?");
    if (respuesta==0){
    dispose();
    }
}//GEN-LAST:event_btnCancelarActionPerformed

private void txtPesoHKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPesoHKeyTyped
    char caracter = evt.getKeyChar();

      // Verificar si la tecla pulsada no es un digito
      if(((caracter < '0') ||
         (caracter > '9')) &&
         (caracter != '\b' /*corresponde a BACK_SPACE*/))
      {
         evt.consume();  // ignorar el evento de teclado
      }
}//GEN-LAST:event_txtPesoHKeyTyped

private void txtHumedadKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtHumedadKeyTyped
    char caracter = evt.getKeyChar();

      // Verificar si la tecla pulsada no es un digito
      if(((caracter < '0') ||
         (caracter > '9')) &&
         (caracter != '\b' /*corresponde a BACK_SPACE*/))
      {
         evt.consume();  // ignorar el evento de teclado
      }
}//GEN-LAST:event_txtHumedadKeyTyped

private void txtNombreCerealKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreCerealKeyTyped
    char c = evt.getKeyChar();
        if (Character.isDigit(c) == false) {
          
        }else{
           evt.consume();
              }
}//GEN-LAST:event_txtNombreCerealKeyTyped

private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
    GestorHibernate gestorH = new GestorHibernate();
    TipoCereal cereal = new TipoCereal();
    CaracteristicasCereal caracteristicas = new CaracteristicasCereal();
    cereal.setNombreCereal(txtNombreCereal.getText());
    Iterator ite = gestorH.listarClase(TipoTemporada.class).iterator();
    while(ite.hasNext()){
         TipoTemporada tipoTemporada= (TipoTemporada) ite.next();
         if(tipoTemporada.getNombreTipoTemporada()=="Cosecha"){
            Temporada temporada = new Temporada();
            temporada.setMesDesde((Mes)cmbMesInicioCosecha.getSelectedItem());
            temporada.setMesHasta((Mes)cmbMesFinCosecha.getSelectedItem());
            tipoTemporada.setTemporada(temporada);
            cereal.setTemporadaCosecha(tipoTemporada);
         } else {
            Temporada temporada = new Temporada();
            temporada.setMesDesde((Mes)cmbMesInicioSiembra.getSelectedItem());
            temporada.setMesHasta((Mes)cmbMesFinSiembra.getSelectedItem());
            tipoTemporada.setTemporada(temporada);
            cereal.setTemporadaCosecha(tipoTemporada);
         }
    }
    caracteristicas.setNombreCaracteristica("Humedad");
    caracteristicas.setValorDesde(0);
    caracteristicas.setValorHasta(Double.parseDouble(txtHumedad.getText()));
    gestorH.guardarObjeto(caracteristicas);
    cereal.setCaracteristicas(caracteristicas);
    gestorH.guardarObjeto(cereal);
}//GEN-LAST:event_btnGuardarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea areaCereal;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JComboBox cmbMesFinCosecha;
    private javax.swing.JComboBox cmbMesFinSiembra;
    private javax.swing.JComboBox cmbMesInicioCosecha;
    private javax.swing.JComboBox cmbMesInicioSiembra;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtFecha;
    private javax.swing.JTextField txtHora;
    private javax.swing.JTextField txtHumedad;
    private javax.swing.JTextField txtNombreCereal;
    private javax.swing.JTextField txtPesoH;
    // End of variables declaration//GEN-END:variables
}
