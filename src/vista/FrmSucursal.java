/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import controlador.SucursalControl;
import controlador.ed.lista.exception.NullException;
import controlador.ed.lista.exception.PosicionException;
import controlador.exception.EspacioException;
import controlador.utiles.Utilidades;
import static java.awt.SystemColor.control;
import java.lang.System.Logger;
import java.lang.System.Logger.Level;
import javax.swing.JOptionPane;
import vista.Utilidades.utilidades;
import vista.modeloTabla.ModeloTablaSucursal;
import vista.modeloTabla.ModeloTablaVenta;

/**
 *
 * @author marylin
 */
public class FrmSucursal extends javax.swing.JDialog {

 

    private SucursalControl sc = new SucursalControl();
    private ModeloTablaSucursal modeloS = new ModeloTablaSucursal();
    private ModeloTablaVenta modeloV = new ModeloTablaVenta();

    /**
     * Creates new form FrmSucursal
     */
    public FrmSucursal(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        Limpiar();
        cargarTabla();
        setLocationRelativeTo(this);
    }

    public FrmSucursal() {
        initComponents();
        this.setLocationRelativeTo(null);
//        this.setLocation(null);
    }

    private void Limpiar() {

        txtNombre.setText("");
        this.sc.setSucursal(null);
        cargarTabla();

    }
    
    /**
     * Metodo guardar Sucursal
     */

    public void guardarSucursal() {
        /* sc.getSucursal().setNombre(txtNombre.getText());
        if (!txtNombre.getText().isEmpty()) {
            utilidades.guardarSucursal(sc.getSucursal());
            JOptionPane.showMessageDialog(null, "La sucursal se ha guardado correctamente");
            cargarTabla();
        } else {
            JOptionPane.showMessageDialog(null, "Datos incompletos");
        }
         */
        sc.getSucursal().setNombre(txtNombre.getText());
        if (!txtNombre.getText().isEmpty()) {
            sc.getSucursal().setId(utilidades.listarSucursal().getSize() + 1);
            utilidades.guardarSucursal(sc.getSucursal());
            JOptionPane.showMessageDialog(null, "La sucursal se ha guardado correctamente");
            cargarTabla();
            Limpiar();
        } else {
            JOptionPane.showMessageDialog(null, "Datos incompletos");
        }
    }

    public void cargarTabla() {
        modeloS.setLista(utilidades.listarSucursal());
        //sc.setSucursalsList(utilidades.listarSucursal());
        modeloS.setLista(utilidades.listarSucursal());
        sc.setListaSucursal(utilidades.listarSucursal());
        tblSucursal.setModel(modeloS);
        tblSucursal.updateUI();

    }
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem2 = new javax.swing.JMenuItem();
        panel1 = new org.edisoncor.gui.panel.Panel();
        panelImage1 = new org.edisoncor.gui.panel.PanelImage();
        panelImage2 = new org.edisoncor.gui.panel.PanelImage();
        jLabel1 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        btnGuardar = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        panelImage3 = new org.edisoncor.gui.panel.PanelImage();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblSucursal = new javax.swing.JTable();
        btnSeleccionar = new javax.swing.JButton();
        panelImage4 = new org.edisoncor.gui.panel.PanelImage();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtMesmy = new javax.swing.JTextField();
        txtTotal_MayorV = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtNombre_SucursalMY = new javax.swing.JTextField();
        txtMesmn = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        Total_MenorV = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtSucursalMn = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        btnHistorial = new javax.swing.JButton();
        btnReclamo = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();

        jMenuItem2.setText("jMenuItem2");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        panel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/f14.png"))); // NOI18N

        panelImage1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Sucursales", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 48))); // NOI18N

        panelImage2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Datos", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 18))); // NOI18N

        jLabel1.setText("Nombre:");

