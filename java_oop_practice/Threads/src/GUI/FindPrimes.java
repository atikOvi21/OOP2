package GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

public class FindPrimes extends JFrame {
    private final JTextField highestPrimeField = new JTextField();
    private final JButton getPrimesButton = new JButton("Get Primes");
    private final JButton cancelGetPrimesButton = new JButton("Cancel");
    private final JTextArea intermediateTextArea = new JTextArea();
    private final JProgressBar progressBar = new JProgressBar();
    private final JLabel statusLabel = new JLabel();
    private PrimeCalculator primeCalculator;


    public FindPrimes() {
        super("Finding Primes");
        setLayout(new BorderLayout());

        JPanel northPanel = new JPanel();
        northPanel.add(new JLabel("Find primes up to: "));
        highestPrimeField.setColumns(8);
        northPanel.add(highestPrimeField);
        getPrimesButton.addActionListener(event -> {
            int number;
            try {
                number = Integer.parseInt(highestPrimeField.getText());
            } catch (NumberFormatException ex) {
                statusLabel.setText("Enter an integer.");
                return;
            }

            primeCalculator  = new PrimeCalculator(intermediateTextArea, getPrimesButton, cancelGetPrimesButton, statusLabel, number);
            primeCalculator.addPropertyChangeListener(
                new PropertyChangeListener() {
                    @Override
                    public void propertyChange(PropertyChangeEvent evt) {
                        if ("progress".equals(evt.getPropertyName())) {
                            progressBar.setValue((Integer) evt.getNewValue());
                        }
                    }
                }
            );
            getPrimesButton.setEnabled(false);
            cancelGetPrimesButton.setEnabled(true);
            primeCalculator.execute();
        });
        northPanel.add(getPrimesButton);

        intermediateTextArea.setEditable(false);
        add(new JScrollPane(intermediateTextArea, ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS, ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER));

        JPanel southPanel = new JPanel(new GridLayout(1, 3, 10, 10));
        cancelGetPrimesButton.setEnabled(false);
        cancelGetPrimesButton.addActionListener(
            new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    primeCalculator.stopCalculation();
                }
            }
        );

        southPanel.add(cancelGetPrimesButton);
        progressBar.setStringPainted(true);
        southPanel.add(progressBar);
        southPanel.add(statusLabel);

        add(northPanel, BorderLayout.NORTH);
        add(southPanel, BorderLayout.SOUTH);
        setSize(550, 300);
        setVisible(true);
    }
}
