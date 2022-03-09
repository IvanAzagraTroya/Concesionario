package models;

public class Camion extends Vehiculo {
    public Camion(TipoVehiculo v, int peso, int velMax) {
        super();
        this.setPeso(peso);
        this.setVelMax(velMax);
        this.setV(v);
    }

    @Override
    public String toString() {

        return "Tipo: " + getV() +
                ", Matricula: " + matricula + // Hacer generador de matriculas e implementar el set aquí
                ", Velocidad máxima: " + getVelMax() +
                ", Peso del vehiculo: " + getPeso();

    }
}
