/**
 * Пересечение двух массивов
 */
public class Array {
    int n;
    double [] A;
    double eps = 0.000001;

    public Array(int _n){


        n = _n;
        A = new double[n];
    }

    public Array(double[]a){
        n = a.length;

        A = a;
    }

    /**
     * Сравнение двух массивов для тестовой функции
     */
    public boolean compare(Array m1){

        if (Math.abs(m1.n - this.n ) > eps)
            return false;
        else{
            for (int i = 0; i < n; i++) {

                if (this.A[i] != m1.A[i])
                    return false;
            }
        }
        return true;
    }

    /**
     * Вывод массива
     */
    public void print(){
        for (int i = 0; i< n; i++){

            System.out.print(A[i]);
            System.out.print("\t");



        }
        System.out.println();
        System.out.println();
    }

    /**
     * функция для определения пересечения двух массивов
     */
    public void intersection(Array a, Array b){
        int k = 0;
        int count = 0;

        for (int i = 0; i < a.A.length; i++){
            boolean fl = false;

            for (int p = 0; p < i; p++) {
                if (Math.abs(a.A[i] - a.A[p]) < eps)
                    fl = true;
            }
            if(!fl) {
                for (int j = 0; j < b.A.length; j++)
                    if (Math.abs(a.A[i] - b.A[j] ) < eps) {
                        A[k] = a.A[i];
                        k++;
                        count++;
                        break;
                    }
            }
        }
        n = count;
    }

    /**
     * Возврат матрицы из экземпляра класса Matrix
     */
    public double[] getMassive (){
        return A;
    }
}