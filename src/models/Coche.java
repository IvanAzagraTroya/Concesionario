package models;

public class Coche extends Vehiculo {

    public Coche(TipoVehiculo v, int peso, int velMax) {
        super();
        this.setPeso(peso);
        this.setVelMax(velMax);
        this.setV(v);
    }

    @Override
    public String toString() {

        return "Tipo: " + getV() +
                ", Matricula: " + matricula +
                ", Velocidad máxima: " + getVelMax() +
                ", Peso del vehiculo: " + getPeso();

    }
}
