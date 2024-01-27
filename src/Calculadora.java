import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculadora extends JFrame {

    private JTextField pantalla;
    private JButton val1;
    private JButton val2;
    private JButton val3;
    private JButton val6;
    private JButton val5;
    private JButton val4;
    private JButton val7;
    private JButton val8;
    private JButton val9;
    private JButton val0;
    private JButton Resta;
    private JButton Multiplicacion;
    private JButton Division;
    private JButton Suma;
    private JButton Igual;
    private JButton Limpiar;
    private JButton Raiz_Cuadrada;
    private JButton Cuadrado;
    private JButton Cubo;
    private JButton Seno;
    private JButton Coseno;
    private JButton Tangente;
    private JButton arcSeno;
    private JButton arcCoseno;
    private JButton arcTangente;
    private double primerNumero;
    private String operacionActual;


    public Calculadora() {
        pantalla = new JTextField(10);
        val1 = new JButton("1");
        val2 = new JButton("2");
        val3 = new JButton("3");
        val4 = new JButton("4");
        val5 = new JButton("5");
        val6 = new JButton("6");
        val7 = new JButton("7");
        val8 = new JButton("8");
        val9 = new JButton("9");
        val0 = new JButton("0");
        Suma = new JButton("+");
        Resta = new JButton("-");
        Multiplicacion = new JButton("*");
        Division = new JButton("/");
        Igual = new JButton("=");
        Limpiar = new JButton("C");
        Raiz_Cuadrada = new JButton("√");
        Cuadrado = new JButton("^2");
        Cubo = new JButton("^3");
        Seno = new JButton("sin");
        Coseno = new JButton("cos");
        Tangente = new JButton("tan");
        arcSeno = new JButton("asin");
        arcCoseno = new JButton("acos");
        arcTangente = new JButton("atan");

        Igual.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                realizarOperacion();
                operacionActual = "";
            }
        });

        val1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String textoActual = pantalla.getText();
                pantalla.setText(textoActual + "1");
            }
        });
        val2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String textoActual = pantalla.getText();
                pantalla.setText(textoActual + "2");
            }
        });
        val3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String textoActual = pantalla.getText();
                pantalla.setText(textoActual + "3");
            }
        });
        val4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String textoActual = pantalla.getText();
                pantalla.setText(textoActual + "4");
            }
        });
        val5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String textoActual = pantalla.getText();
                pantalla.setText(textoActual + "5");
            }
        });
        val6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String textoActual = pantalla.getText();
                pantalla.setText(textoActual + "6");
            }
        });
        val7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String textoActual = pantalla.getText();
                pantalla.setText(textoActual + "7");
            }
        });
        val8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String textoActual = pantalla.getText();
                pantalla.setText(textoActual + "8");
            }
        });
        val9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String textoActual = pantalla.getText();
                pantalla.setText(textoActual + "9");
            }
        });
        val0.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String textoActual = pantalla.getText();
                pantalla.setText(textoActual + "0");
            }
        });

        Suma.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String textoActual = pantalla.getText();
                pantalla.setText(textoActual + "+");
            }
        });

        Resta.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String textoActual = pantalla.getText();
                pantalla.setText(textoActual + "-");
            }
        });

        Multiplicacion.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String textoActual = pantalla.getText();
                pantalla.setText(textoActual + "*");
            }
        });

        Division.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String textoActual = pantalla.getText();
                pantalla.setText(textoActual + "/");
            }
        });
        Limpiar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                pantalla.setText("");
                primerNumero = 0;
                operacionActual = "";
            }
        });
        Raiz_Cuadrada.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double resultado = Math.sqrt(Double.parseDouble(pantalla.getText()));
                pantalla.setText(String.valueOf(resultado));
            }
        });
        Cuadrado.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double resultado = Math.pow(Double.parseDouble(pantalla.getText()), 2);
                pantalla.setText(String.valueOf(resultado));
            }
        });
        Cubo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double resultado = Math.pow(Double.parseDouble(pantalla.getText()), 3);
                pantalla.setText(String.valueOf(resultado));
            }
        });
        Seno.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double resultado = Math.sin(Math.toRadians(Double.parseDouble(pantalla.getText())));
                pantalla.setText(String.valueOf(resultado));
            }
        });
        Coseno.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double resultado = Math.cos(Math.toRadians(Double.parseDouble(pantalla.getText())));
                pantalla.setText(String.valueOf(resultado));
            }
        });
        Tangente.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double resultado = Math.tan(Math.toRadians(Double.parseDouble(pantalla.getText())));
                pantalla.setText(String.valueOf(resultado));
            }
        });
        arcSeno.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double resultado = Math.toDegrees(Math.asin(Double.parseDouble(pantalla.getText())));
                pantalla.setText(String.valueOf(resultado));
            }
        });
        arcCoseno.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double resultado = Math.toDegrees(Math.acos(Double.parseDouble(pantalla.getText())));
                pantalla.setText(String.valueOf(resultado));
            }
        });
        arcTangente.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double resultado = Math.toDegrees(Math.atan(Double.parseDouble(pantalla.getText())));
                pantalla.setText(String.valueOf(resultado));
            }
        });

        JPanel panel = new JPanel(new GridLayout(4, 4));
        panel.add(val1);
        panel.add(val2);
        panel.add(val3);
        panel.add(val4);
        panel.add(val5);
        panel.add(val6);
        panel.add(val7);
        panel.add(val8);
        panel.add(val9);
        panel.add(val0);
        panel.add(Suma);
        panel.add(Resta);
        panel.add(Multiplicacion);
        panel.add(Division);
        panel.add(Igual);
        panel.add(Limpiar);
        panel.add(Raiz_Cuadrada);
        panel.add(Cuadrado);
        panel.add(Cubo);
        panel.add(Seno);
        panel.add(Coseno);
        panel.add(Tangente);
        panel.add(arcSeno);
        panel.add(arcCoseno);
        panel.add(arcTangente);

        JPanel pantallaPanel = new JPanel(new BorderLayout());
        pantallaPanel.add(pantalla, BorderLayout.NORTH);

        add(pantallaPanel, BorderLayout.NORTH);
        add(panel, BorderLayout.CENTER);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
        setLocationRelativeTo(null);
    }
    private class NumeroActionListener implements ActionListener {
        private String numero;

        public NumeroActionListener(String numero) {
            this.numero = numero;
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            String textoActual = pantalla.getText();
            pantalla.setText(textoActual + numero);
        }
    }
    private class OperacionActionListener implements ActionListener {
        private String operacion;

        public OperacionActionListener(String operacion) {
            this.operacion = operacion;
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            realizarOperacion();
            operacionActual = operacion;
        }
    }
    private void realizarOperacion() {
        if (!pantalla.getText().isEmpty()) {
            double numeroActual = Double.parseDouble(pantalla.getText());
            switch (operacionActual) {
                case "+":
                    primerNumero += numeroActual;
                    break;
                case "-":
                    primerNumero -= numeroActual;
                    break;
                case "*":
                    primerNumero *= numeroActual;
                    break;
                case "/":
                    if (numeroActual != 0) {
                        primerNumero /= numeroActual;
                    } else {
                        JOptionPane.showMessageDialog(this, "Error: División por cero");
                    }
                    break;
                default:
                    primerNumero = numeroActual;
                    break;
            }
            pantalla.setText(String.valueOf(primerNumero));
        }
    }
}