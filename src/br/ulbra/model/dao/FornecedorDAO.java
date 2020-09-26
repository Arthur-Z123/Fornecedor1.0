
import br.ulbra.connection.ConnectionFactory;
import br.ulbra.model.bean.Fornecedor;
import java.util.List;
import javax.persistence.EntityManager;
import javax.swing.JOptionPane;

/**
 *
 * @author Jeferson Leon
 */
public class FornecedorDAO {

    public Fornecedor save(Fornecedor fornecedor) {

        EntityManager em = new ConnectionFactory().getConnection();

        try {
            em.getTransaction().begin();
            em.persist(fornecedor);
            em.getTransaction().commit();
        } catch (Exception e) {
            em.getTransaction().rollback();
        } finally {
            em.close();
        }
        return fornecedor;
    }

    public Fornecedor remove(Integer id) {
        EntityManager em = new ConnectionFactory().getConnection();
        Fornecedor fornecedor = null;
        try {
            fornecedor = em.find(Fornecedor.class, id);
            em.getTransaction().begin();
            em.remove(fornecedor);
            em.getTransaction().commit();
            JOptionPane.showMessageDialog(null, "removido com sucesso");
        } catch (Exception e) {
            System.err.println(e);
            em.getTransaction().rollback();
        } finally {
            em.close();
        }
        return fornecedor;
    }

    public Fornecedor findById(Integer id) {

        EntityManager em = new ConnectionFactory().getConnection();
        Fornecedor fornecedor = null;

        try {
            fornecedor = em.find(Fornecedor.class, id);//passa a classe e o id

        } catch (Exception e) {
            System.err.println(e);

        } finally {
            em.close();

        }
        return fornecedor;

    }

    public List<Fornecedor> findAll() {
        EntityManager em = new ConnectionFactory().getConnection();
        List<Fornecedor> fornecedor = null;
        try {
            fornecedor = em.createQuery("from Categoria c").getResultList();

        } catch (Exception e) {
            System.err.println(e);

        } finally {
            em.close();
        }
        return fornecedor;
    }

}

    
