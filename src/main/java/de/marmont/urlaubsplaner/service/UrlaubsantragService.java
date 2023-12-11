package de.marmont.urlaubsplaner.service;

import de.marmont.urlaubsplaner.model.Urlaubsantrag;

import java.util.ArrayList;
import java.util.List;

public class UrlaubsantragService {
    private List<Urlaubsantrag> urlaubsantraege;

    public UrlaubsantragService() {
        urlaubsantraege = new ArrayList<>();
    }

    public void addUrlaubsantrag(Urlaubsantrag urlaubsantrag) {
        urlaubsantraege.add(urlaubsantrag);
    }

    public void editUrlaubsantrag(Urlaubsantrag editedUrlaubsantrag) {
        for (Urlaubsantrag urlaubsantrag : urlaubsantraege) {
            if (urlaubsantrag.getAntragsID() == editedUrlaubsantrag.getAntragsID()) {
                urlaubsantrag.setStartdatum(editedUrlaubsantrag.getStartdatum());
                urlaubsantrag.setEnddatum(editedUrlaubsantrag.getEnddatum());
                urlaubsantrag.setStatus(editedUrlaubsantrag.getStatus());
                break;
            }
        }
    }

    public void deleteUrlaubsantrag(int urlaubsantragId) {
        urlaubsantraege.removeIf(urlaubsantrag -> urlaubsantrag.getAntragsID() == urlaubsantragId);
    }

    public List<Urlaubsantrag> getAllUrlaubsantrags() {
        return urlaubsantraege;
    }
}