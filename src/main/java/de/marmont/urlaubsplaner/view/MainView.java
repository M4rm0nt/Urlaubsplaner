package de.marmont.urlaubsplaner.view;

import de.marmont.urlaubsplaner.model.Urlaubsantrag;
import de.marmont.urlaubsplaner.model.UrlaubsTabel;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

public class MainView extends JFrame {
    private JButton addButton;
    private JButton editButton;
    private JButton deleteButton;
    private JTable vacationTable;
    private UrlaubsTabel urlaubsTabel; // Das TableModel für vacationTable
    private int mitarbeiterID;

    public MainView(int mitarbeiterID, List<Urlaubsantrag> vacationList) {
        this.mitarbeiterID = mitarbeiterID;

        // Hier initialisieren Sie vacationTable, bevor Sie setModel aufrufen
        vacationTable = new JTable();

        urlaubsTabel = new UrlaubsTabel(vacationList);
        vacationTable.setModel(urlaubsTabel);

        setTitle("Urlaubsplaner");
        setSize(500, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        addButton = new JButton("Hinzufügen");
        editButton = new JButton("Bearbeiten");
        deleteButton = new JButton("Löschen");

        add(new JScrollPane(vacationTable), BorderLayout.CENTER);
        JPanel buttonPanel = new JPanel();
        buttonPanel.add(addButton);
        buttonPanel.add(editButton);
        buttonPanel.add(deleteButton);
        add(buttonPanel, BorderLayout.SOUTH);

        // Event-Handling für die Buttons
        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Hier können Sie den Code für das Hinzufügen eines Urlaubsantrags implementieren.
                // Öffnen Sie beispielsweise das Dialogfeld "AntragBearbeitenDialog" für das Hinzufügen.
            }
        });

        editButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Hier können Sie den Code für das Bearbeiten eines ausgewählten Urlaubsantrags implementieren.
                // Öffnen Sie beispielsweise das Dialogfeld "AntragBearbeitenDialog" für die Bearbeitung.
            }
        });

        deleteButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Hier können Sie den Code für das Löschen eines ausgewählten Urlaubsantrags implementieren.
            }
        });
    }
}
