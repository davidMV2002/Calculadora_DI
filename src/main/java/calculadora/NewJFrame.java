package calculadora;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import net.objecthunter.exp4j.ExpressionBuilder;

public class NewJFrame extends javax.swing.JFrame {
    
    private JLabel label = new JLabel("", SwingConstants.CENTER);
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(NewJFrame.class.getName());
    
    private String operacion = "";
    private boolean resultadoMostrado = false;


    public NewJFrame() {
        //initComponents();
        setTitle("Mi calculadora");
        setSize(500, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        
        setLayout(new GridBagLayout());
        
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.fill = GridBagConstraints.BOTH;
        
        //BOTON 1
        JButton boton1 = new JButton("1");
        
        boton1.addActionListener(e -> metodo("1"));
        
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.gridwidth = 1;
        
        add (boton1, gbc);
        
        //BOTON 2
        JButton boton2 = new JButton("2");
        
        boton2.addActionListener(e -> metodo("2"));
        
        gbc.gridx = 1;
        gbc.gridy = 0;
        gbc.gridwidth = 1;
        
        add (boton2, gbc);
        
        //BOTON 3
        JButton boton3 = new JButton("3");
        
        boton3.addActionListener(e -> metodo("3"));
        
        gbc.gridx = 2;
        gbc.gridy = 0;
        gbc.gridwidth = 1;
        
        add (boton3, gbc);
        
        //BOTON MENOS
        JButton botonMenos = new JButton("-");
        
        botonMenos.addActionListener(e -> metodo("-"));
        
        gbc.gridx = 3;
        gbc.gridy = 0;
        gbc.gridwidth = 1;
        
        add (botonMenos, gbc);
        
        //BOTON 4
        JButton boton4 = new JButton("4");
        
        boton4.addActionListener(e -> metodo("4"));
        
        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.gridwidth = 1;
        
        add (boton4, gbc);
        
        //BOTON 5
        JButton boton5 = new JButton("5");
        
        boton5.addActionListener(e -> metodo("5"));
        
        gbc.gridx = 1;
        gbc.gridy = 1;
        gbc.gridwidth = 1;
        
        add (boton5, gbc);
        
        //BOTON 6
        JButton boton6 = new JButton("6");
        
        boton6.addActionListener(e -> metodo("6"));
        
        gbc.gridx = 2;
        gbc.gridy = 1;
        gbc.gridwidth = 1;
        
        add (boton6, gbc);
        
        //BOTON MAS
        JButton botonMas = new JButton("+");
        
        botonMas.addActionListener(e -> metodo("+"));
        
        gbc.gridx = 3;
        gbc.gridy = 1;
        gbc.gridwidth = 1;
        gbc.gridheight = 3;
        
        add (botonMas, gbc);
        
        //BOTON 7
        JButton boton7 = new JButton("7");
        
        boton7.addActionListener(e -> metodo("7"));
        
        gbc.gridx = 0;
        gbc.gridy = 2;
        gbc.gridwidth = 1;
        gbc.gridheight = 1;
        
        add (boton7, gbc);
        
        //BOTON 8
        JButton boton8 = new JButton("8");
        
        boton8.addActionListener(e -> metodo("8"));
        
        gbc.gridx = 1;
        gbc.gridy = 2;
        gbc.gridwidth = 1;
        
        add (boton8, gbc);
        
        //BOTON 9
        JButton boton9 = new JButton("9");
        
        boton9.addActionListener(e -> metodo("9"));
        
        gbc.gridx = 2;
        gbc.gridy = 2;
        gbc.gridwidth = 1;
        
        add (boton9, gbc);
        
        //BOTON division
        JButton botonDiv = new JButton("/");
        
        botonDiv.addActionListener(e -> metodo("/"));
        
        gbc.gridx = 0;
        gbc.gridy = 3;
        gbc.gridwidth = 1;
        
        add (botonDiv, gbc);
        
        //BOTON 0
        JButton boton0 = new JButton("0");
        
        boton0.addActionListener(e -> metodo("0"));
        
        gbc.gridx = 1;
        gbc.gridy = 3;
        gbc.gridwidth = 1;
        
        add (boton0, gbc);
        
        //BOTON multiplicacion
        JButton botonMul = new JButton("*");
        
        botonMul.addActionListener(e -> metodo("*"));
        
        gbc.gridx = 2;
        gbc.gridy = 3;
        gbc.gridwidth = 1;
        
        add (botonMul, gbc);
        
        //BOTON igual
        JButton botonIgual = new JButton("=");
        
        botonIgual.addActionListener(e -> metodo("="));
        
        gbc.gridx = 0;
        gbc.gridy = 4;
        gbc.gridwidth = 3;
        
        add (botonIgual, gbc);
        
        //BOTON seno
        JButton botonSen = new JButton("sen");

        botonSen.addActionListener(e -> metodo("sen"));

        gbc.gridx = 4;
        gbc.gridy = 0;
        gbc.gridwidth = 1;
        gbc.gridheight = 1;

        add(botonSen, gbc);
        
        //BOTON coseno
        JButton botonCos = new JButton("cos");

        botonCos.addActionListener(e -> metodo("cos"));

        gbc.gridx = 4;
        gbc.gridy = 1;

        add(botonCos, gbc);
        
        //BOTON tangente
        JButton botonTan = new JButton("tan");

        botonTan.addActionListener(e -> metodo("tan"));

        gbc.gridx = 4;
        gbc.gridy = 2;

        add(botonTan, gbc);
        
        //BOTON pi
        JButton botonPi = new JButton("π");

        botonPi.addActionListener(e -> metodo("π"));

        gbc.gridx = 4;
        gbc.gridy = 3;

        add(botonPi, gbc);
        
        // BOTON (
        JButton botonAbreParentesis = new JButton("(");
        botonAbreParentesis.addActionListener(e -> metodo("("));

        gbc.gridx = 3;
        gbc.gridy = 4;
        gbc.gridwidth = 1;
        gbc.gridheight = 1;

        add(botonAbreParentesis, gbc);

        // BOTON )
        JButton botonCierraParentesis = new JButton(")");
        botonCierraParentesis.addActionListener(e -> metodo(")"));

        gbc.gridx = 4;
        gbc.gridy = 4;

        add(botonCierraParentesis, gbc);
        
        //LABEL
        label.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        label.setPreferredSize(new Dimension(0, 40));

        gbc.gridx = 0;
        gbc.gridy = 5;
        gbc.gridwidth = 5;
        gbc.gridheight = 1;

        add(label, gbc);
    }
    
    void metodo(String tecla) {

        if (tecla.equals("=")) {
            try {
                double resultado = new ExpressionBuilder(operacion)
                        .build()
                        .evaluate();

                label.setText(String.valueOf(resultado));
                operacion = "";
                resultadoMostrado = true;

            } catch (Exception e) {
                label.setText("Error");
                operacion = "";
            }

            return;
        }

        if (tecla.equals("π")) {
            operacion += "pi";
            label.setText(operacion);
            return;
        }
        
        if (tecla.equals("sen")) {
            operacion += "sin(";
            label.setText(operacion);
            return;
        }

        if (tecla.equals("cos")) {
            operacion += "cos(";
            label.setText(operacion);
            return;
        }

        if (tecla.equals("tan")) {
            operacion += "tan(";
            label.setText(operacion);
            return;
        }

        if (resultadoMostrado) {
            label.setText("");
            resultadoMostrado = false;
        }
        
        operacion += tecla;
        label.setText(operacion);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSplitPane1 = new javax.swing.JSplitPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ReflectiveOperationException | javax.swing.UnsupportedLookAndFeelException ex) {
            logger.log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> new NewJFrame().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JSplitPane jSplitPane1;
    // End of variables declaration//GEN-END:variables

}
