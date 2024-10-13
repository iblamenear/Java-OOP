package Praktikum.PraktikumPBO.Sesi3;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class KalkulatorGui extends JFrame implements ActionListener {
    private JTextField display;
    private String operator;
    private double bil1, hasil;

    public KalkulatorGui() {
        // Membuat JFrame
        setTitle("Kalkulator");
        setSize(400, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());

        // Membuat Display
        display = new JTextField();
        display.setEditable(false);
        display.setFont(new Font("Arial", Font.PLAIN, 36));
        add(display, BorderLayout.NORTH);

        // Membuat Panel untuk Tombol
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(5, 4, 10, 10));

        // Menambahkan Tombol
        String[] buttons = {
            "7", "8", "9", "/",
            "4", "5", "6", "*",
            "1", "2", "3", "-",
            "0", ".", "=", "+",
            "^", "%", "√", "C"
        };

        for (String text : buttons) {
            JButton button = new JButton(text);
            button.setFont(new Font("Arial", Font.PLAIN, 24));
            button.addActionListener(this);
            panel.add(button);
        }

        add(panel, BorderLayout.CENTER);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String command = e.getActionCommand();

        try {
            switch (command) {
                case "C": // Clear
                    display.setText("");
                    break;
                case "=": // Hitung Hasil
                    String[] parts = display.getText().split(" ");  // Memisahkan angka dan operator
                    bil1 = Double.parseDouble(parts[0]);
                    operator = parts[1];
                    double bil2 = Double.parseDouble(parts[2]);

                    switch (operator) {
                        case "+":
                            hasil = bil1 + bil2;
                            break;
                        case "-":
                            hasil = bil1 - bil2;
                            break;
                        case "*":
                            hasil = bil1 * bil2;
                            break;
                        case "/":
                            hasil = bil1 / bil2;
                            break;
                        case "^":
                            hasil = Math.pow(bil1, bil2);
                            break;
                        case "%":
                            hasil = bil1 % bil2;
                            break;
                    }
                    display.setText(String.valueOf(hasil));
                    break;
                case "√": // Akar Kuadrat
                    bil1 = Double.parseDouble(display.getText());
                    hasil = Math.sqrt(bil1);
                    display.setText(String.valueOf(hasil));
                    break;
                case "+": case "-": case "*": case "/": case "^": case "%":
                    display.setText(display.getText() + " " + command + " ");
                    break;
                default: // Angka dan titik desimal
                    display.setText(display.getText() + command);
            }
        } catch (Exception ex) {
            display.setText("Error");
        }
    }

    public static void main(String[] args) {
        new KalkulatorGui();
    }
}
