package Inicio.Modelo;

import java.io.*;

/**
 * Created by MatiEzelQ on 15/2/16.
 */
public class Partidas {

    private FileReader fr;
    private FileWriter fw;

    private String nombres[][] = new String[10][2];
    private String puntos[][] = new String[10][2];

    public Partidas() {


    }


    public void convertirHistorialEnArray(String archivo) {

        String texto = leer(archivo,true);

        String []KeyValue = texto.split(":");

        int contadorKey = 0;
        int contadorValue = 0;

        for (int i=0;i<KeyValue.length;i++) {

            if (i%2 == 0) {
                String []valor = KeyValue[i].split("-");

                for (int z=0; z<valor.length; z++) {//Me guarda en puntos[el contadorValue, que llega a las 10 partidas]
                    nombres[contadorKey][z] = valor[z];//[0 = nombre1 y 1 = nombre2]
                }
                contadorKey++;
            } else if (i%2 != 0) {
                String []valor = KeyValue[i].split("-");

                for (int z=0; z<valor.length; z++) {//Me guarda en puntos[el contadorValue, que llega a las 10 partidas]
                    puntos[contadorValue][z] = valor[z];//[0 = puntaje1 y 1 = puntaje2]
                }

                contadorValue++;
            } else {
                System.out.println("Sobra uno!");
            }


        }

    }

    public void convertirArrayEnHistorial(String nombre[],String value[]) {



    }

    public String leer(String ruta,boolean eliminarEspacios) {

        String texto = "";

        BufferedReader br;

        try{
            fr = new FileReader(ruta);

            br = new BufferedReader(fr);

            String linea = "";

            while ((linea = br.readLine()) != null) {

                texto += linea + "\n";
            }


        } catch (Exception e) {
            System.out.println("Error en el FileReader." + e.getMessage());
        } finally {

            try {
                fr.close();
            } catch (Exception e) {
                System.out.println("Error en el close(FileReader) del Leer." + e.getMessage() );
            }

        }

        if (eliminarEspacios == true) {
            texto = texto.replaceAll(" ","");//Elimina los espacios!.
        }

        return texto;
    }

    public void escribir(String ruta,String a[],String b[]) {

        String texto = a[0] + " : " + b[0] + " : " + a[1] + " : " + b[1] + " : " + a[2] + " : " + b[2] + " : " + a[3] + " : " +
                b[3] + " : " + a[4] + " : " + b[4] + " : " + a[5] + " : " + b[5] + " : " + a[6] + " : " + b[6] + " : " + a[7] + " : "
                + b[7] + " : " + a[9] + " : " + b[8] + " : " + a[9] + " : " + b[9];

        texto = texto.replace(" ","");//Elimina los espacios. Podría hacerlo yo pero me da paja...xd

        try {
            fw = new FileWriter(ruta);

            fw.write(texto);

        } catch (IOException e) {
            System.out.println("FileWriter error. " + e.getMessage() );
        } finally {
            try {
                fw.close();
            } catch (IOException e) {
                System.out.println("Error al cerrar FileWriter." + e.getMessage() );
            }
        }


    }













    //GETTERS-----SETTERS-------------------



    public String[][] getPuntos() {
        return puntos;
    }
    public void setPuntos(String[][] puntos) {
        this.puntos = puntos;
    }
    public String[][] getNombres() {
        return nombres;
    }
    public void setNombres(String[][] nombres) {
        this.nombres = nombres;
    }

















}
