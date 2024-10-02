/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package juego;

import java.util.Arrays;

/**
 *
 * @author Esteban Moroy 338885, Facundo Martínez
 */
public class Prueba {

    public static void main(String[] args) {

        String[][] tableroPrueba = {
                { "", "X", "O" },
                { "X", "O", "X" },
                { "", "X", "O" }
        };

        MiniTablero miniTablero = new MiniTablero();
        miniTablero.setMiniTablero(tableroPrueba);
        System.out.println(miniTablero.toString());
        System.out.println("");

        miniTablero.jugada("A1", "X");
        System.out.println(miniTablero.toString());
        System.out.println("");

        System.out.println(miniTablero.estaLleno());
        System.out.println(miniTablero.determinarGanador());

        System.out.println(miniTablero.filaToString(0));

        Tablero tablero = new Tablero();

        System.out.println(tablero.toString());

    }

}
