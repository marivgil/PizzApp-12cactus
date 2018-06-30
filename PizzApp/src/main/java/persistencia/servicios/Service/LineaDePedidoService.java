package persistencia.servicios.Service;

import modelo.LineaDePedido;
import modelo.Pedido;
import persistencia.repositorios.LineaDePedidoRepository;
import persistencia.servicios.Service.GenericService;

import java.util.List;

public class LineaDePedidoService extends GenericService<LineaDePedido> {

    private LineaDePedidoRepository repository;

    @Override
    public LineaDePedidoRepository getRepository() {
        return repository;
    }

    public void setRepository(LineaDePedidoRepository repository) {
        this.repository = repository;
    }

    List<LineaDePedido> findByPedido(int pedido){
        return getRepository().findByPedido(pedido);
    }
}
