/**
 * This Java Class is part of the Impro-Visor Application
 *
 * Copyright (C) 2005-2014 Robert Keller and Harvey Mudd College
 *
 * Impro-Visor is free software; you can redistribute it and/or modify it under
 * the terms of the GNU General Public License as published by the Free Software
 * Foundation; either version 2 of the License, or (at your option) any later
 * version.
 *
 * Impro-Visor is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of merchantability or fitness
 * for a particular purpose. See the GNU General Public License for more
 * details.
 *
 *
 * You should have received a copy of the GNU General Public License along with
 * Impro-Visor; if not, write to the Free Software Foundation, Inc., 51 Franklin
 * St, Fifth Floor, Boston, MA 02110-1301 USA
 */
package imp.gui;

import polya.Polylist;
import imp.util.Preferences;
import imp.data.Key;
import imp.data.Score;
//import java.awt.Cursor;
//import imp.Constants.StaveType;

/**
 * @author Samantha Long
 */
public class TranspositionWizardDialog extends javax.swing.JDialog {

    public TranspositionWizardDialog(Notate notate)
    {
        initComponents();
        this.notate = notate;
        WindowRegistry.registerWindow(this);
        setVisible(true);
    }
    /**
     * Creates new form TranspositionWizardDialog
     */
//    public TranspositionWizardDialog(Notate notate, java.awt.Frame parent, boolean modal) {
//        this.notate = notate;
//        //super(notate, parent, modal);
//        initComponents();
//    }

