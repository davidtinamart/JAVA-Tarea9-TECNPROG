package EjercicioBicis;

import java.time.LocalDate;

public class Segway extends Ciclo {
    private int minAltura;
    private int autonomia;

    public Segway(String marca, String modelo, LocalDate fechaFabricacion, int minAltura, int autonomia) {
        super(marca, modelo, fechaFabricacion);
        this.minAltura = minAltura;
        this.autonomia = autonomia;
    }
    public int getMinAltura() {
        return minAltura;
    }
    public void setMinAltura(int minAltura) {
        this.minAltura = minAltura;
    }
    public int getAutonomia() {
        return autonomia;
    }
    public double getAlquilerHora() {
        return 18.90;
    }
    public String toString(){
        return String.format("- Segway %s %d cm %d km %s%.2f/hora",
                super.toString(), getMinAltura(), getAutonomia(), "€", getAlquilerHora());
    }

}