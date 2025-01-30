package br.com.senac.financasjpa2.persistencia;

import br.com.senac.financasjpa2.entities.User;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.Query;
import jakarta.persistence.TypedQuery;
import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Predicate;
import jakarta.persistence.criteria.Root;
import javax.swing.JOptionPane;

public class LoginDAO {

    private EntityManager em;
    EntityManagerFactory emf = Persistence.createEntityManagerFactory("Financas-PU");

    public LoginDAO(EntityManager em) {
        this.em = em;
    }

    public LoginDAO() {
    }

    public User executeLogin(String login, String senha) {

        return null;

    }

}
