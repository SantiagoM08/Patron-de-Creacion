package factory;

import model.*;

public class EntradaFactory implements InformeFactory {

    @Override
    public Informe crearFactura() {
        return new FacturaEntrada();
    }

    @Override
    public Informe crearCompra() {
        return new CompraEntrada();
    }

    @Override
    public Informe crearPedido() {
        return new PedidoEntrada();
    }
}