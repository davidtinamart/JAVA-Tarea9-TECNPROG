package EjercicioBicis;

import java.time.LocalDate;

public class Bicicleta extends Ciclo{
    //atributo
    private int numCambios;
    //constructor
    public Bicicleta(String marca, String modelo, LocalDate fechaFabricacion, int numCambios) {
        super(marca, modelo,fechaFabricacion);
        this.numCambios = numCambios;
    }
    //metodos
    public int getNumCambios() {
        return numCambios;
    }

    public void setNumCambios(int numCambios) {
        this.numCambios = numCambios;
    }

    public double getAlquilerHora() {
        return 4.90;
    }
    public String toString(){
        return String.format("- Bici %s %d velocidades %s%.2f/hora",
                super.toString(), getNumCambios(), "€", getAlquilerHora());
    }


}