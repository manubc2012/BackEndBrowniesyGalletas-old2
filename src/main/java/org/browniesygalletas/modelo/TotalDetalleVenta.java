package org.browniesygalletas.modelo;

public class TotalDetalleVenta {
    private Pedido idPedido;
    private DetalleVenta totalPedido;

    public TotalDetalleVenta(Pedido idPedido, double totalPedido) {
        this.idPedido = idPedido;
        //this.totalPedido = totalPedido;
    }
}
