/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Ventanas_Viaje;

import java.awt.*;
import java.text.*;
import java.util.*;
import javax.swing.*;


/**
 *
 * @author Carolina
 */
public class frmRegistrarViaje extends javax.swing.JInternalFrame {

    /**
     * Creates new form frmRegistrarViaje
     */
    public frmRegistrarViaje() {
        initComponents();
        
        txtFecha.setEditable(false);
        txtFecha.setEnabled(false);
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
        
        
        //borrar el icono del InternalFrame
        this.setFrameIcon(new ImageIcon("Imagenes/Aceptar.png"));
        
        
        //Las siguientes lineas son para dar a la pantalla el tamaño requerido y luego centrarla en la pantalla.
        Toolkit kit = Toolkit.getDefaultToolkit();
        Dimension tamanioPantalla = kit.getScreenSize();
        int ancho = 730;
        int alto = 630;
        int posX = (int) ((tamanioPantalla.width - ancho) / 2);
//        int posY = (int) ((tamanioPantalla.height - alto) / 2);
        this.setSize(ancho, alto);
        this.setLocation(posX, 0);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtHora = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        txtFecha = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblLote = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        txtProductor = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        cmbEstablecimiento = new javax.swing.JComboBox();
        btnConsultarMapa = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        txtLote = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtHas = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblProductor = new javax.swing.JTable();
        btnAgregar = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        cmbCereal = new javax.swing.JComboBox();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel3 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        calendarioViaje = new datechooser.beans.DateChooserCombo();
        jLabel12 = new javax.swing.JLabel();
        txtHoraViaje = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        txtSolicitante = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        txtEstado = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        txtNumViaje = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        btnGuardar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();

        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Viaje");

        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel1.setText("Fecha");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(10, 10, 60, 20);
        jPanel1.add(txtHora);
        txtHora.setBounds(190, 10, 70, 20);

        jLabel2.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel2.setText("Hora");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(155, 10, 51, 20);

        jLabel3.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel3.setText("Carolina");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(551, 0, 50, 40);

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/UsuarioLogueado.png"))); // NOI18N
        jPanel1.add(jLabel13);
        jLabel13.setBounds(600, 0, 30, 30);
        jPanel1.add(txtFecha);
        txtFecha.setBounds(50, 10, 70, 20);

        jPanel2.setLayout(null);

        tblLote.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Lote Nº", "Hectáreas"
            }
        ));
        jScrollPane1.setViewportView(tblLote);

        jPanel2.add(jScrollPane1);
        jScrollPane1.setBounds(120, 290, 452, 100);

        jLabel5.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel5.setText("Productor");
        jPanel2.add(jLabel5);
        jLabel5.setBounds(290, 10, 90, 17);
        jPanel2.add(txtProductor);
        txtProductor.setBounds(80, 140, 210, 20);

        jLabel6.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel6.setText("Productor");
        jPanel2.add(jLabel6);
        jLabel6.setBounds(20, 140, 80, 20);

        jLabel4.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel4.setText("Establecimiento");
        jPanel2.add(jLabel4);
        jLabel4.setBounds(330, 140, 120, 20);

        jPanel2.add(cmbEstablecimiento);
        cmbEstablecimiento.setBounds(430, 140, 210, 20);

        btnConsultarMapa.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        btnConsultarMapa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/map.png"))); // NOI18N
        btnConsultarMapa.setText(" Mapa");
        jPanel2.add(btnConsultarMapa);
        btnConsultarMapa.setBounds(280, 170, 100, 30);

        jLabel8.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel8.setText("Lote Nº");
        jPanel2.add(jLabel8);
        jLabel8.setBounds(260, 220, 60, 20);
        jPanel2.add(txtLote);
        txtLote.setBounds(310, 220, 70, 20);

        jLabel9.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel9.setText("Hectáreas");
        jPanel2.add(jLabel9);
        jLabel9.setBounds(430, 220, 80, 20);
        jPanel2.add(txtHas);
        txtHas.setBounds(490, 220, 80, 20);

        tblProductor.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Apellido y Nombre", "Número de Documento"
            }
        ));
        jScrollPane2.setViewportView(tblProductor);

        jPanel2.add(jScrollPane2);
        jScrollPane2.setBounds(90, 30, 490, 100);

        btnAgregar.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        btnAgregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Agregar.png"))); // NOI18N
        btnAgregar.setText("Agregar");
        jPanel2.add(btnAgregar);
        btnAgregar.setBounds(280, 250, 101, 30);

        jLabel10.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel10.setText("Cereal");
        jPanel2.add(jLabel10);
        jLabel10.setBounds(90, 220, 60, 20);

        jPanel2.add(cmbCereal);
        cmbCereal.setBounds(130, 220, 100, 20);
        jPanel2.add(jSeparator1);
        jSeparator1.setBounds(90, 210, 480, 10);

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Datos Viaje", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 0, 14))); // NOI18N
        jPanel3.setLayout(null);

        jLabel11.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel11.setText("Fecha Realización");
        jPanel3.add(jLabel11);
        jLabel11.setBounds(10, 20, 130, 20);
        jPanel3.add(calendarioViaje);
        calendarioViaje.setBounds(120, 20, 89, 20);

        jLabel12.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel12.setText("Hora Realización");
        jPanel3.add(jLabel12);
        jLabel12.setBounds(250, 20, 110, 20);
        jPanel3.add(txtHoraViaje);
        txtHoraViaje.setBounds(350, 20, 80, 20);

        jLabel14.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel14.setText("Solicitante");
        jPanel3.add(jLabel14);
        jLabel14.setBounds(460, 20, 80, 20);
        jPanel3.add(txtSolicitante);
        txtSolicitante.setBounds(520, 20, 150, 20);

        jLabel15.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel15.setText("Estado");
        jPanel3.add(jLabel15);
        jLabel15.setBounds(69, 50, 60, 20);
        jPanel3.add(txtEstado);
        txtEstado.setBounds(120, 50, 90, 20);

        jLabel16.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel16.setText("Numero Viaje");
        jPanel3.add(jLabel16);
        jLabel16.setBounds(260, 50, 110, 20);
        jPanel3.add(txtNumViaje);
        txtNumViaje.setBounds(350, 50, 80, 20);

        btnGuardar.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        btnGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Guardar.png"))); // NOI18N
        btnGuardar.setText("Guardar");

        btnCancelar.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        btnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Cancelar.png"))); // NOI18N
        btnCancelar.setText("Cancelar");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(12, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 681, Short.MAX_VALUE)
                            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(222, 222, 222)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnConsultarMapa;
    private javax.swing.JButton btnGuardar;
    private datechooser.beans.DateChooserCombo calendarioViaje;
    private javax.swing.JComboBox cmbCereal;
    private javax.swing.JComboBox cmbEstablecimiento;
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
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable tblLote;
    private javax.swing.JTable tblProductor;
    private javax.swing.JTextField txtEstado;
    private javax.swing.JTextField txtFecha;
    private javax.swing.JTextField txtHas;
    private javax.swing.JTextField txtHora;
    private javax.swing.JTextField txtHoraViaje;
    private javax.swing.JTextField txtLote;
    private javax.swing.JTextField txtNumViaje;
    private javax.swing.JTextField txtProductor;
    private javax.swing.JTextField txtSolicitante;
    // End of variables declaration//GEN-END:variables
}
