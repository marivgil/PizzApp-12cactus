package persistencia.servicios.Service;

import modelo.Producto;
import org.springframework.transaction.annotation.Transactional;
import persistencia.repositorios.ProductoRepository;

public class ProductoService extends GenericService<Producto>
{
    private ProductoRepository repository;

    @Override
    public ProductoRepository getRepository() {
        return repository;
    }

    public void setRepository(ProductoRepository repository) {
        this.repository = repository;
    }

    @Transactional
    public Producto getPruducto(int id) {
        return this.getRepository().findById(id);
    }
}
