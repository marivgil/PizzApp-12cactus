package modelo;


public class Admin {

    public Cliente crearCliente(int telefono, String nombre, String apellido, String direccion) {
        return new Cliente(telefono,nombre,apellido,direccion);
    }

    public Producto crearProducto(Producto producto) {
        return new Producto();
    }

    public Pedido crearPedido(Pedido pedido) {
        return new Pedido();
    }

/*
    public boolean puedeHacerPedidos(int telefono) {
    }
*/
}
