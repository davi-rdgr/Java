package br.com.senac.financasjpa2;

import br.com.senac.financasjpa2.entities.Podcast;
import br.com.senac.financasjpa2.persistencia.PodcastDAO;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import java.time.LocalDate;

public class FinancasJPA2 {

    public static void main(String[] args) {
        EntityManagerFactory fabricaEntidade = Persistence.createEntityManagerFactory("Financas-PU");
        EntityManager manager = fabricaEntidade.createEntityManager();

        PodcastDAO podcastDAO = new PodcastDAO();

        Podcast podcast = new Podcast();
        podcast.setProdutor("PodPah");
        podcast.setNome_ep("Podpah #2");
        podcast.setNum_ep(1);
        podcast.setDuracao("03:02:11");
        podcast.setUrl("urlficticia.com.br");

        podcastDAO.cadastrar(podcast);
        
    }
}
