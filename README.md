# Sistema de Procesamiento de Informes mediante Abstract Factory

## Autor

Santiago Murillo Mosquera

## Descripción

Este proyecto implementa un sistema para el procesamiento de informes mediante el patrón de diseño de creación Abstract Factory.

El sistema es capaz de procesar distintos tipos de informes identificados mediante nombres de archivo estructurados.

Ejemplos:

- ENT_FAC_001.txt
- ENT_COM_001.txt
- ENT_PED_001.txt
- SAL_FAC_001.txt
- SAL_COM_001.txt
- MIX_FAC_001.txt
- MIX_COM_001.txt

Las categorías soportadas son:

- ENTRADA (ENT)
- SALIDA (SAL)
- MIXTA (MIX)

Los tipos de informe soportados son:

- FACTURA (FAC)
- COMPRA (COM)
- PEDIDO (PED)

## Patrón utilizado

Abstract Factory

Este patrón permite encapsular la creación de familias de objetos relacionados sin necesidad de especificar sus clases concretas.

## Estructura del Proyecto

src/

├── Main.java

├── model/

│   ├── Informe.java

│   ├── FacturaEntrada.java

│   ├── CompraEntrada.java

│   ├── PedidoEntrada.java

│   ├── FacturaSalida.java

│   ├── CompraSalida.java

│   ├── FacturaMixta.java

│   └── CompraMixta.java

├── factory/

│   ├── InformeFactory.java

│   ├── EntradaFactory.java

│   ├── SalidaFactory.java

│   └── MixtaFactory.java

└── service/

    └── ProcesadorInformes.java

## Requisitos

- Java JDK 17 o superior
- IntelliJ IDEA, Eclipse o NetBeans

## Ejecución

1. Abrir el proyecto en el IDE.
2. Compilar todas las clases.
3. Ejecutar Main.java.

## Salida esperada

[ENTRADA] Factura procesada: ENT_FAC_001.txt

[ENTRADA] Compra procesada: ENT_COM_001.txt

[ENTRADA] Pedido procesado: ENT_PED_001.txt

[SALIDA] Factura procesada: SAL_FAC_001.txt

[SALIDA] Compra procesada: SAL_COM_001.txt

[MIXTA] Factura procesada: MIX_FAC_001.txt

[MIXTA] Compra procesada: MIX_COM_001.txt

## UML

El diagrama UML fue desarrollado utilizando PlantUML e incluido en el informe académico.

## Licencia

Proyecto desarrollado con fines académicos para la asignatura de Reutilización de software.
