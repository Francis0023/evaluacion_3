import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class form2 {
    private JRadioButton verSaldoRadioButton;
    private JRadioButton retiroRadioButton;
    private JRadioButton depositóRadioButton;
    private JRadioButton salirRadioButton;
    JPanel panel2;




// CONTINUARButton.addActionListener(new ActionListener() {
//        @Override
//        public void actionPerformed(ActionEvent e) {
//
//// Cerrar la ventana actual (Pantalla1)
//            Main.frame.dispose();
////opcion, regresar(cierra ventana)
//            form3.frame.dispose();
//
//// Ventana 2 (Pantalla2)
////establece el contenido de la ventana
//            frame.setContentPane(new form3().pant4);
////establece la operacion por defecto cuando la ventana se cierra
//            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
////empaqueta los componentes
//            frame.pack();
//            frame.setSize(850,420);
//            frame.setVisible(true);
//        }
//    });

    public form2() {
        verSaldoRadioButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Cerrar la pantalla de ingreso
                form1.pantalla2.dispose();

                // Asegúrate de tener acceso a la instancia de Main.pantalla1
                // Ventana 2 (Pantalla2)
                //establece el contenido de la ventana
                JFrame pantalla3 =new JFrame("Saldo");
                pantalla3.setContentPane(new form3().panel3);
                //establece la operacion por defecto cuando la ventana se cierra
                pantalla3.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                //empaqueta los componentes
                pantalla3.pack();
                pantalla3.setSize(850,420);
                pantalla3.setVisible(true);


            }
        });
        retiroRadioButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Cerrar la pantalla de ingreso
                form1.pantalla2.dispose();


                // Asegúrate de tener acceso a la instancia de Main.pantalla1
                // Ventana 2 (Pantalla2)
                //establece el contenido de la ventana
                JFrame pantalla4 =new JFrame("Retiro");
                pantalla4.setContentPane(new form4().panel4);
                //establece la operacion por defecto cuando la ventana se cierra
                pantalla4.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                //empaqueta los componentes
                pantalla4.pack();
                pantalla4.setSize(850,420);
                pantalla4.setVisible(true);

            }
        });
        depositóRadioButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Cerrar la pantalla de ingreso
                form1.pantalla2.dispose();

                // Asegúrate de tener acceso a la instancia de Main.pantalla1
                // Ventana 2 (Pantalla2)
                //establece el contenido de la ventana

                JFrame pantalla5 =new JFrame("Depósito");
                pantalla5.setContentPane(new form5().panel5);
                //establece la operacion por defecto cuando la ventana se cierra
                pantalla5.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                //empaqueta los componentes
                pantalla5.pack();
                pantalla5.setSize(850,420);
                pantalla5.setVisible(true);

            }
        });
        salirRadioButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
    }
}
