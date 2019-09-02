package dci.ufro.cl.fifa.controladorArchivo;

import dci.ufro.cl.fifa.model.Jugador;

import java.beans.ExceptionListener;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

public class ManejoArchivo {
    public static String leerArchivo(String nombreArchivo) {
        Path archivo = Paths.get(nombreArchivo);
        String data = "";
        try {
            data = new String(Files.readAllBytes(archivo));
        } catch (Exception e) {
            System.out.println("The file could not be read.");
        }
        return data;
    }

    //Metodo generico que captura un archivo de texto y lo sobreescribe con otro texto.
    public static void escribirArchivo(String nombreArchivo, String data) {
        Path file = Paths.get(nombreArchivo);
        try {
            Files.write(file, data.getBytes());
        } catch (Exception e) {
            System.out.println("The file could not be written");
        }

    }

    public static String [] separarLineas(String total){
        String [] listaJugadores = total.split("\n");
        return listaJugadores;
    }

    public static String[] separarComas(String linea){
        String[]  separacion = linea.split(",");
        return separacion;
    }
}
