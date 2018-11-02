/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fabrykaabstrakcyjna;

import javax.swing.UIManager;

/**
 *
 * @author lenovo
 */
public class FabrykaAbstrakcyjna {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            // select Look and Feel
            UIManager.setLookAndFeel("com.jtattoo.plaf.texture.TextureLookAndFeel");
            // start application
            new Wyglad();
        }
        catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    
}
