import javax.swing.*;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    static JFrame pantalla1 =new JFrame("Pantalla 1");
    public static void main(String[] args) {
        pantalla1.setContentPane(new form1().panel1);
        pantalla1.setSize(800,550);
        pantalla1.pack();
        pantalla1.setVisible(true);
        pantalla1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}