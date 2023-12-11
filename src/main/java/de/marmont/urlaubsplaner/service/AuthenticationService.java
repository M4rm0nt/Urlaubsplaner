package de.marmont.urlaubsplaner.service;

public class AuthenticationService {
    public boolean authenticate(int mitarbeiterID, String password) {
        return mitarbeiterID == 1337 && "420".equals(password);
    }
}