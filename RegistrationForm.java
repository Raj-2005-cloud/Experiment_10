
import javax.swing.*;
import java.awt.event.*;

class RegistrationForm {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Registration Form");
        JLabel nameLabel = new JLabel("Name:"), emailLabel = new JLabel("Email:"),
               passLabel = new JLabel("Password:"), confirmLabel = new JLabel("Confirm Password:");
        JTextField nameField = new JTextField(), emailField = new JTextField();
        JPasswordField passField = new JPasswordField(), confirmField = new JPasswordField();
        JButton registerButton = new JButton("Register");
        JLabel messageLabel = new JLabel();

        nameLabel.setBounds(20, 20, 120, 30);
        nameField.setBounds(150, 20, 150, 30);
        emailLabel.setBounds(20, 60, 120, 30);
        emailField.setBounds(150, 60, 150, 30);
        passLabel.setBounds(20, 100, 120, 30);
        passField.setBounds(150, 100, 150, 30);
        confirmLabel.setBounds(20, 140, 120, 30);
        confirmField.setBounds(150, 140, 150, 30);
        registerButton.setBounds(100, 180, 100, 30);
        messageLabel.setBounds(20, 220, 300, 30);

        frame.add(nameLabel); frame.add(nameField);
        frame.add(emailLabel); frame.add(emailField);
        frame.add(passLabel); frame.add(passField);
        frame.add(confirmLabel); frame.add(confirmField);
        frame.add(registerButton); frame.add(messageLabel);

        registerButton.addActionListener(e -> {
            String name = nameField.getText();
            String email = emailField.getText();
            String password = new String(passField.getPassword());
            String confirmPassword = new String(confirmField.getPassword());

            if (name.isEmpty() || email.isEmpty() || password.isEmpty() || confirmPassword.isEmpty())
                messageLabel.setText("All fields are required.");
            else if (!email.contains("@"))
                messageLabel.setText("Invalid email address.");
            else if (!password.equals(confirmPassword))
                messageLabel.setText("Passwords do not match.");
            else
                messageLabel.setText("Registration successful.");
        });

        frame.setSize(350, 300);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}