        btnGuardar.setBackground(new java.awt.Color(232, 231, 231));
        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        btnModificar.setText("Modificar");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });

        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelImage2Layout = new javax.swing.GroupLayout(panelImage2);
        panelImage2.setLayout(panelImage2Layout);
        panelImage2Layout.setHorizontalGroup(
            panelImage2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelImage2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(83, 83, 83)
                .addComponent(btnGuardar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnModificar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnEliminar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelImage2Layout.setVerticalGroup(
            panelImage2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelImage2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelImage2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnGuardar)
                    .addComponent(btnModificar)
                    .addComponent(btnEliminar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelImage3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "ListaSucursales", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 18))); // NOI18N

        tblSucursal.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tblSucursal);

        btnSeleccionar.setText("Seleccionar");
        btnSeleccionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSeleccionarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelImage3Layout = new javax.swing.GroupLayout(panelImage3);
        panelImage3.setLayout(panelImage3Layout);
        panelImage3Layout.setHorizontalGroup(
            panelImage3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelImage3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelImage3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 683, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelImage3Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnSeleccionar)))
                .addContainerGap())
        );
        panelImage3Layout.setVerticalGroup(
            panelImage3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelImage3Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnSeleccionar))
        );

        panelImage4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Resultado", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 18))); // NOI18N

        jLabel2.setText("Mayor Venta:");

        jLabel3.setText("Menor Venta:");

        txtMesmy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMesmyActionPerformed(evt);
            }
        });

        jLabel4.setText("Total:");

        jLabel5.setText("Nombre:");

        jLabel6.setText("Total:");

        Total_MenorV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Total_MenorVActionPerformed(evt);
            }
        });

        jLabel7.setText("Nombre:");

        jLabel8.setText("Mes:");

        jLabel9.setText("Mes:");

        javax.swing.GroupLayout panelImage4Layout = new javax.swing.GroupLayout(panelImage4);
        panelImage4.setLayout(panelImage4Layout);
        panelImage4Layout.setHorizontalGroup(
            panelImage4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelImage4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelImage4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addGroup(panelImage4Layout.createSequentialGroup()
                        .addGroup(panelImage4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(panelImage4Layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtMesmy, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelImage4Layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtMesmn, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelImage4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelImage4Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Total_MenorV, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel7)
                                .addGap(18, 18, 18)
                                .addComponent(txtSucursalMn, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelImage4Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtTotal_MayorV, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtNombre_SucursalMY, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelImage4Layout.setVerticalGroup(
            panelImage4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelImage4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(35, 35, 35)
                .addGroup(panelImage4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtMesmy, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(jLabel4)
                    .addComponent(txtTotal_MayorV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(txtNombre_SucursalMY, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addGroup(panelImage4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtMesmn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(Total_MenorV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(txtSucursalMn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(39, Short.MAX_VALUE))
        );

        btnHistorial.setText("Historial");
        btnHistorial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHistorialActionPerformed(evt);
            }
        });

        btnReclamo.setText("Reclamo");
        btnReclamo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReclamoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelImage1Layout = new javax.swing.GroupLayout(panelImage1);
        panelImage1.setLayout(panelImage1Layout);
        panelImage1Layout.setHorizontalGroup(
            panelImage1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelImage1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(panelImage1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelImage3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelImage2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelImage4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelImage1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnHistorial)
                .addGap(18, 18, 18)
                .addComponent(btnReclamo)
                .addGap(227, 227, 227))
        );
        panelImage1Layout.setVerticalGroup(
            panelImage1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelImage1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelImage1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnHistorial)
                    .addComponent(btnReclamo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelImage2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(panelImage3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelImage4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout panel1Layout = new javax.swing.GroupLayout(panel1);
        panel1.setLayout(panel1Layout);
        panel1Layout.setHorizontalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(panelImage1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        panel1Layout.setVerticalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(panelImage1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jMenu1.setText("Historial");

        jMenuItem1.setText("Acciones");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Reclamo");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        guardarSucursal();
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void txtMesmyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMesmyActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMesmyActionPerformed

    private void Total_MenorVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Total_MenorVActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Total_MenorVActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        // TODO add your handling code here:
        /*try {
            // TODO add your handling code here:
            eliminarSucursal();
        } catch (PosicionException ex) {
            //Logger.getLogger(FrmSucursal.class.getName()).log(Level.SEVERE, null, ex);
        } catch (NullException ex) {
            //Logger.getLogger(FrmSucursal.class.getName()).log(Level.SEVERE, null, ex);
        }
         */
        eliminar();
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        // TODO add your handling code here:
        try {
            // TODO add your handling code here:
            modificarSucursal();
        } catch (PosicionException ex) {
            //Logger.getLogger(FrmSucursal.class.getName()).log(Level.SEVERE, null, ex);
        } catch (NullException ex) {
            //Logger.getLogger(FrmSucursal.class.getName()).log(Level.SEVERE, null, ex);
        }

        if (tblSucursal.getSelectedRow() >= 0) {
            try {
                int fila = tblSucursal.getSelectedRow();
                // sc.setSucursal(sc.getLista().obtener(fila));
                sc.getSucursal().setNombre(txtNombre.getText());
                utilidades.modificarSucursal(sc.getSucursal(), fila);
                cargarTabla();
            } catch (PosicionException ex) {
                // Logger.getLogger(FrmSucursal.class.getName()).log(Level.SEVERE, null, ex);
            }
            //Logger.getLogger(FrmSucursal.class.getName()).log(Level.SEVERE, null, ex);

        }
    }//GEN-LAST:event_btnModificarActionPerformed

    private void btnSeleccionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSeleccionarActionPerformed
        // TODO add your handling code here:
        // int fila = tblSucursal.getSelectedRow();
        //if (fila >= 0) {
        //  if (modeloS.getLista() != null) {

        /*    try {
                    this.sc.setSucursal(modeloS.getLista().get(fila));
                    
                    }catch(NullException ex){
                    Logger.getLogger(FrmSucursal.class.getName()).log(Level.SEVERE, null, ex);
                    }catch (PosicionException ex){
                    Logger.getLogger(FrmSucursal.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    new FrmVenta(null, true, this.sc).setVisible(true);
                    cargarTabla();
                    tblSucursal.clearSelection();
                    }else {
                    JOptionPane.showMessageDialog(null, "Ingrese un nombre a la sucursal", "Error", JOptionPane.ERROR_MESSAGE);
                    }
                    }else{
                    JOptionPane.showMessageDialog(null, "Seleccione una sucursal", "Error", JOptionPane.ERROR_MESSAGE);
                    }
         */
        // this.sc.setSucursal(modeloS.getLista().obtener(fila));
        // new FrmVenta(null, true, this.sc).setVisible(true);
        // cargarTabla();
        //   tblSucursal.clearSelection();
        int fila = tblSucursal.getSelectedRow();
        if (fila >= 0) {
            if (modeloS.getLista() != null) {
                
                try {
                    this.sc.setSucursal(modeloS.getLista().obtener(fila));
                } catch (NullException ex) {
                    java.util.logging.Logger.getLogger(FrmSucursal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
                } catch (PosicionException ex) {
                    java.util.logging.Logger.getLogger(FrmSucursal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
                }
               
                new FrmVenta(null, true, this.sc).setVisible(true);
                cargarTabla();
              
                tblSucursal.clearSelection();
            } else {
                JOptionPane.showMessageDialog(null, "Ingrese un nombre a la sucursal", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Seleccione una sucursal", "Error", JOptionPane.ERROR_MESSAGE);
         
    }


    }//GEN-LAST:event_btnSeleccionarActionPerformed

    private void btnReclamoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReclamoActionPerformed
        // TODO add your handling code here:
        FrmReclamo reclamo = new FrmReclamo();
        reclamo.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnReclamoActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
        FrmHistorial historial = new FrmHistorial();
        //this.setVisible(true);
        historial.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void btnHistorialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHistorialActionPerformed
        // TODO add your handling code here:
        FrmHistorial historial = new FrmHistorial();
        //this.setVisible(true);
        historial.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnHistorialActionPerformed

    public void eliminar() {
        if (tblSucursal.getSelectedRow() >= 0) {
            try {
                utilidades.eliminarSucursal(tblSucursal.getSelectedRow());
            } catch (NullException ex) {
                //Logger.getLogger(FrmSucursal.class.getName()).log(Level.SEVERE, null, ex);
            } catch (PosicionException ex) {
                //Logger.getLogger(FrmSucursal.class.getName()).log(Level.SEVERE, null, ex);
            }
            cargarTabla();
        }
    }

    public void eliminarSucursal() throws PosicionException, NullException {
        if (tblSucursal.getSelectedRow() >= 0) {
            utilidades.eliminarSucursal(tblSucursal.getSelectedRow());
            cargarTabla();
        }
    }

    public void modificarSucursal() throws PosicionException, NullException {
        if (tblSucursal.getSelectedRow() >= 0) {
            if (!txtNombre.getText().isEmpty()) {
                int fila = tblSucursal.getSelectedRow();

                sc.getSucursal().setNombre(txtNombre.getText());
                sc.getListaSucursal().modificar(sc.getSucursal(), fila);
                utilidades.modificarSucursal(sc.getSucursal(), fila);
                JOptionPane.showMessageDialog(null, "La sucursal se a modificado correctamente");
                cargarTabla();
            } else {
                JOptionPane.showMessageDialog(null, "Datos incompletos");
            }
        }
//        aC.getAsignatursList().obtener(ERROR);
    }

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
            java.util.logging.Logger.getLogger(FrmSucursal



.class  


.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmSucursal



.class  


.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmSucursal



.class  


.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmSucursal



.class  


.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                FrmSucursal dialog = new FrmSucursal(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
        public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Total_MenorV;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnHistorial;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnReclamo;
    private javax.swing.JButton btnSeleccionar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JScrollPane jScrollPane1;
    private org.edisoncor.gui.panel.Panel panel1;
    private org.edisoncor.gui.panel.PanelImage panelImage1;
    private org.edisoncor.gui.panel.PanelImage panelImage2;
    private org.edisoncor.gui.panel.PanelImage panelImage3;
    private org.edisoncor.gui.panel.PanelImage panelImage4;
    private javax.swing.JTable tblSucursal;
    private javax.swing.JTextField txtMesmn;
    private javax.swing.JTextField txtMesmy;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtNombre_SucursalMY;
    private javax.swing.JTextField txtSucursalMn;
    private javax.swing.JTextField txtTotal_MayorV;
    // End of variables declaration//GEN-END:variables
}
