package de.marmont.urlaubsplaner.view;

import de.marmont.urlaubsplaner.model.Urlaubsantrag;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AntragBearbeitenDialog extends JDialog {
    private JTextField startDateField;
    private JTextField endDateField;
    private JComboBox<String> statusComboBox;
    private JButton saveButton;
    private JButton cancelButton;

    private Urlaubsantrag urlaubsantrag;

    public AntragBearbeitenDialog(JFrame parent, Urlaubsantrag urlaubsantrag) {
        super(parent, "Urlaubsantrag hinzufügen/bearbeiten", true);
        this.urlaubsantrag = urlaubsantrag;

        setSize(300, 200);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setLayout(new GridLayout(5, 2));

        JLabel startDateLabel = new JLabel("Startdatum (yyyy-MM-dd):");
        startDateField = new JTextField();
        JLabel endDateLabel = new JLabel("Enddatum (yyyy-MM-dd):");
        endDateField = new JTextField();
        JLabel statusLabel = new JLabel("Status:");
        String[] statusOptions = {"Genehmigt", "In Bearbeitung", "Abgelehnt"};
        statusComboBox = new JComboBox<>(statusOptions);

        saveButton = new JButton("Speichern");
        cancelButton = new JButton("Abbrechen");

        add(startDateLabel);
        add(startDateField);
        add(endDateLabel);
        add(endDateField);
        add(statusLabel);
        add(statusComboBox);
        add(saveButton);
        add(cancelButton);

        saveButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (validateInput()) {
                    saveUrlaubsantrag();
                    dispose();
                } else {
                    JOptionPane.showMessageDialog(AntragBearbeitenDialog.this, "Ungültige Eingabe");
                }
            }
        });

        cancelButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
            }
        });

        if (urlaubsantrag != null) {
            startDateField.setText(urlaubsantrag.getStartdatum());
            endDateField.setText(urlaubsantrag.getEnddatum());
            statusComboBox.setSelectedItem(urlaubsantrag.getStatus());
        }
    }

    private boolean validateInput() {
        return !startDateField.getText().isEmpty() && !endDateField.getText().isEmpty();
    }

    private void saveUrlaubsantrag() {
        String startDate = startDateField.getText();
        String endDate = endDateField.getText();
        String status = (String) statusComboBox.getSelectedItem();

        if (urlaubsantrag == null) {
            Urlaubsantrag newUrlaubsantrag = new Urlaubsantrag(0, 0, startDate, endDate, status);
            // Fügen Sie den neuen Urlaubsantrag zur Liste der Urlaubsanträge hinzu oder speichern Sie ihn in Ihrer Datenbank
        } else {
            urlaubsantrag.setStartdatum(startDate);
            urlaubsantrag.setEnddatum(endDate);
            urlaubsantrag.setStatus(status);
            // Aktualisieren Sie den bestehenden Urlaubsantrag in Ihrer Datenbank oder Liste
        }
    }
}