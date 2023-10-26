package org.browniesygalletas.service.productos;
import org.browniesygalletas.modelo.Producto;

import java.util.List;

public interface CRUDProductos {
    //Este es la interface CRUD de los servicios relacionados a los productos

    void crearProducto(Producto producto);

    void eliminarProducto(Producto producto);

    List<Producto> listarProductos();

    void modificarProducto(Producto producto);

    Producto obtenerProductoPorId (Integer id);
}
