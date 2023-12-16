package GUI;

import javax.swing.*;
import java.util.concurrent.ExecutionException;

public class BackgroundCalculator extends SwingWorker<String, Object> {
    private final int number;
    private final JLabel resultLabel;

    public BackgroundCalculator(int number, JLabel resultLabel) {
        this.number = number;
        this.resultLabel = resultLabel;
    }

    @Override
    protected String doInBackground() throws Exception {
        long fibonacciNumber = fibonacci(number);
        return String.valueOf(fibonacciNumber);
    }

    @Override
    protected void done() {
        try {
            resultLabel.setText(get());
        } catch (InterruptedException ex) {
            resultLabel.setText("Interrupted while waiting for results.");
        } catch (ExecutionException ex) {
            resultLabel.setText("Error encountered: " + ex.getMessage());
        }
    }

    public long fibonacci(long number) {
        if (number == 0 || number == 1) {
            return number;
        } else {
            return fibonacci(number - 1) + fibonacci(number - 2);
        }
    }
}
