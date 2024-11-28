package co.jp.restaurantOrderingSystem;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

class StartPanel extends JPanel {
    public StartPanel(MainFrame frame) {
        setLayout(new GridLayout(3, 2, 10, 10));
        add(new JLabel("Enter Table Number:"));
        JTextField tableField = new JTextField();
        add(tableField);

        add(new JLabel("Enter Number of Customers:"));
        JTextField customerField = new JTextField();
        add(customerField);

        JButton nextButton = new JButton("Next");
        nextButton.addActionListener(e -> {
            try {
                frame.tableNumber = Integer.parseInt(tableField.getText());
                frame.customerCount = Integer.parseInt(customerField.getText());
                frame.switchPanel("MenuPanel");
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(this, "Please enter valid numbers!");
            }
        });
        add(new JLabel()); // 占位
        add(nextButton);
    }
}

