package model;

public class FacturaEntrada implements Informe {

    @Override
    public void procesar(String nombreArchivo) {
        System.out.println("[ENTRADA] Factura procesada: "
                + nombreArchivo);
    }
}