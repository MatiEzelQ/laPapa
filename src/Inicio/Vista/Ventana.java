package Inicio.Vista;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

/**
 * Created by MatiEzelQ on 15/2/16.
 */
public class Ventana extends JFrame {

    private static final int ALTO = 1200;
    private static final int ANCHO = 720;

    JPanel datosPanel = new JPanel();
    JPanel principalPanel = new JPanel();
    JPanel botonesPanel = new JPanel();

    Box box = Box.createVerticalBox();
    ButtonGroup grupo = new ButtonGroup();

    public Ventana() {
        setTitle("La papa. El contador");
        setBounds(0,0,ANCHO,ALTO);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        //JPanel Datos.
        add(datosPanel,BorderLayout.WEST);
        datosPanel.add(box);

        //JPanel botones.
        add(botonesPanel,BorderLayout.SOUTH);

        //JPanel Contador.
        principalPanel.setLayout(new GridLayout(0,2));
        add(principalPanel,BorderLayout.CENTER);



        //Radios


    }

    public void configurarContadorPanel(String nombresJugadores[],String puntos[]) {

        String nombreJ1 = nombresJugadores[0];
        String nombreJ2 = nombresJugadores[1];
        String puntoJ1 = puntos[0];
        String puntoJ2 = puntos[1];

        //Creo los 3 paneles.
        JPanel jugador1Panel = new JPanel();
        JPanel jugador2Panel = new JPanel();
        JPanel botonesPanel = new JPanel();

        //Le pongo borde a los paneles de los jugadores.
        jugador1Panel.setBorder(BorderFactory.createTitledBorder(nombreJ1));
        jugador2Panel.setBorder(BorderFactory.createTitledBorder(nombreJ2));

        //Añado los paneles 3 paneles al panel principal.
        datosPanel.add(jugador1Panel);
        datosPanel.add(jugador2Panel);
        datosPanel.add(botonesPanel);

        //Creo las 2 cajas para cada jugador.
        Box box1 = Box.createVerticalBox();
        Box box2 = Box.createVerticalBox();

        //Creo los labels con los puntajes de c/u.
        JLabel label1 = new JLabel(puntoJ1);
        JLabel label2 = new JLabel(puntoJ2);

        //Añado a las cajas su respectivo label.
        box1.add(label1);
        box2.add(label2);

        //Añado a cada panel su respectiva caja.
        jugador1Panel.add(box1);
        jugador2Panel.add(box2);

        principalPanel.add(jugador1Panel);
        principalPanel.add(jugador2Panel);

        principalPanel.updateUI();
    }



    public void agregarBotones(String []nombres,ActionListener a) {

        for (int i=0; i<nombres.length; i++) {

            JButton b = new JButton(nombres[i]);

            b.addActionListener(a);

            botonesPanel.add(b);

        }


    }

    public void agregarRadios(String [][]nombres,ActionListener a){

        for (int i=0;i<nombres.length; i++) {

            JRadioButton r = new JRadioButton(nombres[i][0] + "." + nombres[i][1]);

            r.addActionListener(a);

            r.setActionCommand("Radio"+i);

            System.out.println(r.getActionCommand());

            grupo.add(r);
            box.add(r);
        }

    }

   /* public void agregarPanelDatos() {
        JPanel panel = new JPanel();
        this.add(panel);
        //podría meterle datos de hora jugadas y todo eso. en un txt.
    }*/








}
