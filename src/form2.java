import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class form2 {
    private JRadioButton verSaldoRadioButton;
    private JRadioButton retiroRadioButton;
    private JRadioButton depositoRadioButton;
    private JRadioButton salirRadioButton;
    JPanel panel2;
    static JFrame pantalla2 = new JFrame("Trancsacción a realizar:");
    static JFrame pantalla3 = new JFrame("Saldo");
    static JFrame pantalla4 = new JFrame("Retiro");
    static JFrame pantalla5 = new JFrame("Depósito");

    public form2() {
        verSaldoRadioButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Cerrar la pantalla actual
                form2.pantalla2.dispose();

                // Ventana 3 (Pantalla3)
                // Establecer el contenido de la ventana
                pantalla3.setContentPane(new form3().panel3);
                // Establecer la operación por defecto cuando la ventana se cierra
                pantalla3.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                // Empaquetar los componentes
                pantalla3.pack();
                pantalla3.setSize(850, 420);
                pantalla3.setVisible(true);
            }
        });
        retiroRadioButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Cerrar la pantalla actual
                form2.pantalla2.dispose();

                // Ventana 4 (Pantalla4)
                // Establecer el contenido de la ventana
                pantalla4.setContentPane(new form4().panel4);
                // Establecer la operación por defecto cuando la ventana se cierra
                pantalla4.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                // Empaquetar los componentes
                pantalla4.pack();
                pantalla4.setSize(850, 420);
                pantalla4.setVisible(true);
            }
        });
        depositoRadioButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Cerrar la pantalla actual
                form2.pantalla2.dispose();

                // Ventana 5 (Pantalla5)
                // Establecer el contenido de la ventana
                pantalla5.setContentPane(new form5().panel5);
                // Establecer la operación por defecto cuando la ventana se cierra
                pantalla5.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                // Empaquetar los componentes
                pantalla5.pack();
                pantalla5.setSize(850, 420);
                pantalla5.setVisible(true);
            }
        });
        salirRadioButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Cerrar la pantalla actual
                form2.pantalla2.dispose();
                // Puedes agregar aquí código adicional si es necesario
            }
        });
    }
}
