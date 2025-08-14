package ec.edu.espe.exam.view;

/**
 *
 * @author danielpalacios
 */
public class FrmNewDelivery extends javax.swing.JFrame {

    private static FrmNewDelivery instance;

    private FrmNewDelivery() {
        initComponents();
    }

    public static FrmNewDelivery getInstance() {
        if (instance == null) {
            instance = new FrmNewDelivery();
        }
        return instance;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PnlTitle = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        PnlDataClient = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        txtName = new javax.swing.JTextField();
        txtPhone = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        txtAddress = new javax.swing.JTextField();
        CbxVip = new javax.swing.JCheckBox();
        jLabel9 = new javax.swing.JLabel();
        PnlDataPackage = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        CmbType = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        CbxFragility = new javax.swing.JCheckBox();
        txtWeight = new javax.swing.JTextField();
        txtDeclaredValue = new javax.swing.JTextField();
        txtDescription = new javax.swing.JTextField();
        txtTrackingCode = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel14 = new javax.swing.JLabel();
        txtBasePrice = new javax.swing.JTextField();
        PnlActions = new javax.swing.JPanel();
        BtmProcessShipment = new javax.swing.JButton();
        jSeparator3 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        PnlTitle.setFont(new java.awt.Font("Consolas", 1, 24)); // NOI18N

        jLabel1.setFont(new java.awt.Font("Consolas", 1, 24)); // NOI18N
        jLabel1.setText("Laarbox");

        javax.swing.GroupLayout PnlTitleLayout = new javax.swing.GroupLayout(PnlTitle);
        PnlTitle.setLayout(PnlTitleLayout);
        PnlTitleLayout.setHorizontalGroup(
            PnlTitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PnlTitleLayout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addGroup(PnlTitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PnlTitleLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(289, 289, 289))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PnlTitleLayout.createSequentialGroup()
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 631, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(25, 25, 25))))
        );
        PnlTitleLayout.setVerticalGroup(
            PnlTitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PnlTitleLayout.createSequentialGroup()
                .addContainerGap(38, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(14, 14, 14)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jLabel2.setText("Id:");

        jLabel3.setText("Name:");

        jLabel4.setText("Phone:");

        jLabel5.setText("Email:");

        jLabel6.setText("Address:");

        CbxVip.setText("VIP");

        jLabel9.setText("Customer Data");

        javax.swing.GroupLayout PnlDataClientLayout = new javax.swing.GroupLayout(PnlDataClient);
        PnlDataClient.setLayout(PnlDataClientLayout);
        PnlDataClientLayout.setHorizontalGroup(
            PnlDataClientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PnlDataClientLayout.createSequentialGroup()
                .addGroup(PnlDataClientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PnlDataClientLayout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addGroup(PnlDataClientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6))
                        .addGap(39, 39, 39)
                        .addGroup(PnlDataClientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtId)
                            .addComponent(txtName)
                            .addComponent(txtPhone)
                            .addComponent(txtEmail)
                            .addComponent(txtAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(87, 87, 87)
                        .addComponent(CbxVip))
                    .addGroup(PnlDataClientLayout.createSequentialGroup()
                        .addGap(238, 238, 238)
                        .addComponent(jLabel9)))
                .addContainerGap(87, Short.MAX_VALUE))
        );
        PnlDataClientLayout.setVerticalGroup(
            PnlDataClientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PnlDataClientLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel9)
                .addGap(18, 18, 18)
                .addGroup(PnlDataClientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(PnlDataClientLayout.createSequentialGroup()
                        .addGroup(PnlDataClientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(PnlDataClientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel4))
                    .addGroup(PnlDataClientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtPhone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(CbxVip)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PnlDataClientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addGroup(PnlDataClientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        jLabel7.setText("Type:");

        jLabel8.setText("Parcel Specifications");

        CmbType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Small", "Medium", "Large" }));

        jLabel10.setText("Weight:");

        jLabel11.setText("Declared Value:");

        jLabel12.setText("Description:");

        jLabel13.setText("Tracking Code:");

        CbxFragility.setText("Fragility");

        jLabel14.setText("Base Price:");

        javax.swing.GroupLayout PnlDataPackageLayout = new javax.swing.GroupLayout(PnlDataPackage);
        PnlDataPackage.setLayout(PnlDataPackageLayout);
        PnlDataPackageLayout.setHorizontalGroup(
            PnlDataPackageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PnlDataPackageLayout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addGroup(PnlDataPackageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel8)
                    .addGroup(PnlDataPackageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel11)
                        .addGroup(PnlDataPackageLayout.createSequentialGroup()
                            .addGroup(PnlDataPackageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel7)
                                .addComponent(jLabel10)
                                .addComponent(jLabel12)
                                .addComponent(jLabel13)
                                .addComponent(jLabel14))
                            .addGap(32, 32, 32)
                            .addGroup(PnlDataPackageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtDeclaredValue)
                                .addComponent(txtWeight)
                                .addComponent(CmbType, 0, 229, Short.MAX_VALUE)
                                .addComponent(txtDescription)
                                .addComponent(txtTrackingCode)
                                .addComponent(txtBasePrice)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(CbxFragility)
                .addGap(71, 71, 71))
            .addGroup(PnlDataPackageLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 637, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        PnlDataPackageLayout.setVerticalGroup(
            PnlDataPackageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PnlDataPackageLayout.createSequentialGroup()
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel8)
                .addGap(27, 27, 27)
                .addGroup(PnlDataPackageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(CmbType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PnlDataPackageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10)
                    .addComponent(txtWeight, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PnlDataPackageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(CbxFragility)
                    .addComponent(txtDeclaredValue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PnlDataPackageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(txtDescription, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PnlDataPackageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(txtTrackingCode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PnlDataPackageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(txtBasePrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        BtmProcessShipment.setText("Process Delivery");

        javax.swing.GroupLayout PnlActionsLayout = new javax.swing.GroupLayout(PnlActions);
        PnlActions.setLayout(PnlActionsLayout);
        PnlActionsLayout.setHorizontalGroup(
            PnlActionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PnlActionsLayout.createSequentialGroup()
                .addGap(242, 242, 242)
                .addComponent(BtmProcessShipment, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PnlActionsLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 651, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        PnlActionsLayout.setVerticalGroup(
            PnlActionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PnlActionsLayout.createSequentialGroup()
                .addContainerGap(25, Short.MAX_VALUE)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(BtmProcessShipment)
                .addGap(35, 35, 35))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(PnlDataClient, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PnlTitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PnlDataPackage, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(PnlActions, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(PnlTitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(PnlDataClient, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(PnlDataPackage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PnlActions, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(FrmNewDelivery.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmNewDelivery.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmNewDelivery.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmNewDelivery.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmNewDelivery().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtmProcessShipment;
    private javax.swing.JCheckBox CbxFragility;
    private javax.swing.JCheckBox CbxVip;
    private javax.swing.JComboBox<String> CmbType;
    private javax.swing.JPanel PnlActions;
    private javax.swing.JPanel PnlDataClient;
    private javax.swing.JPanel PnlDataPackage;
    private javax.swing.JPanel PnlTitle;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTextField txtAddress;
    private javax.swing.JTextField txtBasePrice;
    private javax.swing.JTextField txtDeclaredValue;
    private javax.swing.JTextField txtDescription;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtPhone;
    private javax.swing.JTextField txtTrackingCode;
    private javax.swing.JTextField txtWeight;
    // End of variables declaration//GEN-END:variables

    public javax.swing.JButton getBtmProcessShipment() {
        return BtmProcessShipment;
    }

    public void setBtmProcessShipment(javax.swing.JButton BtmProcessShipment) {
        this.BtmProcessShipment = BtmProcessShipment;
    }

    public javax.swing.JCheckBox getCbxFragility() {
        return CbxFragility;
    }

    public void setCbxFragility(javax.swing.JCheckBox CbxFragility) {
        this.CbxFragility = CbxFragility;
    }

    public javax.swing.JCheckBox getCbxVip() {
        return CbxVip;
    }

    public void setCbxVip(javax.swing.JCheckBox CbxVip) {
        this.CbxVip = CbxVip;
    }

    public javax.swing.JComboBox<String> getCmbType() {
        return CmbType;
    }

    public void setCmbType(javax.swing.JComboBox<String> CmbType) {
        this.CmbType = CmbType;
    }

    public javax.swing.JTextField getTxtAddress() {
        return txtAddress;
    }

    public void setTxtAddress(javax.swing.JTextField txtAddress) {
        this.txtAddress = txtAddress;
    }

    public javax.swing.JTextField getTxtDeclaredValue() {
        return txtDeclaredValue;
    }

    public void setTxtDeclaredValue(javax.swing.JTextField txtDeclaredValue) {
        this.txtDeclaredValue = txtDeclaredValue;
    }

    public javax.swing.JTextField getTxtDescription() {
        return txtDescription;
    }

    public void setTxtDescription(javax.swing.JTextField txtDescription) {
        this.txtDescription = txtDescription;
    }

    public javax.swing.JTextField getTxtEmail() {
        return txtEmail;
    }

    public void setTxtEmail(javax.swing.JTextField txtEmail) {
        this.txtEmail = txtEmail;
    }

    public javax.swing.JTextField getTxtId() {
        return txtId;
    }

    public void setTxtId(javax.swing.JTextField txtId) {
        this.txtId = txtId;
    }

    public javax.swing.JTextField getTxtName() {
        return txtName;
    }

    public void setTxtName(javax.swing.JTextField txtName) {
        this.txtName = txtName;
    }

    public javax.swing.JTextField getTxtPhone() {
        return txtPhone;
    }

    public void setTxtPhone(javax.swing.JTextField txtPhone) {
        this.txtPhone = txtPhone;
    }

    public javax.swing.JTextField getTxtTrackingCode() {
        return txtTrackingCode;
    }

    public void setTxtTrackingCode(javax.swing.JTextField txtTrackingCode) {
        this.txtTrackingCode = txtTrackingCode;
    }

    public javax.swing.JTextField getTxtWeight() {
        return txtWeight;
    }

    public void setTxtWeight(javax.swing.JTextField txtWeight) {
        this.txtWeight = txtWeight;
    }

    public javax.swing.JTextField getTxtBasePrice() {
        return txtBasePrice;
    }

    public void setTxtBasePrice(javax.swing.JTextField txtBasePrice) {
        this.txtBasePrice = txtBasePrice;
    }


}
