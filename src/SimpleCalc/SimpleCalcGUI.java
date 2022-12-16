package SimpleCalc;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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

    public SimpleCalcGUI(){
        btnCompute.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (cbOperations.getSelectedItem() == "+") {
                    tfResult.setText(String.valueOf(Double.parseDouble(tfNumber1.getText()) + Double.parseDouble(tfNumber2.getText())));
                } else if (cbOperations.getSelectedItem() == "-") {
                    tfResult.setText(String.valueOf(Double.parseDouble(tfNumber1.getText()) - Double.parseDouble(tfNumber2.getText())));
                } else if (cbOperations.getSelectedItem() == "/") {
                    if (Double.parseDouble(tfNumber2.getText()) == 0)
                        throw new ArithmeticException("Cannot divide by zero");
                    tfResult.setText(String.valueOf(Double.parseDouble(tfNumber1.getText()) / Double.parseDouble(tfNumber2.getText())));
                } else if (cbOperations.getSelectedItem() == "*") {
                    tfResult.setText(String.valueOf(Double.parseDouble(tfNumber1.getText()) * Double.parseDouble(tfNumber2.getText())));
                }
            }
        });
    }
}
