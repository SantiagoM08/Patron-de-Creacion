package factory;

import model.*;

public class SalidaFactory implements InformeFactory {

    @Override
    public Informe crearFactura() {
        return new FacturaSalida();
    }

    @Override
    public Informe crearCompra() {
        return new CompraSalida();
    }

    @Override
    public Informe crearPedido() {
        return null;
    }
}