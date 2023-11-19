package GUI;

import javax.swing.*;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ExecutionException;
import java.util.random.RandomGenerator;

public class PrimeCalculator extends SwingWorker<Integer, Integer> {
    private final RandomGenerator randomGenerator = new Random();
    private final JTextArea intermediateTextArea;
    private final JButton getPrimesButton;
    private final JButton cancelGetPrimesButton;
    private final JLabel statusLabel;
    private final boolean[] primes;
    private boolean stopped = false;

    public PrimeCalculator(JTextArea intermediateTextArea, JButton getPrimesButton, JButton cancelGetPrimesButton, JLabel statusLabel, int max) {
        this.intermediateTextArea = intermediateTextArea;
        this.getPrimesButton = getPrimesButton;
        this.cancelGetPrimesButton = cancelGetPrimesButton;
        this.statusLabel = statusLabel;
        this.primes = new boolean[max];

        for (int i = 0; i < max; i++) {
            primes[i] = true;
        }
    }

    @Override
    protected Integer doInBackground() throws Exception {
        int count = 0;

        for (int i = 2; i < primes.length; i++) {
            if (stopped) {
                return count;
            } else {
                setProgress(100 * count / primes.length);

                try {
                    Thread.sleep(randomGenerator.nextInt(100));
                } catch (InterruptedException ex) {
                    statusLabel.setText("Worker thread interrupted.");
                    return count;
                }

                if (primes[i]) {
                    publish(i);
                    count++;
                    for (int j = 2 * i; j < primes.length; j += i) {
                        primes[j] = false;
                    }
                }
            }
        }
        return count;
    }

    @Override
    protected void process(List<Integer> publishedValues) {
        for (Integer publishedValue : publishedValues) {
            intermediateTextArea.append(publishedValue + "\n");
        }
    }

    @Override
    protected void done() {
        getPrimesButton.setEnabled(true);
        cancelGetPrimesButton.setEnabled(false);

        int numPrimes;

        try {
            numPrimes = get();
        } catch (InterruptedException | ExecutionException ex) {
            statusLabel.setText("Error: " + ex.getMessage());
            return;
        }

        statusLabel.setText("Finished with " + primes.length + " numbers.");
    }

    public void stopCalculation() {
        stopped = true;
    }
}
