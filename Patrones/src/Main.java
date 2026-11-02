import factory.EntradaFactory;
import factory.MixtaFactory;
import factory.SalidaFactory;
import service.ProcesadorInformes;

public class Main {

    public static void main(String[] args) {

        String[] archivos = {

                "ENT_FAC_001.txt",
                "ENT_COM_001.txt",
                "ENT_PED_001.txt",

                "SAL_FAC_001.txt",
                "SAL_COM_001.txt",

                "MIX_FAC_001.txt",
                "MIX_COM_001.txt"
        };

        for(String archivo : archivos) {

            ProcesadorInformes procesador;

            if(archivo.startsWith("ENT")) {

                procesador = new ProcesadorInformes(
                        new EntradaFactory());

            } else if(archivo.startsWith("SAL")) {

                procesador = new ProcesadorInformes(
                        new SalidaFactory());

            } else if(archivo.startsWith("MIX")) {

                procesador = new ProcesadorInformes(
                        new MixtaFactory());

            } else {

                System.out.println(
                        "Categoría desconocida");
                continue;
            }

            procesador.procesarArchivo(archivo);
        }
    }
}