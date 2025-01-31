package br.com.senac.financasjpa2.persistencia;

import br.com.senac.financasjpa2.entities.Podcast;
import jakarta.persistence.EntityManager;

public class PodcastDAO {

    public void cadastrar(Podcast pd) {
        EntityManager em = JPAUtil.getEntityManager();
        try {
            em.getTransaction().begin();
            em.persist(pd);
            em.getTransaction().commit();
        } catch (Exception e) {
            em.getTransaction().rollback();
            throw e;
        } finally {
            JPAUtil.closeEtityManager();
        }
    }
}
