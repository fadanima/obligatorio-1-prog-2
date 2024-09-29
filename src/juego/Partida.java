/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package juego;

/**
 *
 * @author Esteban Moroy 338885, Facundo Martinez
 */
public class Partida {

    // Atributos
    private Jugador jugadorRojo;
    private Jugador jugadorAzul;
    private Tablero tablero;
    private Jugador turnoActual;
    private boolean jugadaMagicaJugadorRojo;
    private boolean jugadaMagicaJugadorAzul;
    private boolean finalizada;
    private String resultado;

    // Métodos
    
    /** Inicia una nueva partida entre los jugadores */
    public void nuevaPartida(Jugador jugadorRojo, Jugador jugadorAzul) {
        // Inicializa una nueva partida con los jugadores dados
    }
    
    /** Registra una jugada del jugador en la partida */
    public void registrarJugada(Jugador jugador, String coordenada) {
        // Valida y registra la jugada en el tablero
    }

    /** Ejecuta una jugada en el tablero */
    public void ejecutarJugada(Jugador jugador, String coordenada) {
        // Actualiza el tablero con la jugada del jugador
    }

    /** Ejecuta la jugada de la CPU en el tablero */
    public void ejecutarJugadaCPU() {
        // Genera y registra una jugada de la CPU
    }
    
    /** Cambia el turno al siguiente jugador */
    public void cambiarTurno() {
        // Cambia el turno de un jugador al otro
    }
    
    /** Retorna el jugador que tiene el turno actual */
    public Jugador getTurnoActual() {
        return turnoActual;
    }

    /** Realiza la jugada mágica del jugador */
    public void jugadaMagica(Jugador jugador) {
        // Ejecuta la jugada mágica del jugador en el tablero
    }

    /** Verifica si hay un ganador en la partida */
    public void verificarGanador() {
        // Verifica si se cumplen las condiciones para ganar
    }

    /** Finaliza la partida y establece el resultado */
    public void finalizarPartida() {
        // Marca la partida como finalizada y establece el resultado
    }
    
    public void abandonarPartida() {
        // Marca la partida como finalizada y establece el resultado
    }

    /** Verifica si la partida está finalizada */
    public boolean isPartidaFinalizada() {
        return finalizada;
    }
    
}
