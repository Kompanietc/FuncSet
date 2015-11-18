/**
 * Утилита в которой реализовано пересечение двух массивов
 */
public final class Array {
    public static void print(double []arrayToPrint){
        for (int i = 0; i< arrayToPrint.length; i++){

            System.out.print(arrayToPrint[i]);
            System.out.print("\t");
        }
        System.out.println();
        System.out.println();
    }
    public static double[] resize(double[] arrayToResize, int newLength){
        double[] result =new double[newLength];
        int min;

        if(arrayToResize.length < newLength)
            min = arrayToResize.length;
        else min = newLength;

        for (int j=0;j<min;j++)
            result[j] = arrayToResize[j];
        if (min < newLength)
            for(int j=min;j < newLength;j++)
                result[j] = 0;
        return result;
    }
    public static double[] intersection(double [] firstArray, double [] secondArray){
        int k = 0;
        int count = 0;
        int size = 0;
        double eps = 0.000001;
        double [] res = new double[firstArray.length];
        for (int i = 0; i < firstArray.length; i++){
            boolean fl = false;

            for (int p = 0; p < i; p++) {
                if (Math.abs(firstArray[i] - firstArray[p]) < eps)
                    fl = true;
            }
            if(!fl) {
                for (int j = 0; j < secondArray.length; j++)
                    if (Math.abs(firstArray[i] - secondArray[j] ) < eps) {
                        res[k] = firstArray[i];
                        k++;
                        count++;
                        break;
                    }
            }
        }
        size = count;
        return Array.resize(res, size);
    }
}