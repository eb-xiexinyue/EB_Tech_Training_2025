package co.jp.restaurantOrderingSystem;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

class PaymentPanel extends JPanel {
    public PaymentPanel(MainFrame frame) {
        setLayout(new BorderLayout());

        JTextArea orderSummary = new JTextArea();
        orderSummary.setEditable(false);
        frame.orderDetails.forEach((item, price) ->
                orderSummary.append(item + ": $" + price + "\n")
        );
        orderSummary.append("\nTotal: $" + frame.totalPrice);
        add(new JScrollPane(orderSummary), BorderLayout.CENTER);

        JButton payButton = new JButton("Pay");
        payButton.addActionListener(e -> {
            JOptionPane.showMessageDialog(this, "Payment Successful!");
            frame.switchPanel("StartPanel");
            frame.orderDetails.clear();
            frame.totalPrice = 0.0;
        });
        add(payButton, BorderLayout.SOUTH);
    }
}

