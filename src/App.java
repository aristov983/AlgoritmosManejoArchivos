import clases.ManejadorArchivos;
import java.io.File;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("========================");
        System.out.println("= Ejercicios Archivos =");
        System.out.println("========================");
        Scanner sc = new Scanner(System.in);
        while (true){
            System.out.println("Digite un número entero entre 1 y 10 para ejecutar el ejercicio correspondiente o digite 0 para finalizar.");
            int opcion = sc.nextInt();
            switch (opcion) {
                case 0:
                    System.out.println("Hasta la proxima.");
                    return;
                case 1:
                    ejercicio1();
                    break;
                case 2:
                    ejercicio2();
                    break;
                case 3:
                    ejercicio3();
                    break;
                case 4:
                    ejercicio4();
                    break;
                case 5:
                    ejercicio5();
                    break;
                case 6:
                    ejercicio6();
                    break;
                case 7:
                    ejercicio7();
                    break;
                case 8:
                    ejercicio8();
                    break;
                case 9:
                    ejercicio9();
                    break;
                case 10:
                    ejercicio10();
                    break;
                default:
                    System.out.print("El ejercicio no se encuentra disponible.");
            }
            System.out.println("===== Ejercicio finalizado. =====");
        }
    }

    public static void ejercicio1(){
        ManejadorArchivos manejadorArchivos = new ManejadorArchivos();

        //Esto lo hice por las dudas que no este la carpeta.
        File carpeta = new File("src/archivos");
        if (!carpeta.exists()) {
            carpeta.mkdir();
        }

        String[] lineasEscribir = {"Hola", "Bienvenidos a Java", "Manejo de archivos básicos."};
        //Ojo acá, puse src/archivos/saludo.txt porque normalmente main te para en la carpeta base del proyecto, no en src.
        manejadorArchivos.escribirArchivo("src/archivos/saludo.txt", lineasEscribir);
    }

    public static void ejercicio2(){
        ManejadorArchivos manejadorArchivos = new ManejadorArchivos();
        manejadorArchivos.leerArchivo("src/archivos/saludo.txt");
    }

    public static void ejercicio3(){
        ManejadorArchivos manejadorArchivos = new ManejadorArchivos();
        
        File carpeta = new File("src/archivos");
        if (!carpeta.exists()){
            carpeta.mkdir();
        }

        String[] frutas = {"Manzana", "Banana", "Naranja","Pera"};
        manejadorArchivos.escribirArchivo("src/archivos/frutas.txt",frutas);
    }

    public static void ejercicio4(){
        ManejadorArchivos manejadorArchivos = new ManejadorArchivos();
        System.out.println("El archivo de texto tiene: " + manejadorArchivos.cantLineas("src/archivos/frutas.txt") + " lineas.");
    }

    public static void ejercicio5(){
        ManejadorArchivos manejadorArchivos = new ManejadorArchivos();

        //Esto lo hice por las dudas que no este la carpeta.
        File carpeta = new File("src/archivos");
        if (!carpeta.exists()) {
            carpeta.mkdir();
        }

        String[] lineasEscribir = {"Primer archivo", "Esta es la 2da linea", "Manejo de archivos divertidos."};
        //Ojo acá, puse src/archivos/saludo.txt porque normalmente main te para en la carpeta base del proyecto, no en src.
        manejadorArchivos.escribirArchivo("src/archivos/ejercicio5.txt", lineasEscribir);
        String[] lineas2Escribir = {"Sigo en el primer archivo", "Esto se agregó después", "Manejo de archivos increibles."};
        manejadorArchivos.escribirArchivo("src/archivos/ejercicio5.txt", lineas2Escribir);
    }

    public static void ejercicio6(){
        ManejadorArchivos manejadorArchivos = new ManejadorArchivos();
        manejadorArchivos.estaEnElArchivo("src/archivos/frutas.txt", "banana");
    }

    public static void ejercicio7(){
        ManejadorArchivos manejadorArchivos = new ManejadorArchivos();
        manejadorArchivos.copiarArchivo("src/archivos/frutas.txt", "src/archivos/frutas_copia.txt");
    }

    public static void ejercicio8(){
        ManejadorArchivos ma = new ManejadorArchivos();
        ma.leerArchivoDeterminadaLongitud("src/archivos/ejercicio5.txt", 22);
    }

    public static void ejercicio9(){
        ManejadorArchivos ma = new ManejadorArchivos();
        String[] lineasEscribir={"Ejercicio 9", "No se mucho que poner", "Liberaciooooon"};
        ma.escribirArchivo("src/archivos/ejercicio9.txt", lineasEscribir);
        ma.leerArchivo("src/archivos/ejercicio9.txt");
    }

    public static void ejercicio10(){
        ManejadorArchivos ma = new ManejadorArchivos();
        ma.ejercicioNotas("src/archivos/notas.txt");
    }

    
}
