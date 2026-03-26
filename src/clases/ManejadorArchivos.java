package clases;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ManejadorArchivos {

    public void leerArchivo(String nombreArchivo){
        FileReader fr;
        try{
            fr = new FileReader(nombreArchivo);
            BufferedReader br = new BufferedReader(fr);
            String lineaActual = br.readLine();
            while (lineaActual != null){
                System.out.print(lineaActual+" ");
                lineaActual = br.readLine();
            } 
        }catch (FileNotFoundException e){
            System.out.println("Error al leer el archivo: "+nombreArchivo);
            e.printStackTrace();
        }catch (IOException e){
            System.out.println("Error al leer el archivo: "+nombreArchivo);
            e.printStackTrace();
        }
        System.out.println();
        System.out.println("Archivo leido satisfacoriamente.");    
    }

    public void escribirArchivo(String nombreCompletoArchivo, String[] listaLineasArchivo) {
        FileWriter fw;
        try {
            fw = new FileWriter(nombreCompletoArchivo,true);
            BufferedWriter bw = new BufferedWriter(fw);
            for (int i = 0; i < listaLineasArchivo.length; i++){
                String lineaActual = listaLineasArchivo[i];
                bw.write(lineaActual);
                bw.newLine();
            }   
            bw.close();
            fw.close();
        } catch (IOException e) {
            System.out.println("Error al escribir el archivo "+nombreCompletoArchivo);
            e.printStackTrace();
        }
    }

    public int cantLineas(String rutaArchivo){
        FileReader fr;
        int numLineas = 0;
        try{
            fr = new FileReader(rutaArchivo);
            BufferedReader br = new BufferedReader(fr);
            String lineaactual = br.readLine();
            while (lineaactual != null){
                numLineas+=1;
                lineaactual = br.readLine();
            }
            fr.close();
            br.close();
        } catch (FileNotFoundException e){
            System.out.println("Error: No se encontró el archivo.");
            e.printStackTrace();
        } catch (IOException e){
            System.out.println("Error: No se encontró el archivo.");
            e.printStackTrace();
        } finally {
            return numLineas;
        }
    }

    public void estaEnElArchivo(String rutaArchivo, String palabra){
        palabra = palabra.toLowerCase();
        FileReader fr;
        try{
            fr = new FileReader(rutaArchivo);
            BufferedReader br = new BufferedReader(fr);
            String lineaActual = br.readLine();
            if (lineaActual!=null){lineaActual = lineaActual.toLowerCase();}
            while (lineaActual!=null && !(lineaActual.equals(palabra))) {
                lineaActual = br.readLine();
                if (lineaActual!=null){lineaActual = lineaActual.toLowerCase();}
            }
            if (lineaActual != null && lineaActual.equals(palabra)){
                System.out.println("La palabra se encuentra en el archivo!");
            } else {
                System.out.println("La palabra No se encuentra en el archivo.");
            }
            fr.close();
            br.close();
            } catch (FileNotFoundException e){
                System.out.println("Error: No se encontró el archivo.");
                e.printStackTrace();
            } catch (IOException e) {
                System.out.println("Error: No se encontró el archivo.");
                e.printStackTrace();
            }
        }

    public void copiarArchivo(String rutaArchivo, String rutaNuevoArchivo){
        FileReader fr;
        FileWriter fw;
        try{
            fr = new FileReader(rutaArchivo);
            fw = new FileWriter(rutaNuevoArchivo);

            BufferedReader br = new BufferedReader(fr);
            BufferedWriter bw = new BufferedWriter(fw);

            String linea = br.readLine();

            while (linea!=null){
                bw.write(linea);
                bw.newLine();
                linea = br.readLine();
            }

            bw.close();
            br.close();
            fw.close();
            fr.close();

        } catch (FileNotFoundException e){
            e.printStackTrace();
        } catch (IOException e){
            e.printStackTrace();
        }
    }

    public ManejadorArchivos(){}
}
