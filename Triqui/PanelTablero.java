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

   JButton btn_00, btn_01, btn_02, btn_10, btn_11, btn_12, btn_20, btn_21, btn_22;

   int tablero[][];

    public PanelTablero() {

        tablero = new int[3][3];
        for(int i = 0; i < 3; i++)
        {
            for(int j = 0; j < 3; j++)
            {
                tablero[i][j] = VACIA;
            }
        }

        ganador = false;
        turno_actual = X;

        this.setLayout(new GridLayout(3,3));

        btn_00 = new JButton();

        btn_00.setActionCommand("Casilla1"); //2
        btn_00.addActionListener(this); //3

        btn_01 = new JButton();

        btn_02 = new JButton();
        btn_10 = new JButton();
        btn_11 = new JButton();
        btn_12 = new JButton();
        btn_20 = new JButton();
        btn_21 = new JButton();
        btn_22 = new JButton();

        add(btn_00);
        add(btn_01);
        add(btn_02);
        add(btn_10);
        add(btn_11);
        add(btn_12);
        add(btn_20);
        add(btn_21);
        add(btn_22);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        String cualBoton = e.getActionCommand();

        if(turno_actual == X && ! ganador) {
            switch (cualBoton) {
                case "Casilla1":
                    JOptionPane.showMessageDialog(this, "CLick en el botón 1");
                    btn_00.setText("X");
                    btn_00.setEnabled(false);
                    tablero[0][0] = 1;
                    validar();
                    jugada_maquina();
                    break;
               /* completar casos de los demás botones */
            }
        }

    }

    /**
    * COMPLETAR EN PAREJAS PARA 27 de MAYO (CALIFICABLE)
    * Permite que la máquina haga su jugada: busca una posición libre en la matriz, cambia el estado del botón, y valida
     */
    private void jugada_maquina() {
    }

    /**
     * COMPLETAR EN PAREJAS PARA 27 de MAYO (CALIFICABLE)
     * Valida si hay un ganador
     */
    private void validar() {



    }
}
