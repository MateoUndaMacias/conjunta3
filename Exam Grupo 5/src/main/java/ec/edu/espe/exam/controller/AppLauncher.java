package ec.edu.espe.exam.controller;

import ec.edu.espe.exam.view.FrmNewDelivery;

/**
 *
 * @author danielpalacios
 */
public class AppLauncher {

    public static void main(String[] args) {
        FrmNewDeliveryController.getInstance();
        FrmNewDelivery.getInstance().setVisible(true);
    }

}
