package factory;

import model.*;

public class MixtaFactory implements InformeFactory {

    @Override
    public Informe crearFactura() {
        return new FacturaMixta();
    }

    @Override
    public Informe crearCompra() {
        return new CompraMixta();
    }

    @Override
    public Informe crearPedido() {
        return null;
    }
}