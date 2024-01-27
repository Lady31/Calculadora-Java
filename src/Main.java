import javax.swing.*;

public class Main {
    public static void main(String[]args){
        SwingUtilities.invokeLater(() -> {
            Calculadora calculadora = new Calculadora();
            calculadora.setSize(500, 400);
            calculadora.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            calculadora.setVisible(true);
        });

    }
}