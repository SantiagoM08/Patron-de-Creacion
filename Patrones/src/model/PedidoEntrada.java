package model;

public class PedidoEntrada implements Informe {

    @Override
    public void procesar(String nombreArchivo) {
        System.out.println("[ENTRADA] Pedido procesado: "
                + nombreArchivo);
    }
}