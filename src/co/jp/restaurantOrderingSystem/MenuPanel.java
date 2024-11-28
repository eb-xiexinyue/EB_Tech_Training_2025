package co.jp.restaurantOrderingSystem;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.util.Map;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

class MenuPanel extends JPanel {
    public MenuPanel(MainFrame frame) {
        setLayout(new BorderLayout());

        // 菜单项
        Map<String, Double> menu = Map.of(
                "Fried Rice", 8.5,
                "Noodles", 7.0,
                "Burger", 5.0,
                "Pizza", 10.0,
                "Salad", 4.5
        );

        JPanel menuPanel = new JPanel(new GridLayout(0, 2, 10, 10));
        menu.forEach((name, price) -> {
            JButton itemButton = new JButton(name + " ($" + price + ")");
            itemButton.addActionListener(e -> {
                frame.orderDetails.put(name, frame.orderDetails.getOrDefault(name, 0.0) + price);
                frame.totalPrice += price;
            });
            menuPanel.add(itemButton);
        });

        add(new JScrollPane(menuPanel), BorderLayout.CENTER);

        JButton checkoutButton = new JButton("Checkout");
        checkoutButton.addActionListener(e -> frame.switchPanel("PaymentPanel"));
        add(checkoutButton, BorderLayout.SOUTH);
    }
}

