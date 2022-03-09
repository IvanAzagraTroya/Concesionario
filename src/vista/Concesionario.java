package vista;

import tda.Pila.Pila;
import tda.matrix.Matrix;
import models.Vehiculo;
import models.VehicleGenerator;

//import java.util.Collections;

public class Concesionario {

    private static Concesionario instance;
    private final Matrix<Vehiculo> plazas;
    private final int MAX_V;
    private final int numV;
    private Pila<Vehiculo> cochesitobrumbrum;

    private Concesionario(int MAX_V, int numV) {
        this.MAX_V = MAX_V;
        this.numV = numV;
        plazas = new Matrix<Vehiculo>(MAX_V, MAX_V);
    }

    public static Concesionario getInstance(int MAX_V, int numV) {
        if (instance == null) {
            instance = new Concesionario(MAX_V, numV);
        }
        return instance;
    }

    public void init() {
        System.out.println("➡️➡️  Inciando cuadrícula  ⬅️⬅️");
        initVehiculos();
        colocarVehiculos();
        printPlazas();
        System.out.println("Se ha creado la pila");
        System.out.println("Inicialización completa 🆗");
    }

    private void printPlazas() {
        System.out.println(plazas);
    }

    private void colocarVehiculos() {
        System.out.println("🤐  Organizando inventario  🤐");
        vaciarPlaza();
        System.out.println("Colocando coches espere 🚗👍");
        for (int i = 0; i < cochesitobrumbrum.size(); i++) {
            int fil;
            int col;
            do {
                fil = (int) (Math.random() * MAX_V);
                col = (int) (Math.random() * MAX_V);
            } while (plazas.get(fil, col) != null);
            plazas.set(fil, col, cochesitobrumbrum.get(i));
        }
        System.out.println("Coches colocados ✅");
    }

    private void vaciarPlaza() {
        plazas.clear();
    }

    private void initVehiculos() {
        cochesitobrumbrum = new Pila<>();
        for (int i = 0; i < numV; i++) {
            cochesitobrumbrum.push(VehicleGenerator.getRandomVehicle());
        }
    }

    public void registroVentas() {
        System.out.println("Registro de ventas: 0" + " 😏");
        System.out.println("Vehiculos(🚗) en concesionario: " + numV);
        imprimirVehiculos();
        // System.out.println("Ventas realizadas😎: "+);

    }

    /*
     * private void ordenarVehiculosPorVentasFallidas(){
     * Collections.sort(cochesitobrumbrum);
     * }
     * 
     * private void ordenarVehiculosPorPrecio(){
     * cochesitobrumbrum.sort(new VehicleComparator());
     * }
     */

    private void imprimirVehiculos() {
        for (int i = 0; i < cochesitobrumbrum.size(); i++) {
            System.out.println("[" + i + "] " + cochesitobrumbrum.get(i));
        }
    }

    /*
     * private int vehiculosVendidos(){
     * int ventas = 0;
     * for(int i = 0; i < cochesitobrumbrum.size(); i++){
     * if(!cochesitobrumbrum.get(i).enVenta()){
     * ventas++;
     * }
     * }
     * return ventas;
     * }
     */
}
