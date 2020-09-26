package br.ulbra.connection;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author Jeferson Leon
 */
public class ConnectionFactory {

    private static EntityManagerFactory emf = Persistence.createEntityManagerFactory("ProjetoHibernatePU");

    public EntityManager getConnection() {
        return emf.createEntityManager();
    }
}
