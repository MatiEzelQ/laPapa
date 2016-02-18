package Inicio.Vista;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionListener;
import java.util.ArrayList;

/**
 * Created by MatiEzelQ on 15/2/16.
 */
public class Ventana extends JFrame {

    private static final int ALTO = 1200;
    private static final int ANCHO = 720;

    ButtonGroup grupo = new ButtonGroup();

    //LA LAMINA PRINCIPAL DEL JUEGO, CONTIENE LA OTRAS 3 LAMINAS
    JPanel principalPanel = new JPanel();
    //Creo los 3 paneles. + 2 boxes para cada jugador.
    JPanel jugador1Panel = new JPanel();
    JPanel jugador2Panel = new JPanel();

    Box boxJ1 = Box.createVerticalBox();
    Box boxJ2 = Box.createVerticalBox();

    //LA LAMINA DE DATOS DEL JUEGO, CONTIENE 2 BOXES Y BOTONES.
    JPanel datosPanel = new JPanel();

    Box boxPrincipal= Box.createVerticalBox();
    Box boxRadios = Box.createVerticalBox();

    JButton sumar = new JButton("Sumar");
    JTextField valor = new JTextField();
    JButton restar = new JButton("Restar");



    //LA LAMINA DE LOS BOTONES DEL JUEGO, CONTIENE LOS 3 BOTONES.
    JPanel botonesPanel = new JPanel();


    public Ventana() {
        setTitle("La papa. El contador");
        setBounds(0,0,ANCHO,ALTO);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        //JPanel Datos.
        add(datosPanel,BorderLayout.WEST);

        boxPrincipal.add(new JLabel("Historial"));
        datosPanel.add(Box.createVerticalStrut(20));
        boxPrincipal.add(boxRadios);

        datosPanel.add(boxPrincipal);

        //JPanel botones.
        add(botonesPanel,BorderLayout.SOUTH);

        //JPanel Contador.
        principalPanel.setLayout(new GridLayout(0,2));
        add(principalPanel,BorderLayout.CENTER);

        jugador1Panel.add(boxJ1);
        jugador2Panel.add(boxJ2);

        principalPanel.add(jugador1Panel);
        principalPanel.add(jugador2Panel);

    }

    public void configurarValoresDeJugadores(String nombres[],String puntos[]) {

        boxJ1.removeAll();
        boxJ2.removeAll();



        boxJ1.add(new JLabel(puntos[0]));
        boxJ2.add(new JLabel(puntos[1]));

        jugador1Panel.setBorder(BorderFactory.createTitledBorder(nombres[0]));
        jugador2Panel.setBorder(BorderFactory.createTitledBorder(nombres[1]));


        jugador2Panel.updateUI();
        jugador1Panel.updateUI();
        principalPanel.updateUI();
    }

    public void vaciarCajasDeJugadores() {

        boxJ1.removeAll();
        boxJ2.removeAll();

    }

    public void actualizarPuntos(ArrayList<String> puntos1,ArrayList<String> puntos2) {

        for (int i=0; i<puntos1.size(); i++) {

            boxJ1.add(new JLabel(puntos1.get(i)));
            boxJ2.add(new JLabel(puntos2.get(i)));

        }


    }

    public void agregarBotones(String []nombres,ActionListener a) {

        for (int i=0; i<nombres.length; i++) {

            JButton b = new JButton(nombres[i]);

            b.addActionListener(a);

            botonesPanel.add(b);

        }


    }

    public void agregarRadios(String [][]nombres,ActionListener a){

        boxRadios.removeAll();

        for (int i=0;i<nombres.length; i++) {

            JRadioButton r = new JRadioButton(nombres[i][0] + "." + nombres[i][1]);

            r.addActionListener(a);

            r.setActionCommand("Radio"+i);

            grupo.add(r);
            boxRadios.add(r);
        }




    }


    public void agregarCalculo(String nombre[],ActionListener a) {

        boxPrincipal.add(restar);
        boxPrincipal.add(valor);
        boxPrincipal.add(sumar);

        restar.addActionListener(a);
        sumar.addActionListener(a);

        JRadioButton j1 = new JRadioButton(nombre[0]);
        JRadioButton j2 = new JRadioButton(nombre[1]);

        j1.setActionCommand("RadioJugadorUno");
        j2.setActionCommand("RadioJugadorDos");

        boxPrincipal.add(j1);
        boxPrincipal.add(j2);



    }

    public void actualizarUI() {

        principalPanel.updateUI();
        datosPanel.updateUI();
        botonesPanel.updateUI();

    }


    public String getValor() {
        return valor.getText();
    }

    /* public void agregarPanelDatos() {
        JPanel panel = new JPanel();
        this.add(panel);
        //podría meterle datos de hora jugadas y todo eso. en un txt.
    }*/








}
