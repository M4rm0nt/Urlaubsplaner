package de.marmont.urlaubsplaner.model;

import javax.swing.table.AbstractTableModel;
import java.util.List;

public class UrlaubsTabel extends AbstractTableModel {
    private List<Urlaubsantrag> urlaubsantraege;

    public UrlaubsTabel(List<Urlaubsantrag> urlaubsantraege) {
        this.urlaubsantraege = urlaubsantraege;
    }

    @Override
    public int getRowCount() {
        return urlaubsantraege.size();
    }

    @Override
    public int getColumnCount() {
        return 6;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Urlaubsantrag vacation = urlaubsantraege.get(rowIndex);

        // Je nach columnIndex, geben Sie die Daten aus dem Urlaubsantrag zurück
        switch (columnIndex) {
            case 0:
                return vacation.getAntragsID();
            case 1:
                return vacation.getMitarbeiterID();
            case 2:
                return vacation.getStartdatum();
            case 3:
                return vacation.getEnddatum();
            case 4:
                return vacation.getStatus();
            default:
                return null;
        }
    }

    @Override
    public String getColumnName(int column) {
        // Hier können Sie die Spaltenüberschriften definieren
        switch (column) {
            case 0:
                return "Antrags-ID";
            case 1:
                return "Mitarbeiter-ID";
            case 2:
                return "Startdatum";
            case 3:
                return "Enddatum";
            case 4:
                return "Status";
            case 5:
                return "Checkbox";
            default:
                return "";
        }
    }

    // Implementieren Sie auch die Methoden, um Datenänderungen zu verarbeiten, wenn Sie Daten bearbeiten
}
