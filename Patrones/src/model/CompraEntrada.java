package model;

public class CompraEntrada implements Informe {

    @Override
    public void procesar(String nombreArchivo) {
        System.out.println("[ENTRADA] Compra procesada: "
                + nombreArchivo);
    }
}