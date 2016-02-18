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

        view.agregarRadios(nombres,gestor);
        view.agregarBotones(botones,gestor);

        view.configurarValoresDeJugadores(nombres[0],puntos[0]);

        view.agregarCalculo(nombres[0],gestor);

        play.getPuntosAcumuladosJ1().add("213");
        play.getPuntosAcumuladosJ1().add("285");

        play.getPuntosAcumuladosJ2().add("482");
        play.getPuntosAcumuladosJ2().add("9241");
    }


    private class GestorEventos implements ActionListener {

        public void actionPerformed(ActionEvent e) {

            String name = e.getActionCommand();
            //RadioButtonSeleccionado.

            if (name.equals("Radio0")) {
                play.setRadioSeleccionado("Radio0");
            } else if (name.equals("Radio1")) {
                play.setRadioSeleccionado("Radio1");
            } else if (name.equals("Radio2")) {
                play.setRadioSeleccionado("Radio2");
            } else if (name.equals("Radio3")) {
                play.setRadioSeleccionado("Radio3");
            } else if (name.equals("Radio4")) {
                play.setRadioSeleccionado("Radio4");
            } else if (name.equals("Radio5")) {
                play.setRadioSeleccionado("Radio5");
            } else if (name.equals("Radio6")) {
                play.setRadioSeleccionado("Radio6");
            } else if (name.equals("Radio7")) {
                play.setRadioSeleccionado("Radio7");
            } else if (name.equals("Radio8")) {
                play.setRadioSeleccionado("Radio8");
            } else if (name.equals("Radio9")) {
                play.setRadioSeleccionado("Radio9");
            } else if (name.equals("RadioJugadorUno")) {
                play.setRadioSeleccionadoCalculo("RadioJugadorUno");
            } else if (name.equals("RadioJugadorDos")) {
                play.setRadioSeleccionadoCalculo("RadioJugadorDos");
            }



            //BotonSeleccionado.
            if (name == botones[0]) {

                //Borrar el name seleccionado.

            } else if (name == botones[1]) {

                //Nueva.

            } else if (name == botones[2]) {

               if (play.getRadioSeleccionado().equals("Radio0")) {

                   view.configurarValoresDeJugadores(nombres[0],puntos[0]);

               }  else if (play.getRadioSeleccionado().equals("Radio1")) {

                   view.configurarValoresDeJugadores(nombres[1],puntos[1]);

               } else if (play.getRadioSeleccionado().equals("Radio2")) {

                   view.configurarValoresDeJugadores(puntos[2],nombres[2]);

               } else if (play.getRadioSeleccionado().equals("Radio3")) {

                   view.configurarValoresDeJugadores(puntos[3],nombres[3]);

               } else if (play.getRadioSeleccionado().equals("Radio4")) {

                   view.configurarValoresDeJugadores(puntos[4],nombres[4]);

               } else if (play.getRadioSeleccionado().equals("Radio5")) {

               } else if (play.getRadioSeleccionado().equals("Radio6")) {

               } else if (play.getRadioSeleccionado().equals("Radio7")) {

               } else if (play.getRadioSeleccionado().equals("Radio8")) {

               } else if (play.getRadioSeleccionado().equals("Radio9")) {

               }



            } else if (name.equals("Sumar")) {
                if (!play.getRadioSeleccionado().equals("nil")) {
                    if (play.getRadioSeleccionadoCalculo().equals("RadioJugadorUno")) {
                        int size = play.getPuntosAcumuladosJ1().size();
                        String ultimoValor = play.getPuntosAcumuladosJ1().get(size);
                        String valorIntroducido = view.getValor();

                        String nuevoValor = (Integer.parseInt(valorIntroducido) + Integer.parseInt(ultimoValor)) + "";

                        play.getPuntosAcumuladosJ1().add(nuevoValor);

                        view.actualizarUI();
                    } else if (play.getRadioSeleccionadoCalculo().equals("RadioJugadorDos")) {

                    } else {

                    }
                } else {
                    System.out.println("Debes seleccionar una partida.");
                }

            } else if (name.equals("Restar")) {

            }




            view.actualizarPuntos(play.getPuntosAcumuladosJ1(),play.getPuntosAcumuladosJ2());

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