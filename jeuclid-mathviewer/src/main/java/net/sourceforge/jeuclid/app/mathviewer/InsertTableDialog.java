/*
 * Copyright 2009 - 2010 JEuclid, http://jeuclid.sf.net
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

/* $Id $ */

package net.sourceforge.jeuclid.app.mathviewer;

// CHECKSTYLE:OFF
public class InsertTableDialog extends javax.swing.JDialog {
    // CHECKSTYLE:OFF
    private String mathMLText;

    /** Creates new form InsertTableDialog */
    public InsertTableDialog(final java.awt.Frame parent, final boolean modal) {
        super(parent, modal);
        this.initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed"
    // desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        this.buttonGroupType = new javax.swing.ButtonGroup();
        this.tableRadioButton = new javax.swing.JRadioButton();
        this.matrixRadioButton = new javax.swing.JRadioButton();
        this.determinantRadioButton = new javax.swing.JRadioButton();
        this.cancelButton = new javax.swing.JButton();
        this.okButton = new javax.swing.JButton();
        this.columnsLabel = new javax.swing.JLabel();
        this.rowsSpinner = new javax.swing.JSpinner();
        this.columnsSpinner = new javax.swing.JSpinner();
        this.typeLabel = new javax.swing.JLabel();
        this.rowsLabel = new javax.swing.JLabel();

        this
                .setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        this.buttonGroupType.add(this.tableRadioButton);
        this.tableRadioButton.setText("Tabelle");

        this.buttonGroupType.add(this.matrixRadioButton);
        this.matrixRadioButton.setSelected(true);
        this.matrixRadioButton.setText("Matrix");

        this.buttonGroupType.add(this.determinantRadioButton);
        this.determinantRadioButton.setText("Determinante");

        this.cancelButton.setText("Abbrechen");
        this.cancelButton
                .addActionListener(new java.awt.event.ActionListener() {
                    public void actionPerformed(
                            final java.awt.event.ActionEvent evt) {
                        InsertTableDialog.this.cancelButtonActionPerformed(evt);
                    }
                });

        this.okButton.setText("OK");
        this.okButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(final java.awt.event.ActionEvent evt) {
                InsertTableDialog.this.okButtonActionPerformed(evt);
            }
        });

        this.columnsLabel.setText("Spalten");

        this.rowsSpinner.setModel(new javax.swing.SpinnerNumberModel(3, 1, 99,
                1));

        this.columnsSpinner.setModel(new javax.swing.SpinnerNumberModel(3, 1,
                99, 1));

        this.typeLabel.setText("Typ");

        this.rowsLabel.setText("Zeilen");

        final javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this
                .getContentPane());
        this.getContentPane().setLayout(layout);
        layout
                .setHorizontalGroup(layout
                        .createParallelGroup(
                                javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(
                                layout
                                        .createSequentialGroup()
                                        .addGroup(
                                                layout
                                                        .createParallelGroup(
                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(
                                                                layout
                                                                        .createSequentialGroup()
                                                                        .addGap(
                                                                                24,
                                                                                24,
                                                                                24)
                                                                        .addComponent(
                                                                                this.typeLabel)
                                                                        .addGap(
                                                                                18,
                                                                                18,
                                                                                18)
                                                                        .addGroup(
                                                                                layout
                                                                                        .createParallelGroup(
                                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                        .addComponent(
                                                                                                this.tableRadioButton)
                                                                                        .addComponent(
                                                                                                this.matrixRadioButton)
                                                                                        .addComponent(
                                                                                                this.determinantRadioButton)))
                                                        .addGroup(
                                                                layout
                                                                        .createSequentialGroup()
                                                                        .addGap(
                                                                                24,
                                                                                24,
                                                                                24)
                                                                        .addComponent(
                                                                                this.rowsLabel)
                                                                        .addGap(
                                                                                14,
                                                                                14,
                                                                                14)
                                                                        .addComponent(
                                                                                this.rowsSpinner,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addGap(
                                                                                18,
                                                                                18,
                                                                                18)
                                                                        .addComponent(
                                                                                this.columnsLabel)
                                                                        .addPreferredGap(
                                                                                javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                        .addComponent(
                                                                                this.columnsSpinner,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(
                                                                layout
                                                                        .createSequentialGroup()
                                                                        .addGap(
                                                                                39,
                                                                                39,
                                                                                39)
                                                                        .addComponent(
                                                                                this.okButton,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                93,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addPreferredGap(
                                                                                javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                        .addComponent(
                                                                                this.cancelButton)))
                                        .addContainerGap(44, Short.MAX_VALUE)));
        layout
                .setVerticalGroup(layout
                        .createParallelGroup(
                                javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(
                                layout
                                        .createSequentialGroup()
                                        .addGap(25, 25, 25)
                                        .addGroup(
                                                layout
                                                        .createParallelGroup(
                                                                javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(
                                                                this.rowsLabel)
                                                        .addComponent(
                                                                this.columnsLabel)
                                                        .addComponent(
                                                                this.rowsSpinner,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(
                                                                this.columnsSpinner,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18)
                                        .addGroup(
                                                layout
                                                        .createParallelGroup(
                                                                javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(
                                                                this.typeLabel)
                                                        .addComponent(
                                                                this.matrixRadioButton))
                                        .addPreferredGap(
                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(this.tableRadioButton)
                                        .addPreferredGap(
                                                javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(
                                                this.determinantRadioButton)
                                        .addGap(18, 18, 18)
                                        .addGroup(
                                                layout
                                                        .createParallelGroup(
                                                                javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(
                                                                this.cancelButton)
                                                        .addComponent(
                                                                this.okButton))
                                        .addContainerGap(
                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                Short.MAX_VALUE)));

        this.pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cancelButtonActionPerformed(
            final java.awt.event.ActionEvent evt) {// GEN-FIRST:event_cancelButtonActionPerformed
        this.mathMLText = null;
        this.setVisible(false);
    }// GEN-LAST:event_cancelButtonActionPerformed

    public String getMathMLText() {
        return this.mathMLText;
    }

    private void okButtonActionPerformed(final java.awt.event.ActionEvent evt) {// GEN-FIRST:event_okButtonActionPerformed

        this.updateMathMLText();
        this.setVisible(false);
    }// GEN-LAST:event_okButtonActionPerformed

    private String buildText(final int lines, final int columns,
            final String type) {
        // String s = "<" + type + ">" + Helper.nl();
        String s = "<mrow>" + Helper.nl() + "<mfenced" + type + ">"
                + Helper.nl() + "<mtable>" + Helper.nl();

        for (int i = 0; i < lines; ++i) {
            // s += "<matrixrow>" + Helper.nl();
            s += "<mtr>" + Helper.nl();
            for (int j = 0; j < columns; ++j) {
                s += "<mtd><mn>1</mn></mtd>" + Helper.nl();
                // s+="\t<cn>1</cn>" + Helper.nl();
            }
            // s+= "</matrixrow>" + Helper.nl();
            s += "</mtr>" + Helper.nl();
        }
        // s+="</" + type + ">" + Helper.nl();
        s += "</mtable>" + Helper.nl() + "</mfenced>" + Helper.nl() + "</mrow>"
                + Helper.nl();
        return s;
    }

    private void updateMathMLText() {
        final int m = (Integer) this.rowsSpinner.getValue();
        final int n = (Integer) this.columnsSpinner.getValue();

        // matrix
        if (this.matrixRadioButton.isSelected()) {
            this.mathMLText = this.buildText(m, n, "");
        } else if (this.determinantRadioButton.isSelected()) {
            this.mathMLText = this.buildText(m, n, " open=\"|\" close=\"|\"");
        } else if (this.tableRadioButton.isSelected()) {
            this.mathMLText = this.buildText(m, n, " open=\"\" close=\"\"");
        } else {
            this.mathMLText = null;
        }
    }

    /**
     * @param args
     *            the command line arguments
     */
    public static void main(final String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                final InsertTableDialog dialog = new InsertTableDialog(
                        new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(final java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroupType;
    private javax.swing.JButton cancelButton;
    private javax.swing.JLabel columnsLabel;
    private javax.swing.JSpinner columnsSpinner;
    private javax.swing.JRadioButton determinantRadioButton;
    private javax.swing.JRadioButton matrixRadioButton;
    private javax.swing.JButton okButton;
    private javax.swing.JLabel rowsLabel;
    private javax.swing.JSpinner rowsSpinner;
    private javax.swing.JRadioButton tableRadioButton;
    private javax.swing.JLabel typeLabel;
    // End of variables declaration//GEN-END:variables

}
