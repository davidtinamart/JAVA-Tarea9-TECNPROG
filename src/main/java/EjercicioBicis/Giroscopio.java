package EjercicioBicis;

import java.time.LocalDate;

public class Giroscopio extends Ciclo {

    private int autonomia;

    public Giroscopio(String marca, String modelo, LocalDate fechaFabricacion, int autonomia) {
        super(marca, modelo, fechaFabricacion);
        this.autonomia = autonomia;
    }

    public void setAutonomia(int autonomia) {
        this.autonomia = autonomia;
    }

    public int getAutonomia() {
        return autonomia;
    }
    public double getAlquilerHora() {
        return 29.90;
    }
    public String toString(){
        int horas = getAutonomia() / 60;
        int minutos = getAutonomia() % 60;
        return String.format("- Giroscopio %s %d km de autonomía %s%.2f/hora",
                super.toString(), getAutonomia(), "€", getAlquilerHora());
    }
}