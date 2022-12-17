package LeapYear;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.InputMismatchException;

public class LeapYearGUI extends JFrame{
    private JPanel pnlMain;
    private JTextField tfYear;
    private JButton btnCheckYear;

    public static void main(String[] args) {
        LeapYearGUI app = new LeapYearGUI();
        app.setTitle("Leap Year Checker");
        app.setContentPane(app.pnlMain);
        app.setSize(600,500);
        app.setDefaultCloseOperation(EXIT_ON_CLOSE);
        app.setVisible(true);
    }

    public LeapYearGUI(){
        btnCheckYear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    int year = Integer.parseInt(tfYear.getText());
                    if(year < 0){
                        throw new Exception("Year cannot be negative");
                    }
                    if (year % 4 == 0) {
                        JOptionPane.showMessageDialog(pnlMain, "Leap year");
                    } else {
                        JOptionPane.showMessageDialog(pnlMain, "Not a leap year");
                    }
                }catch(NumberFormatException d){
                    JOptionPane.showMessageDialog(pnlMain, "Cannot be empty");
                }catch(InputMismatchException d) {
                    JOptionPane.showMessageDialog(pnlMain, "Input a number");
                }catch(Exception d){
                    JOptionPane.showMessageDialog(pnlMain, d.getMessage());
                }
            }
        });
    }
}
