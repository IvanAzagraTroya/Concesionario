package tda.matrix;

import java.util.ArrayList;

public class Matrix<T> extends ArrayList<ArrayList<T>> implements IMatrix<T> {
    public int rows;
    public int cols;

    public Matrix(int rows, int cols) {
        super(rows);
        this.rows = rows;
        this.cols = cols;
        for (int i = 0; i < rows; i++) {
            ArrayList<T> fila = new ArrayList<T>();
            for (int j = 0; j < cols; j++) {
                fila.add(null);
            }
            this.add(fila);
        }
    }

    @Override
    public T get(int row, int col) {
        return this.get(row).get(col);
    }

    @Override
    public void set(int row, int col, T value) {
        this.get(row).set(col, value);
    }

    @Override
    public int getRows() {
        return this.rows;
    }

    @Override
    public int getCols() {
        return this.cols;
    }

    @Override
    public void clear() {
        // Inicialización a null creando los arraylist
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                this.set(i, j, null); // set de la posición en row: i, col: j y seteando el valor
            }
        }
    }

    @Override
    public void addRows(int numRows) {
        for (int i = 0; i < numRows; i++) {
            // Creación de cada fila y columna a null
            ArrayList<T> fila = new ArrayList<T>();
            for (int j = 0; j < cols; j++) {
                fila.add(null);
            }
            this.add(fila);
        }
        this.rows += numRows;
    }

    @Override
    public void addCols(int numCols) {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < numCols; j++) {
                this.get(i).add(null);
            }
        }
        this.cols += numCols;
    }

    @Override
    public void removeRows(int numRows) {
        for (int i = 0; i < numRows; i++) {
            this.remove(this.size() - 1);
        }
        this.rows += numRows;
    }

    @Override
    public void removeCols(int numCols) {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                this.get(i).remove(this.get(i).size() - 1);
            }
        }
        this.cols -= numCols;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (this.get(i, j) != null) {
                    sb.append("[").append(this.get(i, j)).append("]");
                } else {
                    sb.append("[ ]");
                }
            }
            sb.append("\n");
        }
        return sb.toString();
    }

}
