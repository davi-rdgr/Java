package br.com.senac.financasjpa2.persistencia;

import br.com.senac.financasjpa2.entities.User;
import br.com.senac.financasjpa2.main.Main;
import br.com.senac.financasjpa2.main.Produtos;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.Query;
import java.awt.HeadlessException;
import javax.swing.JOptionPane;

public class LoginDAO {

    private Main main;
    private EntityManager em;
    EntityManagerFactory emf = Persistence.createEntityManagerFactory("uc10_02_hibernate");

    public LoginDAO(EntityManager em) {
        this.em = em;
    }

    public LoginDAO(Main main, EntityManager em) {
        this.main = main;
        this.em = em;
    }

    public void executeLogin(String login, String senha) {
        try {
            Query consulta = em.createQuery("SELECT u FROM User u JOIN FETCH u.role WHERE u.nome = :nome AND u.senha = :senha");

            consulta.setParameter("nome", login);
            consulta.setParameter("senha", senha);

            User userLog = (User) consulta.getSingleResult();

            JOptionPane.showMessageDialog(null, "Login realizado");

            Produtos produtos = new Produtos(userLog, em);
            produtos.setVisible(true);
            produtos.setLocationRelativeTo(main);
        } catch (HeadlessException e) {
            JOptionPane.showMessageDialog(main, "Credenciais incorretas! Tente novamente");
        }
    }
}
