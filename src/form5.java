import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class form5 {
    private JTextField $TextField;
    private JButton button1;
    private JButton button2;
    private JButton button3;
    private JButton button4;
    private JButton button5;
    private JButton button6;
    private JButton button7;
    private JButton button8;
    private JButton button9;
    private JButton button10;
    private JButton button11;
    private JButton menúButton;
    JPanel panel5;
    static JFrame pantalla5 =new JFrame("Depósito");
    public form5() {
        menúButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                form5.pantalla5.dispose();

                // Crear una nueva instancia de JFrame para la pantalla del menú
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
}
