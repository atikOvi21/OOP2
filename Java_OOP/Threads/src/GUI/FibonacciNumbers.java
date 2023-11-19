package GUI;

import javax.swing.*;
import java.awt.*;

public class FibonacciNumbers extends JFrame {
    private final JPanel workerPanel = new JPanel(new GridLayout(2, 2, 5, 5));
    private final JTextField numberField = new JTextField();
    private final JButton goButton = new JButton("Go");
    private final JLabel fibonacciLabel = new JLabel();

    private final JPanel eventThreadPanel = new JPanel(new GridLayout(2, 2, 5, 5));
    private int n1 = 0;
    private int n2 = 1;
    private int counter = 1;
    private final JLabel nLabel = new JLabel("Fibonacci of 1: ");
    private final JLabel nFibonacciLabel = new JLabel(String.valueOf(n2));
    private final JButton nextNumberButton = new JButton("Next Number");

    public FibonacciNumbers() {
        super("Fibonacci Numbers");
        setLayout(new GridLayout(2, 1, 10, 10));
        workerPanel.setBorder(BorderFactory.createTitledBorder("With SwingWorker"));
        workerPanel.add(new JLabel("Get Fibonacci of: "));
        workerPanel.add(numberField);
        goButton.addActionListener(event -> {
            int n;
            try {
                n = Integer.parseInt(numberField.getText());
            } catch (NumberFormatException ex) {
                fibonacciLabel.setText("Enter an integer.");
                return;
            }
            fibonacciLabel.setText("Calculating...");
            BackgroundCalculator task = new BackgroundCalculator(n, fibonacciLabel);
            task.execute();
        });
        workerPanel.add(goButton);
        workerPanel.add(fibonacciLabel);
        add(workerPanel);
        eventThreadPanel.setBorder(BorderFactory.createTitledBorder("Without SwingWorker"));
        eventThreadPanel.add(nLabel);
        eventThreadPanel.add(nFibonacciLabel);
        nextNumberButton.addActionListener(event -> {
            int temp = n1 + n2;
            n1 = n2;
            n2 = temp;
            counter++;
            nLabel.setText("Fibonacci of " + counter + ": ");
            nFibonacciLabel.setText(String.valueOf(n2));
        });
        eventThreadPanel.add(nextNumberButton);
        add(eventThreadPanel);
        setSize(375, 250);
        setVisible(true);
    }
}
