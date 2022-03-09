package models;

public abstract class Vehiculo {
    private TipoVehiculo v;
    String matricula;
    int peso;
    int velMax;

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public int getVelMax() {
        return velMax;
    }

    public void setVelMax(int velMax) {
        this.velMax = velMax;
    }

    public TipoVehiculo getV() {
        return v;
    }

    public void setV(TipoVehiculo v) {
        this.v = v;
    }

    @Override
    public String toString() {

        return "Vehiculo{" +
                "Tipo: " + v +
                "Matricula: " + matricula +
                "Velocidad máxima: " + velMax +
                "Peso del vehiculo: " + peso + "}";

    }

}
