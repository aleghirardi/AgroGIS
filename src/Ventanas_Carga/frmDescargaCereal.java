/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * frmDescargaCereal.java
 *
 * Created on 10/11/2011, 21:25:54
 */
package Ventanas_Carga;

import Clases_Modulo_Carga.Descarga;
import Clases_Modulo_Carga.Productor;
import Clases_Modulo_Carga.Silo;
import Clases_Modulo_Carga.TipoCereal;
import Clases_Modulo_Carga.TipoTemporada;
import Clases_Modulo_Transporte.Transportista;
import Gestores_Vista.gestorDescargaCereal;
import Hibernate.GestorHibernate;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Iterator;
import java.util.TimeZone;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Charito
 */
public class frmDescargaCereal extends javax.swing.JInternalFrame {
gestorDescargaCereal gestorD = new gestorDescargaCereal();
    /** Creates new form frmDescargaCereal */
    public frmDescargaCereal() {
        initComponents();
        gestorD.rellenaTablaProductor(tblEstablecimiento);
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
        
        
        
        //redimensionar columnas de la tabla
        tblEstablecimiento.getColumnModel().getColumn(0).setPreferredWidth(100);
        tblEstablecimiento.getColumnModel().getColumn(1).setPreferredWidth(100);
        
        
         //Las siguientes lineas son para dar a la pantalla el tamaño requerido y luego centrarla en la pantalla.
        Toolkit kit = Toolkit.getDefaultToolkit();
        Dimension tamanioPantalla = kit.getScreenSize();
        int ancho = 600;
        int alto = 600;
        int posX = (int) ((tamanioPantalla.width - ancho) / 2);
//        int posY = (int) ((tamanioPantalla.height - alto) / 2);
        this.setSize(ancho, alto);
        this.setLocation(posX, 30);
        
        
        
        
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        txtFecha = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtHora = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblEstablecimiento = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        btnAgregar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        cmbTipoCereal = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();
        cmbTemporada = new javax.swing.JComboBox();
        jLabel4 = new javax.swing.JLabel();
        txtHumedad = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtToneladas = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        cmbImpurezas = new javax.swing.JComboBox();
        jLabel7 = new javax.swing.JLabel();
        cmbSilo = new javax.swing.JComboBox();
        jLabel8 = new javax.swing.JLabel();
        cmbTransportista = new javax.swing.JComboBox();
        txtProductor = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        txtEstablecimiento = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();

        setIconifiable(true);
        setMaximizable(true);
        setTitle("Descarga de Cereal");

        jPanel3.setLayout(null);

        jLabel9.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel9.setText("Fecha");
        jPanel3.add(jLabel9);
        jLabel9.setBounds(10, 13, 50, 15);
        jPanel3.add(txtFecha);
        txtFecha.setBounds(50, 10, 102, 20);

        jLabel10.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel10.setText("Hora");
        jPanel3.add(jLabel10);
        jLabel10.setBounds(180, 10, 40, 20);
        jPanel3.add(txtHora);
        txtHora.setBounds(210, 10, 70, 20);

        jLabel11.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel11.setText("Usuario");
        jPanel3.add(jLabel11);
        jLabel11.setBounds(460, 10, 50, 15);

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/UsuarioLogueado.png"))); // NOI18N
        jPanel3.add(jLabel12);
        jLabel12.setBounds(510, 0, 30, 30);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Establecimiento", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 0, 14))); // NOI18N
        jPanel1.setLayout(null);

        tblEstablecimiento.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Establecimiento", "Productor"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblEstablecimiento.getTableHeader().setResizingAllowed(false);
        tblEstablecimiento.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tblEstablecimiento);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(40, 30, 520, 160);

