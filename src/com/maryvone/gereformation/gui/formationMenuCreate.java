/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package src.com.maryvone.gereformation.gui;

/**
 *
 * @author david
 */
public class formationMenuCreate extends javax.swing.JPanel {
    private Home home;
    /**
     * Creates new form formationMenuCreate
     */
    public formationMenuCreate(Home home) {
        this.home=home;
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

        nouvelleFormation = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        nouvelleSequence = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        nouveauECF = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        nouveauModule = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        nouvelleFormation.setBackground(new java.awt.Color(204, 204, 204));
        nouvelleFormation.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                nouvelleFormationMouseClicked(evt);
            }
        });

        jLabel1.setText("Nouvelle");
        nouvelleFormation.add(jLabel1);

        jLabel5.setText("Formation");
        nouvelleFormation.add(jLabel5);

        nouvelleSequence.setBackground(new java.awt.Color(204, 204, 204));

        jLabel2.setText("Nouvelle");
        nouvelleSequence.add(jLabel2);

        jLabel7.setText("Sequence");
        nouvelleSequence.add(jLabel7);

        nouveauECF.setBackground(new java.awt.Color(204, 204, 204));

        jLabel4.setText("Nouveau");
        nouveauECF.add(jLabel4);

        jLabel8.setText("ECF");
        nouveauECF.add(jLabel8);

        nouveauModule.setBackground(new java.awt.Color(204, 204, 204));
        nouveauModule.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                nouveauModuleMouseClicked(evt);
            }
        });

        jLabel3.setText("Nouveau");
        nouveauModule.add(jLabel3);

        jLabel6.setText("Module");
        nouveauModule.add(jLabel6);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(306, 306, 306)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nouveauECF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nouvelleFormation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nouvelleSequence, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nouveauModule, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(389, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(113, 113, 113)
                .addComponent(nouvelleFormation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(nouveauModule, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(nouvelleSequence, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(nouveauECF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(180, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void nouvelleFormationMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nouvelleFormationMouseClicked
        FormationCreationForm panel = new FormationCreationForm(home);
        
       home.setResultPanel(panel);
    }//GEN-LAST:event_nouvelleFormationMouseClicked

    private void nouveauModuleMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nouveauModuleMouseClicked
       ModuleCreationForm panel = new ModuleCreationForm(home);
       home.setResultPanel(panel);
    }//GEN-LAST:event_nouveauModuleMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel nouveauECF;
    private javax.swing.JPanel nouveauModule;
    private javax.swing.JPanel nouvelleFormation;
    private javax.swing.JPanel nouvelleSequence;
    // End of variables declaration//GEN-END:variables
}
