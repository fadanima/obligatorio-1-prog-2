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
    private String[][] tableroPrincipal;
    private boolean[][] miniCuadradosDisponibles;

    // Constructor
    public Tablero() {
        // Inicializa un nuevo tablero
    }

    // Métodos
    
    /** Inicializa un nuevo tablero */
    public void nuevoTablero() {
        // Inicializa el tablero con valores predeterminados
    }

    /** Realiza una jugada en el tablero */
    public void jugada(String tipoJugador, String coordenada, String coordenadaMiniTablero) {
        // Ejecuta una jugada en el tablero
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

    /** Actualiza el estado del tablero con una nueva jugada */
    public void actualizarTablero(String coordenada, String valor) {
        // Cambia el valor de la casilla en la coordenada especificada
    }

    /** Muestra el estado actual del tablero */
    public void mostrarTablero() {
        // Muestra el tablero en su estado actual
    }

    /** Verifica si la jugada es válida */
    public boolean esJugadaValida(String coordenada) {
        // Verifica si la jugada es válida
        return true;
    }
    
}
