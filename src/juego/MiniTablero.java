/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package juego;

/**
 *
 * @author Esteban Moroy 338885, Facundo Martínez
 */
public class MiniTablero {
    private String[][] miniTablero;

    // Constructor
    public MiniTablero() {
        this.miniTablero = new String[3][3];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                this.miniTablero[i][j] = "";
            }
        }

    }

    public boolean jugada(String coordenada, String tipoJugador) {
        int fila = getFila(coordenada);
        int columna = getColumna(coordenada);
        if (this.miniTablero[fila][columna].isEmpty()) {
            this.miniTablero[fila][columna] = tipoJugador;
            return true; // Jugada válida
        } else {
            return false; // Jugada inválida
        }
    }

    private int getFila(String coordenada) {
        int retorno;
        switch (coordenada.charAt(0)) {
            case 'A':
                retorno = 0;
                break;
            case 'B':
                retorno = 1;
                break;
            case 'C':
                retorno = 2;
                break;
            default:
                retorno = -1;
                break;
        }
        return retorno;
    }

    private int getColumna(String coordenada) {
        int retorno;
        switch (coordenada.charAt(1)) {
            case '1':
                retorno = 0;
                break;
            case '2':
                retorno = 1;
                break;
            case '3':
                retorno = 2;
                break;
            default:
                retorno = -1;
                break;
        }
        return retorno;
    }

    public String determinarGanador() {
        String resultado = "indeterminado";
        // Checkeo de filas
        for (int i = 0; i < 3; i++) {
            if (!this.miniTablero[i][0].isEmpty() &&
                    this.miniTablero[i][0].equals(this.miniTablero[i][1]) &&
                    this.miniTablero[i][1].equals(this.miniTablero[i][2])) {
                resultado = this.miniTablero[i][0];
            }
        }
        // Checkeo de columnas
        for (int j = 0; j < 3; j++) {
            if (!this.miniTablero[0][j].isEmpty() &&
                    this.miniTablero[0][j].equals(this.miniTablero[1][j]) &&
                    this.miniTablero[1][j].equals(this.miniTablero[2][j])) {
                resultado = this.miniTablero[0][j];
            }
        }
        // Checkeo de diagonales
        if (!this.miniTablero[0][0].isEmpty() &&
                this.miniTablero[0][0].equals(this.miniTablero[1][1]) &&
                this.miniTablero[1][1].equals(this.miniTablero[2][2])) {
            resultado = this.miniTablero[0][0];
        }
        if (!this.miniTablero[0][2].isEmpty() &&
                this.miniTablero[0][2].equals(this.miniTablero[1][1]) &&
                this.miniTablero[1][1].equals(this.miniTablero[2][0])) {
            resultado = this.miniTablero[0][2];
        }
        // Checkeo de empate
        if (estaLleno() && resultado == "indeterminado") {
            resultado = "empate";
        }
        return resultado;
    }

    public boolean estaLleno() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (this.miniTablero[i][j].isEmpty()) {
                    return false;
                }
            }
        }
        return true;
    }

    public void setMiniTablero(String[][] miniTablero) {
        this.miniTablero = miniTablero;
    }

    @Override
    public String toString() {
        String retorno = "";
        for (int i = 0; i < this.miniTablero.length; i++) {
            for (int j = 0; j < this.miniTablero[0].length; j++) {
                if (j == 0) {
                    retorno += " "; // Agrega un espacio antes de la primera columna
                }
                if (this.miniTablero[i][j].isEmpty()) {
                    retorno += " "; // Si el casillero está vacío agrega un espacio
                } else {
                    retorno += this.miniTablero[i][j]; // Si no está vacío agrega el valor
                }
                if (j < this.miniTablero[i].length - 1) {
                    retorno += " | "; // Agrega las barras divisorias entre columnas
                }
            }
            if (i < this.miniTablero.length - 1) {
                retorno += "\n"; // Agrega un salto de línea cuando termina con la fila
            }
        }
        return retorno;
    }

}
