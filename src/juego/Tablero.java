/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package juego;

/**
 *
 * @author Esteban Moroy 338885, Facundo Martínez
 */
public class Tablero {

    // Atributos
    private MiniTablero[][] tableroPrincipal;
    private MiniTablero ganadoresMiniTableros;

    // Métodos

    /** Inicializa un nuevo tablero */
    public Tablero() {
        this.tableroPrincipal = new MiniTablero[3][3];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                this.tableroPrincipal[i][j] = new MiniTablero();
            }
        }

    }

    /** Realiza una jugada en el tablero */
    public void jugada(String tipoJugador, String coordenada, String coordenadaMiniTablero) {

    }

    /** Ejecuta la jugada mágica en el mini-tablero */
    public void jugadaMagica(String posicionMiniTablero) {
        // Realiza una jugada mágica en un mini-tablero
    }

    /** Deshabilita un mini-cuadrado para que no se pueda usar más */
    public void deshabilitarMiniCuadrado(String coordenada) {
        // Deshabilita la casilla especificada
    }

    /** Verifica si el tablero está completo */
    public boolean tableroCompleto() {
        // Retorna true si el tablero está completamente lleno
        return false;
    }

    public void setTablero(int fila, int columna, MiniTablero miniTablero) {
        this.tableroPrincipal[fila][columna] = miniTablero;
    }

    @Override
    /** Muestra el tablero en su estado actual **/
    public String toString() {
        String retorno = "";
        String lineaAsteriscos = "*".repeat(19) + "\n";
        String lineaHorizontal = "*-+-+-*-+-+-*-+-+-*\n";

        for (int i = 0; i < 3; i++) {
            retorno += lineaAsteriscos;

            for (int j = 0; j < 3; j++) {
                retorno += "*";
                for (int k = 0; k < 3; k++) {
                    retorno += this.tableroPrincipal[i][j].filaToString(k) + "*";
                }
                retorno += "\n";
                retorno += lineaHorizontal;
            }
        }
        retorno += lineaAsteriscos;

        return retorno;
    }

}
