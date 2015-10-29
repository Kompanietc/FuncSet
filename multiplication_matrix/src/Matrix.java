import java.util.Random;

/**
 * Умножение матриц
 */
public class Matrix {
    int m;
    int n;
    int [][]A;

    public Matrix(int _n, int _m){

        m = _m;
        n = _n;
        A = new int[n][m];
    }
    public Matrix(int[][]a,int _n,int _m){
     n = _n;
     m = _m;
     A = a;
    }

    /**
     * Заполнение матриц рандомными значениями
     */
    public void full() {


        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                Random rnd = new Random();
                A[i][j] = rnd.nextInt(3);
            }
        }
    }

    /**
     * Сравнивание двух матриц для тестового режима
     */
    public boolean compare(Matrix m1){
        if(!(m1.n == this.n && m1.m == this.m ))
            return false;
        else{
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    if (this.A[i][j] != m1.A[i][j])
                        return false;
                }
            }
        }
        return true;
    }

    /**
     * Вывод матрицы
     */
    public void print(){
        for (int i = 0; i< n; i++){
            for (int j = 0; j < m; j++) {
                System.out.print(A[i][j]);
                System.out.print("\t");
            }
            System.out.println();

        }
        System.out.println();
    }

    /**
     * Функция умножения матриц
     */
    public void mult(Matrix a, Matrix b){
        for (int i = 0; i < a.n; i++)
            for (int j = 0; j < b.m; j++){
                int res = 0;
                for (int k = 0; k < a.m; k++){
                    res = a.A[i][k]*b.A[k][j] + res;
                }
                A[i][j] = res;
            }
    }
    /**
     * Возврат матрицы из экземпляра класса Matrix
     */
    public int[][] getMassive (){
        return A;
    }
}
