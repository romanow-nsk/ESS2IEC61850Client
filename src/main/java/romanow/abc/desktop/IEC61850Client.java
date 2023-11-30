package romanow.abc.desktop;

import org.openmuc.openiec61850.clientgui.ClientGui;

import javax.swing.*;

public class IEC61850Client {
        public static void main(String args[]) {
            /* Set the Nimbus look and feel */
            //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
            /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
             * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
             */
            try {
                System.out.println(javax.swing.UIManager.getLookAndFeel().getName());
                for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                    System.out.println(info.getName()+" "+info.getClassName());
                    if ("Nimbus".equals(info.getName())) {
                        javax.swing.UIManager.setLookAndFeel(info.getClassName());
                        break;
                    }
                }
            } catch (Exception ex) {}
            //</editor-fold>
            /* Create and display the form */
            java.awt.EventQueue.invokeLater(new Runnable() {
                public void run() {
                    try {
                        System.setProperty("file.encoding","UTF-8");
                        UIManager.setLookAndFeel("javax.swing.plaf.metal.MetalLookAndFeel");
                        ClientGui gui = new ClientGui();
                        gui.setTitle("СМУ СНЭЭ МЭК 61850 (OpenIEC61850)");
                        gui.setVisible(true);
                        gui.setBounds(300,200,800,600);
                    } catch (Exception ee) {}
                }
            });
        }
}