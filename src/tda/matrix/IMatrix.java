package tda.matrix;

public interface IMatrix<T> {
    T get(int row, int col);

    void set(int row, int col, T value);

    int getRows();

    int getCols();

    void clear();

    void addRows(int numRows);

    void addCols(int numCols);

    void removeRows(int numRows);

    void removeCols(int numCols);

    String toString();
}
