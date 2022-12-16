package FoodOrdering;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FoodOrderGUI extends JFrame{
    private JPanel pnlMain;
    private JCheckBox cPizza;
    private JRadioButton rbNone;
    private JButton btnOrder;
    private JCheckBox cBurger;
    private JCheckBox cFries;
    private JCheckBox cSoftDrinks;
    private JCheckBox cTea;
    private JCheckBox cSundae;
    private JRadioButton rb5;
    private JRadioButton rb10;
    private JRadioButton rb15;

    public static void main(String[] args) {
        FoodOrderGUI app = new FoodOrderGUI();
        app.setTitle("Food Ordering System");
        app.setContentPane(app.pnlMain);
        app.setSize(600,500);
        app.setDefaultCloseOperation(EXIT_ON_CLOSE);
        app.setVisible(true);
    }

    public FoodOrderGUI(){
        btnOrder.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    double total = 0;
                    if (cPizza.isSelected()) {
                        total += 100;
                    }
                    if (cBurger.isSelected()) {
                        total += 80;
                    }
                    if (cFries.isSelected()) {
                        total += 65;
                    }
                    if (cTea.isSelected()) {
                        total += 50;
                    }
                    if (cSoftDrinks.isSelected()) {
                        total += 55;
                    }
                    if (cSundae.isSelected()) {
                        total += 40;
                    }

                    if(total == 0) {
                        throw new Exception("No order selected. Please select order");
                    } else if (!rb5.isSelected() && !rbNone.isSelected() && !rb10.isSelected() && !rb15.isSelected()) {
                        if (total != 0)
                            throw new Exception("Please select discount");
                    }

                    if (rbNone.isSelected()) {
                        JOptionPane.showMessageDialog(pnlMain, "The total price is Php " + String.format("%.2f", total));
                    } else if (rb5.isSelected()) {
                        total -= total * .05;
                        JOptionPane.showMessageDialog(pnlMain, "The total price is Php " + String.format("%.2f", total));
                    } else if (rb10.isSelected()) {
                        total -= total * .10;
                        JOptionPane.showMessageDialog(pnlMain, "The total price is Php " + String.format("%.2f", total));
                    } else {
                        total -= total * .15;
                        JOptionPane.showMessageDialog(pnlMain, "The total price is Php " + String.format("%.2f", total));
                    }

                }catch(Exception d){
                    JOptionPane.showMessageDialog(pnlMain, d.getMessage());
                }
            }
        });
    }
}
