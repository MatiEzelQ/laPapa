package Inicio;

import Inicio.Controlador.Gestor;
import Inicio.Modelo.Partidas;
import Inicio.Vista.Ventana;

/**
 * Created by MatiEzelQ on 15/2/16.
 */
public class Main {

    public static void main(String[] args) {

        Partidas partidas = new Partidas();
        Ventana ventana = new Ventana();

        Gestor gestor = new Gestor(ventana,partidas);

        ventana.setVisible(true);

    /*    Partidas a = new Partidas();

        String c[] = {"Matías","Pedro","Silvina","Juan","Diego","Laura","Roxana","Fernanda","Lautaro","Paula"};
        String j[] = {"0","513","4721","8812","10000","8421","1044","951","204","101"};

        a.escribir("/Users/MatiEzelQ/Documents/Java SE/Personal/laPapa/src/mvc/Inicio.Controlador.Modelo/Historial.txt",c,j);
*/


    }





}



