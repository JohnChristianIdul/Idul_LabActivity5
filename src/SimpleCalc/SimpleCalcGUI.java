package SimpleCalc;

import javax.swing.*;

public class SimpleCalcGUI extends JFrame{
    private JPanel pnMain;
    private JTextField tfNumber1;
    private JComboBox cbOperations;
    private JButton btnCompute;
    private JTextField tfNumber2;
    private JLabel lblResult;
    private JTextField tfResult;

    public static void main(String[] args) {
        SimpleCalcGUI app = new SimpleCalcGUI();
        app.setTitle("Simple Calculator");
        app.setContentPane(app.pnMain);
        app.setSize(600, 500);
        app.setDefaultCloseOperation(EXIT_ON_CLOSE);
        app.setVisible(true);
    }
}
