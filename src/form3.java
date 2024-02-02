import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class form3 {
    private JLabel text1;
    private JButton menuButton;
    JPanel panel3;

    static JFrame pantalla3 = new JFrame("Saldo");

    public form3() {
        menuButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Cerrar la ventana actual (pantalla3)
                pantalla3.dispose();

                // Crear una nueva instancia de JFrame para la pantalla del menú (form2)
                JFrame pantalla2 = new JFrame("Trancsacción a realizar:");
                pantalla2.setContentPane(new form2().panel2);
                // Establecer la operación por defecto cuando la ventana se cierra
                pantalla2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                // Empaquetar los componentes
                pantalla2.pack();
                pantalla2.setSize(850, 420);
                pantalla2.setVisible(true);
            }
        });
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                form3 form = new form3();
                pantalla3.setContentPane(form.panel3);
                pantalla3.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                pantalla3.pack();
                pantalla3.setSize(850, 420);
                pantalla3.setVisible(true);
            }
        });
    }
}
