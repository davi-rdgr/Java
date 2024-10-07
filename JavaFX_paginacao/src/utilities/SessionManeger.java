package utilities;

import entities.Cliente;

public class SessionManeger {

    private static SessionManeger instance;
    private Cliente currentUser;
    private String loggedInUserName;

    private SessionManeger() {
    }

    public static SessionManeger getInstance() {
        if (instance == null) {
            instance = new SessionManeger();
        }
        return instance;
    }

    public void login(Cliente cliente) {
        this.currentUser = cliente;
    }

    public void logout() {
        this.currentUser = null;
    }

    public boolean isLoggedIn() {
        return currentUser != null;
    }

    public Cliente getCurrentUser() {
        return currentUser;
    }
    
     public void login(String username) {
        this.loggedInUserName = username;
    }

    public String getLoggedInUserName() {
        return loggedInUserName;
    }
}
