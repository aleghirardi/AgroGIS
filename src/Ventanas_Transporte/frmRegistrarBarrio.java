/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * frmRegistrarBarrio.java
 *
 * Created on 27/10/2011, 13:05:07
 */
package Ventanas_Transporte;

import Clases_Modulo_Transporte.Barrio;
import Clases_Modulo_Transporte.Localidad;
import Gestores_Clases.gestorPais;
import Gestores_Vista.gestorRegistroBarrio;
import Hibernate.GestorHibernate;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.TimeZone;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Charito
 */
public class frmRegistrarBarrio extends javax.swing.JInternalFrame {

    /** Creates new form frmRegistrarBarrio */
    gestorPais gPais = new gestorPais();
    gestorRegistroBarrio gRBarrio = new gestorRegistroBarrio();
    
    public frmRegistrarBarrio() {
        initComponents();   
        
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
        tblBarrio.getColumnModel().getColumn(0).setPreferredWidth(100);
        tblBarrio.getColumnModel().getColumn(1).setPreferredWidth(100);
        
        
    //lineas para mejorar el aspecto de la pantalla     
    Toolkit kit = Toolkit.getDefaultToolkit();
    Dimension tamanioPantalla = kit.getScreenSize();
    int ancho = 500;
    int alto = 520;
//    int posX = (int) ((tamanioPantalla.width - ancho) / 2);
//    int posY = (int) ((tamanioPantalla.height - alto) / 2);
    this.setSize(ancho, alto);
    this.setLocation(360, 60);
    cmbPais.setModel(gPais.getComboModelPais());    
    
    //Relleno Provincia de acuerdo al Pais
    cmbPais.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent arg0){
            cmbProv.setModel(gRBarrio.rellenaComboProvincia(cmbPais.getSelectedItem().toString()));
        }
        }
        );
        cmbProv.setModel(gRBarrio.rellenaComboProvincia(cmbPais.getSelectedItem().toString()));
        //Relleno Departamento de acuerdo a la Provincia
        cmbProv.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent arg0) {
                cmbDepto.setModel(gRBarrio.rellenaComboDepartamento(cmbProv.getSelectedItem().toString()));
            }
        });
        cmbDepto.setModel(gRBarrio.rellenaComboDepartamento(cmbProv.getSelectedItem().toString()));
       
        //Relleno Localidad de acuerdo al Departamento
        cmbDepto.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent arg0) {
                cmbLocal.setModel(gRBarrio.rellenaComboLocalidad(cmbDepto.getSelectedItem().toString()));
            }
        });
        cmbLocal.setModel(gRBarrio.rellenaComboLocalidad(cmbDepto.getSelectedItem().toString()));
    }

    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        cmbPais = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        cmbProv = new javax.swing.JComboBox();
        cmbLocal = new javax.swing.JComboBox();
        jLabel4 = new javax.swing.JLabel();
        txtBarrio = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        cmbDepto = new javax.swing.JComboBox();
        jPanel17 = new javax.swing.JPanel();
        btnAgregarBarrio = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblBarrio = new javax.swing.JTable();
        btnEliminarBarrio = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        txtFecha = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtHora = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        btnGuardar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setTitle("Barrio");

        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Arial", 0, 12));
        jLabel1.setText("País");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(100, 10, 30, 20);

        jPanel1.add(cmbPais);
        cmbPais.setBounds(140, 10, 189, 20);

        jLabel2.setFont(new java.awt.Font("Arial", 0, 12));
        jLabel2.setText("Provincia");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(80, 40, 60, 20);

        jPanel1.add(cmbProv);
        cmbProv.setBounds(140, 40, 189, 20);

        jPanel1.add(cmbLocal);
        cmbLocal.setBounds(140, 100, 189, 20);

        jLabel4.setFont(new java.awt.Font("Arial", 0, 12));
        jLabel4.setText("Nombre Barrio");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(50, 130, 90, 20);

        txtBarrio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtBarrioKeyTyped(evt);
            }
        });
        jPanel1.add(txtBarrio);
        txtBarrio.setBounds(140, 130, 190, 20);

        jLabel3.setFont(new java.awt.Font("Arial", 0, 12));
        jLabel3.setText("Localidad");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(70, 100, 60, 20);

        jLabel5.setFont(new java.awt.Font("Arial", 0, 12));
        jLabel5.setText("Departamento");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(50, 70, 90, 20);

        jPanel1.add(cmbDepto);
        cmbDepto.setBounds(140, 70, 189, 20);

        btnAgregarBarrio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Agregar.png"))); // NOI18N
        btnAgregarBarrio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarBarrioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel17Layout = new javax.swing.GroupLayout(jPanel17);
        jPanel17.setLayout(jPanel17Layout);
        jPanel17Layout.setHorizontalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addContainerGap(50, Short.MAX_VALUE)
                .addComponent(btnAgregarBarrio, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel17Layout.setVerticalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addGap(106, 106, 106)
                .addComponent(btnAgregarBarrio, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel17);
        jPanel17.setBounds(290, 20, 100, 140);

        tblBarrio.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Localidad", "Barrio"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblBarrio.getTableHeader().setResizingAllowed(false);
        tblBarrio.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tblBarrio);

        btnEliminarBarrio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/delete.png"))); // NOI18N
        btnEliminarBarrio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarBarrioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 339, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnEliminarBarrio, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addComponent(btnEliminarBarrio, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setLayout(null);

        jLabel9.setFont(new java.awt.Font("Arial", 1, 12));
        jLabel9.setText("Fecha");
        jPanel3.add(jLabel9);
        jLabel9.setBounds(10, 13, 50, 15);
        jPanel3.add(txtFecha);
        txtFecha.setBounds(50, 10, 90, 20);

        jLabel10.setFont(new java.awt.Font("Arial", 1, 12));
        jLabel10.setText("Hora");
        jPanel3.add(jLabel10);
        jLabel10.setBounds(200, 10, 40, 20);
        jPanel3.add(txtHora);
        txtHora.setBounds(230, 10, 70, 20);

        jLabel11.setFont(new java.awt.Font("Arial", 1, 12));
        jLabel11.setText("Usuario");
        jPanel3.add(jLabel11);
        jLabel11.setBounds(380, 10, 50, 15);

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/UsuarioLogueado.png"))); // NOI18N
        jPanel3.add(jLabel12);
        jLabel12.setBounds(430, 0, 30, 30);

        btnGuardar.setFont(new java.awt.Font("Arial", 0, 11));
        btnGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Guardar.png"))); // NOI18N
        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        btnCancelar.setFont(new java.awt.Font("Arial", 0, 11));
        btnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Cancelar.png"))); // NOI18N
        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 457, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addGap(32, 32, 32)
                                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 441, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(16, 16, 16))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(156, 156, 156)
                        .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 504, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 5, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

