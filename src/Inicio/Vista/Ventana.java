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
        add(principalPanel,BorderLayout.CENTER);
        principalPanel.setBackground(Color.red);



        //Radios


    }

    public void agregarBotones(String []nombres,ActionListener a) {

        for (int i=0; i<nombres.length; i++) {

            JButton b = new JButton(nombres[i]);

            b.addActionListener(a);

            botonesPanel.add(b);

        }


    }

    public void agregarRadios(String []nombres,ActionListener a){

        for (int i=0;i<nombres.length; i++) {

            JRadioButton r = new JRadioButton(nombres[i]);

            r.addActionListener(a);

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
