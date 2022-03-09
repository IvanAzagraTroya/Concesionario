package models;

public class VehicleGenerator {
    public static Vehiculo getRandomVehicle() {
        int random = (int) (Math.random() * 100);
        // System.out.println("random es: " + random); Esto es un debug
        if (random < 20)
            return new Coche(TipoVehiculo.COCHE, 600, 200);
        else if (random < 40)
            return new Moto(TipoVehiculo.MOTO, 80, 250);
        else if (random < 80)
            return new Camion(TipoVehiculo.CAMION, 2500, 140);
        else
            return new Deslizador(TipoVehiculo.DESLIZADOR, 100, 90);
    }
}
