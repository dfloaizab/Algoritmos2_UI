package com.usc.UI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PanelTablero extends JPanel implements ActionListener { //1

    JLabel etiquetaPrueba;

    final int X = 1, O=0, VACIA = -1;

    int turno_actual;

    boolean ganador;

   int tablero[][];
   JButton botones[][];

    public PanelTablero() {

        ganador = false;
        turno_actual = X;

        this.setLayout(new GridLayout(3,3));

        tablero = new int[3][3];
        botones = new JButton[3][3];

        for(int i = 0; i < 3; i++)
        {
            for(int j = 0; j < 3; j++)
            {
                tablero[i][j] = VACIA;
                botones[i][j] = new JButton();
                botones[i][j].setActionCommand(""+i+j);
                botones[i][j].addActionListener(this);

                add(botones[i][j]);
            }
        }
    }

    /**
    * Maneja los eventos de los distintos elementos de UI
    */
    @Override
    public void actionPerformed(ActionEvent e) {

        String cualBoton = e.getActionCommand();

        if(turno_actual == X && ! ganador) {
            switch (cualBoton) {
                case "00":
                    //JOptionPane.showMessageDialog(this, "CLick en el botón 1");
                    botones[0][0].setText("X");
                    botones[0][0].setEnabled(false);
                    tablero[0][0] = 1;
                    validar();
                    JOptionPane.showMessageDialog(this, "Juega la máquina"   );
                    jugada_maquina();
                    break;
                case "01":
                    botones[0][1].setText("X");
                    botones[0][1].setEnabled(false);
                    tablero[0][1] = 1;
                    validar();
                    JOptionPane.showMessageDialog(this, "Juega la máquina"   );
                    jugada_maquina();
                    break;
                case "02":
                    botones[0][2].setText("X");
                    botones[0][2].setEnabled(false);
                    tablero[0][2] = 1;
                    validar();
                    JOptionPane.showMessageDialog(this, "Juega la máquina"   );
                    jugada_maquina();
                    break;
                case "10":
                    botones[1][0].setText("X");
                    botones[1][0].setEnabled(false);
                    tablero[1][0] = 1;
                    validar();
                    JOptionPane.showMessageDialog(this, "Juega la máquina"   );
                    jugada_maquina();
                    break;
                case "11":
                    botones[1][1].setText("X");
                    botones[1][1].setEnabled(false);
                    tablero[1][1] = 1;
                    validar();
                    JOptionPane.showMessageDialog(this, "Juega la máquina"   );
                    jugada_maquina();
                    break;
                case "20":
                    botones[2][0].setText("X");
                    botones[2][0].setEnabled(false);
                    tablero[2][0] = 1;
                    validar();
                    JOptionPane.showMessageDialog(this, "Juega la máquina"   );
                    jugada_maquina();
                    break;

            }
        }

    }


    /**
    * La jugada de la máquina solo busca la primera casilla libre en la que puede hacer la jugada
    */
    private void jugada_maquina() {
        //buscar una casilla libre donde jugar:
        boolean jugada = false;
        if(!ganador) {
            for (int i = 0; i < 3 && !jugada; i++) {
                for (int j = 0; j < 3 ; j++) {
                    if (tablero[i][j] == VACIA) {
                        tablero[i][j] = O;
                        botones[i][j].setText("O");
                        botones[i][j].setEnabled(false);
                        jugada = true;
                        break;
                    }
                }
            }
        }
    }

    /**
     * PENDIENTE
     * Validar si hay un ganador, y VALIDAR EL EMPATE:
     */
    private void validar() {

        //validar primera fila:
        if(tablero[0][0]== tablero[0][1] && tablero[0][1] == tablero[0][2] && tablero[0][0] != VACIA)
            ganador = true;

        //validar segunda fila:

        //validar tercera fila:

        //validar columnas:

        //validar diagonales:

    }
}
