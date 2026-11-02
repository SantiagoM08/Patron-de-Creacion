package model;

public class FacturaMixta implements Informe {

    @Override
    public void procesar(String nombreArchivo) {
        System.out.println("[MIXTA] Factura procesada: "
                + nombreArchivo);
    }
}