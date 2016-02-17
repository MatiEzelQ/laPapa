package Inicio.Controlador;

import Inicio.Modelo.Partidas;
import Inicio.Vista.Ventana;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by MatiEzelQ on 15/2/16.
 */
public class Gestor {

    private Ventana view;
    private Partidas play;

    private String nombres[][];
    private String puntos[][];//10 partidas con 2 puntos cada una.

    private String botones[] = {"Borrar","Nueva","Continuar"};

    private GestorEventos gestor = new GestorEventos();

    String radioSeleccionado = "nil";

    public Gestor(Ventana v, Partidas p) {
        view = v;
        play = p;

        inicio();

    }

    public void inicio() {
        play.convertirHistorialEnArray("/Users/MatiEzelQ/Documents/Java SE/Personal/laPapa/src/Inicio/Modelo/Historial.txt");

        this.nombres = play.getNombres();
        this.puntos = play.getPuntos();

        view.configurarContadorPanel(nombres[0],puntos[0]);

        view.agregarRadios(nombres,gestor);
        view.agregarBotones(botones,gestor);






    }


    private class GestorEventos implements ActionListener {

        public void actionPerformed(ActionEvent e) {

            String name = e.getActionCommand();
            //RadioButtonSeleccionado.

            if (name.equals("Radio0")) {
                radioSeleccionado = "Radio0";
            } else if (name.equals("Radio1")) {
                radioSeleccionado = "Radio1";
            } else if (name.equals("Radio2")) {
                radioSeleccionado = "Radio2";
            } else if (name.equals("Radio3")) {
                radioSeleccionado = "Radio3";
            } else if (name.equals("Radio4")) {
                radioSeleccionado = "Radio4";
            } else if (name.equals("Radio5")) {
                radioSeleccionado = "Radio5";
            } else if (name.equals("Radio6")) {
                radioSeleccionado = "Radio6";
            } else if (name.equals("Radio7")) {
                radioSeleccionado = "Radio7";
            } else if (name.equals("Radio8")) {
                radioSeleccionado = "Radio8";
            } else if (name.equals("Radio9")) {
                radioSeleccionado = "Radio9";
            }



            //BotonSeleccionado.
            if (name == botones[0]) {

                //Borrar el name seleccionado.

            } else if (name == botones[1]) {

                //Nueva.

            } else if (name == botones[2]) {

               if (radioSeleccionado.equals("Radio0")) {

                   view.configurarContadorPanel(nombres[0],puntos[0]);

               }  else if (radioSeleccionado.equals("Radio1")) {
                   System.out.println("ok");
                   view.configurarContadorPanel(nombres[1],puntos[1]);

               } else if (radioSeleccionado.equals("Radio2")) {

                   view.configurarContadorPanel(nombres[2],puntos[2]);

               } else if (radioSeleccionado.equals("Radio3")) {

                   view.configurarContadorPanel(nombres[0],puntos[0]);

               } else if (radioSeleccionado.equals("Radio4")) {

                   view.configurarContadorPanel(nombres[0],puntos[0]);

               } else if (radioSeleccionado.equals("Radio5")) {
                    radioSeleccionado = "Radio6";
               } else if (radioSeleccionado.equals("Radio6")) {
                    radioSeleccionado = "Radio7";
               } else if (radioSeleccionado.equals("Radio7")) {
                    radioSeleccionado = "Radio8";
               } else if (radioSeleccionado.equals("Radio8")) {
                    radioSeleccionado = "Radio9";
               } else if (radioSeleccionado.equals("Radio9")) {
                    radioSeleccionado = "Radio10";
               }



            } else {

            }






        }



    }


/*



    System.out.println("radio1");

                String nombresTemp[] = new String[2];
                String puntosTemp[] = new String[2];

                for (int i=0;i<nombresTemp.length;i++) {
                    nombresTemp[i] = nombres[1][i];//Guardo los nombres de la partida 1.
                    puntosTemp[i] = puntos[1][i];//Guardo los puntos de la partida 1.
                }

                view.configurarContadorPanel(nombresTemp,puntosTemp);



 */






}