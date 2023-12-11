package de.marmont.urlaubsplaner;

import de.marmont.urlaubsplaner.view.LoginView;

public class Urlaubsplaner {
    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(() -> new LoginView().setVisible(true));
    }
}