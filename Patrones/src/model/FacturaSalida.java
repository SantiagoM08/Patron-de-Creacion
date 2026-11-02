package model;

public class FacturaSalida implements Informe {

    @Override
    public void procesar(String nombreArchivo) {
        System.out.println("[SALIDA] Factura procesada: "
                + nombreArchivo);
    }
}