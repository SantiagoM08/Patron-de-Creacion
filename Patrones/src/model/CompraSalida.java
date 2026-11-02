package model;

public class CompraSalida implements Informe {

    @Override
    public void procesar(String nombreArchivo) {
        System.out.println("[SALIDA] Compra procesada: "
                + nombreArchivo);
    }
}