     Notate getNotate()
    {
        return notate;
    }
     
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        transposeTitle = new javax.swing.JLabel();
        instrumentSelectionPanel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        transpositionWizardJList = new javax.swing.JList<>();
        jLabel7 = new javax.swing.JLabel();
        transpositionWizardSaveButton = new javax.swing.JButton();
        transpositionPreviewPanel = new javax.swing.JPanel();
        melodyWizardLabel = new javax.swing.JLabel();
        chordWizardLabel = new javax.swing.JLabel();
        bassWizardLabel = new javax.swing.JLabel();
        melodyWizardSpinner = new javax.swing.JSpinner();
        bassWizardSpinner = new javax.swing.JSpinner();
        chordWizardSpinner = new javax.swing.JSpinner();
        jLabel5 = new javax.swing.JLabel();
        clefWizardTextField = new javax.swing.JTextField();
        concertPitchButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setAlwaysOnTop(true);
        setAutoRequestFocus(false);
        setLocationByPlatform(true);
        setMinimumSize(new java.awt.Dimension(630, 450));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });
        getContentPane().setLayout(new java.awt.GridBagLayout());

        transposeTitle.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        transposeTitle.setText("Transpose Playback For:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipady = 30;
        getContentPane().add(transposeTitle, gridBagConstraints);

        instrumentSelectionPanel.setMaximumSize(new java.awt.Dimension(350, 250));
        instrumentSelectionPanel.setMinimumSize(new java.awt.Dimension(350, 250));
        instrumentSelectionPanel.setPreferredSize(new java.awt.Dimension(350, 250));
        instrumentSelectionPanel.setLayout(new java.awt.GridBagLayout());

        transpositionWizardJList.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Bb-Trumpet", "Bb-TenorSax", "Bb-SopranoSax", "Eb-AltoSax", "Eb-BaritoneSax", "F-Horn", "Trombone", "SopranoRecorder" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        transpositionWizardJList.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        transpositionWizardJList.setBounds(new java.awt.Rectangle(0, 0, 300, 300));
        transpositionWizardJList.setMaximumSize(new java.awt.Dimension(300, 300));
        transpositionWizardJList.setMinimumSize(new java.awt.Dimension(300, 300));
        transpositionWizardJList.setPreferredSize(new java.awt.Dimension(300, 300));
        transpositionWizardJList.setVisibleRowCount(12);
        transpositionWizardJList.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                transpositionWizardJListValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(transpositionWizardJList);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        instrumentSelectionPanel.add(jScrollPane1, gridBagConstraints);

        jLabel7.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        jLabel7.setText("  Instrument  ");
        jLabel7.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        instrumentSelectionPanel.add(jLabel7, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        getContentPane().add(instrumentSelectionPanel, gridBagConstraints);

        transpositionWizardSaveButton.setText("Save Preference");
        transpositionWizardSaveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                transpositionWizardSaveButtonActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 2;
        getContentPane().add(transpositionWizardSaveButton, gridBagConstraints);

        transpositionPreviewPanel.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        transpositionPreviewPanel.setMaximumSize(new java.awt.Dimension(250, 200));
        transpositionPreviewPanel.setMinimumSize(new java.awt.Dimension(250, 200));
        transpositionPreviewPanel.setPreferredSize(new java.awt.Dimension(250, 200));
        transpositionPreviewPanel.setLayout(new java.awt.GridBagLayout());

        melodyWizardLabel.setText("Melody Transposition:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.ipadx = 10;
        gridBagConstraints.ipady = 10;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(8, 51, 0, 0);
        transpositionPreviewPanel.add(melodyWizardLabel, gridBagConstraints);

        chordWizardLabel.setText("Chord Transposition:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.ipadx = 10;
        gridBagConstraints.ipady = 10;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 51, 0, 0);
        transpositionPreviewPanel.add(chordWizardLabel, gridBagConstraints);

        bassWizardLabel.setText("Bass Transposition:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.ipadx = 10;
        gridBagConstraints.ipady = 10;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 51, 0, 0);
        transpositionPreviewPanel.add(bassWizardLabel, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 5;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 15;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(8, 0, 0, 51);
        transpositionPreviewPanel.add(melodyWizardSpinner, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 5;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.ipadx = 15;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 51);
        transpositionPreviewPanel.add(bassWizardSpinner, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 5;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.ipadx = 15;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 51);
        transpositionPreviewPanel.add(chordWizardSpinner, gridBagConstraints);

        jLabel5.setText("Clef:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 10;
        gridBagConstraints.ipady = 10;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 51, 8, 0);
        transpositionPreviewPanel.add(jLabel5, gridBagConstraints);

        clefWizardTextField.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        clefWizardTextField.setMaximumSize(new java.awt.Dimension(90, 20));
        clefWizardTextField.setMinimumSize(new java.awt.Dimension(90, 20));
        clefWizardTextField.setPreferredSize(new java.awt.Dimension(70, 20));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 5;
        gridBagConstraints.ipadx = 20;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        gridBagConstraints.insets = new java.awt.Insets(3, 49, 0, 51);
        transpositionPreviewPanel.add(clefWizardTextField, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        getContentPane().add(transpositionPreviewPanel, gridBagConstraints);

        concertPitchButton.setText("Transpose Leadsheet");
        concertPitchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                concertPitchButtonActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        getContentPane().add(concertPitchButton, gridBagConstraints);

        pack();
    }// </editor-fold>//GEN-END:initComponents
Notate notate;

    private void transpositionWizardJListValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_transpositionWizardJListValueChanged
        //gives preview of what will be transposed in transposition wizard window
        String transpositionInstrument = transpositionWizardJList.getSelectedValue();
        String allValues = Preferences.getPreference("transposing-instruments");
        Polylist ALL_VALUES = Polylist.PolylistFromString(allValues);
        Polylist found = ALL_VALUES.assoc(transpositionInstrument);
        Long mel = (Long) found.second();
        Long chordbass = (Long) found.third();
        String clef = (String) found.fourth();
        melodyWizardSpinner.setValue(mel);
        chordWizardSpinner.setValue(chordbass);
        bassWizardSpinner.setValue(chordbass);
        clefWizardTextField.setText(clef);
    }//GEN-LAST:event_transpositionWizardJListValueChanged

    private void transpositionWizardSaveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_transpositionWizardSaveButtonActionPerformed
        if (transpositionWizardJList.getSelectedValue() != null)
        {
            //deals with changing transposition spinners & radio buttons in preferences windows
            String transpositionInstrument = transpositionWizardJList.getSelectedValue();
            String allValues = Preferences.getPreference("transposing-instruments");
            Polylist ALL_VALUES = Polylist.PolylistFromString(allValues);
            Polylist found = ALL_VALUES.assoc(transpositionInstrument);
            Long mel = (Long) found.second();
            Long chordbass = (Long) found.third();
            String clef = (String) found.fourth();
            if (clef.equals("auto"))
            {
                notate.autoStaveMIActionPerformedPublic(evt);
                notate.getAutoStaveBtn().setSelected(true);
            }
            else if (clef.equals("treble"))
            {
                notate.trebleStaveMIActionPerformedPublic(evt);
                notate.getTrebleStaveBtn().setSelected(true);
            }
            else if (clef.equals("bass"))
            {
                notate.bassStaveMIActionPerformedPublic(evt);
                notate.getBassStaveBtn().setSelected(true);
            }
            else if (clef.equals("grand"))
            {
                notate.grandStaveMIActionPerformedPublic(evt);
                notate.getGrandStaveBtn().setSelected(true);
            }

            notate.getChorusMelodyTranspositionSpinner().setValue(mel);
            notate.getLeadsheetChordTranspositionSpinner().setValue(chordbass);
            notate.getLeadsheetBassTranspositionSpinner().setValue(chordbass);

            //deals with transposing the playback
            notate.changeMelodyTransposition(mel.intValue());
            notate.changeChordTransposition(chordbass.intValue());
            notate.changeBassTransposition(chordbass.intValue());
   
        }

        setVisible(false);
        notate.getTranspositionWizardMI().setEnabled(true);
    }//GEN-LAST:event_transpositionWizardSaveButtonActionPerformed

    private void concertPitchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_concertPitchButtonActionPerformed
        String transpositionInstrument = transpositionWizardJList.getSelectedValue();
        String allValues = Preferences.getPreference("transposing-instruments");
        Polylist ALL_VALUES = Polylist.PolylistFromString(allValues);
        Polylist found = ALL_VALUES.assoc(transpositionInstrument);
        Long mel = (Long) found.second();
        Long chordbass = (Long) found.third();

        //****still needs some fixing
        //transposes score/leadsheet visually (notes + key signature)
        Score score = notate.getScore();
        score.transposeMelodyInPlace((132 - mel.intValue())%12);
        score.transposeChordsAndBassInPlace(-chordbass.intValue());
        int oldKeySignature = score.getKeySignature();
        int newKeySignature = Key.transpositions[(12 + oldKeySignature)%12][(132 - chordbass.intValue())%12];
        //System.out.println("change key signature from " + oldKeySignature + " to " + newKeySignature);
        score.setKeySignature(newKeySignature);
        notate.getCurrentStave().setKeySignature(newKeySignature);
        if (!notate.hasFocus())
        {
            notate.requestFocusInWindow();
        }
    }//GEN-LAST:event_concertPitchButtonActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        notate.getTranspositionWizardMI().setEnabled(true);
    }//GEN-LAST:event_formWindowClosing

//    /**
//     * @param args the command line arguments
//     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(TranspositionWizardDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(TranspositionWizardDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(TranspositionWizardDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(TranspositionWizardDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the dialog */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                TranspositionWizardDialog dialog = new TranspositionWizardDialog(new javax.swing.JFrame(), true);
//                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
//                    @Override
//                    public void windowClosing(java.awt.event.WindowEvent e) {
//                        System.exit(0);
//                    }
//                });
//                dialog.setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bassWizardLabel;
    private javax.swing.JSpinner bassWizardSpinner;
    private javax.swing.JLabel chordWizardLabel;
    private javax.swing.JSpinner chordWizardSpinner;
    private javax.swing.JTextField clefWizardTextField;
    private javax.swing.JButton concertPitchButton;
    private javax.swing.JPanel instrumentSelectionPanel;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel melodyWizardLabel;
    private javax.swing.JSpinner melodyWizardSpinner;
    private javax.swing.JLabel transposeTitle;
    private javax.swing.JPanel transpositionPreviewPanel;
    private javax.swing.JList<String> transpositionWizardJList;
    private javax.swing.JButton transpositionWizardSaveButton;
    // End of variables declaration//GEN-END:variables
}
