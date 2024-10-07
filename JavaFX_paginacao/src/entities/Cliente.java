package entities;

import java.time.LocalDate;
import java.util.Date;

public class Cliente {

    private boolean superUser;
    private String name;
    private String lastname;
    private LocalDate born;
    private String email;
    private String password;

    public Cliente(boolean superUser, String name, String lastname, LocalDate born, String email, String password) {
        this.superUser = superUser;
        this.name = name;
        this.lastname = lastname;
        this.born = born;
        this.email = email;
        this.password = password;
    }

    public Cliente(boolean superUser, String name, String email) {
        this.superUser = superUser;
        this.name = name;
        this.email = email;
    }

    public Cliente() {
    }

    // getters
    public boolean getSuperUser() {
        return superUser;
    }
    
    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastname;
    }

    public LocalDate getBorn() {
        return born;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }
    // setters

    public void setName(String name) {
        this.name = name;
    }

    public void setLastName(String lastname) {
        this.lastname = lastname;
    }

    public void setBorn(LocalDate born) {
        this.born = born;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String toString() {
        return name + " - " + email;
    }
}
