import javax.swing.*;
import java.awt.event.*;

class LoginForm {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Login Form");
        JLabel userLabel = new JLabel("Username:");
        JLabel passLabel = new JLabel("Password:");
        JTextField userField = new JTextField();
        JPasswordField passField = new JPasswordField();
        JButton loginButton = new JButton("Login");

        userLabel.setBounds(20, 20, 100, 30);
        userField.setBounds(120, 20, 150, 30);
        passLabel.setBounds(20, 60, 100, 30);
        passField.setBounds(120, 60, 150, 30);
        loginButton.setBounds(100, 100, 100, 30);

        frame.add(userLabel);
        frame.add(userField);
        frame.add(passLabel);
        frame.add(passField);
        frame.add(loginButton);

        loginButton.addActionListener(e -> {
            String username = userField.getText();
            String password = new String(passField.getPassword());
            if(username.equals("admin") && password.equals("password"))
                JOptionPane.showMessageDialog(frame, "Login Successful");
            else
                JOptionPane.showMessageDialog(frame, "Invalid Credentials");
        });

        frame.setSize(300, 200);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
