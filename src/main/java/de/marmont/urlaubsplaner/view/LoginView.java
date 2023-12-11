package de.marmont.urlaubsplaner.view;

import de.marmont.urlaubsplaner.model.Urlaubsantrag;
import de.marmont.urlaubsplaner.service.AuthenticationService;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class LoginView extends JFrame {
    private JTextField usernameField;
    private JPasswordField passwordField;
    private JButton loginButton;

    public LoginView() {
        setTitle("Login");
        setSize(500, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));

        usernameField = new JTextField();
        passwordField = new JPasswordField();
        loginButton = new JButton("Login");

        add(usernameField);
        add(passwordField);
        add(loginButton);

        loginButton.addActionListener(e -> attemptLogin());
    }

    private void attemptLogin() {
        try {
            int mitarbeiterID = Integer.parseInt(usernameField.getText());
            String password = new String(passwordField.getPassword());

            AuthenticationService authService = new AuthenticationService();
            if (authService.authenticate(mitarbeiterID, password)) {
                this.setVisible(false);

                // Beispiel: Erstellung einer leeren Urlaubsliste
                List<Urlaubsantrag> vacationList = new ArrayList<>();

                new MainView(mitarbeiterID, vacationList).setVisible(true);
            } else {
                JOptionPane.showMessageDialog(this, "Falsche Anmeldeinformationen");
            }
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Ungültige Mitarbeiter-ID");
        }
    }

}