        btnAgregar.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        btnAgregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Agregar.png"))); // NOI18N
        btnAgregar.setText("Agregar");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 124, Short.MAX_VALUE)
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel4Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 52, Short.MAX_VALUE)
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel4Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        jPanel1.add(jPanel4);
        jPanel4.setBounds(230, 190, 120, 50);

        btnCancelar.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        btnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Cancelar.png"))); // NOI18N
        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        btnGuardar.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        btnGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Guardar.png"))); // NOI18N
        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        jPanel2.setLayout(null);

        jLabel2.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel2.setText("Tipo Cereal");
        jPanel2.add(jLabel2);
        jLabel2.setBounds(30, 40, 100, 20);

        jPanel2.add(cmbTipoCereal);
        cmbTipoCereal.setBounds(110, 40, 110, 20);

        jLabel3.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel3.setText("Temporada");
        jPanel2.add(jLabel3);
        jLabel3.setBounds(330, 40, 100, 20);

        jPanel2.add(cmbTemporada);
        cmbTemporada.setBounds(410, 40, 130, 20);

        jLabel4.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel4.setText("Toneladas");
        jPanel2.add(jLabel4);
        jLabel4.setBounds(40, 70, 80, 20);

        txtHumedad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtHumedadKeyTyped(evt);
            }
        });
        jPanel2.add(txtHumedad);
        txtHumedad.setBounds(410, 70, 90, 20);

        jLabel5.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel5.setText("%Humedad");
        jPanel2.add(jLabel5);
        jLabel5.setBounds(330, 70, 90, 20);

        txtToneladas.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtToneladasKeyTyped(evt);
            }
        });
        jPanel2.add(txtToneladas);
        txtToneladas.setBounds(110, 70, 110, 20);

        jLabel6.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel6.setText("Nivel de Impurezas");
        jPanel2.add(jLabel6);
        jLabel6.setBounds(0, 100, 120, 20);

        jPanel2.add(cmbImpurezas);
        cmbImpurezas.setBounds(110, 100, 110, 20);

        jLabel7.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel7.setText("Silo N°");
        jPanel2.add(jLabel7);
        jLabel7.setBounds(360, 100, 60, 20);

        jPanel2.add(cmbSilo);
        cmbSilo.setBounds(410, 100, 90, 20);

        jLabel8.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel8.setText("Transportista");
        jPanel2.add(jLabel8);
        jLabel8.setBounds(24, 130, 100, 20);

        jPanel2.add(cmbTransportista);
        cmbTransportista.setBounds(110, 130, 200, 20);
        jPanel2.add(txtProductor);
        txtProductor.setBounds(110, 10, 110, 20);

        jLabel1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel1.setText("Productor");
        jPanel2.add(jLabel1);
        jLabel1.setBounds(40, 10, 80, 20);
        jPanel2.add(txtEstablecimiento);
        txtEstablecimiento.setBounds(410, 10, 130, 20);

        jLabel13.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel13.setText("Establecimiento");
        jPanel2.add(jLabel13);
        jLabel13.setBounds(310, 10, 130, 20);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 589, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(199, 199, 199)
                        .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 186, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 589, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 589, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jSeparator1)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

//evento salida
private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
    int respuesta = JOptionPane.showConfirmDialog(null, "¿Confirma que desea cancelar la operacion?");
    if (respuesta==0){
    dispose();
    }
}//GEN-LAST:event_btnCancelarActionPerformed

private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
    GestorHibernate gestorH = new GestorHibernate();
    Descarga descarga = new Descarga();
    descarga.setCereal((TipoCereal) cmbTipoCereal.getSelectedItem());
    descarga.setFecha(txtFecha.getText());
    descarga.setHora(txtHora.getText());
    descarga.setSilo((Silo) cmbSilo.getSelectedItem());
    descarga.setTemporada((TipoTemporada) cmbTemporada.getSelectedItem());
    descarga.setToneladas(Double.parseDouble(txtToneladas.getText()));
    descarga.setTransportista((Transportista) cmbTransportista.getSelectedItem());
    Iterator ite = gestorH.listarClase(Productor.class).iterator();
    while(ite.hasNext()){
        Productor productor = (Productor) ite.next();
        if(productor.getNombre().equals(txtProductor.getText())){
            descarga.setProductor(productor);
        }
    }
    gestorH.guardarObjeto(descarga);
    

}//GEN-LAST:event_btnGuardarActionPerformed

//validacion de campos que solo deben llevar valores numericos
private void txtToneladasKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtToneladasKeyTyped
    char caracter = evt.getKeyChar();

      // Verificar si la tecla pulsada no es un digito
      if(((caracter < '0') ||
         (caracter > '9')) &&
         (caracter != '\b' /*corresponde a BACK_SPACE*/))
      {
         evt.consume();  // ignorar el evento de teclado
      }
   

}//GEN-LAST:event_txtToneladasKeyTyped

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

private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
    DefaultTableModel modeloT = (DefaultTableModel) tblEstablecimiento.getModel();
    int fila = tblEstablecimiento.getSelectedRow();
    txtProductor.setText((String) modeloT.getValueAt(fila, 1));
    txtEstablecimiento.setText((String) modeloT.getValueAt(fila, 0));

}//GEN-LAST:event_btnAgregarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JComboBox cmbImpurezas;
    private javax.swing.JComboBox cmbSilo;
    private javax.swing.JComboBox cmbTemporada;
    private javax.swing.JComboBox cmbTipoCereal;
    private javax.swing.JComboBox cmbTransportista;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
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
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable tblEstablecimiento;
    private javax.swing.JTextField txtEstablecimiento;
    private javax.swing.JTextField txtFecha;
    private javax.swing.JTextField txtHora;
    private javax.swing.JTextField txtHumedad;
    private javax.swing.JTextField txtProductor;
    private javax.swing.JTextField txtToneladas;
    // End of variables declaration//GEN-END:variables
}