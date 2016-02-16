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

    private String nombres[];
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

                //Continuar.

            } else {

            }






        }



    }









}