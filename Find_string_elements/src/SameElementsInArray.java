public class SameElementsInArray {
    public static void print(String []arrayToPrint){
        for (int i = 0; i< arrayToPrint.length; i++){

            System.out.print(arrayToPrint[i]);
            System.out.print("\t");
        }
        System.out.println();
        System.out.println();
    }
    /**
     * функция проверки элементов строкового массива на совпадение
     */
    static boolean checkSameElements(String[] elem) {
        boolean isSame = false;
        for (int i = 0; i < elem.length; i++) {
            if(!isSame) {
                String testElem = elem[i];
                for (int j = i + 1; j < elem.length; j++) {
                    if (testElem.equals(elem[j])) {
                        isSame = true;
                        break;
                    }
                }
            }
            else
                return isSame;
        }
        return isSame;
    }
}
