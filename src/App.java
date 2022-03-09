import vista.Concesionario;

public class App {
    public static void main(String[] args) {
        // Compruebo número de parámetros
        // if (args.length != 6) {
        // System.out.println("Usage: java -jar Programa -c <dimension cuadricula> -v
        // <numero numV>");
        // } else {
        try {
            int MAX_V = 5; // Integer.parseInt(args[1]);
            int numV = 25; // Integer.parseInt(args[3]);

            // if (checkParams(MAX_V, numV)) {
            // creación de cuadricula
            Concesionario concesionario = Concesionario.getInstance(MAX_V, numV);
            concesionario.init();
            concesionario.registroVentas();
            /*
             * } else
             * System.out.
             * println("Usage: java -jar Programa -c <dimension cuadricula> -v <numero numV>"
             * );
             */
        } catch (NumberFormatException e) {
            System.out.println("Los parametros deben ser números enteros positivos");
            System.out.println("Usage: java -jar Programa -c <dimension cuadricula> -v <numero numV>");
        }
    }
    // }

    /*
     * private static boolean checkParams(int MAX_V, int numV) {
     * boolean result = true;
     * if (MAX_V < 5 || MAX_V > 9) {
     * System.out.println("La dimensión debe estar entre 5 y 9 ❌");
     * result = true;
     * }
     * if (numV < 1 || numV > 300) {
     * System.out.println("Los numV deben estar entre 1 y 300 ❌");
     * result = true;
     * }
     * return result;
     * }
     */
}
