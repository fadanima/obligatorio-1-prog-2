/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package juego;

/**
 *
 * @author Esteban Moroy 338885, Facundo Martinez
 */

public class Sistema {
    // Atributos
    private Partida partidaActual;
    private Partida[] historialPartidas;
    private Jugador[] jugadores;

    // Métodos
    
    /** Muestra el menú del sistema con las opciones disponibles */
    public void mostrarMenu() {
        // Mostrar menú de opciones
    }

    /** Procesa la opción seleccionada por el usuario */
    public void procesarOpcion(String opcion) {
        // Procesa la opción del menú
    }

    /** Registra un nuevo jugador en el sistema */
    public void registrarJugador(Jugador jugador) {
        // Agrega un jugador a la lista, verificando que el alias sea único
    }

    /** Inicia una nueva partida entre dos jugadores */
    public void jugar() {
        // Inicia el flujo de una partida entre dos jugadores
    }

    /** Inicia una partida contra la CPU */
    public void jugarVsCPU() {
        // Inicia una partida contra la computadora
    }

    /** Muestra el ranking de los jugadores basado en su puntaje */
    public void mostrarRanking() {
        // Muestra el ranking de los jugadores
    }

    /** Renderiza el tablero actual en el sistema */
    public void renderTablero(Tablero tablero) {
        // Muestra el tablero visualmente
    }

    /** Guarda una partida finalizada en el historial */
    public void guardarPartida(Partida partida) {
        // Almacena la partida en el historial
    }

    /** Carga una partida del historial según el ID */
    public Partida cargarPartida(int id) {
        // Retorna una partida del historial
        return null;
    }
    
}
