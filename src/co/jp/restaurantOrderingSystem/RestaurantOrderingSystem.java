package co.jp.restaurantOrderingSystem;

import java.awt.CardLayout;
import java.util.HashMap;
import java.util.Map;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

public class RestaurantOrderingSystem {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new MainFrame().setVisible(true));
    }
}

class MainFrame extends JFrame {
    CardLayout cardLayout = new CardLayout();
    JPanel mainPanel = new JPanel(cardLayout);

    int tableNumber;
    int customerCount;
    Map<String, Double> orderDetails = new HashMap<>();
    double totalPrice = 0.0;

    public MainFrame() {
        setTitle("Restaurant Ordering System");
        setSize(800, 600);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        // 添加面板
        mainPanel.add(new StartPanel(this), "StartPanel");
        mainPanel.add(new MenuPanel(this), "MenuPanel");
        mainPanel.add(new PaymentPanel(this), "PaymentPanel");

        add(mainPanel);
        cardLayout.show(mainPanel, "StartPanel");
    }

    // 切换到指定的面板
    public void switchPanel(String panelName) {
        cardLayout.show(mainPanel, panelName);
    }
}

