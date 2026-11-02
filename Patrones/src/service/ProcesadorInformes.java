package service;

import factory.InformeFactory;
import model.Informe;

public class ProcesadorInformes {

    private final InformeFactory factory;

    public ProcesadorInformes(InformeFactory factory) {
        this.factory = factory;
    }

    public void procesarArchivo(String archivo) {

        String[] partes = archivo.split("_");

        if(partes.length < 3) {
            System.out.println("Archivo inválido");
            return;
        }

        String tipo = partes[1];

        Informe informe = null;

        switch (tipo) {

            case "FAC":
                informe = factory.crearFactura();
                break;

            case "COM":
                informe = factory.crearCompra();
                break;

            case "PED":
                informe = factory.crearPedido();
                break;

            default:
                System.out.println("Tipo no soportado");
                return;
        }

        if(informe == null) {
            System.out.println(
                    "La categoría no soporta este tipo de informe");
            return;
        }

        informe.procesar(archivo);
    }
}