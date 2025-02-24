package gui;

public class VentanaPrincipal extends javax.swing.JFrame {

    public VentanaPrincipal() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        escritorio = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        itemAlumnos = new javax.swing.JMenuItem();
        itemProfesores = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jMenuItem5 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setExtendedState(this.MAXIMIZED_BOTH);

        javax.swing.GroupLayout escritorioLayout = new javax.swing.GroupLayout(escritorio);
        escritorio.setLayout(escritorioLayout);
        escritorioLayout.setHorizontalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        escritorioLayout.setVerticalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 279, Short.MAX_VALUE)
        );

        getContentPane().add(escritorio, java.awt.BorderLayout.CENTER);

        jMenu1.setText("Catalógos");

        itemAlumnos.setText("Alumnos");
        itemAlumnos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemAlumnosActionPerformed(evt);
            }
        });
        jMenu1.add(itemAlumnos);

        itemProfesores.setText("Profesores");
        itemProfesores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemProfesoresActionPerformed(evt);
            }
        });
        jMenu1.add(itemProfesores);
        jMenu1.add(jSeparator1);

        jMenuItem5.setText("Salir");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem5);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        setBounds(0, 0, 416, 339);
    }// </editor-fold>//GEN-END:initComponents

    private void itemProfesoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemProfesoresActionPerformed
        // TODO add your handling code here:
        VentanaMaestros ventanaMaestros = new VentanaMaestros();
        this.escritorio.add(ventanaMaestros);
        ventanaMaestros.setVisible(true);
    }//GEN-LAST:event_itemProfesoresActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        // TODO add your handling code here:
        this.dispose();
        Login local = new Login(this, true);
        local.setLocationRelativeTo(this);
        local.setVisible(true);
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void itemAlumnosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemAlumnosActionPerformed
        // TODO add your handling code here:
        VentanaAlumno ventanaAlumno = new VentanaAlumno();
        this.escritorio.add(ventanaAlumno);
        ventanaAlumno.setVisible(true);
    }//GEN-LAST:event_itemAlumnosActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane escritorio;
    private javax.swing.JMenuItem itemAlumnos;
    private javax.swing.JMenuItem itemProfesores;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    // End of variables declaration//GEN-END:variables
}
