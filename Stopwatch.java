import javax.swing.*;
import java.awt.event.*;

class Stopwatch {
    static int time = 0;
    static Timer timer;

    public static void main(String[] args) {
        JFrame frame = new JFrame("Stopwatch");
        JLabel timeLabel = new JLabel("0", SwingConstants.CENTER);
        JButton startButton = new JButton("Start");
        JButton stopButton = new JButton("Stop");
        JButton resetButton = new JButton("Reset");

        timeLabel.setBounds(100, 50, 100, 30);
        startButton.setBounds(30, 100, 80, 30);
        stopButton.setBounds(120, 100, 80, 30);
        resetButton.setBounds(210, 100, 80, 30);

        timer = new Timer(1000, e -> {
            time++;
            timeLabel.setText(String.valueOf(time));
        });

        startButton.addActionListener(e -> timer.start());
        stopButton.addActionListener(e -> timer.stop());
        resetButton.addActionListener(e -> {
            timer.stop();
            time = 0;
            timeLabel.setText("0");
        });

        frame.add(timeLabel);
        frame.add(startButton);
        frame.add(stopButton);
        frame.add(resetButton);

        frame.setSize(350, 200);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