private void btnEliminarBarrioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarBarrioActionPerformed
    DefaultTableModel modeloT = (DefaultTableModel) tblBarrio.getModel();
    modeloT.removeRow(tblBarrio.getSelectedRow());
}//GEN-LAST:event_btnEliminarBarrioActionPerformed

private void btnAgregarBarrioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarBarrioActionPerformed
    DefaultTableModel modeloTabla = (DefaultTableModel) tblBarrio.getModel();
    Object fila[]={cmbLocal.getSelectedItem(), txtBarrio.getText()};
    modeloTabla.addRow(fila);
    tblBarrio.setModel(modeloTabla);
    txtBarrio.setText(""); 
}//GEN-LAST:event_btnAgregarBarrioActionPerformed

private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
    int respuesta = JOptionPane.showConfirmDialog(null, "Confirma que desea cancelar la operación?");
    if (respuesta==0){
    dispose();
    }
}//GEN-LAST:event_btnCancelarActionPerformed

private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
    DefaultTableModel modeloTabla = (DefaultTableModel) tblBarrio.getModel();
    GestorHibernate gestorH = new GestorHibernate();
    Barrio barrio = new Barrio();
    for(int i=0;i<modeloTabla.getRowCount();i++){
        barrio.setNombreBarrio((String)modeloTabla.getValueAt(i, 1));
        barrio.setLocalidad((Localidad)modeloTabla.getValueAt(i, 0));
    }
    JOptionPane.showMessageDialog(null, "Los cambios se han guardado correctamente");
    gestorH.guardarObjeto(barrio);
}//GEN-LAST:event_btnGuardarActionPerformed

private void txtBarrioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBarrioKeyTyped
    char c = evt.getKeyChar();
        if (Character.isDigit(c) == false) {
          
        }else{
           evt.consume();
              }
}//GEN-LAST:event_txtBarrioKeyTyped

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregarBarrio;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnEliminarBarrio;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JComboBox cmbDepto;
    private javax.swing.JComboBox cmbLocal;
    private javax.swing.JComboBox cmbPais;
    private javax.swing.JComboBox cmbProv;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable tblBarrio;
    private javax.swing.JTextField txtBarrio;
    private javax.swing.JTextField txtFecha;
    private javax.swing.JTextField txtHora;
    // End of variables declaration//GEN-END:variables
}
