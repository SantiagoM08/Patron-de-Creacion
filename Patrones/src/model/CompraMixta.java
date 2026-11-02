package model;

public class CompraMixta implements Informe {

    @Override
    public void procesar(String nombreArchivo) {
        System.out.println("[MIXTA] Compra procesada: "
                + nombreArchivo);
    }
}