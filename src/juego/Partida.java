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
    private boolean tieneJugadaMagicaJugadorRojo;
    private boolean tieneJugadaMagicaJugadorAzul;
    private boolean finalizada;
    private String resultado;

    // Métodos

    // Constructor
    public Partida() {
        this.tablero = new Tablero();
        this.finalizada = false;
        this.resultado = "";
    }

    /** Inicia una nueva partida entre los jugadores */
    public void nuevaPartida(Jugador jugadorRojo, Jugador jugadorAzul) {
        this.jugadorRojo = jugadorRojo;
        this.jugadorAzul = jugadorAzul;
        this.turnoActual = jugadorRojo; // Siempre empieza el jugador rojo
        this.tieneJugadaMagicaJugadorRojo = false;
        this.tieneJugadaMagicaJugadorAzul = false;
        this.tablero = new Tablero();
        this.finalizada = false;
        this.resultado = "";
    }

    /** Registra una jugada del jugador en la partida */
    public void registrarJugada(Jugador jugador, String coordenada, String coordenadaMiniTablero) {
        if (tablero.esJugadaValida(coordenada, coordenadaMiniTablero)) {
            ejecutarJugada(jugador, coordenada, coordenadaMiniTablero);
            verificarGanador();
            if (!finalizada) {
                cambiarTurno();
            }
        }
    }

    /** Ejecuta una jugada en el tablero */
    public void ejecutarJugada(Jugador jugador, String coordenada, String coordenadaMiniTablero) {
        tablero.jugada(caracterJugador(jugador), coordenada, coordenadaMiniTablero);
    }

    public String caracterJugador(Jugador jugador) {
        String retorno;
        if (jugador == jugadorRojo) {
            retorno = "X";
        } else {
            retorno = "O";
        }
        return retorno;
    }

    /** Ejecuta la jugada de la CPU en el tablero */
    public void ejecutarJugadaCPU() {
        if (turnoActual instanceof JugadorCPU) {
            JugadorCPU cpu = (JugadorCPU) turnoActual;
            String[] jugada = cpu.generarJugada(tablero);
            while (!tablero.esJugadaValida(jugada[0], jugada[1])) {
                jugada = cpu.generarJugada(tablero);
            }
            registrarJugada(cpu, jugada[0], jugada[1]);
        }
    }

    /** Cambia el turno al siguiente jugador */
    public void cambiarTurno() {
        if (turnoActual == jugadorRojo) {
            turnoActual = jugadorAzul;
        } else {
            turnoActual = jugadorRojo;
        }
    }

    /** Retorna el jugador que tiene el turno actual */
    public Jugador getTurnoActual() {
        return turnoActual;
    }

    /** Realiza la jugada mágica del jugador */
    public void jugadaMagica(Jugador jugador, String coordenada) {
        if (jugador.equals(jugadorRojo) && tieneJugadaMagicaJugadorRojo) {
            tablero.limpiarMiniTablero(coordenada);
            tieneJugadaMagicaJugadorRojo = false;
        } else if (jugador.equals(jugadorAzul) && tieneJugadaMagicaJugadorAzul) {
            tablero.limpiarMiniTablero(coordenada);
            tieneJugadaMagicaJugadorAzul = false;
        }
        cambiarTurno();
    }

    /** Verifica si hay un ganador en la partida */
    public void verificarGanador() {
        String ganador = tablero.getGanadoresMiniTableros().determinarGanador();
        if (!ganador.equals("indeterminado")) {
            finalizarPartida();
            if (ganador.equals("X")) {
                resultado = "Rojo (X)";
            } else if (ganador.equals("O")) {
                resultado = "Azul (O)";
            }
        } else if (tablero.estaLleno()) {
            finalizarPartida();
            resultado = "Empate";
        }
    }

    /** Finaliza la partida y establece el resultado */
    public void finalizarPartida() {
        finalizada = true;
    }

    public void abandonarPartida() {
        finalizarPartida();
        if (turnoActual == jugadorRojo) {
            resultado = "Azul (O)";
        } else {
            resultado = "Rojo (X)";
        }
    }

    /** Verifica si la partida está finalizada */
    public boolean isPartidaFinalizada() {
        return finalizada;
    }

}
