package factory;

import model.Informe;

public interface InformeFactory {

    Informe crearFactura();

    Informe crearCompra();

    Informe crearPedido();
}