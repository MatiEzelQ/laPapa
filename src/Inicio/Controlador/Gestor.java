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

            if (name == botones[0]) {

                //Borrar el name seleccionado.

            } else if (name == botones[1]) {

                //Nueva partida. //Si está completa (podría pedir tipo un "Estás seguro? La borrarás) la sobreescribe.

            } else if (name == botones[2]) {

                if (name == "Radio1") {

                    System.out.println("radio1");

                    String nombresTemp[] = new String[2];
                    String puntosTemp[] = new String[2];

                    for (int i=0;i<nombresTemp.length;i++) {
                        nombresTemp[i] = nombres[1][i];//Guardo los nombres de la partida 1.
                        puntosTemp[i] = puntos[1][i];//Guardo los puntos de la partida 1.
                    }

                    view.configurarContadorPanel(nombresTemp,puntosTemp);


                } else if (name == "Radio2") {



                } else if (name == "Radio3") {



                } else if (name == "Radio4") {



                } else if (name == "Radio5") {


                } else if (name == "Radio6") {



                } else if (name == "Radio7") {


                } else if (name == "Radio8") {


                } else if (name == "Radio9") {


                } else if (name == "Radio10") {

                }


            } else {




            }






        }



    }









}