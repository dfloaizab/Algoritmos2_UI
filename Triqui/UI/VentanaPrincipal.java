package com.usc.UI;

import javax.swing.*;
import java.awt.*;

public class VentanaPrincipal extends JFrame {

    PanelLogo logoTriqui;
    PanelTablero tableroTriqui;
    PanelPuntaje puntajeTriqui;

    /* constructor para establecer las características de la ventana */
    public VentanaPrincipal()
    {
        this.setTitle("Mi primera aplicación con UI");
        this.setBackground(Color.BLACK);
        this.setSize(800, 600);
        this.setResizable(false);

        //Establecer diagramación para la ventana principal:
        this.setLayout(new BorderLayout());

        //Instanciar y agregar el panel del logo:
        logoTriqui = new PanelLogo();
        this.add(logoTriqui, BorderLayout.NORTH);

        //Instanciar y agregar el panel del tablero:
        tableroTriqui = new PanelTablero();
        this.add(tableroTriqui, BorderLayout.CENTER);

        //Instanciar y agregar el panel del puntaje:
        puntajeTriqui = new PanelPuntaje();
        this.add(puntajeTriqui, BorderLayout.EAST);


    }

    public static void main(String[] args) {

        VentanaPrincipal miVentana = new VentanaPrincipal();
        miVentana.setVisible(true);
    }
}
